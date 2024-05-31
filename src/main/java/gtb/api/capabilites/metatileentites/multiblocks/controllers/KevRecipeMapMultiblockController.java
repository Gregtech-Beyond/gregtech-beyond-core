package gtb.api.capabilites.metatileentites.multiblocks.controllers;

import java.util.List;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;

import gtb.api.capabilites.GTBMultiblockAbility;
import gtb.api.capabilites.containers.impl.KevContainer;
import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;
import gtb.api.capabilites.containers.interfaces.machines.KevMachine;
import gtb.api.capabilites.metatileentites.multiblocks.logics.MultiblockKevRecipeLogic;
import lombok.Getter;

@Getter
public abstract class KevRecipeMapMultiblockController extends RecipeMapMultiblockController implements KevMachine {

    private IKevContainer iKevContainer;
    private final MultiblockAbility<IKevContainer> multiblockAbility;

    public KevRecipeMapMultiblockController(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap,
                                            boolean doesGenerateKev) {
        super(metaTileEntityId, recipeMap);
        this.multiblockAbility = doesGenerateKev ? GTBMultiblockAbility.KEY_CONTAINER_OUTPUT :
                GTBMultiblockAbility.KEY_CONTAINER_INPUT;
        this.initializeAbilities();
        this.recipeMapWorkable = new MultiblockKevRecipeLogic(this, this.iKevContainer, doesGenerateKev);
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
        return predicate.or(abilities(this.multiblockAbility)
                .setExactLimit(1)
                .setPreviewCount(1));
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
    }

    private int getMaxKev() {
        return 1;
    }

    @Override
    protected void initializeAbilities() {
        super.initializeAbilities();
        this.iKevContainer = new KevContainer(this, this.getMaxKev());
        List<IKevContainer> iKevContainers = this.getAbilities(this.multiblockAbility);
        this.iKevContainer = iKevContainers.isEmpty() ? null : iKevContainers.get(0);
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
