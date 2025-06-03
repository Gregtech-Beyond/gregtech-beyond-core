package gtb.common.metatileentities.multiblocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockActiveCasing;
import gtb.common.block.blocks.GTBMultiblockCasing;

public class MetaTileEntityBlackHoleCompressor extends RecipeMapMultiblockController {

    public MetaTileEntityBlackHoleCompressor(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.BLACK_HOLE_COMPRESSOR_RECIPES);
    }

    public IBlockState getCasingState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.QUANTUM_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.FRONT, RelativeDirection.UP)
                .aisle("~DSD~", "DCCCD", "FCCCF", "DCCCD", "~DFD~")
                .aisle("~GGG~", "G~~~G", "G~O~G", "G~~~G", "~GGG~").setRepeatable(3)
                .aisle("~DFD~", "DCCCD", "FCCCF", "DCCCD", "~DFD~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(10)
                        .or(autoAbilities()))
                .where('F',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING
                                .getState(GTBMultiblockActiveCasing.ActiveCasingType.FIELD_GENERATOR_CASING)))
                .where('D',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING
                                .getState(GTBMultiblockActiveCasing.ActiveCasingType.DIMENSIONAL_CASING)))
                .where('G',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_CASING
                                .getState(GTBMultiblockCasing.CasingType.QUANTUM_GLASS)))
                .where('O',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING
                                .getState(GTBMultiblockActiveCasing.ActiveCasingType.HIGH_ENERGY_COIL)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.ROBUST_TUNGSTENSTEEL_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.COMPRESSOR_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityBlackHoleCompressor(metaTileEntityId);
    }
}
