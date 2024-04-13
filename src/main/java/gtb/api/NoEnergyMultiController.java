package gtb.api;

import java.util.List;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.RecipeMap;

public abstract class NoEnergyMultiController extends RecipeMapMultiblockController {

    public NoEnergyMultiController(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
        this.recipeMapWorkable = new NoEnergyLogic(this);
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addParallelsLine(recipeMapWorkable.getParallelLimit())
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, true, true, true, false);
    }
}
