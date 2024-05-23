package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public final class Metallurgy {

    public static void init() {
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144))
                .input(ingot, Palladium, 3)
                .output(ingot, RhodiumPlatedPalladium, 4)
                .duration(122)
                .EUt(24)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(FLUID_CELL)
                .output(COOLANT_CELL)
                .circuitMeta(1)
                .duration(1200)
                .EUt(8)
                .buildAndRegister();

        CANNER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumPotassium.getFluid(1000))
                .input(COOLANT_CELL)
                .output(NAK_COOLANT_CELL)
                .duration(120)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, TitaniumNitrate, 17)
                .input(dust, SodiumHydroxide, 6)
                .fluidInputs(LithiumCarbonateSolution.getFluid(1000))
                .output(ingot, LithiumTitanate, 6)
                .output(dust, SodaAsh, 6)
                .fluidOutputs(NitricAcid.getFluid(4000))
                .blastFurnaceTemp(1280)
                .EUt(800)
                .duration(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidInputs(LithiumPeroxideSolution.getFluid(1000))
                .fluidOutputs(LithiumCarbonateSolution.getFluid(2000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DEHYDRATOR.recipeBuilder()
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .fluidInputs(LithiumHydroxideSolution.getFluid(1000))
                .fluidOutputs(LithiumPeroxideSolution.getFluid(1000))
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .fluidInputs(TitaniumTetrachloride.getFluid(1000))
                .fluidInputs(NitrogenPentoxide.getFluid(1000))
                .fluidOutputs(Chlorine.getFluid(4000))
                .output(dust, BariumTitanate, 17)
                .duration(200)
                .EUt(700)
                .buildAndRegister();
    }
}
