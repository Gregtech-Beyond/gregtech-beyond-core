package gtb.loaders.recipe;


import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.RecipeMaps;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;
import static gregtech.api.recipes.ingredients.IntCircuitIngredient.getIntegratedCircuit;
import static gregtech.api.unification.ore.OrePrefix.*;
import gregtech.common.items.MetaItems;


public final class GTBRecipeLoader {

    public static void init() {
        GTBMaterialRecipeHandler.register();

        GTBRecipeMaps.WATER_TANK.recipeBuilder().circuitMeta(1).duration(20).fluidOutputs(Materials.Water.getFluid(200)).buildAndRegister();
        GTBRecipeMaps.SOLAR_THERMAL_CONCENTRATOR.recipeBuilder().circuitMeta(1).duration(20).fluidInputs(Materials.Water.getFluid(10)).fluidOutputs(Materials.Steam.getFluid(5000)).buildAndRegister();










    }
}
