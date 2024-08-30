package gtb.loaders.recipe.handlers.ore_processing;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.unification.materials.GTBMaterials.Rubidium;

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
}
