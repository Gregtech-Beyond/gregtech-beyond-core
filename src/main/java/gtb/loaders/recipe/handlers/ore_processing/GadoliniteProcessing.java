package gtb.loaders.recipe.handlers.ore_processing;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.BURNER_REACTOR_RECIPES;
import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.DIGESTER_RECIPES;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.unification.material.Materials;

public class GadoliniteProcessing {

    public static void init() {
        DIGESTER_RECIPES.recipeBuilder()
                .input(dust, Gadolinite, 1)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(GadoliniteLeachSolution.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
                .fluidInputs(GadoliniteLeachSolution.getFluid(1000))
                .fluidInputs(Ice.getFluid(1000))
                .fluidOutputs(CooledGadoliniteLeachSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(800)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(CooledGadoliniteLeachSolution.getFluid(1000))
                .notConsumable(dust, WroughtIron)
                .fluidOutputs(RoastedGadoliniteLeachSolution.getFluid(1000))
                .duration(120)
                .EUt(890)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(RoastedGadoliniteLeachSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(GadoliniumLeach.getFluid(600))
                .fluidOutputs(REEGroupMud.getFluid(400))
                .duration(900)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .fluidInputs(GadoliniumLeach.getFluid(1000))
                .notConsumable(Alumina.getFluid(100))
                .fluidOutputs(GadoliniumSolution.getFluid(600))
                .fluidOutputs(SulfuricResidues.getFluid(400))
                .notConsumable(stick, Titanium)
                .notConsumable(stick, Aluminium)
                .duration(600)
                .EUt(600)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricResidues.getFluid(1000))
                .fluidOutputs(LiquidAir.getFluid(1000))
                .output(dust, Sulfur)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GadoliniumSolution.getFluid(1000))
                .output(dust, GadoliniumOxide, 4)
                .fluidOutputs(Water.getFluid(1000))
                .duration(240)
                .EUt(700)
                .buildAndRegister();

        DILUTION_REFRIGERATOR_RECIPES.recipeBuilder()
                .fluidInputs(REEGroupMud.getFluid(1000))
                .fluidInputs(AquaRegia.getFluid(1000))
                .fluidOutputs(DilutedAquaRegia.getFluid(2000))
                .fluidOutputs(LanthanumLeachEmulsion.getFluid(500))
                .fluidOutputs(RarerEarthConcentrate.getFluid(500))
                .duration(800)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(LanthanumLeachEmulsion.getFluid(1000))
                .input(dust, SodiumHydroxide, 9)
                .fluidOutputs(LanthanumLeachSolution.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(LanthanumLeachSolution.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(2000))
                .output(dust, Sodium, 3)
                .output(dust, YttriumOxide, 2)
                .output(dust, LanthanumOxide, 2)
                .fluidOutputs(ExquisiteScandiumLeachResidues.getFluid(200))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(ExquisiteScandiumLeachResidues.getFluid(1000))
                .notConsumable(CHROMATIC_GLASS_FIBER)
                .fluidOutputs(PurifiedScandiumLeachResidues.getFluid(1000))
                .output(SATURATED_CHROMATIC_GLASS_FIBER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(SATURATED_CHROMATIC_GLASS_FIBER)
                .output(CHROMATIC_GLASS_FIBER)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(SodiumSulfideSolution.getFluid(1000))
                .duration(100)
                .EUt(700)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(PurifiedScandiumLeachResidues.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .chancedOutput(dust, ScandiumOxide, 2, 200, 100)
                .chancedOutput(dust, Potassium, 2500, 0)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, ScandiumOxide, 2)
                .output(dust, Materials.Scandium)
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(RarerEarthConcentrate.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Water.getFluid(1600))
                .fluidOutputs(RarestEarthMixture.getFluid(400))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(RarestEarthMixture.getFluid(1000))
                .output(dust, ErbiumOxide, 2)
                .output(dust, CeriumOxide, 2)
                .fluidOutputs(DysprosiumOxideSolution.getFluid(1000))
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(DysprosiumOxideSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, DysprosiumOxide, 3)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, DysprosiumOxide, 2)
                .fluidOutputs(Oxygen.getFluid(1000))
                .output(dust, Dysprosium)
                .duration(900)
                .EUt(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, ErbiumOxide, 2)
                .fluidOutputs(Oxygen.getFluid(1000))
                .output(dust, Erbium)
                .duration(900)
                .EUt(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, YttriumOxide, 2)
                .fluidOutputs(Oxygen.getFluid(1000))
                .output(dust, Yttrium)
                .duration(900)
                .EUt(80)
                .buildAndRegister();
    }
}
