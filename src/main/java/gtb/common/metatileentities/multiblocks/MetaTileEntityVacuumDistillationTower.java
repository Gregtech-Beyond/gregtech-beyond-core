package gtb.common.metatileentities.multiblocks;

import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
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
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType;
import gregtech.common.blocks.BlockFireboxCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.NoEnergyLogic;
import gtb.api.NoEnergyMultiController;
import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityVacuumDistillationTower extends RecipeMapMultiblockController {

    public MetaTileEntityVacuumDistillationTower(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.VACUUM_DISTILLATION_TOWER);
        this.recipeMapWorkable = new NoEnergyLogic(this);
        initializeAbilities();
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("~~~~~CCC~~~~~","~CP~PCCCP~PC~","C~CFCCCCCFC~C","~CP~PCCCP~PC~","~~~~~CSC~~~~~")
                .aisle("~~~~~CCC~~~~~","~CPPP~~~PPPC~","C~CFC~~~CFC~C","~CPPP~~~PPPC~","~~~~~CCC~~~~~")
                .aisle("~~~~~CCC~~~~~","~C~~P~~~P~~C~","C~CFP~~~PFC~C","~C~~P~~~P~~C~","~~~~~CCC~~~~~")
                .aisle("~~~~~CCC~~~~~","~C~~P~~~P~~C~","C~CFP~~~PFC~C","~C~~P~~~P~~C~","~~~~~CCC~~~~~")
                .aisle("~~~~~CCC~~~~~","~C~~P~~~P~~C~","C~CFP~~~PFC~C","~C~~P~~~P~~C~","~~~~~CCC~~~~~")
                .aisle("~~~~~CCC~~~~~","~C~~P~~~P~~C~","C~CFP~~~PFC~C","~C~~P~~~P~~C~","~~~~~CCC~~~~~")
                .aisle("~~~~~CCC~~~~~","~C~~PC~CP~~C~","C~CFP~~~PFC~C","~C~~PC~CP~~C~","~~~~~CCC~~~~~")
                .aisle("~~~~~~F~~~~~~","~C~~~FCF~~~C~","C~CFFCCCFFC~C","~C~~~FCF~~~C~","~~~~~~F~~~~~~")
                .aisle("~~~~~~~~~~~~~","~C~~~~~~~~~C~","C~C~~~~~~~C~C","~C~~~~~~~~~C~","~~~~~~~~~~~~~")
                .aisle("~~~~~~~~~~~~~","~~~~~~~~~~~~~","~C~~~~~~~~~C~","~~~~~~~~~~~~~","~~~~~~~~~~~~~")
                .where('S', selfPredicate())
                .where('G', states(Blocks.GLASS.getDefaultState()))
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1)))
                .where('F', frames(Materials.BlueSteel))
                .where('H', states(MetaBlocks.METAL_CASING.getState((BlockMetalCasing.MetalCasingType.STEEL_SOLID))))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, false, false, true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(),
                recipeMapWorkable.isActive(), recipeMapWorkable.isWorkingEnabled());
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
