package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

public class ManganeseProcessing {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES, OreDictUnifier.get(dust, Pyrolusite, 3));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Pyrolusite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Pyrolusite));

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Pyrolusite, 3)
                .circuitMeta(0)
                .output(dust, Manganese)
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Pyrolusite, 3)
                .circuitMeta(1)
                .fluidOutputs(Steam.getFluid(1000))
                .output(dust, Manganese)
                .duration(200)
                .EUt(7)
                .buildAndRegister();
    }
}
