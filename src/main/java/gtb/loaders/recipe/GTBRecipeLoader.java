package gtb.loaders.recipe;

import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;

public final class GTBRecipeLoader {

    private GTBRecipeLoader() {}

    public static void init() {
        GTBMaterialRecipeHandler.register();
    }
}
