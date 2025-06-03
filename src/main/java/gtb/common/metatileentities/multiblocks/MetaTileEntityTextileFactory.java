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
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityTextileFactory extends RecipeMapMultiblockController {

    public MetaTileEntityTextileFactory(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.TEXTILE_FACTORY_RECIPES);
    }

    public IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.VIBRATION_SAFE_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("       ", " A   A ", " A   A ", " A   A ", "       ")
                .aisle(" A   A ", " AAAAA ", "AAGGGAA", " AAAAA ", " A   A ")
                .aisle(" A   A ", "AAAAAAA", "AA~~~AA", "AAAAAAA", " A   A ")
                .aisle(" A   A ", " AAAAA ", "AAGGGAA", " AAAAA ", " A   A ")
                .aisle("       ", " A   A ", " S   A ", " A   A ", "       ")
                .where('S', selfPredicate())
                .where(' ', any())
                .where('A', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS).setExactLimit(1)))
                .where('G', states(Blocks.GLASS.getDefaultState()))
                .where('~', air())
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, true);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GCYMTextures.VIBRATION_SAFE_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.BENDER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityTextileFactory(metaTileEntityId);
    }
}
