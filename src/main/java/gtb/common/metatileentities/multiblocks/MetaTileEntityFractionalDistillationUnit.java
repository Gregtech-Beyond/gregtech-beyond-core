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
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityFractionalDistillationUnit extends RecipeMapMultiblockController {

    public MetaTileEntityFractionalDistillationUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.FRACTIONAL_DISTILLATION_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF",
                        "~CCC~")
                .aisle("~CCC~", "FC~CF", "~C~C~", "FC~CF", "~C~C~", "FC~CF", "~C~C~", "FC~CF", "~C~C~", "FC~CF",
                        "~CSC~")
                .aisle("~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF", "~CCC~", "FCCCF",
                        "~CCC~")
                .aisle("~~~~~", "FFFFF", "~~~~~", "FFFFF", "~~~~~", "FFFFF", "~~~~~", "FFFFF", "~~~~~", "FFFFF",
                        "~~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(60)
                        .or(autoAbilities()))
                .where('F', frames(Materials.Steel))
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
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityFractionalDistillationUnit(metaTileEntityId);
    }
}
