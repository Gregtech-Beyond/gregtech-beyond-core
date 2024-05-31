package gtb.api.capabilites.metatileentites.multiblocks.logics;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.recipeproperties.RecipeProperty;

import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;
import gtb.api.capabilites.containers.interfaces.machines.KevMachine;
import gtb.api.recipes.properties.KevInputRecipeProperty;
import gtb.api.recipes.properties.KevOutputRecipeProperty;
import gtb.api.utils.GTBLog;
import lombok.Getter;

public class MultiblockKevRecipeLogic extends MultiblockRecipeLogic implements KevMachine {

    private final IKevContainer iKevContainer;
    private int kevRecipeValue;
    @Getter
    private final RecipeProperty<Integer> recipeProperty;

    public MultiblockKevRecipeLogic(RecipeMapMultiblockController tileEntity, IKevContainer iKevContainer,
                                    boolean doesGenerateKev) {
        super(tileEntity);
        this.iKevContainer = iKevContainer;
        this.kevRecipeValue = 0;
        this.recipeProperty = doesGenerateKev ? KevOutputRecipeProperty.getInstance() :
                KevInputRecipeProperty.getInstance();
    }

    @Override
    public IKevContainer getIKevContainer() {
        return ((KevMachine) this.metaTileEntity).getIKevContainer();
    }

    public void setKevRecipeValue(Recipe recipe) {
        if (recipe.getRecipePropertyStorage() != null && recipe.hasProperty(this.recipeProperty)) {
            this.kevRecipeValue = recipe.getProperty(this.recipeProperty, 0);
        } else this.kevRecipeValue = 0;
    }

    @Override
    public void setupRecipe(Recipe recipe) {
        super.setupRecipe(recipe);
        this.setKevRecipeValue(recipe);
    }

    @Override
    protected void completeRecipe() {
        super.completeRecipe();
        this.iKevContainer.changeKev(this.kevRecipeValue);
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe) {
        this.setKevRecipeValue(recipe);
        GTBLog.logger.info("Recipe value : " + this.kevRecipeValue);
        GTBLog.logger.info("this.iKevContainer.canChangeKev(this.kevRecipeValue) : " +
                this.iKevContainer.canChangeKev(this.kevRecipeValue));
        return this.iKevContainer.canChangeKev(this.kevRecipeValue) && super.checkRecipe(recipe);
    }
}
