package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gregtech.common.items.MetaItems;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.item.GTBMetaItems;

public class OilLine {

    public static void init() {
        CENTRIFUGE_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.DilutedOil.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(600)).fluidOutputs(GTBMaterials.DesaltedOil.getFluid(400)).EUt(299)
                .duration(120).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.DesaltedOil.getFluid(1000))
                .fluidOutputs(SulfuricGas.getFluid(500)).fluidOutputs(GTBMaterials.SulfuricGasoline.getFluid(100))
                .fluidOutputs(SulfuricNaphtha.getFluid(200))
                .fluidOutputs(GTBMaterials.SulfuricOilResidues.getFluid(150))
                .fluidOutputs(GTBMaterials.SulfuricKerosene.getFluid(100))
                .fluidOutputs(GTBMaterials.SulfuricDiesel.getFluid(200)).duration(250).EUt(12).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.SulfuricKerosene.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(GTBMaterials.Kerosene.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.SulfuricGasoline.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(Gasoline.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.SulfuricFuelOil.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(GTBMaterials.FuelOil.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.SulfuricDiesel.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(Diesel.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(Gasoline.getFluid(1000)).fluidOutputs(Propane.getFluid(200))
                .fluidOutputs(Ethane.getFluid(300)).fluidOutputs(Methane.getFluid(350))
                .fluidOutputs(Butane.getFluid(150)).EUt(70).duration(200).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(SteamCrackedButane.getFluid(1000))
                .fluidOutputs(Ethylene.getFluid(350)).fluidOutputs(Methane.getFluid(150))
                .fluidOutputs(Hydrogen.getFluid(100)).fluidOutputs(Butadiene.getFluid(150))
                .fluidOutputs(Propene.getFluid(250)).duration(200).EUt(70).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(SteamCrackedEthane.getFluid(2000))
                .fluidOutputs(Ethylene.getFluid(500)).fluidOutputs(GTBMaterials.Propylene.getFluid(200))
                .fluidOutputs(Butane.getFluid(100)).fluidOutputs(Hydrogen.getFluid(200))
                .fluidOutputs(Methane.getFluid(500)).fluidOutputs(Ethane.getFluid(300))
                .fluidOutputs(GTBMaterials.Nonene.getFluid(200)).duration(200).EUt(800).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.FuelOil.getFluid(1000))
                .fluidOutputs(Propane.getFluid(150)).fluidOutputs(Ethane.getFluid(100))
                .fluidOutputs(Methane.getFluid(100)).fluidOutputs(GTBMaterials.Hexane.getFluid(300))
                .fluidOutputs(GTBMaterials.Pentane.getFluid(250)).fluidOutputs(Butane.getFluid(250)).duration(200)
                .EUt(480).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.Kerosene.getFluid(1000))
                .fluidOutputs(Propane.getFluid(250)).fluidOutputs(Ethane.getFluid(200))
                .fluidOutputs(Methane.getFluid(100)).fluidOutputs(GTBMaterials.Hexane.getFluid(100))
                .fluidOutputs(GTBMaterials.Pentane.getFluid(150)).fluidOutputs(Butane.getFluid(250)).duration(200)
                .EUt(480).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.Kerosene.getFluid(1000))
                .fluidInputs(Steam.getFluid(1000)).fluidOutputs(GTBMaterials.SteamCrackedKerosene.getFluid(1000))
                .duration(200).EUt(12).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.Kerosene.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(GTBMaterials.HydroCrackedKerosene.getFluid(1000))
                .duration(200).EUt(12).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.HydroCrackedKerosene.getFluid(1000))
                .fluidOutputs(Propane.getFluid(100)).fluidOutputs(Ethane.getFluid(75))
                .fluidOutputs(Methane.getFluid(75)).fluidOutputs(Gasoline.getFluid(600))
                .fluidOutputs(Naphtha.getFluid(100)).fluidOutputs(Butane.getFluid(100)).duration(200).EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.SteamCrackedKerosene.getFluid(1000))
                .fluidOutputs(Ethylene.getFluid(150)).fluidOutputs(Methane.getFluid(150))
                .fluidOutputs(Propane.getFluid(150)).fluidOutputs(Propene.getFluid(100))
                .fluidOutputs(Ethane.getFluid(15)).fluidOutputs(Benzene.getFluid(125)).fluidOutputs(Butene.getFluid(80))
                .fluidOutputs(Butadiene.getFluid(50)).fluidOutputs(Gasoline.getFluid(100))
                .fluidOutputs(Naphtha.getFluid(125)).fluidOutputs(Toluene.getFluid(80)).duration(200).EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(LightlySteamCrackedNaphtha.getFluid(1000))
                .fluidOutputs(Ethane.getFluid(35))
                .fluidOutputs(Ethylene.getFluid(200))
                .fluidOutputs(Methane.getFluid(200))
                .fluidOutputs(Butadiene.getFluid(150))
                .fluidOutputs(Propane.getFluid(15))
                .fluidOutputs(Propene.getFluid(200))
                .fluidOutputs(Benzene.getFluid(150))
                .fluidOutputs(GTBMaterials.FractionC_5.getFluid(150))
                .fluidOutputs(Butene.getFluid(80))
                .fluidOutputs(GTBMaterials.Kerosene.getFluid(75))
                .fluidOutputs(Gasoline.getFluid(150))
                .fluidOutputs(Toluene.getFluid(40))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(SeverelySteamCrackedNaphtha.getFluid(1000))
                .fluidOutputs(Ethane.getFluid(65))
                .fluidOutputs(Ethylene.getFluid(500))
                .fluidOutputs(Methane.getFluid(500))
                .fluidOutputs(Butadiene.getFluid(50))
                .fluidOutputs(Propane.getFluid(15))
                .fluidOutputs(Propene.getFluid(300))
                .fluidOutputs(Benzene.getFluid(100))
                .fluidOutputs(GTBMaterials.FractionC_5.getFluid(350))
                .fluidOutputs(Butene.getFluid(50))
                .fluidOutputs(GTBMaterials.Kerosene.getFluid(25))
                .fluidOutputs(Gasoline.getFluid(50))
                .fluidOutputs(Toluene.getFluid(20))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.FractionC_5.getFluid(1000))
                .fluidOutputs(GTBMaterials.Dicyclopentadiene.getFluid(200))
                .fluidOutputs(GTBMaterials.Pentane.getFluid(400))
                .fluidOutputs(Isoprene.getFluid(400)).duration(200).EUt(12).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Dicyclopentadiene.getFluid(1000))
                .fluidOutputs(GTBMaterials.Cyclopentadiene.getFluid(2000))
                .duration(80).EUt(90).buildAndRegister();

        // Desulfurization with CoMoAl Catalyst

        // Dilution of Oil

        GTBRecipeMaps.DILUTION_TANK.recipeBuilder().fluidInputs(Water.getFluid(2000))
                .fluidInputs(OilHeavy.getFluid(500)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2500)).EUt(80)
                .duration(100).buildAndRegister();
        GTBRecipeMaps.DILUTION_TANK.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(RawOil.getFluid(1000))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2500)).EUt(80).duration(100).buildAndRegister();
        GTBRecipeMaps.DILUTION_TANK.recipeBuilder().fluidInputs(Water.getFluid(1300))
                .fluidInputs(OilLight.getFluid(1200)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2500)).EUt(80)
                .duration(100).buildAndRegister();
        GTBRecipeMaps.DILUTION_TANK.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(Oil.getFluid(1000))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2500)).EUt(80).duration(100).buildAndRegister();

        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(OilHeavy.getFluid(500))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(RawOil.getFluid(1000))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(800)).fluidInputs(OilLight.getFluid(1200))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(Oil.getFluid(1000))
                .fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();

        GTBRecipeMaps.FISCHER_TROPSCH_REACTOR.recipeBuilder().fluidInputs(DistilledWater.getFluid(2000))
                .fluidInputs(RefineryGas.getFluid(8000)).notConsumable(dust, CobaltOxide, 1)
                .output(GTBMetaItems.getByNameOrId("paraffin_wax"), 1).fluidOutputs(Diesel.getFluid(1000))
                .fluidOutputs(Gasoline.getFluid(500)).fluidOutputs(Water.getFluid(2000))
                .fluidOutputs(SulfuricAcid.getFluid(1000)).fluidOutputs(Ethylene.getFluid(1500))
                .fluidOutputs(Ethanol.getFluid(1500)).fluidOutputs(Methane.getFluid(2000))
                .fluidOutputs(GTBMaterials.Formaldehyde.getFluid(500)).duration(200).EUt(5000).buildAndRegister();

        GTBRecipeMaps.VACUUM_DISTILLATION_TOWER.recipeBuilder()
                .fluidInputs(GTBMaterials.SulfuricOilResidues.getFluid(1000))
                .fluidOutputs(GTBMaterials.LubricantMixture.getFluid(850))
                .fluidOutputs(GTBMaterials.SulfuricFuelOil.getFluid(200))
                .output(GTBMetaItems.getByNameOrId("bitominous_residues"), 1)
                .fluidOutputs(GTBMaterials.SulfuricDiesel.getFluid(200))
                .fluidOutputs(GTBMaterials.SulfuricKerosene.getFluid(150))
                .fluidOutputs(SulfuricNaphtha.getFluid(100))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.LubricantMixture.getFluid(1000))
                .fluidOutputs(GTBMaterials.SlackWax.getFluid(350))
                .fluidOutputs(Lubricant.getFluid(650))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .input(GTBMetaItems.getByNameOrId("paraffin_wax"))
                .fluidOutputs(GTBMaterials.Resin.getFluid(1000))
                .duration(20)
                .EUt(8)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .circuitMeta(2)
                .input(GTBMetaItems.getByNameOrId("paraffin_wax"))
                .fluidOutputs(Lubricant.getFluid(1000))
                .duration(20)
                .EUt(8)
                .buildAndRegister();

        GTBRecipeMaps.CRYSTALLIZATION.recipeBuilder()
                .fluidInputs(GTBMaterials.SlackWax.getFluid(1000))
                .output(GTBMetaItems.getByNameOrId("paraffin_wax"), 4)
                .fluidOutputs(Lubricant.getFluid(250))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Resin.getFluid(100))
                .fluidOutputs(Glue.getFluid(100))
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Resin.getFluid(100))
                .output(MetaItems.STICKY_RESIN, 1)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(MetaItems.STICKY_RESIN, 1)
                .fluidOutputs(GTBMaterials.Resin.getFluid(100))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        GTBRecipeMaps.COKER.recipeBuilder()
                .input(GTBMetaItems.getByNameOrId("bitominous_residues"), 1)
                .fluidInputs(Steam.getFluid(1000))
                .fluidOutputs(GTBMaterials.SulfuricOilResidues.getFluid(150))
                .output(dust, Coke, 4)
                .duration(200)
                .EUt(99)
                .buildAndRegister();
    }
}
