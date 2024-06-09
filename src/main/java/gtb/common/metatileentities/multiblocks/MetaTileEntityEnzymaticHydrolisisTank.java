package gtb.common.metatileentities.multiblocks;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import net.minecraft.advancements.Advancement;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
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
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.*;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.NoEnergyLogic;
import gtb.api.recipes.GTBRecipeMaps;


public class MetaTileEntityEnzymaticHydrolisisTank extends RecipeMapMultiblockController {

    public MetaTileEntityEnzymaticHydrolisisTank(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ENZYMATIC_HYDROLISIS_RECIPES);
        this.recipeMapWorkable = new NoEnergyLogic(this);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~~~P~~~~","~~~~~~~~~","~~~CCC~~~","~~CCCCC~~","P~CCCCC~P","~~CCCCC~~","~~~CSC~~~")
                .aisle("~~~~P~~~~","~~~~~~~~~","~~~CCC~~~","~~C~~~C~~","P~C~~~C~P","~~C~~~C~~","~~~CCC~~~")
                .aisle("~~~~P~~~~","~~~~~~~~~","~~~~C~~~~","~~~C~C~~~","P~C~~~C~P","~~~C~C~~~","~~~CCC~~~")
                .aisle("~~~~~~~~~","~~~~P~~~~","~~~~C~~~~","~~~~C~~~~","~PCCCCCP~","~~~~C~~~~","~~~~C~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(9))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1)))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
                .build();
    }


    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, false, true, true, true, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.CLEAN_STAINLESS_STEEL_CASING;
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
        return Textures.LASER_ENGRAVER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityEnzymaticHydrolisisTank(metaTileEntityId);
    }
}
