package gtb.common.metatileentities.multiblockpart;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiblockPart;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.GTBTileCapabilities;
import gtb.api.capabilities.KevContainer;
import gtb.api.render.GTBTextures;

public class MetaTileEntityKevHatch extends MetaTileEntityMultiblockPart
                                    implements IMultiblockAbilityPart<KevContainer> {

    private final KevContainer kevContainer;
    private final boolean isInput;

    public MetaTileEntityKevHatch(ResourceLocation metaTileEntityId, boolean isInput) {
        super(metaTileEntityId, 1);
        this.isInput = isInput;

        this.kevContainer = new KevContainer(this, isInput);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevHatch(metaTileEntityId, isInput);
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
    public MultiblockAbility<KevContainer> getAbility() {
        return isInput ? GTBMultiblockAbilities.KEV_CONTAINER_INPUT : GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT;
    }

    @Override
    public void registerAbilities(List<KevContainer> abilityList) {
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
}
