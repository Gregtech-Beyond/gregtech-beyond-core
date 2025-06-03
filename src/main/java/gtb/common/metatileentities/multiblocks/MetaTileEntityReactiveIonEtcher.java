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
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockCasing;

public class MetaTileEntityReactiveIonEtcher extends RecipeMapMultiblockController {

    public MetaTileEntityReactiveIonEtcher(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.REACTIVE_ION_ETCHER_RECIPES);
    }

    public IBlockState getCasingState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.LEAD_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~CCC~~", "~CCCCC~", "CCCCCCC", "CCCCCCC", "CCCCCCC", "~CCCCC~", "~~CSC~~")
                .aisle("~~CGC~~", "~C~~~C~", "C~~~~~C", "G~~~~~G", "C~~~~~C", "~C~~~C~", "~~CGC~~")
                .aisle("~~CGC~~", "~C~~~C~", "C~~~~~C", "G~~~~~G", "C~~~~~C", "~C~~~C~", "~~CGC~~")
                .aisle("~~PGP~~", "~C~~~C~", "P~~~~~P", "G~~~~~G", "P~~~~~P", "~C~~~C~", "~~PGP~~")
                .aisle("~~PPP~~", "~PCCCP~", "PCCCCCP", "PCCCCCP", "PCCCCCP", "~PCCCP~", "~~PPP~~")
                .aisle("~~P~P~~", "~~P~P~~", "PPP~PPP", "~~P~P~~", "PPP~PPP", "~~P~P~~", "~~P~P~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(40)
                        .or(autoAbilities()))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE)))
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
        return GTBTextures.LEAD_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.LATHE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityReactiveIonEtcher(metaTileEntityId);
    }
}
