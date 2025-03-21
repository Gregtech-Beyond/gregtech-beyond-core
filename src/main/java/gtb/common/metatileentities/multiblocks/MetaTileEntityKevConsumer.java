package gtb.common.metatileentities.multiblocks;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.util.GTUtility;
import gregtech.api.util.RelativeDirection;
import gregtech.api.util.TextComponentUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.IKevMachine;
import gtb.api.capabilities.KevContainer;
import gtb.api.metatileentity.multiblock.KevConsumerLogic;
import gtb.api.recipes.GTBRecipeMaps;
import lombok.Getter;

public class MetaTileEntityKevConsumer extends RecipeMapMultiblockController implements IKevMachine {

    @Getter
    private KevContainer kevContainer;

    public MetaTileEntityKevConsumer(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.KEV_RECIPE_MAP);
        this.recipeMapWorkable = new KevConsumerLogic(this);
    }

    @Override
    protected void initializeAbilities() {
        super.initializeAbilities();
        if (!getAbilities(GTBMultiblockAbilities.KEV_CONTAINER_INPUT).isEmpty()) {
            this.kevContainer = getAbilities(GTBMultiblockAbilities.KEV_CONTAINER_INPUT).get(0);
        }
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("CCC", "CCC", "CCC")
                .aisle("CCC", "CAC", "CSC")
                .aisle("CCC", "CCC", "CCC")
                .where('S', selfPredicate())
                .where('A', air())
                .where('C', states(getCasingState()).setMinGlobalLimited(18)
                        .or(autoAbilities())
                        .or(abilities(GTBMultiblockAbilities.KEV_CONTAINER_INPUT).setExactLimit(1)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, false);
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
        return Textures.ASSEMBLER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevConsumer(metaTileEntityId);
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(recipeMapWorkable.getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))
                .addParallelsLine(recipeMapWorkable.getParallelLimit())
                .addCustom(list -> {
                    if (kevContainer.getKev() > 0) {
                        list.add(TextComponentUtil.translationWithColor(TextFormatting.GREEN,
                                "gtb.multiblock.kev_reception", kevContainer.getKev()));
                    } else {
                        list.add(TextComponentUtil.translationWithColor(TextFormatting.RED,
                                "gtb.multiblock.kev_reception.none"));
                    }
                })
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }
}
