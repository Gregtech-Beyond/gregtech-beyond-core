package gtb.loaders.recipe;

import static gregtech.api.unification.material.Materials.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

public class RandomRecipes {

    public static void init() {
        WATER_TANK.recipeBuilder().circuitMeta(1).duration(20).fluidOutputs(Water.getFluid(200))
                .buildAndRegister();
        SOLAR_THERMAL_CONCENTRATOR.recipeBuilder().circuitMeta(1).duration(20)
                .fluidInputs(Water.getFluid(10)).fluidOutputs(Steam.getFluid(5000))
                .buildAndRegister();
    }
}
