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
import gregtech.common.blocks.MetaBlocks;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityPrecisionLaser extends RecipeMapMultiblockController {

    public MetaTileEntityPrecisionLaser(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.PRECISION_LASER_RECIPES);
    }

    public IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING.getState(BlockLargeMultiblockCasing.CasingType.ENGRAVER_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~~~~", "~~C~~", "~~C~~", "~~~~~", "~~~~~", "~~~~~", "~~~~~", "~CCC~", "~CSC~")
                .aisle("~~C~~", "~C~C~", "~C~C~", "~~B~~", "~~B~~", "~~B~~", "~~~~~", "C~~~C", "CCCCC")
                .aisle("~CCC~", "C~~~C", "~C~C~", "~~~~~", "~~~~~", "~~~~~", "~~~~~", "C~~~C", "CCCCC")
                .aisle("~~C~~", "CC~CC", "C~~~C", "~CCC~", "~~~~~", "~~~~~", "~~~~~", "C~~~C", "CCCCC")
                .aisle("~~C~~", "CC~CC", "C~~~C", "C~~~C", "~CCC~", "~CCC~", "~CTC~", "CTTTC", "CCCCC")
                .aisle("~~~~~", "~CCC~", "C~~~C", "C~~~C", "C~~~C", "C~~~C", "C~~~C", "T~~~T", "CCCCC")
                .aisle("~~~~~", "~~~~~", "~CCC~", "C~~~C", "C~~~C", "C~~~C", "T~~~T", "T~~~T", "CCCCC")
                .aisle("~~~~~", "~~~~~", "~~~~~", "~CCC~", "CCCCC", "CCCCC", "CCTCC", "TTTTT", "CCCCC")
                .where('S', selfPredicate())
                .where('T',
                        states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID)))
                .where('~', any())
                .where('B', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
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
        return GCYMTextures.ENGRAVER_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.ASSEMBLER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityPrecisionLaser(metaTileEntityId);
    }
}
