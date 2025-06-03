package gtb.common.metatileentities.multiblocks;

import net.minecraft.block.state.IBlockState;
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
import gregtech.common.blocks.*;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityHeatExchanger extends RecipeMapMultiblockController {

    public MetaTileEntityHeatExchanger(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.HEAT_EXCHANGER_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("AAAA", "ACCA", "ACCA", "AAAA")
                .aisle("ACCA", "CRRC", "CRRC", "AGGA")
                .aisle("ACCA", "CFFC", "CFFC", "AGGA").setRepeatable(3)
                .aisle("AAAA", "ASCA", "ACCA", "AAAA")
                .where('S', selfPredicate())
                .where('A', any())
                .where('R', air())
                .where('G', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)))
                .where('F',
                        states(MetaBlocks.MULTIBLOCK_CASING
                                .getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING)))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
                .where('C', states(getCasingState()).setMinGlobalLimited(8)
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setMaxGlobalLimited(1, 1))
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setMaxGlobalLimited(1, 1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setMaxGlobalLimited(1, 1)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, true);
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
        return new MetaTileEntityHeatExchanger(metaTileEntityId);
    }
}
