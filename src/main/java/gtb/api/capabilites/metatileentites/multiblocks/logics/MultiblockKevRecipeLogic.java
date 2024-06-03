package gtb.api.capabilites.metatileentites.multiblocks.logics;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.recipeproperties.RecipeProperty;

import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;
import gtb.api.capabilites.containers.interfaces.machines.KevMachine;
import gtb.api.capabilites.metatileentites.multiblocks.controllers.KevRecipeMapMultiblockController;
import gtb.api.recipes.properties.KevInputRecipeProperty;
import gtb.api.recipes.properties.KevOutputRecipeProperty;
import lombok.Getter;

public class MultiblockKevRecipeLogic extends MultiblockRecipeLogic implements KevMachine {

    private int kevRecipeValue;
    @Getter
    private final RecipeProperty<Integer> recipeProperty;

    public MultiblockKevRecipeLogic(KevRecipeMapMultiblockController tileEntity,
                                    boolean doesGenerateKev) {
        super(tileEntity);
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
        this.getIKevContainer().changeKev(this.kevRecipeValue);
    }
}
