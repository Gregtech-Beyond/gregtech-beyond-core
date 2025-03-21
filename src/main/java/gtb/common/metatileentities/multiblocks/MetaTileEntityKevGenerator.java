package gtb.common.metatileentities.multiblocks;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Lists;

import gregtech.api.capability.GregtechDataCodes;
import gregtech.api.capability.GregtechTileCapabilities;
import gregtech.api.capability.IControllable;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.EnergyContainerList;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.MultiblockWithDisplayBase;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.util.RelativeDirection;
import gregtech.api.util.TextComponentUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.IKevMachine;
import gtb.api.capabilities.KevContainer;
import lombok.Getter;

public class MetaTileEntityKevGenerator extends MultiblockWithDisplayBase implements IControllable, IKevMachine {

    @Getter
    private KevContainer kevContainer;
    @Getter
    private boolean isWorkingEnabled;
    private IEnergyContainer energyContainer;
    protected boolean hasNotEnoughEnergy;
    private boolean isWorking = false;
    private int coolingAmount = 0;
    private int kevProduction;
    private final int euConsumption = 1024;
    private final int baseKevProduction = 300;

    public MetaTileEntityKevGenerator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId);
    }

    private void initializeAbilities() {
        this.energyContainer = new EnergyContainerList(getAbilities(MultiblockAbility.INPUT_ENERGY));
        if (!getAbilities(GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT).isEmpty()) {
            this.kevContainer = getAbilities(GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT).get(0);
            setCoolingAmount();
            setKevProduction();
        }
    }

    private void setCoolingAmount() {
        if (!getAbilities(GTBMultiblockAbilities.KEV_COOLER).isEmpty()) {
            getAbilities(GTBMultiblockAbilities.KEV_COOLER)
                    .forEach(cooler -> coolingAmount += cooler.getCoolingAmount());
        }
    }

    private void setKevProduction() {
        this.kevProduction = this.baseKevProduction - this.coolingAmount;
    }

    private void resetTileAbilities() {
        this.energyContainer = new EnergyContainerList(Lists.newArrayList());
        this.kevContainer.reset();
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        initializeAbilities();
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        resetTileAbilities();
    }

    @Override
    protected void updateFormedValid() {
        if (!isWorkingEnabled()) {
            setWorking(false);
            return;
        }

        int energyToConsume = this.euConsumption;
        boolean hasMaintenance = ConfigHolder.machines.enableMaintenance && hasMaintenanceMechanics();
        if (hasMaintenance) {
            // 10% more energy per maintenance problem
            energyToConsume += getNumMaintenanceProblems() * energyToConsume / 10;
        }

        if (this.hasNotEnoughEnergy && energyContainer.getInputPerSec() > 19L * energyToConsume) {
            this.hasNotEnoughEnergy = false;
        }

        if (this.energyContainer.getEnergyStored() >= energyToConsume) {
            if (!hasNotEnoughEnergy) {
                long consumed = this.energyContainer.removeEnergy(energyToConsume);
                if (consumed == -energyToConsume) {
                    setWorking(true);
                } else {
                    this.hasNotEnoughEnergy = true;
                    setWorking(false);
                }
            }
        } else {
            this.hasNotEnoughEnergy = true;
            setWorking(false);
        }
    }

    @Override
    public void setWorkingEnabled(boolean isWorkingAllowed) {
        this.isWorkingEnabled = isWorkingAllowed;
        markDirty();
        World world = getWorld();
        if (world != null && !world.isRemote) {
            writeCustomData(GregtechDataCodes.WORKING_ENABLED, buf -> buf.writeBoolean(isWorkingEnabled));
        }
    }

    public void setWorking(boolean working) {
        if (working) getKevContainer().setKev(kevProduction);
        else getKevContainer().reset();

        if (this.isWorking != working) {
            this.isWorking = working;

            markDirty();
            World world = getWorld();
            if (world != null && !world.isRemote) {
                writeCustomData(GregtechDataCodes.WORKABLE_ACTIVE, buf -> buf.writeBoolean(working));
            }
        }
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("CCC", "CCC", "CCC", "CCC")
                .aisle("CCC", "GOG", "GOG", "CSC")
                .aisle("CCC", "CCC", "CCC", "CCC")
                .where('S', selfPredicate())
                .where('O', abilities(GTBMultiblockAbilities.KEV_COOLER))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getDefaultState()))
                .where('C', states(getCasingState()).setMinGlobalLimited(18)
                        .or(autoAbilities())
                        .or(abilities(GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMaxGlobalLimited(2)))
                .build();
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(), this.isActive(),
                this.isWorkingEnabled());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevGenerator(metaTileEntityId);
    }

    @Override
    public boolean isActive() {
        return super.isActive() && this.isWorking;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        data.setBoolean("isWorking", this.isWorking);
        data.setBoolean("isWorkingEnabled", this.isWorkingEnabled);
        return data;
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        this.isWorking = data.getBoolean("isWorking");
        this.isWorkingEnabled = data.getBoolean("isWorkingEnabled");
    }

    @Override
    public void writeInitialSyncData(PacketBuffer buf) {
        super.writeInitialSyncData(buf);
        buf.writeBoolean(this.isWorking);
        buf.writeBoolean(this.isWorkingEnabled);
    }

    @Override
    public void receiveInitialSyncData(PacketBuffer buf) {
        super.receiveInitialSyncData(buf);
        this.isWorking = buf.readBoolean();
        this.isWorkingEnabled = buf.readBoolean();
    }

    @Override
    public void receiveCustomData(int dataId, @NotNull PacketBuffer buf) {
        super.receiveCustomData(dataId, buf);
        if (dataId == GregtechDataCodes.WORKABLE_ACTIVE) {
            this.isWorking = buf.readBoolean();
            scheduleRenderUpdate();
        } else if (dataId == GregtechDataCodes.WORKING_ENABLED) {
            this.isWorkingEnabled = buf.readBoolean();
            scheduleRenderUpdate();
        }
    }

    @Override
    protected void addWarningText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed(), false)
                .addLowPowerLine(hasNotEnoughEnergy)
                .addMaintenanceProblemLines(getMaintenanceProblems());
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(isWorkingEnabled(), isActive())
                .addEnergyUsageExactLine(euConsumption)
                .addIdlingLine(isActive())
                .addRunningPerfectlyLine(true)
                .addCustom(list -> {
                    if (!isStructureFormed()) return;
                    if (isActive()) {
                        list.add(TextComponentUtil.translationWithColor(TextFormatting.GREEN,
                                "gtb.multiblock.kev_production", kevContainer.getKev()));
                    } else {
                        list.add(TextComponentUtil.translationWithColor(TextFormatting.WHITE,
                                "gtb.multiblock.kev_production.expected", kevProduction));
                    }
                });
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing side) {
        if (capability == GregtechTileCapabilities.CAPABILITY_CONTROLLABLE) {
            return GregtechTileCapabilities.CAPABILITY_CONTROLLABLE.cast(this);
        }
        return super.getCapability(capability, side);
    }
}
