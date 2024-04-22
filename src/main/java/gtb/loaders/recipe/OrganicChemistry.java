package gtb.loaders.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.RecipeMaps;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.item.GTBMetaItems;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;
import static gregtech.api.recipes.ingredients.IntCircuitIngredient.getIntegratedCircuit;
import static gregtech.api.unification.ore.OrePrefix.*;
import gregtech.common.items.MetaItems;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class OrganicChemistry {
    public static void init() {
        GTBMaterialRecipeHandler.register();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.SulfuricAcid.getFluid(1000)).fluidInputs(GTBMaterials.SodiumFormate.getFluid(1000)).fluidOutputs(GTBMaterials.FormicAcid.getFluid(1000)).output(dust, GTBMaterials.SodiumFormate, 7).duration(80).EUt(120).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.SulfuricAcid.getFluid(1000)).fluidInputs(GTBMaterials.SodiumFormate.getFluid(1000)).fluidOutputs(GTBMaterials.FormicAcid.getFluid(1000)).output(dust, GTBMaterials.SodiumFormate, 7).duration(80).EUt(120).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.CarbonMonoxide.getFluid(1000)).input(dust, SodiumHydroxide, 3).circuitMeta(0).duration(60).EUt(30).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.CarbonMonoxide.getFluid(1000)).input(dust, SodiumHydroxide, 3).circuitMeta(0).duration(60).EUt(30).buildAndRegister();

    }
    }
