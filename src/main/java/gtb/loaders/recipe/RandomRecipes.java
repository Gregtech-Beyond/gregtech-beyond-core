package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class RandomRecipes {

    public static void init() {
        WATER_TANK_RECIPES.recipeBuilder().circuitMeta(1).duration(20).fluidOutputs(Water.getFluid(200))
                .buildAndRegister();

        SOLAR_THERMAL_CONCENTRATOR_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .duration(20)
                .fluidInputs(Water.getFluid(10))
                .fluidOutputs(Steam.getFluid(5000))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(Lava.getFluid(1000))
                .input(stick, Steel)
                .output(ALUMINO_SILICATE_WOOL_SHEET)
                .duration(200)
                .EUt(250)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(ALUMINO_SILICATE_WOOL_SHEET)
                .output(dust, AluminoSilicateWool, 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();
    }
}
