package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import gtb.api.unification.materials.GTBMaterials;

public final class Metallurgy {

    public static void init() {
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144))
                .input(ingot, Palladium, 3)
                .output(ingot, RhodiumPlatedPalladium, 4)
                .duration(122)
                .EUt(24)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(FLUID_CELL)
                .output(COOLANT_CELL)
                .circuitMeta(1)
                .duration(1200)
                .EUt(8)
                .buildAndRegister();

        CANNER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumPotassium.getFluid(1000))
                .input(COOLANT_CELL)
                .output(NAK_COOLANT_CELL)
                .duration(120)
                .EUt(12)
                .buildAndRegister();

    }
}
