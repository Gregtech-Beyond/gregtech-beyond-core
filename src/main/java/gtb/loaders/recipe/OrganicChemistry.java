package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class OrganicChemistry {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(SodiumFormate.getFluid(1000))
                .fluidOutputs(FormicAcid.getFluid(1000))
                .output(dust, SodiumFormate, 7)
                .duration(80).EUt(120).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(Water.getFluid(2000))
                .input(dust, CalciumHydroxide, 5)
                .output(dust, CalciumChloride, 3)
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenChloride.getFluid(1000))
                .input(dust, Silicon)
                .fluidOutputs(ChloroSilane.getFluid(1000))
                .duration(600)
                .EUt(48)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ChloroSilane.getFluid(1000))
                .notConsumable(dust, AluminiumChloride)
                .fluidOutputs(DisproportionatedChloroSilane.getFluid(1000))
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidOutputs(Silane.getFluid(1000))
                .fluidOutputs(ChloroSilane.getFluid(1000))
                .fluidInputs(DisproportionatedChloroSilane.getFluid(2000))
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Toluene.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidOutputs(Benzylbromide.getFluid(1000))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Magnesium, 2)
                .fluidInputs(Benzylbromide.getFluid(1000))
                .notConsumable(Nitrogen.getFluid(1000))
                .notConsumable(dust, Iodine)
                .fluidInputs(DiethylEther.getFluid(1000))
                .fluidOutputs(ArylmagnesiumHalides.getFluid(2000))
                .duration(1287)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ArylmagnesiumHalides.getFluid(1000))
                .input(dust, PhosphorusTrichloride, 2)
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(DiethylEther.getFluid(1000))
                .fluidOutputs(TriarylPhosphineSolution.getFluid(4000))
                .duration(1200)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(TriarylPhosphineSolution.getFluid(4000))
                .fluidOutputs(DiethylEther.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .output(dust, Sodium)
                .fluidOutputs(TriarylPhosphine.getFluid(1000))
                .duration(100)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(TriarylPhosphine.getFluid(1000))
                .fluidInputs(Propene.getFluid(1000))
                .fluidOutputs(Butanal.getFluid(1000))
                .input(dust, Rhodium)
                .duration(890)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethanol.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(DiethylEther.getFluid(1000))
                .circuitMeta(2)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethanol.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(Ether.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(dust, Zeolite)
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(NButanol.getFluid(1000))
                .fluidOutputs(Tributylamine.getFluid(1000))
                .duration(120)
                .EUt(600)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, PotassiumBromide, 2)
                .output(dust, Potassium)
                .fluidOutputs(Bromine.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Boron)
                .fluidInputs(Fluorine.getFluid(2000))
                .fluidOutputs(BoronFluoride.getFluid(3000))
                .duration(212)
                .EUt(78)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Chloroform.getFluid(1000))
                .input(dust, SodiumHydroxide, 4)
                .output(dust, SodiumFormate)
                .output(dust, Salt, 3)
                .fluidOutputs(Water.getFluid(2000))
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenChloride.getFluid(3000))
                .input(dust, Phosphorus)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .output(dust, PhosphorusTrichloride, 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CATALYTIC_REFORMATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(OrthoXylene.getFluid(1000))
                .notConsumable(dust, VanadiumPentoxide)
                .fluidOutputs(OxidizedOrthoXyleneMixture.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(OxidizedOrthoXyleneMixture.getFluid(1000))
                .fluidOutputs(CooledOrthoXyleneMixture.getFluid(1000))
                .duration(200)
                .EUt(670)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(CooledOrthoXyleneMixture.getFluid(1000))
                .output(dust, PhthalicAnhydride, 3)
                .fluidOutputs(PhthalicAcid.getFluid(600))
                .duration(500)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(5000))
                .input(dust, Vanadium)
                .output(dust, VanadiumPentoxide)
                .duration(200)
                .EUt(8)
                .buildAndRegister();
    }
}
