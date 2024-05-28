package gtb.loaders.recipe.polymerLines;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class PolystyreneLine {

    public static void init() {
        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(1000))
                .fluidInputs(Air.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(4000))
                .notConsumable(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(2000))
                .notConsumable(dust, PhilipsCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(3000))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();
    }
}
