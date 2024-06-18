package gtb.loaders.recipe.handlers;

import static gregtech.api.recipes.RecipeMaps.BENDER_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.plate;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;

import gtb.api.unification.ore.GTBOrePrefix;

public final class GTBMaterialRecipeHandler {

    public static void register() {
        GTBOrePrefix.itemCasing.addProcessingHandler(GTBMaterialRecipeHandler::generateItemCasing);
    }

    private static void generateItemCasing(OrePrefix orePrefix, Material material) {
        BENDER_RECIPES.recipeBuilder()
                .input(plate, material)
                .output(orePrefix, material, 2)
                .duration(400)
                .EUt(60)
                .buildAndRegister();
    }
}
