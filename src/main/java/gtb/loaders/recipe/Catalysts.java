package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.block.blocks.GTBMultiblockCasing.CasingType.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.unification.material.Materials;

import gtb.common.block.GTBMetaBlocks;

public class Catalysts {

    public static void init() {
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(Tetrapropylammoniumbromide.getFluid(1000))
                .input(dust, SodiumHydroxide, 1)
                .input(dust, SiliconDioxide, 6)
                .input(dust, AluminiumSulfite, 51)
                .output(dust, ZSM5, 1)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidInputs(Tripropylamine.getFluid(1000))
                .fluidOutputs(Tetrapropylammoniumbromide.getFluid(1000))
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidInputs(Tripropylamine.getFluid(1000))
                .fluidOutputs(Tetrapropylammoniumbromide.getFluid(1000))
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NPropanol.getFluid(1500))
                .fluidInputs(Ammonia.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .fluidOutputs(Tripropylamine.getFluid(500))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NPropanol.getFluid(1500))
                .fluidInputs(Ammonia.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .fluidOutputs(Tripropylamine.getFluid(500))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Pyrolusite, 3)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(PotassiumHydroxide.getFluid(2000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, PotassiumManganate, 7)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(CarbonSulfide.getFluid(1000))
                .fluidInputs(IsobutylAlcohol.getFluid(1000))
                .output(dust, SodiumIsobutylXanthate)
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .input(dust, Sulfur, 2)
                .fluidOutputs(CarbonSulfide.getFluid(1000))
                .chancedOutput(dust, Ash, 1111, 0)
                .duration(1200)
                .blastFurnaceTemp(1290)
                .EUt(660)
                .buildAndRegister();

        CANNER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumPotassium.getFluid(1000))
                .input(COOLANT_CELL)
                .output(NAK_COOLANT_CELL)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(FLUID_CELL)
                .output(COOLANT_CELL)
                .duration(120)
                .EUt(300)
                .buildAndRegister();

        // Philips Catalyst

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide, 3)
                .input(dust, ChromiumTrioxide, 4)
                .output(dust, PhilipsCatalyst, 7)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        // Ziegler Natta Catalyst

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TitaniumTetrachloride.getFluid(1000))
                .fluidInputs(TriethylAluminium.getFluid(1000))
                .output(dust, ZieglerNattaCatalyst, 2)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylene.getFluid(3000))
                .input(dust, Aluminium)
                .fluidOutputs(TriethylAluminium.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        // Kaminsky Catalyst

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(Toluene.getFluid(1000))
                .input(dust, MethylAluminoxane)
                .input(dust, RecrystallizedZirconiumDioxide, 6)
                .output(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidOutputs(TrimethylAluminium.getFluid(1000))
                .input(dust, Aluminium)
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(TrimethylAluminium.getFluid(1000))
                .fluidOutputs(Methane.getFluid(2000))
                .output(dust, MethylAluminoxane)
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Chlorine.getFluid(1000))
                .input(dust, Materials.Zirconium)
                .fluidOutputs(ZirconiumChloride.getFluid(1000))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ZirconiumChloride.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(ZirconiumDioxideSolution.getFluid(1000))
                .fluidOutputs(HydrogenChloride.getFluid(1000))
                .duration(200)
                .EUt(600)
                .buildAndRegister();

        CRYSTALLIZATION.recipeBuilder()
                .fluidInputs(ZirconiumDioxideSolution.getFluid(1000))
                .output(dust, RecrystallizedZirconiumDioxide, 2)
                .duration(500)
                .EUt(670)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Polystyrene.getFluid(144))
                .input(wireFine, Gold)
                .input(dust, Glucose)
                .output(BORON_RETAINING_YARN)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, FullerenePolymerTetrix, 6)
                .input(frameGt, FullerenePolymerMatrix)
                .circuitMeta(6)
                .outputs(GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getItemVariant(FULLERENE_POLYMER_TETRIX_CASING))
                .duration(200)
                .EUt(800)
                .buildAndRegister();
    }
}
