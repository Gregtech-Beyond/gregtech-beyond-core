package gtb.common.metatileentities.multiblockpart;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.GTValues;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.IDataInfoProvider;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiblockPart;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.capabilites.GTBMultiblockAbility;
import gtb.api.capabilites.GTBTileCapabilities;
import gtb.api.capabilites.impl.KevContainer;
import gtb.api.capabilites.interfaces.containers.IKevContainer;
import gtb.api.render.GTBTextures;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class MetaTileEntityKevHatch extends MetaTileEntityMultiblockPart
                                    implements IMultiblockAbilityPart<IKevContainer>, IDataInfoProvider {

    private final IKevContainer kevContainer;
    private final int tier;
    private final boolean isInput;

    public MetaTileEntityKevHatch(ResourceLocation metaTileEntityId, int tier, boolean isInput) {
        super(metaTileEntityId, tier);
        this.kevContainer = new KevContainer(this, (int) GTValues.V[tier - 3]);
        this.tier = tier;
        this.isInput = isInput;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevHatch(metaTileEntityId, tier, isInput);
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        GTBTextures.KEV_MULTIBLOCK_HATCH.render(renderState, translation, pipeline);
        if (isInput) {
            GTBTextures.KEV_HATCH_INPUT_OVERLAY.renderSided(getFrontFacing(), renderState, translation, pipeline);
        } else {
            GTBTextures.KEV_HATCH_OUTPUT_OVERLAY.renderSided(getFrontFacing(), renderState, translation, pipeline);
        }
    }

    @Override
    public MultiblockAbility<IKevContainer> getAbility() {
        return this.isInput ? GTBMultiblockAbility.KEY_CONTAINER_INPUT : GTBMultiblockAbility.KEY_CONTAINER_OUTPUT;
    }

    @Override
    public void registerAbilities(List<IKevContainer> abilityList) {
        abilityList.add(this.kevContainer);
    }

    @Override
    @Nullable
    public <T> T getCapability(@NotNull Capability<T> capability, EnumFacing side) {
        if (capability.equals(GTBTileCapabilities.CAPABILITY_KEV_CONTAINER)) {
            return GTBTileCapabilities.CAPABILITY_KEV_CONTAINER.cast(this.kevContainer);
        }
        return super.getCapability(capability, side);
    }

    @NotNull
    @Override
    public List<ITextComponent> getDataInfo() {
        List<ITextComponent> list = new ObjectArrayList<>();
        list.add(new TextComponentTranslation("behavior.tricorder.kev", kevContainer.getKev()));
        list.add(new TextComponentTranslation("behavior.tricorder.max_kev", kevContainer.getMaxKev()));
        return list;
    }
}
