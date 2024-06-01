package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class ArsenicProcessing {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, Realgar, 2)
                .fluidOutputs(RealgarSolution.getFluid(1000))
                .duration(120)
                .EUt(10)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(RealgarSolution.getFluid(1000))
                .output(dust, RecrystallizedRealgar)
                .duration(100)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, RecrystallizedRealgar)
                .output(dust, ArsenicHydroxide, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, ArsenicHydroxide, 2)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .output(dust, Arsenic)
                .duration(50)
                .blastFurnaceTemp(1200)
                .EUt(70)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Realgar, 2) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, ArsenicTrioxide, 5) });
    }
}
