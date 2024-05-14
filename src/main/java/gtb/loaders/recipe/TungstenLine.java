package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMap.getByName;
import static gregtech.api.recipes.RecipeMap.getRecipeMaps;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.MetaOreDictItem;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.unification.OreDictUnifier;
import gregtech.common.items.MetaItems;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


public class TungstenLine {

    public static void init() {

        DEHYDRATOR.recipeBuilder()
                .input(dust, TungsticAcid, 7)
                .output(dust, GTBMaterials.TungstenTrioxide, 4)
                .duration(200)
                .EUt(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.HydrogenPeroxide.getFluid(1000))
                .input(dust, Scheelite, 7)
                .input(dust, SodiumHydroxide, 6)
                .output(dust, GTBMaterials.CalciumHydroxide, 10)
                .fluidOutputs(GTBMaterials.SodiumTungstate.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Tungstate, 7)
                .input(dust, SodiumHydroxide, 6)
                .output(dust, GTBMaterials.LithiumHydroxide, 6)
                .fluidOutputs(GTBMaterials.SodiumTungstate.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CalciumChloride, 3)
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(GTBMaterials.SodiumTungstate.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(2000))
                .output(dust, GTBMaterials.CalciumTungstate, 6)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(2000))
                .output(dust, TungsticAcid, 7)
                .output(dust, GTBMaterials.CalciumHydroxide, 5)
                .input(dust, GTBMaterials.CalciumTungstate, 6)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, GTBMaterials.LithiumHydroxide, 3)
                .fluidOutputs(GTBMaterials.LithiumHydroxideSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.LithiumHydroxideSolution.getFluid(1000))
                .fluidInputs(HydrofluoricAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, GTBMaterials.LithiumFluoride, 2)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.LithiumFluoride, 2)
                .fluidOutputs(Fluorine.getFluid(1000))
                .output(dust, Lithium, 1)
                .duration(70)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(6000))
                .input(dust, GTBMaterials.TungstenTrioxide, 4)
                .output(dust, Tungsten, 1)
                .fluidOutputs(Water.getFluid(3000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES, OreDictUnifier.get(dust, TungsticAcid, 7));
    }
}
