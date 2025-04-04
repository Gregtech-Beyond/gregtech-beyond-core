package gtb.common.metatileentities.multiblocks;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.recipes.Recipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.metatileentity.multiblock.GTBPredicates;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.recipes.properties.CoilingCoilTemperatureProperty;
import gtb.common.block.blocks.BlockCoolingCoil;

public class MetaTileEntityDilutionRefrigerator extends RecipeMapMultiblockController {

    private int temperature;

    public MetaTileEntityDilutionRefrigerator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.DILUTION_REFRIGERATOR_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityDilutionRefrigerator(metaTileEntityId);
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))
                .addCustom(tl -> {
                    // Coil heat capacity line
                    if (isStructureFormed()) {
                        ITextComponent heatString = TextComponentUtil.stringWithColor(
                                TextFormatting.RED,
                                TextFormattingUtil.formatNumbers(temperature) + "K");

                        tl.add(TextComponentUtil.translationWithColor(
                                TextFormatting.GRAY,
                                "gregtech.multiblock.blast_furnace.max_temperature",
                                heatString));
                    }
                })
                .addParallelsLine(recipeMapWorkable.getParallelLimit())
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        Object type = context.get("CoolingCoilType");
        if (type instanceof BlockCoolingCoil.CoolingCoilType) {
            this.temperature = ((BlockCoolingCoil.CoolingCoilType) type).coilTemperature;
        } else {
            this.temperature = BlockCoolingCoil.CoolingCoilType.SILVER_ALLOY.coilTemperature;
        }
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.temperature = Integer.MAX_VALUE;
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        return this.temperature <= recipe.getProperty(CoilingCoilTemperatureProperty.getInstance(), 0);
    }

    @Override
    @NotNull
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "CCC", "CCC", "CCC", "XXX")
                .aisle("XXX", "C#C", "C#C", "C#C", "XXX")
                .aisle("XSX", "CCC", "CCC", "CCC", "XXX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(10)
                        .or(autoAbilities(true, true, true, true, true, true, false)))
                .where('C', GTBPredicates.coolingCoils())
                .where('#', air())
                .build();
    }

    protected @NotNull IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.ALUMINIUM_FROSTPROOF);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.FROST_PROOF_CASING;
    }

    @Override
    public boolean canBeDistinct() {
        return true;
    }

    @NotNull
    @Override
    public List<ITextComponent> getDataInfo() {
        List<ITextComponent> list = super.getDataInfo();
        list.add(new TextComponentTranslation("gregtech.multiblock.dilution_refrigerator.min_temperature",
                new TextComponentTranslation(TextFormattingUtil.formatNumbers(temperature) + "K")
                        .setStyle(new Style().setColor(TextFormatting.BLUE))));
        return list;
    }
}
