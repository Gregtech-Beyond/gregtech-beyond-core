package gtb.loaders.recipe.ore_processing;


import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gtb.api.unification.ore.GTBOrePrefix;

public class StrontiumProcessing {

    public static void init() {
        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .input(dust, Celestine)
                .output(GTBOrePrefix.sifted, Celestine)
                .duration(140)
                .EUt(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(GTBOrePrefix.sifted, Celestine, 4)
                .fluidOutputs(ImpureCelestineSlurry.getFluid(1000))
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(ImpureCelestineSlurry.getFluid(1000))
                .notConsumable(MethylIsobutylCarbonyl.getFluid(1000))
                .notConsumable(dust, SodiumAcetate, 2)
                .notConsumable(dust, SodiumIsobutylXanthate, 2)
                .fluidOutputs(CelestineSlurry.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(CelestineSlurry.getFluid(1000))
                .output(GTBOrePrefix.floated, Celestine, 16)
                .fluidOutputs(WasteWater.getFluid(1000))
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(GTBOrePrefix.floated, Celestine, 1)
                .output(dust, SiliconDioxide)
                .fluidOutputs(StrontiumSulfideSolution.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(StrontiumSulfideSolution.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .fluidOutputs(SodiumHydroxideSolution.getFluid(1000))
                .output(dust, StrontiumCarbonate, 2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .input(dust, StrontiumCarbonate, 2)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(dust, Strontium)
                .duration(200)
                .EUt(90)
                .buildAndRegister();
    }
}
