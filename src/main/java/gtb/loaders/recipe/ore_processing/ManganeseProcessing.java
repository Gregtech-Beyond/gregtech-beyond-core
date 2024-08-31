package gtb.loaders.recipe.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;


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
    }
}
