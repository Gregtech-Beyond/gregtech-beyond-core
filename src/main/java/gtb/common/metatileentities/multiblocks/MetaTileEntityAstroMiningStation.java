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
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockCasing;

public class MetaTileEntityAstroMiningStation extends RecipeMapMultiblockController {

    public MetaTileEntityAstroMiningStation(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ASTRO_MINING_STATION_RECIPES);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.CLIMATE_PROOF_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~CCCCC~", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "~CCSCC~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~C~P~C~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~CPPPC~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCPPPCF", "~CPPPC~", "~CPPPC~", "~CPPPC~", "~C~P~C~", "FC~~~CF", "~C~~~C~")
                .aisle("~CCCCC~", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "~CCCCC~")
                .aisle("~~~~~~~", "~FFFFF~", "~F~~~F~", "~F~~~F~", "~F~~~F~", "~F~~~F~", "~FFFFF~", "~~~~~~~")
                .where('S', selfPredicate())
                .where('G', states(Blocks.GLASS.getDefaultState()))
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(120)
                        .or(autoAbilities()))
                .where('F', frames(Materials.Steel))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, false, true, true, true, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GTBTextures.CLIMATE_PROOF_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityAstroMiningStation(metaTileEntityId);
    }
}
