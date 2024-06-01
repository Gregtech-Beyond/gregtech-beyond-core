package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

public class TinProcessing {

    public static void init() {
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, CassiteriteSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, CassiteriteSand));

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, CassiteriteSand, 3) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, CassiteriteSand, 3)
                .fluidOutputs(Steam.getFluid(2000))
                .circuitMeta(1)
                .output(dust, Tin)
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, CassiteriteSand, 3)
                .circuitMeta(0)
                .output(dust, Tin)
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Cassiterite, 3) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Cassiterite, 3)
                .fluidOutputs(Steam.getFluid(2000))
                .circuitMeta(1)
                .output(dust, Tin)
                .duration(200)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Cassiterite, 3)
                .circuitMeta(0)
                .output(dust, Tin)
                .duration(200)
                .EUt(7)
                .buildAndRegister();
    }
}
