package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.MarkerMaterials;

import gtb.common.item.GTBMetaItems;

public final class AdamantiumLine {

    public static void init() {
        BEDROCK_PUMP_RECIPES.recipeBuilder()
                .fluidOutputs(BedrockContaminatedOil.getFluid(12))
                .duration(9000)
                .EUt(7000)
                .circuitMeta(1)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(BedrockContaminatedOil.getFluid(1000))
                .fluidOutputs(OilHeavy.getFluid(400))
                .output(dust, WetBedrockDust)
                .output(dust, GrainsOfInfinity)
                .output(dust, Stone)
                .output(dust, BasalticMineralSand)
                .duration(401)
                .EUt(700)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(PhosphorusPentoxide.getFluid(1000))
                .fluidOutputs(PhosphoricAcid.getFluid(1000))
                .input(dust, WetBedrockDust, 1)
                .output(dust, OilyBedrockDust, 1)
                .duration(700)
                .EUt(80)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(16000))
                .fluidInputs(Perfluorotributylamine.getFluid(100))
                .notConsumable(dust, SodiumIsobutylXanthate)
                .input(dust, Salt)
                .input(dust, OilyBedrockDust)
                .fluidOutputs(BedrockSlurry.getFluid(1000))
                .duration(1200)
                .EUt(7800)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(BedrockSlurry.getFluid(1000))
                .fluidOutputs(PurifiedBedrockSlurry.getFluid(900))
                .fluidOutputs(WasteWater.getFluid(100))
                .duration(100)
                .EUt(700)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(PurifiedBedrockSlurry.getFluid(1000))
                .fluidOutputs(AdamantaneRichOilSolution.getFluid(400))
                .output(dust, Diamond)
                .output(dust, Oilsands, 2)
                .output(dust, FineBedrockDust)
                .duration(1200)
                .EUt(120)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(Ozone.getFluid(1000))
                .fluidOutputs(LiquidOzone.getFluid(1000))
                .duration(100)
                .EUt(2000)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(6000))
                .fluidOutputs(Ozone.getFluid(2000))
                .duration(800)
                .EUt(7012)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, FineBedrockDust)
                .fluidInputs(LiquidOzone.getFluid(1000))
                .output(dust, Adamantite)
                .blastFurnaceTemp(1900)
                .EUt(7000)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Adamantite, 2)
                .fluidInputs(AquaRegia.getFluid(2000))
                .fluidOutputs(TriniumSolution.getFluid(1000))
                .output(dust, EnrichedNaquadahNitrate)
                .output(dust, NaquadriaNitrate)
                .output(dust, AdamantiumPentoxide)
                .duration(2000)
                .EUt(700)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(dust, AdamantiumPentoxide)
                .fluidOutputs(AdamantiumPentoxide.getFluid(1000))
                .duration(900)
                .EUt(120)
                .buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(AdamantiumPentoxide.getFluid(12))
                .fluidInputs(Hydrogen.getFluid(12))
                .fluidOutputs(AdamantiumPhosphorusHydrogenPlasma.getPlasma(12))
                .EUToStart(320000000)
                .EUt(200000)
                .duration(70)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .notConsumable(dust, DarmstadtiumCatalyst)
                .input(dust, Tungsten, 2)
                .output(dust, TungstenTrioxide, 6)
                .output(dust, Adamantium, 2)
                .input(GTBMetaItems.LASER_ASSEMBLY)
                .fluidInputs(GaseousAdamantane.getFluid(400))
                .fluidInputs(AdamantiumPentoxide.getFluid(1000))
                .duration(9000)
                .EUt(400)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(Fluorine.getFluid(1000))
                .fluidInputs(AntimonyPentafluoride.getFluid(1000))
                .input(dust, Triphenylphosphine)
                .fluidOutputs(FluorodarmstadticAcid.getFluid(1000))
                .duration(210)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Fluorine.getFluid(2000))
                .input(dust, AntimonyTrifluoride, 4)
                .fluidOutputs(AntimonyPentafluoride.getFluid(1000))
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(AdamantiumPhosphorusHydrogenPlasma.getPlasma(2000))
                .output(dust, Phosphorus)
                .output(dust, AdamantiumPentoxide, 2)
                .fluidOutputs(GaseousAdamantane.getFluid(800))
                .fluidOutputs(Hydrogen.getFluid(400))
                .fluidOutputs(MoltenAdamantiumDioxide.getFluid(400))
                .duration(620)
                .EUt(12000)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(MoltenAdamantiumDioxide.getFluid(1000))
                .fluidOutputs(MithrilFluoride.getFluid(500))
                .fluidOutputs(AdamantaneLubricant.getFluid(500))
                .output(dust, Adamantite)
                .EUt(200)
                .duration(8000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(AquaRegia.getFluid(1000))
                .input(dust, Adamantite, 2)
                .output(dust, EnrichedNaquadahNitrate, 2)
                .output(dust, NaquadriaNitrate, 2)
                .output(dust, AdamantiumPentoxide)
                .fluidOutputs(TriniumSolution.getFluid(1000))
                .duration(1200)
                .EUt(7800)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenSulfide.getFluid(1000))
                .fluidInputs(TriniumSolution.getFluid(1000))
                .output(dust, TriniumSulfide, 2)
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .duration(120)
                .EUt(600)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, TriniumSulfide, 2)
                .output(dust, Trinium)
                .output(dust, Sulfur)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(MithrilFluoride.getFluid(1000))
                .input(dust, Lithium)
                .output(dust, LithiumFluoride)
                .output(dust, PrecipitateMithril, 2)
                .duration(950)
                .EUt(1278)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, PrecipitateMithril)
                .output(dustTiny, Silver)
                .output(dustTiny, Copper)
                .output(dust, RoughenMithril)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(craftingLens, MarkerMaterials.Color.Blue)
                .input(dust, RoughenMithril)
                .output(dust, ExcitedRoughenMithril)
                .duration(120)
                .EUt(790)
                .buildAndRegister();

        NEUTRON_ACCELERATOR_RECIPES.recipeBuilder()
                .input(dust, ExcitedRoughenMithril)
                .output(dustSmall, Potassium)
                .output(dustTiny, Naquadah)
                .output(dust, ExcitedMithril)
                .duration(1280)
                .EUt(9000)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .output(dust, Mithril)
                .input(dust, ExcitedMithril)
                .duration(2000)
                .EUt(8)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, NaquadriaNitrate)
                .input(dust, Sodium)
                .output(dust, SodiumNitrate, 3)
                .output(dust, NaquadriaticCompound)
                .duration(800)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, EnrichedNaquadahNitrate)
                .input(dust, Sodium)
                .output(dust, SodiumNitrate, 3)
                .output(dust, EnrichedNaquadahCompound)
                .duration(800)
                .EUt(670)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(AdamantaneRichOilSolution.getFluid(1000))
                .fluidOutputs(Adamantane.getFluid(400))
                .fluidOutputs(Perfluorotributylamine.getFluid(90))
                .fluidOutputs(IodizedOil.getFluid(510))
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(AlkylatedAdamantanes.getFluid(2000))
                .fluidInputs(IsoOctane.getFluid(1000))
                .fluidInputs(Adamantane.getFluid(1000))
                .notConsumable(dust, AluminiumChloride, 3)
                .duration(900)
                .EUt(80000)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(AlkylatedAdamantanes.getFluid(1000))
                .fluidOutputs(AdamantaneLubricant.getFluid(500))
                .fluidOutputs(Ethanol.getFluid(500))
                .duration(700)
                .EUt(7800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Tributylamine.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(Perfluorotributylamine.getFluid(2000))
                .EUt(700)
                .duration(1200)
                .buildAndRegister();
    }
}
