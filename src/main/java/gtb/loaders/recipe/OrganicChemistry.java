package gtb.loaders.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;

import gtb.api.unification.materials.GTBMaterials;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;

public class OrganicChemistry {

    public static void init() {
        GTBMaterialRecipeHandler.register();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.SulfuricAcid.getFluid(1000))
                .fluidInputs(GTBMaterials.SodiumFormate.getFluid(1000))
                .fluidOutputs(GTBMaterials.FormicAcid.getFluid(1000)).output(dust, GTBMaterials.SodiumFormate, 7)
                .duration(80).EUt(120).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.SulfuricAcid.getFluid(1000))
                .fluidInputs(GTBMaterials.SodiumFormate.getFluid(1000))
                .fluidOutputs(GTBMaterials.FormicAcid.getFluid(1000)).output(dust, GTBMaterials.SodiumFormate, 7)
                .duration(80).EUt(120).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.CarbonMonoxide.getFluid(1000))
                .input(dust, SodiumHydroxide, 3).circuitMeta(0).duration(60).EUt(30).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.CarbonMonoxide.getFluid(1000))
                .input(dust, SodiumHydroxide, 3).circuitMeta(0).duration(60).EUt(30).buildAndRegister();
    }
}
