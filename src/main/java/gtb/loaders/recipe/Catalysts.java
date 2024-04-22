package gtb.loaders.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.RecipeMaps;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.item.GTBMetaItems;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;

import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.ingredients.IntCircuitIngredient.getIntegratedCircuit;
import static gregtech.api.unification.ore.OrePrefix.*;
import gregtech.common.items.MetaItems;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class Catalysts {
    public static void init() {
        GTBMaterialRecipeHandler.register();

            LARGE_CHEMICAL_RECIPES.recipeBuilder()
                    .fluidInputs(SulfuricAcid.getFluid(1000))
                    .fluidInputs(GTBMaterials.Tetrapropylammoniumbromide.getFluid(1000))
                    .input(dust, SodiumHydroxide, 1)
                    .input(dust, SiliconDioxide, 6)
                    .input(dust, AluminiumSulfite, 51)
                    .output(dust, GTBMaterials.ZSM5, 1)
                    .duration(800)
                    .EUt(70)
                    .buildAndRegister();

            CHEMICAL_RECIPES.recipeBuilder()
                    .fluidInputs(Propene.getFluid(1000))
                    .fluidInputs(Bromine.getFluid(1000))
                    .fluidInputs(GTBMaterials.Tripropylamine.getFluid(1000))
                    .fluidOutputs(GTBMaterials.Tetrapropylammoniumbromide.getFluid(1000))
                    .duration(90)
                    .EUt(120)
                    .buildAndRegister();

            LARGE_CHEMICAL_RECIPES.recipeBuilder()
                    .fluidInputs(Propene.getFluid(1000))
                    .fluidInputs(Bromine.getFluid(1000))
                    .fluidInputs(GTBMaterials.Tripropylamine.getFluid(1000))
                    .fluidOutputs(GTBMaterials.Tetrapropylammoniumbromide.getFluid(1000))
                    .duration(90)
                    .EUt(120)
                    .buildAndRegister();

            CHEMICAL_RECIPES.recipeBuilder()
                    .fluidInputs(GTBMaterials.NPropanol.getFluid(1500))
                    .fluidInputs(Ammonia.getFluid(500))
                    .fluidOutputs(Water.getFluid(1500))
                    .fluidOutputs(GTBMaterials.Tripropylamine.getFluid(500))
                    .duration(80)
                    .EUt(120)
                    .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.NPropanol.getFluid(1500))
                .fluidInputs(Ammonia.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .fluidOutputs(GTBMaterials.Tripropylamine.getFluid(500))
                .duration(80)
                .EUt(120)
                .buildAndRegister();


























    }}
