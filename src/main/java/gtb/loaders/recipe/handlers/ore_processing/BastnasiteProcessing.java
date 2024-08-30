package gtb.loaders.recipe.handlers.ore_processing;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.DIGESTER_RECIPES;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Holmium;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class BastnasiteProcessing {

    public static void init() {
        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Bastnasite)
                .input(dust, Calcite)
                .output(dust, CalcinatedBastnasite, 2)
                .duration(290)
                .EUt(70)
                .buildAndRegister();

        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(NitricAcid.getFluid(1000))
                .input(dust, CalcinatedBastnasite)
                .output(dust, CalcinatedSiliconDioxide)
                .fluidOutputs(MuddyBastnasiteSolution.getFluid(1000))
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, CalcinatedSiliconDioxide)
                .output(dust, SiliconDioxide)
                .output(dust, CalcinatedResidues)
                .duration(500)
                .EUt(600)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, CalcinatedResidues)
                .fluidOutputs(CalcinatedResidues.getFluid(1000))
                .duration(800)
                .EUt(670)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(CalcinatedResidues.getFluid(1000))
                .output(dust, CalciumDioxide, 2)
                .fluidOutputs(MuddyWater.getFluid(1000))
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CalciumDioxide, 2)
                .notConsumable(dust, DeoxygenationCatalyst)
                .output(dust, Calcite)
                .EUt(900)
                .duration(600)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(MuddyBastnasiteSolution.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .fluidOutputs(ConditionedBastnasiteMud.getFluid(1432))
                .duration(400)
                .EUt(80)
                .buildAndRegister();

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(4000))
                .fluidInputs(ConditionedBastnasiteMud.getFluid(1432))
                .fluidOutputs(DilutedBastnasiteMud.getFluid(5000))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(DilutedBastnasiteMud.getFluid(5000))
                .fluidOutputs(FilteredBastnasiteMud.getFluid(1000))
                .chancedOutput(dust, Ilmenite, 7500, 60)
                .chancedOutput(dust, Rutile, 3200, 80)
                .chancedOutput(dust, SiliconDioxide, 6000, 80)
                .duration(800)
                .EUt(912)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(FilteredBastnasiteMud.getFluid(1000))
                .circuitMeta(1)
                .output(dust, BastnasiteOxideComposite, 1)
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .input(dust, BastnasiteOxideComposite)
                .input(dust, SodiumHydroxide, 3)
                .fluidOutputs(BastnasiteConcentrate.getFluid(1000))
                .duration(200)
                .EUt(600)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(BastnasiteConcentrate.getFluid(1000))
                .fluidInputs(NitricAcid.getFluid(1000))
                .fluidOutputs(NitrogenDioxide.getFluid(1000))
                .fluidOutputs(AcidicBastnasiteConcentrate.getFluid(1000))
                .duration(190)
                .EUt(2090)
                .buildAndRegister();

        DILUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(AcidicBastnasiteConcentrate.getFluid(1000))
                .fluidInputs(Fluorine.getFluid(1000))
                .fluidOutputs(HydrofluoricAcid.getFluid(1000))
                .fluidOutputs(CeriumRichBastnasiteConcentrate.getFluid(1000))
                .duration(900)
                .EUt(1009)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .notConsumable(stick, Iridium)
                .notConsumable(stick, StainlessSteel)
                .fluidInputs(CeriumRichBastnasiteConcentrate.getFluid(1000))
                .fluidOutputs(AcidicCeriumBasedMud.getFluid(400))
                .fluidOutputs(BastnasiteRarerEarthOxidesMixture.getFluid(600))
                .output(dust, SodiumNitride, 9)
                .duration(200)
                .EUt(8000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AcidicCeriumBasedMud.getFluid(1000))
                .fluidInputs(PotassiumHydroxide.getFluid(432))
                .output(dust, Potassium, 2)
                .fluidOutputs(CeriumSolution.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DILUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(CeriumSolution.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidOutputs(DilutedCeriumSolution.getFluid(2000))
                .EUt(500)
                .duration(800)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(DilutedCeriumSolution.getFluid(1000))
                .output(dust, CeriumOxide, 2)
                .fluidOutputs(Water.getFluid(1000))
                .duration(1000)
                .EUt(900)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, CeriumOxide, 3)
                .output(dust, Cerium)
                .fluidOutputs(Oxygen.getFluid(2000))
                .duration(1200)
                .EUt(70)
                .buildAndRegister();

        DRYER_RECIPES.recipeBuilder()
                .fluidInputs(BastnasiteRarerEarthOxidesMixture.getFluid(1000))
                .output(dust, DriedBastnasiteRarerEarthOxidesPulp, 1)
                .output(dust, BastnasiteByProducts, 1)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, DriedBastnasiteRarerEarthOxidesPulp)
                .fluidOutputs(BastnasiteRarerEarthOxidesEmulsion.getFluid(1000))
                .duration(890)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(BastnasiteRarerEarthOxidesEmulsion.getFluid(1000))
                .fluidOutputs(BastnasiteRarerEarthOxidesSolution.getFluid(1000))
                .output(dust, Salt, 3)
                .EUt(900)
                .duration(280)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(BastnasiteRarerEarthOxidesSolution.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .output(dust, SamaricRareEarthConcentrate, 2)
                .fluidOutputs(SamariumReducedRarerEarthOxides.getFluid(1000))
                .duration(800)
                .EUt(1890)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(SamariumReducedRarerEarthOxides.getFluid(1000))
                .notConsumable(dust, HydrogenationCatalyst)
                .output(dust, NeodymiumRareEarthConcentrate, 2)
                .fluidOutputs(HydrogenChloride.getFluid(2000))
                .duration(890)
                .EUt(600)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, NeodymiumRareEarthConcentrate, 2)
                .fluidInputs(AquaRegia.getFluid(1000))
                .fluidOutputs(DilutedAquaRegia.getFluid(2000))
                .output(dust, NeodymiumOxide)
                .output(dust, LanthanumOxide)
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(DilutedAquaRegia.getFluid(2000))
                .fluidOutputs(AquaRegia.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(129)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SamariumRareEarthConcentrate, 2)
                .fluidInputs(AquaRegia.getFluid(1000))
                .fluidOutputs(DilutedAquaRegia.getFluid(2000))
                .output(dust, SamariumOxide)
                .output(dust, HolmiumOxide)
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(HydrofluoricAcid.getFluid(1000))
                .input(dust, HolmiumOxide)
                .output(dust, HolmiumFluoride)
                .EUt(280)
                .duration(900)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, HolmiumFluoride, 2)
                .input(dust, Calcium)
                .output(dust, Holmium)
                .output(dust, CalciumFluoride)
                .EUt(800)
                .blastFurnaceTemp(1800)
                .duration(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, CalciumFluoride, 3)
                .output(dust, Calcium)
                .fluidOutputs(Fluorine.getFluid(2000))
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, SamariumOxide, 3)
                .output(dust, Samarium)
                .fluidOutputs(Oxygen.getFluid(2000))
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, LanthanumOxide, 3)
                .output(dust, Lanthanum)
                .fluidOutputs(Oxygen.getFluid(2000))
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, NeodymiumOxide, 3)
                .output(dust, Neodymium)
                .fluidOutputs(Oxygen.getFluid(2000))
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, RareEarth, 1) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Bastnasite, 6) });
    }
}
