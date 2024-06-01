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

public class MetaTileEntityEngravingUnit extends RecipeMapMultiblockController {

    public MetaTileEntityEngravingUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ENGRAVING_UNIT_RECIPES);
        this.recipeMapWorkable = new NoEnergyLogic(this);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    public IBlockState getIronPillar() {
        return Blocks.IRON_BARS.getDefaultState();
    }

    public IBlockState getGearBoxCasing() {
        return MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STEEL_GEARBOX);
    }

    public IBlockState getPipeCasing() {
        return MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE);
    }

    public IBlockState getLaserDanger() {
        return MetaBlocks.WARNING_SIGN_1.getState(BlockWarningSign1.SignType.LASER_HAZARD);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("F---F", "-----", "-----", "-----", "-----", "-----", "F---F", "-----", "-F-F-")
                .aisle("HHHHH", "HHHHH", "HHHHH", "HHHHH", "HHHHH", "HHHHH", "HHHHH", "HHHHH", "-HHH-")
                .aisle("HGGGH", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "HCCCH", "-HHH-")
                .aisle("HGGGH", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "HCCCH", "-HSH-")
                .aisle("HGGGH", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GABAG", "GAAAG", "HCCCH", "-PDP-")
                .aisle("HGGGH", "GAAAG", "GAAAG", "GAAAG", "GAAAG", "GABAG", "GAAAG", "HCCCH", "-PPP-")
                .aisle("HHDHH", "HHTHH", "HHTHH", "HHTHH", "HHTHH", "HHDHH", "HHTHH", "HHTHH", "--T--")
                .where('-', any())
                .where('A', air())
                .where('B', states(getIronPillar()))
                .where('P', states(getPipeCasing()))
                .where('D', states(getLaserDanger()))
                .where('T', states(getGearBoxCasing()))
                .where('C', states(getCasingState()))
                .where('H', states(getCasingState())
                        .or(autoAbilities()))
                .where('F', frames(Materials.BlueSteel))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getDefaultState()))
                .where('S', selfPredicate())
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
        return new MetaTileEntityEngravingUnit(metaTileEntityId);
    }
}
