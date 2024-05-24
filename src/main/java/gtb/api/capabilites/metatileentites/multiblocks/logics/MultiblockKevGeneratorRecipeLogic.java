package gtb.api.capabilites.metatileentites.multiblocks.logics;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.recipes.Recipe;

import gtb.api.capabilites.interfaces.containers.IKevContainer;
import gtb.api.recipes.properties.KevOutputRecipeProperty;
import gtb.api.utils.GTBLog;
import lombok.Getter;

public class MultiblockKevGeneratorRecipeLogic extends MultiblockRecipeLogic {

    @Getter
    private final IKevContainer iKevContainer;
    private int kevRecipeOutput;

    public MultiblockKevGeneratorRecipeLogic(RecipeMapMultiblockController tileEntity, IKevContainer iKevContainer) {
        super(tileEntity);
        this.iKevContainer = iKevContainer;
        this.kevRecipeOutput = 0;
    }

    public void setKevRecipeOutput(Recipe recipe) {
        if (recipe.getRecipePropertyStorage() != null && recipe.hasProperty(KevOutputRecipeProperty.getInstance())) {
            this.kevRecipeOutput = recipe.getProperty(KevOutputRecipeProperty.getInstance(), 0);
        } else this.kevRecipeOutput = 0;
    }

    @Override
    public void setupRecipe(Recipe recipe) {
        super.setupRecipe(recipe);
        this.setKevRecipeOutput(recipe);
    }

    @Override
    protected void completeRecipe() {
        super.completeRecipe();
        this.iKevContainer.changeKev(this.kevRecipeOutput);
        GTBLog.logger.info("Completed recipe, added " + this.kevRecipeOutput);
    }

    /*
     * @Override
     * public boolean checkRecipe(@NotNull Recipe recipe) {
     * this.setKevRecipeOutput(recipe);
     * // return this.iKevContainer.canChangeKev(this.kevRecipeOutput) && super.checkRecipe(recipe);
     * return super.checkRecipe(recipe);
     * }
     * 
     */
}
