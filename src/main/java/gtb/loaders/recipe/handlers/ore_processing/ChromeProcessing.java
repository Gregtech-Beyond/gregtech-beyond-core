package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class ChromeProcessing {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SodiumCarbonateSolution.getFluid(4000))
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Chromite, 7)
                .fluidOutputs(CarbonDioxide.getFluid(4000))
                .fluidOutputs(SodiumChromateSolution.getFluid(4000))
                .output(dust, BandedIron, 5)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, SodaAsh, 5)
                .fluidOutputs(SodiumCarbonateSolution.getFluid(1000))
                .duration(299)
                .EUt(500)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(SodiumChromateSolution.getFluid(2000))
                .output(dust, SodiumSulfate, 7)
                .fluidOutputs(SodiumDichromateSolution.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SodiumDichromateSolution.getFluid(1000))
                .output(dust, SodiumDichromate, 11)
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumDichromate, 5)
                .fluidInputs(Water.getFluid(1000))
                .output(dust, ChromiumTrioxide, 3)
                .fluidOutputs(SodaAshSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SodaAshSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, SodaAsh, 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodaAsh, 3)
                .fluidOutputs(SodaAshSolution.getFluid(1000))
                .duration(400)
                .EUt(280)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .input(dust, ChromiumTrioxide, 5)
                .input(dust, Aluminium, 2)
                .output(dust, Alumina, 5)
                .output(dust, Chrome, 2)
                .duration(200)
                .EUt(180)
                .buildAndRegister();
    }
}
