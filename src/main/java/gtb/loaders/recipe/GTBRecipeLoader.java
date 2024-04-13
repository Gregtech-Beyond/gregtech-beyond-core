package gtb.loaders.recipe;

import gregtech.api.unification.material.Materials;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBRecipeLoader {

    public static void init() {
        GTBMaterialRecipeHandler.register();

        GTBRecipeMaps.WATER_TANK.recipeBuilder()
                .circuitMeta(1)
                .duration(20)
                .fluidOutputs(Materials.Water.getFluid(200))
                .buildAndRegister();
    }
}
