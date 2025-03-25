package gtb.common.metatileentities.multiblocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.*;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityMOCVDUnit extends RecipeMapMultiblockController {

    public MetaTileEntityMOCVDUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.MOCVD_UNIT_RECIPES);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle(
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "SCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC",
                        "CCC")
                .aisle(
                        "CCC",
                        "G~G",
                        "GTG",
                        "G~G",
                        "CCC",
                        "CPC",
                        "CPC",
                        "CPC",
                        "CCC",
                        "G~G",
                        "GTG",
                        "G~G",
                        "CCC")
                .aisle(
                        "~C~",
                        "~G~",
                        "~G~",
                        "~G~",
                        "CCC",
                        "~~~",
                        "~~~",
                        "~~~",
                        "CCC",
                        "~G~",
                        "~G~",
                        "~G~",
                        "~C~")
                .where('S', selfPredicate())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setMaxGlobalLimited(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(3))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setMaxGlobalLimited(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setMaxGlobalLimited(1)))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TITANIUM_PIPE)))
                .where('T', states(MetaBlocks.WIRE_COIL.getState(BlockWireCoil.CoilType.NICHROME)))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)))
                .where('~', any())
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, false, false, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GCYMTextures.NONCONDUCTING_CASING;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(),
                recipeMapWorkable.isActive(), recipeMapWorkable.isWorkingEnabled());
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.FERMENTER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityMOCVDUnit(metaTileEntityId);
    }
}
