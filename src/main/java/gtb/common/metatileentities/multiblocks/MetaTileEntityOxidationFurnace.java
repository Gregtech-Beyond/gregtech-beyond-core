package gtb.common.metatileentities.multiblocks;

import static gregtech.api.unification.material.Materials.Steel;

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
import gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityOxidationFurnace extends RecipeMapMultiblockController {

    public MetaTileEntityOxidationFurnace(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.OXIDATION_FURNACE_RECIPES);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle(
                        "~C~~F~~F",
                        "CCC~~~~~",
                        "~C~~F~~F")
                .aisle(
                        "~C~~ZZZZ",
                        "C~C~ZZZZ",
                        "~C~~ZZZZ")
                .aisle(
                        "~C~~ZGGZ",
                        "C~CPZ~~Z",
                        "~C~~SGGZ")
                .aisle(
                        "~C~~ZZZZ",
                        "CCC~ZZZZ",
                        "~C~~ZZZZ")
                .aisle(
                        "~~~~~~~~",
                        "~P~~~~P~",
                        "~~~~~~~~")
                .aisle(
                        "~~~~~~~~",
                        "~PPPPPP~",
                        "~~~~~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(10)
                        .or(autoAbilities()))
                .where('F', frames(Steel))
                .where('Z', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.INVAR_HEATPROOF)))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, false, true, true, true, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.ELECTRIC_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityOxidationFurnace(metaTileEntityId);
    }
}
