package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;

public class AluminiumProcessing {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Bauxite, 15) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Bauxite)
                .output(dust, RoastedBauxite)
                .fluidOutputs(Steam.getFluid(1000))
                .duration(200)
                .EUt(2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, RoastedBauxite, 5)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(ingot, Aluminium, 2)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Aluminium, 1),
                        IntCircuitIngredient.getIntegratedCircuit(1) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Aluminium, 1),
                        IntCircuitIngredient.getIntegratedCircuit(2) },
                new FluidStack[] {
                        Nitrogen.getFluid(1000)
                });

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Nitrogen.getFluid(1000))
                .circuitMeta(2)
                .input(dust, Aluminium)
                .output(ingot, Aluminium)
                .duration(360)
                .EUt(140)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .input(dust, Aluminium)
                .output(ingot, Aluminium)
                .duration(580)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, RoastedBauxite, 2)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .output(dust, LeachedBauxite)
                .chancedOutput(dust, RedMudConcentrate, 1, 200, 20)
                .chancedOutput(dust, AluminiumHydroxide, 2, 400, 0)
                .duration(200)
                .EUt(300)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .input(dust, LeachedBauxite, 2)
                .fluidInputs(Hydrogen.getFluid(4000))
                .fluidOutputs(HydrogenChloride.getFluid(2000))
                .output(dust, AluminiumHydroxide, 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodiumAluminate, 3)
                .fluidOutputs(SodiumAluminateSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(SodiumAluminateSolution.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(SodiumHydroxideSolution.getFluid(1000))
                .output(dust, AluminiumHydroxide, 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, AluminiumHydroxide, 4)
                .output(ingot, Aluminium, 1)
                .fluidOutputs(Steam.getFluid(2000))
                .duration(200)
                .EUt(400)
                .blastFurnaceTemp(1800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, AluminiumHydroxide, 5)
                .output(dust, Alumina, 2)
                .fluidOutputs(Steam.getFluid(2000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(dust, Alumina)
                .fluidOutputs(Alumina.getFluid(144))
                .duration(60)
                .EUt(7)
                .buildAndRegister();
    }
}
