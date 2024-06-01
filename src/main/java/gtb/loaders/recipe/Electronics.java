package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import java.util.function.Predicate;

import gregtech.common.items.MetaItems;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;

import gregtech.api.recipes.ModHandler;

import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.BlockCoolingCoil;

public class Electronics {

    public static void init() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Polybenzimidazole)
                .input(ELECTRIC_MOTOR_HV)
                .input(dye, DyeOrange)
                .input(stick, Steel, 4)
                .output(ROTARRY_SPINNING_WHISKER)
                .duration(2000)
                .EUt(700)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .notConsumable(SHAPE_MOLD_INGOT)
                .input(dust, Silver)
                .output(ingot, SinteredSilver)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Cobalt, 2)
                .input(dust, Silver, 5)
                .input(dust, Steel, 1)
                .output(dust, SilverAlloy, 8)
                .circuitMeta(3)
                .duration(80)
                .EUt(500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .input(dust, SilverAlloy, 1)
                .output(ingot, SilverAlloy, 1)
                .blastFurnaceTemp(2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Nomex.getFluid(1000))
                .input(plate, SilverAlloy, 4)
                .input(SINTERED_SILVER_COIL)
                .input(foil, Zylon, 2)
                .output((Item) GTBMetaBlocks.COOLING_COIL.getState(BlockCoolingCoil.CoolingCoilType.SILVER_ALLOY), 1)
                .duration(400)
                .EUt(2000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Silvertetrafluoroborate.getFluid(144))
                .input(foil, Mica, 2)
                .input(stick, SinteredSilver, 2)
                .output(SINTERED_SILVER_COIL)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ModHandler.removeRecipeByOutput(ITEM_FILTER.getStackForm());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Zinc, 16)
                .input(plate, Steel)
                .output(ITEM_FILTER)
                .duration(200)
                .EUt(12)
                .buildAndRegister();
    }
}
