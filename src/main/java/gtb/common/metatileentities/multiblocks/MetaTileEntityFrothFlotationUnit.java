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
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityFrothFlotationUnit extends RecipeMapMultiblockController {

    public MetaTileEntityFrothFlotationUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.FROTH_FLOTATION_UNIT_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~P~~", "~CCC~", "PCCCP", "~CCC~", "~~P~~")
                .aisle("~~P~~", "~CCC~", "PC~CP", "~CCC~", "~~S~~")
                .aisle("~~~~~", "~CCC~", "~C~C~", "~CCC~", "~~~~~")
                .aisle("~~~~~", "~CCC~", "~C~C~", "~CCC~", "~~~~~")
                .aisle("~~~~~", "~CCC~", "~CGC~", "~CCC~", "~~~~~")
                .where('S', selfPredicate())
                .where('G',
                        states(MetaBlocks.MULTIBLOCK_CASING
                                .getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING)))
                .where('~', any())
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
                .where('C', states(getCasingState()).setMinGlobalLimited(30)
                        .or(autoAbilities()))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, false);
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
        return Textures.BLOWER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityFrothFlotationUnit(metaTileEntityId);
    }
}
