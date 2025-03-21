package gtb.api.metatileentity.multiblock;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.ItemStack;

import org.jetbrains.annotations.NotNull;

import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.recipes.Recipe;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.util.GTTransferUtils;

import gtb.api.capabilities.IKevMachine;
import gtb.api.capabilities.KevContainer;
import gtb.api.recipes.properties.KevRecipeProperty;
import gtb.api.unification.materials.GTBMaterials;

public class KevConsumerLogic extends MultiblockRecipeLogic {

    private IKevMachine kevMachine;
    private int recipeKev;
    private int currentKev;

    public KevConsumerLogic(RecipeMapMultiblockController tileEntity) {
        super(tileEntity);
        this.kevMachine = (IKevMachine) tileEntity;
    }

    @Override
    public void updateWorkable() {
        super.updateWorkable();
        if (metaTileEntity.getOffsetTimer() % 20 == 0) {
            KevContainer kevContainer = kevMachine.getKevContainer();
            if (kevContainer == null) {
                this.currentKev = 0;
            } else {
                kevContainer.scanAndSetKev();
                this.currentKev = kevContainer.getKev();
            }
        }
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe) {
        this.recipeKev = recipe.getProperty(KevRecipeProperty.getInstance(), KevRecipeProperty.DEFAULT_VALUE);
        return isKevValid() && super.checkRecipe(recipe);
    }

    @Override
    protected void updateRecipeProgress() {
        if (isKevValid()) {
            super.updateRecipeProgress();
        } else {
            resetRecipe();
            outputsNuclearWaste();
        }
    }

    protected void resetRecipe() {
        this.progressTime = 0;
        setMaxProgress(0);
        this.recipeEUt = 0;
        this.fluidOutputs = null;
        this.itemOutputs = null;
        this.hasNotEnoughEnergy = false;
        this.wasActiveAndNeedsUpdate = true;
        this.parallelRecipesPerformed = 0;
        this.overclockResults = new int[] { 0, 0 };
    }

    protected void outputsNuclearWaste() {
        List<ItemStack> nuclearWaste = Collections
                .singletonList(OreDictUnifier.get(OrePrefix.dust, GTBMaterials.NuclearWaste));
        GTTransferUtils.addItemsToItemHandler(getOutputInventory(), false, nuclearWaste);
    }

    private boolean isKevValid() {
        return this.recipeKev == this.currentKev;
    }
}
