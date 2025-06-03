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
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityVisBreaker extends RecipeMapMultiblockController {

    public MetaTileEntityVisBreaker(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.VIS_BREAKER_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~~~~~~", "~~CCC~~", "~CCCCC~", "~CCCCC~", "~CCCCC~", "~~CCC~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CSC~~", "~~~~~~~")
                .aisle("~~FFF~~", "~FFFFF~", "FFCCCFF", "FFCCCFF", "FFCCCFF", "~FFFFF~", "~~FFF~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~FFF~~", "~FFFFF~", "FFCCCFF", "FFCCCFF", "FFCCCFF", "~FFFFF~", "~~FFF~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~FFF~~", "~FFFFF~", "FFCCCFF", "FFCCCFF", "FFCCCFF", "~FFFFF~", "~~FFF~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~CCC~~", "~C~~~C~", "~C~~~C~", "~C~~~C~", "~~CCC~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~~~~~~", "~~CCC~~", "~~CCC~~", "~~CCC~~", "~~~~~~~", "~~~~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(130)
                        .or(autoAbilities()))
                .where('F', frames(Steel))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, true);
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
        return Textures.COMPRESSOR_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityVisBreaker(metaTileEntityId);
    }
}
