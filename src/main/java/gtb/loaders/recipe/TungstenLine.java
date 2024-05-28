package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class TungstenLine {

    public static void init() {
        DEHYDRATOR_RECIPES.recipeBuilder()
                .input(dust, TungsticAcid, 7)
                .output(dust, TungstenTrioxide, 4)
                .duration(200)
                .EUt(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .input(dust, Scheelite, 7)
                .input(dust, SodiumHydroxide, 6)
                .output(dust, CalciumHydroxide, 10)
                .fluidOutputs(SodiumTungstate.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Tungstate, 7)
                .input(dust, SodiumHydroxide, 6)
                .output(dust, LithiumHydroxide, 6)
                .fluidOutputs(SodiumTungstate.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CalciumChloride, 3)
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(SodiumTungstate.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(2000))
                .output(dust, CalciumTungstate, 6)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(2000))
                .output(dust, TungsticAcid, 7)
                .output(dust, CalciumHydroxide, 5)
                .input(dust, CalciumTungstate, 6)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, LithiumHydroxide, 3)
                .fluidOutputs(LithiumHydroxideSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(LithiumHydroxideSolution.getFluid(1000))
                .fluidInputs(HydrofluoricAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, LithiumFluoride, 2)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, LithiumFluoride, 2)
                .fluidOutputs(Fluorine.getFluid(1000))
                .output(dust, Lithium, 1)
                .duration(70)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(6000))
                .input(dust, TungstenTrioxide, 4)
                .output(dust, Tungsten, 1)
                .fluidOutputs(Water.getFluid(3000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES, OreDictUnifier.get(dust, TungsticAcid, 7));
    }
}
