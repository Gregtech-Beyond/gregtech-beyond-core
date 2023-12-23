package tkcy.simpleaddon.loaders.recipe;

import tkcy.simpleaddon.loaders.recipe.handlers.TKCYSAMaterialRecipeHandler;

public final class TKCYSARecipeLoader {

    private TKCYSARecipeLoader() {}

    public static void init() {
        TKCYSAMaterialRecipeHandler.register();
    }
}
