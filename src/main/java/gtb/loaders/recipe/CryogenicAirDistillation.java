package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class CryogenicAirDistillation {

    public static void init() {
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
                .fluidInputs(CrudeKrypton.getFluid(1000))
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

        PRESSURE_SWING_ADSORBER.recipeBuilder()
                .fluidInputs(Syngas.getFluid(10000))
                .fluidOutputs(Hydrogen.getFluid(6000))
                .fluidOutputs(CarbonMonoxide.getFluid(4000))
                .duration(400)
                .EUt(80)
                .buildAndRegister();

        PRESSURE_SWING_ADSORBER.recipeBuilder()
                .fluidInputs(Air.getFluid(10000))
                .fluidOutputs(Nitrogen.getFluid(7780))
                .fluidOutputs(Oxygen.getFluid(2200))
                .duration(400)
                .EUt(120)
                .buildAndRegister();

        PRESSURE_SWING_ADSORBER.recipeBuilder()
                .fluidInputs(SaltWater.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Salt, 4)
                .duration(160)
                .EUt(70)
                .buildAndRegister();

        RARE_GAS_STRIPPING_COLUMN.recipeBuilder()
                .fluidInputs(CrudeArgonVapor.getFluid(1000))
                .fluidInputs(LiquidOxygen.getFluid(1000))
                .fluidInputs(LiquidNitrogen.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .fluidOutputs(RareGasRichGaseousNitrogen.getFluid(2000))
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CONDENSATION_UNIT.recipeBuilder()
                .fluidInputs(RareGasRichGaseousNitrogen.getFluid(1000))
                .fluidOutputs(CrudeKrypton.getFluid(100))
                .fluidOutputs(ColdGaseousOxygen.getFluid(200))
                .fluidOutputs(RareGasMixture.getFluid(700))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT.recipeBuilder()
                .fluidInputs(RareGasMixture.getFluid(1000))
                .fluidInputs(LiquidNitrogen.getFluid(500))
                .fluidOutputs(Nitrogen.getFluid(1000))
                .fluidOutputs(NitrogenStrippedRareGasMixture.getFluid(500))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT.recipeBuilder()
                .fluidInputs(CrudeArgonVapor.getFluid(1000))
                .fluidInputs(SupercooledOxygen.getFluid(1000))
                .fluidOutputs(CrudeArgon.getFluid(200))
                .fluidOutputs(LiquidOxygen.getFluid(1800))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT.recipeBuilder()
                .fluidInputs(ColdWasteGasouesNitrogen.getFluid(1000))
                .fluidOutputs(LiquidWasteNitrogen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidHelium.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidArgon.getFluid(1000))
                .fluidOutputs(Argon.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidXenon.getFluid(1000))
                .fluidOutputs(Xenon.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidNeon.getFluid(1000))
                .fluidOutputs(Neon.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidKrypton.getFluid(1000))
                .fluidOutputs(Krypton.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidNitrogen.getFluid(1000))
                .fluidOutputs(Nitrogen.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR.recipeBuilder()
                .fluidInputs(LiquidOxygen.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(800)
                .EUt(8)
                .buildAndRegister();

    }
}
