package gtb.common.metatileentities.multiblockpart;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiblockPart;
import gtb.api.capabilites.GTBMultiblockAbility;
import gtb.api.capabilites.GTBTileCapabilities;
import gtb.api.capabilites.impl.KevContainer;
import gtb.api.capabilites.interfaces.containers.IKevContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetaTileEntityKevHatch extends MetaTileEntityMultiblockPart implements IMultiblockAbilityPart<IKevContainer> {

    private final IKevContainer kevMachine;

    public MetaTileEntityKevHatch(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, 0);
        this.kevMachine = new KevContainer(this);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevHatch(metaTileEntityId);
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
    }

    @Override
    public MultiblockAbility<IKevContainer> getAbility() {
        return GTBMultiblockAbility.KEY_CONTAINER;
    }

    @Override
    public void registerAbilities(List<IKevContainer> abilityList) {
        abilityList.add(this.kevMachine);
    }

    @Override
    @Nullable
    public <T> T getCapability(@NotNull Capability<T> capability, EnumFacing side) {
        if (capability.equals(GTBTileCapabilities.CAPABILITY_KEV_CONTAINER)) {
            return GTBTileCapabilities.CAPABILITY_KEV_CONTAINER.cast(this.kevMachine);
        }
        return super.getCapability(capability, side);
    }
}
