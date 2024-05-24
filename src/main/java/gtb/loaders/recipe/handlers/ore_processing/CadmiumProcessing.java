package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class CadmiumProcessing {

    public static void init() {
        ROASTER.recipeBuilder()
                .input(dust, Zincite)
                .fluidOutputs(CrudeZinc.getFluid(144))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(CrudeZinc.getFluid(144))
                .notConsumable(SHAPE_MOLD_INGOT)
                .duration(200)
                .output(ingot, Zinc)
                .EUt(80)
                .buildAndRegister();
    }
}
