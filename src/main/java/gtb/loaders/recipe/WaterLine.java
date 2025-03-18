package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.block.GTBMetaBlocks.*;
import static gtb.common.block.blocks.GTBExplosive.CasingType.*;
import static gtb.common.item.GTBMetaItems.*;

public class WaterLine {

    public static void init() {
        ION_EXCHANGE_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(DemineralizedWater.getFluid(900))
                .notConsumable(dust, MolecularSieve)
                .duration(400)
                .EUt(20)
                .buildAndRegister();

        VACUUM_EJECTION_RECIPES.recipeBuilder()
                .fluidInputs(DemineralizedWater.getFluid(1000))
                .fluidOutputs(DeaeratedWater.getFluid(900))
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .notConsumable(dust, ActivatedCarbon)
                .fluidInputs(DeaeratedWater.getFluid(1000))
                .fluidOutputs(DeionizedWater.getFluid(700))
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        UV_LIGHT_RECIPES.recipeBuilder()
                .fluidInputs(DeionizedWater.getFluid(1000))
                .fluidOutputs(SterilizedWater.getFluid(900))
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .fluidInputs(SterilizedWater.getFluid(1000))
                .circuitMeta(1)
                .fluidOutputs(UltrapureWater.getFluid(800))
                .duration(600)
                .EUt(200)
                .buildAndRegister();

        ION_EXCHANGE_RECIPES.recipeBuilder()
                .notConsumable(dust, ActivatedCarbon)
                .fluidInputs(UltrapureWater.getFluid(1000))
                .fluidOutputs(UltrapureWaterGrade1.getFluid(900))
                .duration(600)
                .EUt(1200)
                .buildAndRegister();

        FLUID_COMPRESSOR_RECIPES.recipeBuilder()
                .fluidInputs(UltrapureWaterGrade1.getFluid(1000))
                .fluidOutputs(HighPressureUltrapureWaterGrade1.getFluid(100))
                .duration(800)
                .EUt(2200)
                .buildAndRegister();

        FLUID_COMPRESSOR_RECIPES.recipeBuilder()
                .fluidInputs(HighPressureUltrapureWaterGrade1.getFluid(1000))
                .fluidOutputs(SupercriticalUltrapureWaterGrade1.getFluid(100))
                .duration(800)
                .EUt(2200)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(SupercriticalUltrapureWaterGrade1.getFluid(1000))
                .fluidOutputs(UltrapureWaterGrade2.getFluid(1000))
                .duration(800)
                .EUt(8200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(UltrapureWaterGrade2.getFluid(1000))
                .fluidOutputs(UltrapureWaterGrade3.getFluid(200))
                .fluidOutputs(UltrapureWaterGrade1.getFluid(300))
                .fluidOutputs(UltrapureWater.getFluid(500))
                .duration(800)
                .EUt(16200)
                .buildAndRegister();
    }
}
