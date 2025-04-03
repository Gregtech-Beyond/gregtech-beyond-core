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
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockCasing;

public class MetaTileEntitySealedReactionChamber extends RecipeMapMultiblockController {

    public MetaTileEntitySealedReactionChamber(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.SEALED_REACTION_CHAMBER_RECIPES);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~CCC~~~~",
                        "~~~CCCCC~~~",
                        "~~~CCCCC~~~",
                        "~~~CCCCC~~~",
                        "~~~~CCC~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~CCC~~~~",
                        "~~CCPPPCC~~",
                        "~~CP~~~PC~~",
                        "~CP~~~~~PC~",
                        "~CP~~~~~PC~",
                        "~CP~~~~~PC~",
                        "~~CP~~~PC~~",
                        "~~CCPPPCC~~",
                        "~~~~CCC~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~CCC~~~~",
                        "~~CC~~~CC~~",
                        "~C~~~~~~~C~",
                        "~C~~~~~~~C~",
                        "C~~~TTT~~~C",
                        "C~~~TTT~~~C",
                        "C~~~TTT~~~C",
                        "~C~~~~~~~C~",
                        "~C~~~~~~~C~",
                        "~~CC~~~CC~~",
                        "~~~~CCC~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~",
                        "~F~~TTT~~F~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~F~~TST~~F~",
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~",
                        "~F~~TTT~~F~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~F~~TTT~~F~",
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~",
                        "~F~~TTT~~F~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~F~~TTT~~F~",
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~",
                        "~F~~TTT~~F~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~~~T~~~T~~~",
                        "~F~~TTT~~F~",
                        "~~~~~~~~~~~",
                        "~~~F~~~F~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~CCC~~~~",
                        "~~CC~~~CC~~",
                        "~C~~~~~~~C~",
                        "~C~~~~~~~C~",
                        "C~~~TTT~~~C",
                        "C~~~TTT~~~C",
                        "C~~~TTT~~~C",
                        "~C~~~~~~~C~",
                        "~C~~~~~~~C~",
                        "~~CC~~~CC~~",
                        "~~~~CCC~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~CCC~~~~",
                        "~~CCPPPCC~~",
                        "~~CP~~~PC~~",
                        "~CP~~~~~PC~",
                        "~CP~~~~~PC~",
                        "~CP~~~~~PC~",
                        "~~CP~~~PC~~",
                        "~~CCPPPCC~~",
                        "~~~~CCC~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~CCC~~~~",
                        "~~~CCCCC~~~",
                        "~~~CCCCC~~~",
                        "~~~CCCCC~~~",
                        "~~~~CCC~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setExactLimit(1)))
                .where('F', frames(Materials.Steel))
                .where('T',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_CASING
                                .getState(GTBMultiblockCasing.CasingType.PERFECTLY_SEALED_VACUUM_CASING)))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
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
        return Textures.DISTILLERY_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntitySealedReactionChamber(metaTileEntityId);
    }
}
