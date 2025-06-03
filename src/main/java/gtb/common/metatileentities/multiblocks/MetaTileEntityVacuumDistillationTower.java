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
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityVacuumDistillationTower extends RecipeMapMultiblockController {

    public MetaTileEntityVacuumDistillationTower(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.VACUUM_DISTILLATION_TOWER_RECIPES);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~CCCCC~", "CCCPCCC", "CCCPCCC", "CPPPPPC", "CCCPCCC", "CCCPCCC", "~CCSCC~")
                .aisle("~C~~~C~", "CCF~FCC", "~F~~~F~", "~~~P~~~", "~F~~~F~", "CCF~FCC", "~C~~~C~")
                .aisle("~~~~~~~", "~FF~FF~", "~F~~~F~", "~~~P~~~", "~F~~~F~", "~FF~FF~", "~~~~~~~")
                .aisle("~~~~~~~", "~F~~~F~", "~~HHH~~", "~~HHH~~", "~~HHH~~", "~F~~~F~", "~~~~~~~")
                .aisle("~~~~~~~", "~FHHHF~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~FHHHF~", "~~~~~~~")
                .aisle("~~~~~~~", "~FHHHF~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~FHHHF~", "~~~~~~~")
                .aisle("~~~~~~~", "~FHHHF~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~FHHHF~", "~~~~~~~")
                .aisle("~~CCC~~", "~C~~~C~", "C~~~~~C", "C~~~~~C", "C~~~~~C", "~C~~~C~", "~~CCC~~")
                .aisle("~~CCC~~", "~C~~~C~", "C~~~~~C", "C~~~~~C", "C~~~~~C", "~C~~~C~", "~~CCC~~")
                .aisle("~~CCC~~", "~C~~~C~", "C~~~~~C", "C~~~~~C", "C~~~~~C", "~C~~~C~", "~~CCC~~")
                .aisle("~~CCC~~", "~C~~~C~", "C~~~~~C", "C~~~~~C", "C~~~~~C", "~C~~~C~", "~~CCC~~")
                .aisle("~~CCC~~", "~C~~~C~", "C~~~~~C", "C~~~~~C", "C~~~~~C", "~C~~~C~", "~~CCC~~")
                .aisle("~~~~~~~", "~~HHH~~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~~HHH~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~HHH~~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~~HHH~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~HHH~~", "~H~~~H~", "~H~~~H~", "~H~~~H~", "~~HHH~~", "~~~~~~~")
                .aisle("~~~~~~~", "~~~~~~~", "~~HHH~~", "~~HHH~~", "~~HHH~~", "~~~~~~~", "~~~~~~~")
                .where('S', selfPredicate())
                .where('G', states(Blocks.GLASS.getDefaultState()))
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(120)
                        .or(autoAbilities()))
                .where('F', frames(Materials.BlueSteel))
                .where('H', states(MetaBlocks.METAL_CASING.getState((BlockMetalCasing.MetalCasingType.STEEL_SOLID))))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
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
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityVacuumDistillationTower(metaTileEntityId);
    }
}
