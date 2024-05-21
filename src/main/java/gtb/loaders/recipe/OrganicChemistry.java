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

        ROASTER.recipeBuilder()
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
    }
}
