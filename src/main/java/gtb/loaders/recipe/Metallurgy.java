package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public final class Metallurgy {

    public static void init() {
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144))
                .input(ingot, Palladium, 3)
                .output(ingot, RhodiumPlatedPalladium, 4)
                .duration(122)
                .EUt(24)
                .buildAndRegister();
    }
}
