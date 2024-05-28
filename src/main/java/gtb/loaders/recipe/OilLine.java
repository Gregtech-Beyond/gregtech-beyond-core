package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.common.items.MetaItems;

import gtb.api.recipes.GTBRecipeMaps;

public class OilLine {

    public static void init() {
        CENTRIFUGE_RECIPES.recipeBuilder().fluidInputs(DilutedOil.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(600)).fluidOutputs(DesaltedOil.getFluid(400)).EUt(299)
                .duration(120).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(DesaltedOil.getFluid(1000))
                .fluidOutputs(SulfuricGas.getFluid(500)).fluidOutputs(SulfuricGasoline.getFluid(100))
                .fluidOutputs(SulfuricNaphtha.getFluid(200))
                .fluidOutputs(SulfuricOilResidues.getFluid(150))
                .fluidOutputs(SulfuricKerosene.getFluid(100))
                .fluidOutputs(SulfuricDiesel.getFluid(200)).duration(250).EUt(12).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(SulfuricKerosene.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(Kerosene.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(SulfuricGasoline.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(Gasoline.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(SulfuricFuelOil.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(FuelOil.getFluid(1000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000)).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(SulfuricDiesel.getFluid(1000))
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
                .fluidOutputs(Ethylene.getFluid(500)).fluidOutputs(Propylene.getFluid(200))
                .fluidOutputs(Butane.getFluid(100)).fluidOutputs(Hydrogen.getFluid(200))
                .fluidOutputs(Methane.getFluid(500)).fluidOutputs(Ethane.getFluid(300))
                .fluidOutputs(Nonene.getFluid(200)).duration(200).EUt(800).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(FuelOil.getFluid(1000))
                .fluidOutputs(Propane.getFluid(150)).fluidOutputs(Ethane.getFluid(100))
                .fluidOutputs(Methane.getFluid(100)).fluidOutputs(Hexane.getFluid(300))
                .fluidOutputs(Pentane.getFluid(250)).fluidOutputs(Butane.getFluid(250)).duration(200)
                .EUt(480).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(Kerosene.getFluid(1000))
                .fluidOutputs(Propane.getFluid(250)).fluidOutputs(Ethane.getFluid(200))
                .fluidOutputs(Methane.getFluid(100)).fluidOutputs(Hexane.getFluid(100))
                .fluidOutputs(Pentane.getFluid(150)).fluidOutputs(Butane.getFluid(250)).duration(200)
                .EUt(480).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(Kerosene.getFluid(1000))
                .fluidInputs(Steam.getFluid(1000)).fluidOutputs(SteamCrackedKerosene.getFluid(1000))
                .duration(200).EUt(12).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(Kerosene.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000)).fluidOutputs(HydroCrackedKerosene.getFluid(1000))
                .duration(200).EUt(12).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(HydroCrackedKerosene.getFluid(1000))
                .fluidOutputs(Propane.getFluid(100)).fluidOutputs(Ethane.getFluid(75))
                .fluidOutputs(Methane.getFluid(75)).fluidOutputs(Gasoline.getFluid(600))
                .fluidOutputs(Naphtha.getFluid(100)).fluidOutputs(Butane.getFluid(100)).duration(200).EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(SteamCrackedKerosene.getFluid(1000))
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
                .fluidOutputs(FractionC_5.getFluid(150))
                .fluidOutputs(Butene.getFluid(80))
                .fluidOutputs(Kerosene.getFluid(75))
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
                .fluidOutputs(FractionC_5.getFluid(350))
                .fluidOutputs(Butene.getFluid(50))
                .fluidOutputs(Kerosene.getFluid(25))
                .fluidOutputs(Gasoline.getFluid(50))
                .fluidOutputs(Toluene.getFluid(20))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(FractionC_5.getFluid(1000))
                .fluidOutputs(Dicyclopentadiene.getFluid(200))
                .fluidOutputs(Pentane.getFluid(400))
                .fluidOutputs(Isoprene.getFluid(400)).duration(200).EUt(12).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(Dicyclopentadiene.getFluid(1000))
                .fluidOutputs(Cyclopentadiene.getFluid(2000))
                .duration(80).EUt(90).buildAndRegister();

        // Desulfurization with CoMoAl Catalyst

        // Dilution of Oil

        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(2000))
                .fluidInputs(OilHeavy.getFluid(500)).fluidOutputs(DilutedOil.getFluid(2500)).EUt(80)
                .duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(RawOil.getFluid(1000))
                .fluidOutputs(DilutedOil.getFluid(2500)).EUt(80).duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1300))
                .fluidInputs(OilLight.getFluid(1200)).fluidOutputs(DilutedOil.getFluid(2500)).EUt(80)
                .duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(Oil.getFluid(1000))
                .fluidOutputs(DilutedOil.getFluid(2500)).EUt(80).duration(100).buildAndRegister();

        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(OilHeavy.getFluid(500))
                .fluidOutputs(DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(RawOil.getFluid(1000))
                .fluidOutputs(DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(800)).fluidInputs(OilLight.getFluid(1200))
                .fluidOutputs(DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(Oil.getFluid(1000))
                .fluidOutputs(DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();

        GTBRecipeMaps.FISCHER_TROPSCH_REACTOR_RECIPES.recipeBuilder().fluidInputs(DistilledWater.getFluid(2000))
                .fluidInputs(RefineryGas.getFluid(8000)).notConsumable(dust, CobaltOxide, 1)
                .output(PARAFFIN_WAX, 1).fluidOutputs(Diesel.getFluid(1000))
                .fluidOutputs(Gasoline.getFluid(500)).fluidOutputs(Water.getFluid(2000))
                .fluidOutputs(SulfuricAcid.getFluid(1000)).fluidOutputs(Ethylene.getFluid(1500))
                .fluidOutputs(Ethanol.getFluid(1500)).fluidOutputs(Methane.getFluid(2000))
                .fluidOutputs(Formaldehyde.getFluid(500)).duration(200).EUt(5000).buildAndRegister();

        VACUUM_DISTILLATION_TOWER_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricOilResidues.getFluid(1000))
                .fluidOutputs(LubricantMixture.getFluid(850))
                .fluidOutputs(SulfuricFuelOil.getFluid(200))
                .output(BITUMINOUS_RESIDUES, 1)
                .fluidOutputs(SulfuricDiesel.getFluid(200))
                .fluidOutputs(SulfuricKerosene.getFluid(150))
                .fluidOutputs(SulfuricNaphtha.getFluid(100))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(LubricantMixture.getFluid(1000))
                .fluidOutputs(SlackWax.getFluid(350))
                .fluidOutputs(Lubricant.getFluid(650))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(PARAFFIN_WAX)
                .fluidOutputs(Resin.getFluid(1000))
                .duration(20)
                .EUt(8)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(SlackWax.getFluid(1000))
                .output(PARAFFIN_WAX, 4)
                .fluidOutputs(Lubricant.getFluid(250))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .fluidInputs(Resin.getFluid(100))
                .fluidOutputs(Glue.getFluid(100))
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(Resin.getFluid(100))
                .output(MetaItems.STICKY_RESIN, 1)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(MetaItems.STICKY_RESIN, 1)
                .fluidOutputs(Resin.getFluid(100))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        COKER_RECIPES.recipeBuilder()
                .input(BITUMINOUS_RESIDUES, 1)
                .fluidInputs(Steam.getFluid(1000))
                .fluidOutputs(SulfuricOilResidues.getFluid(150))
                .output(dust, Coke, 4)
                .duration(200)
                .EUt(99)
                .buildAndRegister();
    }
}
