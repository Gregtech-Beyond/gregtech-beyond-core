package gtb.loaders.recipe.handlers.ore_processing;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

public class NickelProcessing {

    public static void init() {
        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Garnierite, 2)
                .output(dust, Nickel)
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(20)
                .EUt(90)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Garnierite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Garnierite));

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Garnierite, 2) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(9500))
                .fluidInputs(Oxygen.getFluid(37000))
                .fluidInputs(SulfuricAcid.getFluid(4000))
                .input(dust, Pentlandite, 17)
                .fluidOutputs(NickelSulfuricSolution.getFluid(10000))
                .output(dust, NickelRareResidue)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, NickelRareResidue)
                .output(dust, PlatinumGroupSludge)
                .output(dust, Silver)
                .output(dust, Zinc)
                .duration(900)
                .EUt(70)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(NickelSulfuricSolution.getFluid(1000))
                .output(dust, NickelSulfatePrecipitate)
                .fluidOutputs(SodiumArsenateSulfuricSolution.getFluid(150))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(SodiumArsenateSulfuricSolution.getFluid(2000))
                .input(dust, SodiumIodide, 8)
                .output(dust, SodiumSulfide, 14)
                .output(dust, ArsenicTrioxide, 5)
                .output(dust, Iodine, 4)
                .fluidOutputs(Water.getFluid(5000))
                .EUt(700)
                .duration(500)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumHydroxideSolution.getFluid(6000))
                .input(dust, Iodine, 6)
                .output(dust, SodiumIodate, 5)
                .output(dust, SodiumIodide, 10)
                .fluidOutputs(Water.getFluid(9000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Sulfur, 2)
                .input(dust, NickelSulfatePrecipitate, 12)
                .output(dust, CopperFreeNickelSulfide, 12)
                .output(dust, CopperSulfide, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(500)
                .blastFurnaceTemp(500)
                .EUt(70)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Sulfur, 2)
                .output(dust, CupricOxide, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(500)
                .blastFurnaceTemp(1100)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(2000))
                .fluidInputs(Ammonia.getFluid(2800))
                .input(dust, CopperFreeNickelSulfide, 6)
                .output(dust, Nickel)
                .fluidOutputs(AmmoniaMetalSulfuricSolution.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenSulfide.getFluid(2000))
                .output(dust, CobaltSulfide, 2)
                .output(dust, NickelSulfide, 2)
                .fluidInputs(AmmoniaMetalSulfuricSolution.getFluid(5000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Pentlandite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Pentlandite));

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, CopperSulfide)
                .fluidOutputs(CopperSulfideSolution.getFluid(1000))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(CopperSulfideSolution.getFluid(1000))
                .output(dust, CupricOxide, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES, OreDictUnifier.get(dust, Powellite, 6));
    }
}
