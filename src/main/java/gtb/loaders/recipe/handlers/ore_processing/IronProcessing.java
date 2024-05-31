package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;

public class IronProcessing {

    public static void init() {
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Magnetite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Magnetite));

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .input(dust, Magnetite)
                .output(ingot, Iron)
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Magnetite, 3)
                .input(dust, Carbon, 2)
                .output(ingot, BandedIron, 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Magnetite, 3)
                .input(dust, Charcoal, 2)
                .output(ingot, BandedIron, 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Magnetite, 3)
                .input(dust, Coal, 2)
                .output(ingot, BandedIron, 4)
                .duration(200)
                .buildAndRegister();

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Magnetite, 3)
                .input(dust, Coke)
                .output(ingot, BandedIron, 4)
                .duration(200)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BandedIron));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BandedIron));

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .input(ingot, BandedIron, 5)
                .output(ingot, Iron, 2)
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .input(dust, BandedIron, 5)
                .output(ingot, Iron, 2)
                .duration(200)
                .EUt(12)
                .blastFurnaceTemp(1000)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(100))
                .input(dust, BandedIron, 5)
                .output(ingot, Iron, 2)
                .EUt(8)
                .duration(80)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, YellowLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, YellowLimonite));

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, YellowLimonite, 4)
                .fluidInputs(Hydrogen.getFluid(3000))
                .output(dust, Iron)
                .fluidOutputs(Steam.getFluid(2000))
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BrownLimonite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BrownLimonite));

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, BrownLimonite, 4)
                .fluidInputs(Hydrogen.getFluid(3000))
                .output(dust, Iron)
                .fluidOutputs(Steam.getFluid(2000))
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, BasalticMineralSand));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, BasalticMineralSand));

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, BandedIron, 5) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Magnetite, 7) });
    }
}
