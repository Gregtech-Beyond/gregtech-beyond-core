package gtb.common.metatileentities.multiblocks;

import gregtech.common.blocks.BlockFireboxCasing;
import gregtech.common.blocks.BlockMetalCasing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
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
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType;
import gregtech.common.blocks.MetaBlocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockActiveCasing;
import gtb.common.block.blocks.GTBMultiblockCasing;


public class MetaTileEntityBlackHoleCompressor extends RecipeMapMultiblockController {

    public MetaTileEntityBlackHoleCompressor(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.BLACK_HOLE_COMPRESSOR);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.QUANTUM_CASING);}

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~DFD~", "DCCCD", "FCCCF", "DCCCD", "~DSD~")
                .aisle("~GGG~", "G~~~G", "G~O~G", "G~~~G", "~GGG~")
                .aisle("~GGG~", "G~~~G", "G~O~G", "G~~~G", "~GGG~")
                .aisle("~GGG~", "G~~~G", "G~O~G", "G~~~G", "~GGG~")
                .aisle("~DFD~", "DCCCD", "FCCCF", "DCCCD", "~DFD~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setExactLimit(1)))
                .where('F', states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING.getState(GTBMultiblockActiveCasing.ActiveCasingType.FIELD_GENERATOR_CASING)))
                .where('D', states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING.getState(GTBMultiblockActiveCasing.ActiveCasingType.DIMENSIONAL_CASING)))
                .where('G', states(GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.QUANTUM_GLASS)))
                .where('O', states(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING.getState(GTBMultiblockActiveCasing.ActiveCasingType.HIGH_ENERGY_COIL)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, false, false, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.ROBUST_TUNGSTENSTEEL_CASING;
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
        return Textures.CLEANROOM_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityBlackHoleCompressor(metaTileEntityId);
    }
}
