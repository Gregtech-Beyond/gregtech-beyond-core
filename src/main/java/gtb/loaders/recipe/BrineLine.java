package gtb.loaders.recipe;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.CRYSTALLIZATION_RECIPES;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class BrineLine {

    public static void init() {
        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(IodizedOil.getFluid(2000))
                .fluidOutputs(Oil.getFluid(1000))
                .fluidOutputs(IodizedBrine.getFluid(1000))
                .duration(129)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(IodizedBrine.getFluid(1300))
                .fluidOutputs(BrominatedBrine.getFluid(1000))
                .fluidOutputs(IodineSlurry.getFluid(300))
                .duration(130)
                .EUt(650)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(IodineSlurry.getFluid(1000))
                .output(dust, Iodine)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(BrominatedBrine.getFluid(1000))
                .fluidOutputs(CrudeBromineSolution.getFluid(1000))
                .fluidOutputs(Brine.getFluid(1000))
                .duration(2000)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(BrominatedBrine.getFluid(3000))
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(Chlorine.getFluid(1000))
                .fluidOutputs(DampBromine.getFluid(1000))
                .duration(600)
                .EUt(7120)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(DampBromine.getFluid(1000))
                .fluidOutputs(Bromine.getFluid(1000))
                .duration(1200)
                .EUt(4800)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(Brine.getFluid(1000))
                .fluidOutputs(ConcentratedBrine.getFluid(800))
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(ConcentratedBrine.getFluid(1000))
                .notConsumable(NAK_COOLANT_CELL)
                .output(dust, PotassiumMagnesiumSalts, 30)
                .output(dust, SodiumSalts, 4)
                .output(dust, CalciumSalts, 13)
                .fluidOutputs(SaltFreeBrine.getFluid(1000))
                .duration(1200)
                .EUt(420)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SaltFreeBrine.getFluid(1000))
                .fluidOutputs(BoronFreeSolution.getFluid(1000))
                .input(BORON_RETAINING_YARN)
                .output(BORON_SATURATED_YARN)
                .duration(120)
                .EUt(500)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(LITHIUM_SIEVE)
                .output(LITHIUM_SATURATED_LITHIUM_SIEVE)
                .fluidInputs(BoronFreeSolution.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(1000))
                .duration(1200)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(LITHIUM_SATURATED_LITHIUM_SIEVE)
                .output(LITHIUM_SIEVE)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(LithiumChlorideSolution.getFluid(1000))
                .duration(800)
                .EUt(850)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(LithiumChlorideSolution.getFluid(1000))
                .fluidOutputs(Chlorine.getFluid(1000))
                .output(dust, Lithium)
                .duration(210)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .input(BORON_SATURATED_YARN)
                .input(dust, SodiumHydroxide, 6)
                .output(BORON_RETAINING_YARN)
                .fluidOutputs(BoricAcid.getFluid(1000))
                .fluidOutputs(SodiumSulfide.getFluid(1000))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(SodiumSulfide.getFluid(1000))
                .fluidOutputs(SodiumSulfideSolution.getFluid(2000))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(SodiumSulfideSolution.getFluid(1000))
                .output(dust, SodiumSulfide)
                .duration(102)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, PotassiumMagnesiumSalts, 15)
                .output(dust, RockSalt, 2)
                .output(dust, MagnesiumSulfate, 6)
                .output(dust, PotassiumSulfate, 7)
                .chancedOutput(dust, PotassiumFluoride, 1, 880, 0)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, PotassiumSulfate, 7)
                .output(dust, Potassium, 2)
                .output(dust, Sulfur)
                .fluidOutputs(Oxygen.getFluid(4000))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, MagnesiumSulfate, 6)
                .output(dust, Magnesium)
                .output(dust, Sulfur)
                .fluidOutputs(Oxygen.getFluid(4000))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, PotassiumFluoride, 2)
                .output(dust, Potassium)
                .fluidOutputs(Fluorine.getFluid(1000))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, SodiumSalts, 2)
                .output(dust, Salt, 2)
                .chancedOutput(dust, SodiumFluoride, 1, 33, 1)
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, SodiumFluoride, 2)
                .output(dust, Sodium)
                .fluidOutputs(Fluorine.getFluid(1000))
                .duration(60)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, CalciumSalts, 13)
                .output(dust, Gypsum, 8)
                .output(dust, Calcite, 5)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(dust, LithiumTitanate, 2)
                .input(plate, Polyetheretherketone)
                .input(dust, PolystyreneNanoParticles, 2)
                .output(LITHIUM_FOAM_BASE)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(LITHIUM_FOAM_BASE)
                .fluidInputs(Nomex.getFluid(1000))
                .output(LITHIUM_SIEVE)
                .duration(200)
                .EUt(80)
                .buildAndRegister();
    }
}
