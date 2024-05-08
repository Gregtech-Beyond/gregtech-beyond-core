package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;

public class AlcoholLine {

    public static void init() {
        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.ImpureEthanol.getFluid(2000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Wood, 1)
                .fluidOutputs(GTBMaterials.EthanolWaterAzeotrope.getFluid(720))
                .fluidOutputs(GTBMaterials.FuselOil.getFluid(80))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.EthanolWaterAzeotrope.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(800))
                .fluidOutputs(Ethylene.getFluid(1200))
                .duration(200)
                .circuitMeta(1)
                .EUt(800)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.EthanolWaterAzeotrope.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(800))
                .fluidOutputs(Ethylene.getFluid(1200))
                .duration(200)
                .circuitMeta(1)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.FuselOil.getFluid(1000))
                .fluidOutputs(Water.getFluid(120))
                .fluidOutputs(GTBMaterials.NPropanol.getFluid(10))
                .fluidOutputs(GTBMaterials.EthanolWaterAzeotrope.getFluid(100))
                .fluidOutputs(GTBMaterials.IsoamylAlcohol.getFluid(615))
                .fluidOutputs(GTBMaterials.NButanol.getFluid(10))
                .fluidOutputs(GTBMaterials.IsobutylAlcohol.getFluid(155))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTBRecipeMaps.FERMENTATION_VAT.recipeBuilder()
                .fluidInputs(Water.getFluid(16000))
                .fluidInputs(GTBMaterials.GrainSolution.getFluid(1000))
                .input(dust, Sugar, 24)
                .circuitMeta(1)
                .fluidOutputs(GTBMaterials.ImpureEthanol.getFluid(16000))
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        GTBRecipeMaps.FERMENTATION_VAT.recipeBuilder()
                .fluidInputs(Water.getFluid(16000))
                .fluidInputs(Oxygen.getFluid(4000))
                .input(dust, Sugar, 24)
                .circuitMeta(0)
                .fluidOutputs(GTBMaterials.Vinegar.getFluid(16000))
                .duration(2000)
                .EUt(12)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Vinegar.getFluid(2000))
                .fluidOutputs(Water.getFluid(1600))
                .fluidOutputs(AceticAcid.getFluid(400))
                .output(dust, Wood, 1)
                .duration(200)
                .EUt(800)
                .buildAndRegister();


    }
}
