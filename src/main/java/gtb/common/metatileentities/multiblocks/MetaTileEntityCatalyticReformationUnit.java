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
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityCatalyticReformationUnit extends RecipeMapMultiblockController {

    public MetaTileEntityCatalyticReformationUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.CATALYTIC_REFORMATION_UNIT_RECIPES);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("F###F", "XXXPX", "XXXPX", "XXXPX")
                .aisle("#####", "XXXPX", "X###X", "XXXPX")
                .aisle("F###F", "XXXPX", "XXSPX", "XXXPX")
                .where('S', selfPredicate())
                .where('#', any())
                .where('X', states(getCasingState()).setMinGlobalLimited(22)
                        .or(autoAbilities()))
                .where('F', frames(Materials.Titanium))
                .where('P', states(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TITANIUM_PIPE)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, false, true, true, true, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.STABLE_TITANIUM_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.ASSEMBLER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityCatalyticReformationUnit(metaTileEntityId);
    }
}
