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
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;

import gregicality.multiblocks.api.unification.GCYMMaterials;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityRocketAssemblingMachine extends RecipeMapMultiblockController {

    public MetaTileEntityRocketAssemblingMachine(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ROCKET_ASSEMBLY_RECIPES);
    }

    public IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC",
                        "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC")
                .aisle("CCCCC", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F",
                        "~~~~~", "F~~~F", "CCCCC", "G~~~G", "G~~~G", "G~~~G", "CCSCC")
                .aisle("CCCCC", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F",
                        "~~~~~", "F~~~F", "CCCCC", "G~~~G", "G~~~G", "G~~~G", "CCCCC")
                .aisle("CCCCC", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F", "~~~~~", "F~~~F",
                        "~~~~~", "F~~~F", "CCCCC", "G~~~G", "G~~~G", "G~~~G", "CCCCC")
                .aisle("CCCCC", "~F~F~", "~~~~~", "~F~F~", "~~~~~", "~F~F~", "~~~~~", "~F~F~", "~~~~~", "~F~F~",
                        "~~~~~", "~F~F~", "CCCCC", "CCCCC", "CCCCC", "CCCCC", "CCCCC")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(150)
                        .or(autoAbilities()))
                .where('F', frames(GCYMMaterials.HSLASteel))
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.LAMINATED_GLASS)))
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
        return Textures.ASSEMBLER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityRocketAssemblingMachine(metaTileEntityId);
    }
}
