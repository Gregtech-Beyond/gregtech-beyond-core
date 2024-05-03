package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;

import gtb.api.unification.materials.GTBMaterials;
import gtb.common.item.GTBMetaItems;

public class BiologyLines {

    public static void init() {

    CHEMICAL_RECIPES.recipeBuilder()
            .notConsumable(GTBMetaItems.PETRI_DISH_MOLD)
            .fluidInputs(Polybenzimidazole.getFluid(144))
            .fluidInputs(Polytetrafluoroethylene.getFluid(144))
            .fluidInputs(GTBMaterials.Polyetheretherketone.getFluid(144))
            .output(GTBMetaItems.PETRI_DISH)
            .duration(200)
            .EUt(700)
            .buildAndRegister();

    CHEMICAL_BATH_RECIPES.recipeBuilder()
            .input(GTBMetaItems.PETRI_DISH)
            .output(GTBMetaItems.STERILIZED_PETRI_DISH)
            .fluidInputs(GTBMaterials.HundredEthanol.getFluid(1000))
            .duration(200)
            .EUt(12)
            .buildAndRegister();

    CHEMICAL_BATH_RECIPES.recipeBuilder()
            .input(GTBMetaItems.STERILIZED_PETRI_DISH)
            .output(GTBMetaItems.PLUS_STERILIZED_PETRI_DISH)
            .fluidInputs(GTBMaterials.HundredButanol.getFluid(1000))
            .fluidInputs(GTBMaterials.HundredMethanol.getFluid(1000))
            .duration(200)
            .EUt(12)
            .buildAndRegister();

    CHEMICAL_RECIPES.recipeBuilder()
            .input(GTBMetaItems.PLUS_STERILIZED_PETRI_DISH)
            .input(dust, GTBMaterials.CupriavidusNecatorBacteriaSample)
            .output(GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
            .duration(40)
            .EUt(200)
            .buildAndRegister();

    CHEMICAL_RECIPES.recipeBuilder()
            .input(GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
            .fluidInputs(GTBMaterials.Cuproquin.getFluid(1000))
            .output(GTBMetaItems.CUPRIAVIDUS_NECATOR_CULTURE)
            .duration(1200)
            .EUt(80)
            .buildAndRegister();









    }
}
