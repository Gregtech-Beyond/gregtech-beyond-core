package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class DamascusSteelLine {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES, OreDictUnifier.get(dust, DamascusSteel, 8));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Steel, 8)
                .input(plate, BlackSteel, 8)
                .input(dust, Borax, 8)
                .circuitMeta(16)
                .fluidInputs(Steel.getFluid(576))
                .output(DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(300)
                .EUt(512)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        EXTRUDER_RECIPES.recipeBuilder()
                .input(HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .notConsumable(SHAPE_EXTRUDER_INGOT.getStackForm(1))
                .output(ingot, DamascusSteel, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, DamascusSteel, 1)
                .output(dust, Steel, 8)
                .output(dust, BlackSteel, 8)
                .duration(84)
                .EUt(30)
                .buildAndRegister();
    }
}
