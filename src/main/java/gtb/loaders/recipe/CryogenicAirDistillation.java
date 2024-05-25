package gtb.loaders.recipe;

import static gtb.api.recipes.GTBRecipeMaps.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class CryogenicAirDistillation {

    public static void init(){


       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(ColdAir.getFluid(1000))
               .fluidInputs(Air.getFluid(1000))
               .fluidOutputs(UntreatedLiquidOxygen.getFluid(50))
               .fluidOutputs(ColdWasteGasouesNitrogen.getFluid(5440))
               .fluidOutputs(ArgonRichGas.getFluid(200))
               .duration(400)
               .EUt(116)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(ArgonRichGas.getFluid(500))
               .fluidOutputs(CrudeArgonVapor.getFluid(600))
               .duration(200)
               .EUt(120)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(NitrogenStrippedRareGasMixture.getFluid(10000))
               .fluidOutputs(CrudeXenon.getFluid(90))
               .fluidOutputs(CrudeKrypton.getFluid(144))
               .fluidOutputs(CrudeHelium.getFluid(524))
               .fluidOutputs(CrudeNeon.getFluid(1818))
               .fluidOutputs(CrudeArgonVapor.getFluid(7454))
               .duration(200)
               .EUt(84)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(LiquidNitrogen.getFluid(200))
               .fluidInputs(ColdGaseousOxygen.getFluid(200))
               .fluidInputs(CrudeArgon.getFluid(1000))
               .fluidOutputs(ColdGasouesNitrogen.getFluid(200))
               .fluidOutputs(LiquidOzone.getFluid(200))
               .fluidOutputs(PartiallyLiquidArgon.getFluid(1000))
               .duration(800)
               .EUt(12)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(LiquidNitrogen.getFluid(200))
               .fluidInputs(ColdGaseousOxygen.getFluid(200))
               .fluidInputs(CrudeXenon.getFluid(1000))
               .fluidOutputs(ColdGasouesNitrogen.getFluid(200))
               .fluidOutputs(LiquidOxygen.getFluid(200))
               .fluidOutputs(PartiallyLiquidXenon.getFluid(1000))
               .duration(800)
               .EUt(12)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(LiquidNitrogen.getFluid(200))
               .fluidInputs(ColdGaseousOxygen.getFluid(200))
               .fluidInputs(CrudeXenon.getFluid(1000))
               .fluidOutputs(ColdGasouesNitrogen.getFluid(200))
               .fluidOutputs(LiquidOxygen.getFluid(200))
               .fluidOutputs(PartiallyLiquidKrypton.getFluid(1000))
               .duration(800)
               .EUt(12)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(LiquidNitrogen.getFluid(200))
               .fluidInputs(ColdGaseousOxygen.getFluid(200))
               .fluidInputs(CrudeHelium.getFluid(1000))
               .fluidOutputs(ColdGasouesNitrogen.getFluid(200))
               .fluidOutputs(LiquidOxygen.getFluid(200))
               .fluidOutputs(PartiallyLiquidHelium.getFluid(1000))
               .duration(800)
               .EUt(12)
               .buildAndRegister();

       CRYOGENIC_DISTILLATION_PLANT.recipeBuilder()
               .fluidInputs(LiquidNitrogen.getFluid(200))
               .fluidInputs(ColdGaseousOxygen.getFluid(200))
               .fluidInputs(CrudeNeon.getFluid(1000))
               .fluidOutputs(ColdGasouesNitrogen.getFluid(200))
               .fluidOutputs(LiquidOxygen.getFluid(200))
               .fluidOutputs(PartiallyLiquidNeon.getFluid(1000))
               .duration(800)
               .EUt(12)
               .buildAndRegister();

       PHASE_SEPARATOR.recipeBuilder()
               .fluidInputs(PartiallyLiquidArgon.getFluid(1000))
               .fluidOutputs(LiquidArgon.getFluid(200))
               .duration(200)
               .EUt(70)
               .buildAndRegister();

       PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(PartiallyLiquidHelium.getFluid(1000))
                .fluidOutputs(LiquidHelium.getFluid(200))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

       PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(PartiallyLiquidKrypton.getFluid(1000))
                .fluidOutputs(LiquidKrypton.getFluid(200))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

       PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(PartiallyLiquidNeon.getFluid(1000))
                .fluidOutputs(LiquidNeon.getFluid(200))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

       PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(PartiallyLiquidXenon.getFluid(1000))
                .fluidOutputs(LiquidXenon.getFluid(200))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        

    }
}
