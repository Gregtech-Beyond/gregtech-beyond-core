package gtb.loaders.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.RecipeMaps;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.block.blocks.VacuumFurnaceCasing;
import gtb.common.item.GTBMetaItems;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;
import static gregtech.api.recipes.ingredients.IntCircuitIngredient.getIntegratedCircuit;
import static gregtech.api.unification.ore.OrePrefix.*;
import gregtech.common.items.MetaItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class OilLine {
    public static void init() {
        GTBMaterialRecipeHandler.register();

        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1500)).fluidInputs(OilHeavy.getFluid(500)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(RawOil.getFluid(1000)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(800)).fluidInputs(OilLight.getFluid(1200)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(Water.getFluid(1000)).fluidInputs(Oil.getFluid(1000)).fluidOutputs(GTBMaterials.DilutedOil.getFluid(2000)).EUt(80).duration(100).buildAndRegister();
        CENTRIFUGE_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.DilutedOil.getFluid(1000)).fluidOutputs(SaltWater.getFluid(600)).fluidOutputs(GTBMaterials.DesaltedOil.getFluid(400)).EUt(299).duration(120).buildAndRegister();











    }}
