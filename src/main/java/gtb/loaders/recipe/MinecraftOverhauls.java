package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.loaders.recipe.CraftingComponent.*;
import static gregtech.loaders.recipe.MetaTileEntityLoader.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.block.blocks.GTBMultiblockCasing.CasingType.*;
import static net.minecraft.init.Items.*;

import net.minecraft.init.Blocks.*;

import gregtech.api.recipes.ModHandler;

public class MinecraftOverhauls {

    public static void init() {
        ModHandler.removeRecipeByOutput(GOLDEN_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(GOLDEN_LEGGINGS.getDefaultInstance());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Gold, 4)
                .circuitMeta(4)
                .output(GOLDEN_BOOTS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Gold, 7)
                .circuitMeta(7)
                .output(GOLDEN_LEGGINGS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Gold, 5)
                .circuitMeta(5)
                .output(GOLDEN_HELMET)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Gold, 8)
                .circuitMeta(8)
                .output(GOLDEN_CHESTPLATE)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ModHandler.removeRecipeByOutput(DIAMOND_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(DIAMOND_LEGGINGS.getDefaultInstance());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Diamond, 4)
                .circuitMeta(4)
                .output(DIAMOND_BOOTS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Diamond, 7)
                .circuitMeta(7)
                .output(DIAMOND_LEGGINGS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Diamond, 5)
                .circuitMeta(5)
                .output(DIAMOND_HELMET)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Diamond, 8)
                .circuitMeta(8)
                .output(DIAMOND_CHESTPLATE)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ModHandler.removeRecipeByOutput(IRON_BOOTS.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_HELMET.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_CHESTPLATE.getDefaultInstance());
        ModHandler.removeRecipeByOutput(IRON_LEGGINGS.getDefaultInstance());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Iron, 4)
                .circuitMeta(4)
                .output(IRON_BOOTS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Iron, 7)
                .circuitMeta(7)
                .output(IRON_LEGGINGS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Iron, 5)
                .circuitMeta(5)
                .output(IRON_HELMET)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Iron, 8)
                .circuitMeta(8)
                .output(IRON_CHESTPLATE)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Iron, 4)
                .circuitMeta(4)
                .output(CHAINMAIL_BOOTS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Iron, 7)
                .circuitMeta(7)
                .output(CHAINMAIL_LEGGINGS)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Iron, 5)
                .circuitMeta(5)
                .output(CHAINMAIL_HELMET)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ring, Iron, 8)
                .circuitMeta(8)
                .output(CHAINMAIL_CHESTPLATE)
                .duration(200)
                .EUt(8)
                .buildAndRegister();
    }
}
