package gtb.common.metatileentities.multiblocks;

import static gtb.common.block.blocks.GTBMultiblockCasing.CasingType.*;

import javax.annotation.Nonnull;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import gregtech.common.blocks.*;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.common.block.GTBMetaBlocks;

public class MetaTileEntityCVDUnit extends RecipeMapMultiblockController {

    public MetaTileEntityCVDUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.CVD_UNIT_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new MetaTileEntityCVDUnit(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXX", "XGGGX", "XGGGX")
                .aisle("XXXXX", "XCCCX", "XGGGX").setRepeatable(3)
                .aisle("XXXXX", "SGGGX", "XGGGX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(35).or(autoAbilities()))
                .where('G', states(getGlassState()))
                .where('C', states(getSubstrateState()))
                .build();
    }

    private static IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
    }

    private static IBlockState getSubstrateState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(SUBSTRATE);
    }

    private static IBlockState getGlassState() {
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS);
    }

    @Nonnull
    @Override
    protected SimpleOverlayRenderer getFrontOverlay() {
        return GTBTextures.CVD_UNIT_OVERLAY;
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GCYMTextures.NONCONDUCTING_CASING;
    }
}
