package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class AlcoholLine {

    public static void init() {
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ImpureEthanol.getFluid(2000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Wood, 1)
                .fluidOutputs(EthanolWaterAzeotrope.getFluid(720))
                .fluidOutputs(FuselOil.getFluid(80))
                .duration(120)
                .EUt(20)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthanolWaterAzeotrope.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(800))
                .fluidOutputs(Ethylene.getFluid(1200))
                .duration(200)
                .circuitMeta(1)
                .EUt(20)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthanolWaterAzeotrope.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(800))
                .fluidOutputs(Ethylene.getFluid(1200))
                .duration(200)
                .circuitMeta(1)
                .EUt(40)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(FuselOil.getFluid(1000))
                .fluidOutputs(Water.getFluid(120))
                .fluidOutputs(NPropanol.getFluid(10))
                .fluidOutputs(EthanolWaterAzeotrope.getFluid(100))
                .fluidOutputs(IsoamylAlcohol.getFluid(615))
                .fluidOutputs(NButanol.getFluid(10))
                .fluidOutputs(IsobutylAlcohol.getFluid(155))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(16000))
                .fluidInputs(GrainSolution.getFluid(1000))
                .input(dust, Sugar, 24)
                .circuitMeta(1)
                .fluidOutputs(ImpureEthanol.getFluid(16000))
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(16000))
                .fluidInputs(Oxygen.getFluid(4000))
                .input(dust, Sugar, 24)
                .circuitMeta(0)
                .fluidOutputs(Vinegar.getFluid(16000))
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Vinegar.getFluid(2000))
                .fluidOutputs(Water.getFluid(1600))
                .fluidOutputs(AceticAcid.getFluid(400))
                .output(dust, Wood, 1)
                .duration(200)
                .EUt(20)
                .buildAndRegister();
    }
}
