package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

public class CopperProcessing {

    public static void init() {
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Bornite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Bornite));

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Bornite, 2)
                .output(dust, RoastedBornite, 2)
                .fluidOutputs(SulfurDioxide.getFluid(2000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, RoastedBornite, 1)
                .input(dust, Carbon, 2)
                .output(ingot, Copper)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, RoastedBornite, 1)
                .input(dust, Charcoal, 2)
                .output(ingot, Copper)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, RoastedBornite, 1)
                .input(dust, Coal, 2)
                .output(ingot, Copper)
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, RoastedBornite, 1)
                .output(ingot, Copper)
                .chancedOutput(ingot, Iron, 2000, 1)
                .blastFurnaceTemp(800)
                .EUt(80)
                .duration(160)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Chalcocite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Chalcocite));

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Chalcocite, 2)
                .output(dust, Copper)
                .fluidOutputs(SulfurDioxide.getFluid(2000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Tetrahedrite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Tetrahedrite));

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Tetrahedrite, 8) });

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Malachite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Malachite));

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Malachite)
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Coke, 2)
                .output(dust, MalachiteSlag)
                .fluidOutputs(CarbonDioxide.getFluid(2000))
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(2000))
                .fluidOutputs(Steam.getFluid(4000))
                .input(dust, MalachiteSlag)
                .output(dust, SinteredMalachiteSlag)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .input(dust, SinteredMalachiteSlag)
                .output(ingot, Copper)
                .duration(400)
                .EUt(50)
                .buildAndRegister();
    }
}
