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

public class MetaTileEntityDissolutionTank extends RecipeMapMultiblockController {

    public MetaTileEntityDissolutionTank(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.DISSOLUTION_TANK_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("F~~~F", "~~~~~", "~~~~~", "~~~~~", "F~~~F")
                .aisle("FFFFF", "F~~~F", "F~~~F", "F~~~F", "FFFFF")
                .aisle("FCCCF", "CCCCC", "CCCCC", "CCCCC", "FCCCF")
                .aisle("CCCCC", "C~~~C", "C~~~C", "C~~~C", "CCSCC")
                .aisle("CGGGC", "G~~~G", "G~~~G", "G~~~G", "CGGGC")
                .aisle("CGGGC", "G~~~G", "G~~~G", "G~~~G", "CGGGC")
                .aisle("CGGGC", "G~~~G", "G~~~G", "G~~~G", "CGGGC")
                .aisle("CGGGC", "G~~~G", "G~~~G", "G~~~G", "CGGGC")
                .aisle("~CCC~", "CCCCC", "CCCCC", "CCCCC", "~CCC~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(65)
                        .or(autoAbilities()))
                .where('F', frames(Materials.BlueSteel))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getDefaultState()))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, false, false, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.CLEAN_STAINLESS_STEEL_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.LATHE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityDissolutionTank(metaTileEntityId);
    }
}
