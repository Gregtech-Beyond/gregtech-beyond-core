package gtb.common.metatileentities.multiblocks;

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

public class MetaTileEntityAstroMiningStation extends RecipeMapMultiblockController {

    public MetaTileEntityAstroMiningStation(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ASTRO_MINING_STATION);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return GTBMetaBlocks.CLIMATE_PROOF_CASING.getDefaultState();
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~CCCCC~", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "~CCSCC~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~C~P~C~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~CPPPC~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~C~P~C~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "~CCCCC~")
                .aisle("~~~~~~~", "~FFFFF~", "~F~~~F~", "~F~~~F~", "~F~~~F~", "~F~~~F~", "~FFFFF~", "~~~~~~~")
                .where('S', selfPredicate())
                .where('G', states(Blocks.GLASS.getDefaultState()))
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setExactLimit(1)))
                .where('F', frames(Materials.Steel))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, false, false, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
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
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityAstroMiningStation(metaTileEntityId);
    }
}
