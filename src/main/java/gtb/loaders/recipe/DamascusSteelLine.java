package gtb.loaders.recipe;

import gtb.common.item.GTBMetaItems;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.ore.OrePrefix.*;


public class DamascusSteelLine {

    public static void init() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Steel, 8)
                .input(plate, BlackSteel, 8)
                .input(dust, Borax, 8)
                .circuitMeta(16)
                .fluidInputs(Steel.getFluid(576))
                .output(GTBMetaItems.DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(300)
                .EUt(512)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(GTBMetaItems.DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(GTBMetaItems.LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(GTBMetaItems.HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(GTBMetaItems.HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .blastFurnaceTemp(1200)
                .duration(1200)
                .EUt(1920)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                .output(plate, DamascusSteel, 1)
                .duration(160)
                .EUt(384)
                .buildAndRegister();
    }
}
