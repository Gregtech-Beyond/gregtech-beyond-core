package gtb.loaders.recipe;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;

import gtb.api.recipes.GTBRecipeMaps;

public class KevRecipes {

    public static void init() {
        GTBRecipeMaps.KEV_TEST.recipeBuilder()
                .KeV(25)
                .EUt(100)
                .duration(300)
                .input(OrePrefix.ingot, Materials.Steel)
                .output(OrePrefix.ingot, Materials.SteelMagnetic)
                .buildAndRegister();
    }
}
