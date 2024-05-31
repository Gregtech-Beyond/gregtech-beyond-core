package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.unification.materials.GTBMaterials.Rubidium;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.common.items.MetaItems;

public class RubidiumProcessing {

    public static void init() {
        // (Al2O3)Cs2(SiO2)2(H2O)2O + 3HCl -> RbCl(CsCl)2(H2O)2 + Al2O3 + 2SiO2 + O (lost)
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Pollucite, 10)
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .output(dust, Alumina)
                .output(dust, SiliconDioxide, 4)
                .fluidOutputs(HeavyAlkaliChlorideSolution.getFluid(1000))
                .duration(400).EUt(VA[EV]).buildAndRegister();

        // Sn + 4Cl -> SnCl4
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Tin)
                .fluidInputs(Chlorine.getFluid(4000))
                .fluidOutputs(StannicChloride.getFluid(1000))
                .duration(100).EUt(VA[HV]).buildAndRegister();

        // 2RbCl(CsCl)2(H2O)2 + 3SnCl4 -> Rb2SnCl6 + 2Cs2SnCl6 + 4H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HeavyAlkaliChlorideSolution.getFluid(1000))
                .fluidInputs(StannicChloride.getFluid(1500))
                .output(dust, RubidiumChlorostannate, 4)
                .output(dust, CaesiumChlorostannate, 9)
                .fluidOutputs(Water.getFluid(2000))
                .duration(400).EUt(VA[EV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .input(dust, RubidiumChlorostannate, 6)
                .output(dust, TinFourChloride, 3)
                .fluidOutputs(DilutedRubidiumSolution.getFluid(2000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .input(dust, CaesiumChlorostannate, 6)
                .output(dust, TinFourChloride, 3)
                .fluidOutputs(DilutedCaesiumSolution.getFluid(2000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(DilutedCaesiumSolution.getFluid(1000))
                .output(dust, Caesium)
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(DilutedRubidiumSolution.getFluid(1000))
                .output(dust, Rubidium)
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .input(dust, TinFourChloride, 2)
                .notConsumable(stick, Steel)
                .notConsumable(MagnesiumChlorideSolution.getFluid(432))
                .notConsumable(stick, Platinum)
                .output(dust, Tin)
                .fluidOutputs(Chlorine.getFluid(1000))
                .duration(90)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, MagnesiumChloride)
                .fluidOutputs(MagnesiumChlorideSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();
    }

    public static final class PlatinumLine {

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

            SIFTER_RECIPES.recipeBuilder()
                    .input(dust, PlatinumSalt)
                    .output(dust, PlatinumMetallicPowder)
                    .duration(129)
                    .EUt(80)
                    .buildAndRegister();

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

            GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES,
                    new ItemStack[] {
                            OreDictUnifier.get(dust, PlatinumGroupSludge, 6) },
                    new FluidStack[] { AquaRegia.getFluid(1200) });

            BLAST_RECIPES.recipeBuilder()
                    .fluidInputs(AquaRegia.getFluid(1000))
                    .input(dust, PlatinumMetallicPowder, 3)
                    .fluidOutputs(PlatinumSolution.getFluid(1000))
                    .blastFurnaceTemp(1900)
                    .duration(700)
                    .EUt(120)
                    .buildAndRegister();

            GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                    new FluidStack[] { RhodiumSulfate.getFluid(1000) });

            DEHYDRATOR_RECIPES.recipeBuilder()
                    .fluidInputs(RhodiumSulfateSolution.getFluid(1000))
                    .input(dust, Zinc)
                    .output(dust, ZincSulfide, 6)
                    .output(dust, CrudeRhodiumMetal, 2)
                    .EUt(30)
                    .duration(300)
                    .buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .input(dust, CrudeRhodiumMetal, 2)
                    .input(dust, Salt, 2)
                    .output(dust, RhodiumSalt, 3)
                    .blastFurnaceTemp(775)
                    .EUt(120)
                    .duration(300)
                    .buildAndRegister();

            MIXER_RECIPES.recipeBuilder()
                    .input(dust, RhodiumSalt, 3)
                    .fluidInputs(Chlorine.getFluid(1000))
                    .fluidOutputs(RhodiumSaltSolution.getFluid(1000))
                    .EUt(30)
                    .duration(30)
                    .buildAndRegister();

            // 2Na + 2HNO3 + O -> 2NaNO3 + H2O
            CHEMICAL_RECIPES.recipeBuilder()
                    .input(dust, Sodium, 2)
                    .fluidInputs(NitricAcid.getFluid(2000))
                    .fluidInputs(Oxygen.getFluid(1000))
                    .output(dust, SodiumNitrate, 10)
                    .fluidOutputs(Water.getFluid(1000))
                    .EUt(60)
                    .duration(8)
                    .buildAndRegister();

            // Rh(NaCl)2Cl + NaNO3 + 2NO2 + 2O -> 3NaCl + Rh(NH3)3
            LARGE_CHEMICAL_RECIPES.recipeBuilder()
                    .fluidInputs(RhodiumSaltSolution.getFluid(1000))
                    .fluidInputs(NitrogenDioxide.getFluid(2000))
                    .fluidInputs(Oxygen.getFluid(2000))
                    .input(dust, SodiumNitrate, 5)
                    .output(dust, Salt, 6)
                    .output(dust, RhodiumNitrate, 13)
                    .EUt(30)
                    .duration(300)
                    .buildAndRegister();

            // Rh(NH3)3 -> Rh(NH3)3
            SIFTER_RECIPES.recipeBuilder()
                    .input(dust, RhodiumNitrate, 13)
                    .chancedOutput(OreDictUnifier.get(dust, RhodiumFilterCake, 2), 9500, 0)
                    .EUt(30)
                    .duration(600)
                    .buildAndRegister();

            // Rh(NH3)3 + 2H2O -> Rh(NH3)3(H2O)2
            MIXER_RECIPES.recipeBuilder()
                    .input(dust, RhodiumFilterCake, 2)
                    .fluidInputs(Water.getFluid(2000))
                    .fluidOutputs(RhodiumFilterCakeSolution.getFluid(1000))
                    .EUt(30)
                    .duration(300)
                    .buildAndRegister();

            // Rh(NH3)2(H2O)2 -> Rh + 2NH3 + 2H2O (H2O lost to dehydrator)
            DEHYDRATOR_RECIPES.recipeBuilder()
                    .fluidInputs(RhodiumFilterCakeSolution.getFluid(1000))
                    .output(dust, Rhodium)
                    .fluidOutputs(Ammonia.getFluid(2000))
                    .EUt(30)
                    .duration(500)
                    .buildAndRegister();

            GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES,
                    new ItemStack[] {
                            OreDictUnifier.get(dust, IridiumMetalResidue, 5) });
        }
    }
}
