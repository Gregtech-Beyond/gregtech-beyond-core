package gtb.api.capabilites.metatileentites.multiblocks.controllers;

import java.util.List;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;

import gtb.api.capabilites.GTBMultiblockAbility;
import gtb.api.capabilites.containers.impl.KevContainer;
import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;
import gtb.api.capabilites.containers.interfaces.machines.KevMachine;
import gtb.api.capabilites.metatileentites.multiblocks.logics.MultiblockKevGeneratorRecipeLogic;
import lombok.Getter;

@Getter
public abstract class KevRecipeMapMultiblockController extends RecipeMapMultiblockController implements KevMachine {

    private IKevContainer iKevContainer;

    public KevRecipeMapMultiblockController(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
        this.initializeAbilities();
        this.recipeMapWorkable = new MultiblockKevGeneratorRecipeLogic(this, this.iKevContainer);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public TraceabilityPredicate autoAbilities(boolean checkEnergyIn,
                                               boolean checkMaintenance,
                                               boolean checkItemIn,
                                               boolean checkItemOut,
                                               boolean checkFluidIn,
                                               boolean checkFluidOut,
                                               boolean checkMuffler) {
        TraceabilityPredicate predicate = super.autoAbilities(checkEnergyIn, checkMaintenance, checkItemIn,
                checkItemOut, checkFluidIn, checkFluidOut, checkMuffler);
        return predicate.or(abilities(GTBMultiblockAbility.KEY_CONTAINER_OUTPUT)
                .setExactLimit(1)
                .setPreviewCount(1));
    }

    private int getMaxKev() {
        List<IKevContainer> iKevContainers = this.getAbilities(GTBMultiblockAbility.KEY_CONTAINER_OUTPUT);
        if (iKevContainers.isEmpty()) return 0;
        return iKevContainers.get(0).getMaxKev();
    }

    @Override
    protected void initializeAbilities() {
        super.initializeAbilities();
        this.iKevContainer = new KevContainer(this, this.getMaxKev());
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        /*
         * this.logic.setKevRecipeOutput(recipe);
         * // return this.iKevContainer.canChangeKev(this.kevRecipeOutput) && super.checkRecipe(recipe);
         * return super.checkRecipe(recipe);
         * }
         * return true;
         * 
         */
        return true;
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.iKevContainer.resetContainer();
    }
}
