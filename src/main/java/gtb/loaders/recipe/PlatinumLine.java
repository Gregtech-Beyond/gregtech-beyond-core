package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.common.items.MetaItems;

public final class PlatinumLine {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AquaRegia.getFluid(9000))
                .input(dust, PlatinumGroupSludge, 18)
                .output(dust, PlatinumResidues, 5)
                .fluidOutputs(PlatinumConcentrate.getFluid(9000))
                .circuitMeta(1).duration(20).EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, PotassiumDisulfate, 11)
                .input(dust, PlatinumResidues, 5)
                .output(dust, Sulfur, 7)
                .output(dust, LeachResidue, 4)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(RhodiumSulfate.getFluid(1000))
                .EUt(120).duration(120).blastFurnaceTemp(775)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(9000))
                .fluidInputs(RhodiumSulfate.getFluid(27000))
                .output(dust, LeachResidue, 4)
                .circuitMeta(1).fluidOutputs(RhodiumSulfateSolution.getFluid(27000))
                .EUt(30).duration(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(3000))
                .input(dust, SodaAsh, 18)
                .input(dust, LeachResidue, 40)
                .output(dust, SodiumRuthenate, 21)
                .output(dust, RarestMetalMixture, 6)
                .fluidOutputs(CarbonMonoxide.getFluid(3000))
                .EUt(120).duration(600).blastFurnaceTemp(775)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Chlorine.getFluid(4000))
                .input(dust, SodiumRuthenate, 14)
                .fluidOutputs(RutheniumTetroxideSolution.getFluid(2000))
                .EUt(30).duration(200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(RutheniumTetroxideSolution.getFluid(1000))
                .output(dust, Salt, 4)
                .fluidOutputs(RutheniumTetroxideLiquid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(480).duration(2000).buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(RutheniumTetroxideLiquid.getFluid(1000))
                .notConsumable(MetaItems.SHAPE_MOLD_BALL)
                .output(dust, RutheniumTetroxide)
                .duration(200)
                .EUt(120).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, IridiumMetalResidue, 5)
                .output(dust, IridiumDioxide, 6)
                .output(dust, PlatinumSludgeResidue, 5)
                .blastFurnaceTemp(775)
                .duration(200).EUt(30).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().input(dust, IridiumDioxide, 6)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(AcidicIridiumDioxide.getFluid(1000))
                .duration(200).EUt(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, AmmoniumChloride, 4)
                .fluidInputs(AcidicIridiumDioxide.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, IridiumChloride, 8)
                .fluidOutputs(Ammonia.getFluid(4000))
                .duration(800).EUt(900).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PlatinumExtractionMixture.getFluid(4000))
                .fluidInputs(PlatinumConcentrate.getFluid(4000))
                .fluidOutputs(PalladiumExtract.getFluid(1000))
                .fluidOutputs(PlatinumExtract.getFluid(3000))
                .duration(200).EUt(120).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PlatinumExtract.getFluid(1000))
                .fluidOutputs(PlatinumExtractionMixture.getFluid(1000))
                .fluidOutputs(PlatinumSolution.getFluid(1000))
                .duration(200).EUt(80).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PlatinumSolution.getFluid(1000))
                .input(dust, AmmoniumChloride, 2)
                .fluidOutputs(NitricAcid.getFluid(2000))
                .fluidOutputs(Hydrogen.getFluid(1200))
                .output(dust, PlatinumSalt, 1)
                .output(dust, PlatinumRaw, 2)
                .duration(400).EUt(80).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PalladiumExtract.getFluid(1000))
                .fluidOutputs(PlatinumExtractionMixture.getFluid(1000))
                .fluidOutputs(PalladiumMotherLiqour.getFluid(1000))
                .fluidOutputs(PalladiumEnrichedAmmonia.getFluid(1000))
                .duration(200).EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(1)
                .output(dust, PalladiumSalt, 2)
                .duration(80).EUt(90).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(FormicAcid.getFluid(2000))
                .input(dust, ReprecipitatedPalladium, 2)
                .output(dust, Palladium)
                .fluidOutputs(AceticAcid.getFluid(1000))
                .fluidOutputs(Ammonia.getFluid(2000))
                .duration(800).EUt(9).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PalladiumMetallicPowder, 12)
                .fluidInputs(PalladiumEnrichedAmmonia.getFluid(6000))
                .circuitMeta(1)
                .output(dust, PalladiumSalt, 15)
                .output(dust, PalladiumRaw, 8)
                .duration(80).EUt(90).buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, PalladiumSalt, 1)
                .output(dust, PalladiumMetallicPowder, 1)
                .duration(200).EUt(12).buildAndRegister();
    }
}
