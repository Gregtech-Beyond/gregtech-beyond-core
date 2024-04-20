package gtb.loaders.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.recipes.RecipeMaps;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
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


public final class PlatinumLine {

    public static void init() {
        GTBMaterialRecipeHandler.register();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.AquaRegia.getFluid(9000)).input(dust, Materials.PlatinumGroupSludge, 18).output(dust, GTBMaterials.PlatinumResidues, 5).fluidOutputs(GTBMaterials.PlatinumConcentrate.getFluid(9000)).circuitMeta(1).duration(20).EUt(120).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.AquaRegia.getFluid(9000)).input(dust, Materials.PlatinumGroupSludge, 18).output(dust, GTBMaterials.PlatinumResidues, 5).fluidOutputs(GTBMaterials.PlatinumConcentrate.getFluid(9000)).circuitMeta(1).duration(20).EUt(120).buildAndRegister();
        RecipeMaps.BLAST_RECIPES.recipeBuilder().input(dust, GTBMaterials.PotassiumDisulfate, 11).input(dust, GTBMaterials.PlatinumResidues, 5).output(dust, Materials.Sulfur, 7).output(dust, GTBMaterials.LeachResidue, 4).fluidInputs(Materials.Oxygen.getFluid(1000)).fluidOutputs(Materials.RhodiumSulfate.getFluid(1000)).EUt(120).duration(120).blastFurnaceTemp(775).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.Water.getFluid(9000)).fluidInputs(Materials.RhodiumSulfate.getFluid(27000)).output(dust, GTBMaterials.LeachResidue, 4).circuitMeta(1).fluidOutputs(GTBMaterials.RhodiumSulfateSolution.getFluid(27000)).EUt(30).duration(800).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.Water.getFluid(9000)).fluidInputs(Materials.RhodiumSulfate.getFluid(27000)).output(dust, GTBMaterials.LeachResidue, 4).circuitMeta(1).fluidOutputs(GTBMaterials.RhodiumSulfateSolution.getFluid(27000)).EUt(30).duration(800).buildAndRegister();
        RecipeMaps.BLAST_RECIPES.recipeBuilder().fluidInputs(Materials.Oxygen.getFluid(3000)).input(dust, Materials.SodaAsh, 18).input(dust, GTBMaterials.LeachResidue, 40).output(dust, GTBMaterials.SodiumRuthenate, 21).output(dust, Materials.RarestMetalMixture, 6).fluidInputs(Materials.CarbonMonoxide.getFluid(3000)).EUt(120).duration(600).blastFurnaceTemp(775).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.Chlorine.getFluid(4000)).input(dust, GTBMaterials.SodiumRuthenate, 14).fluidOutputs(GTBMaterials.RutheniumTetroxideSolution.getFluid(2000)).EUt(30).duration(200).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Materials.Chlorine.getFluid(4000)).input(dust, GTBMaterials.SodiumRuthenate, 14).fluidOutputs(GTBMaterials.RutheniumTetroxideSolution.getFluid(2000)).EUt(30).duration(200).buildAndRegister();
        RecipeMaps.DISTILLATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.RutheniumTetroxideSolution.getFluid(1000)).output(dust, Materials.Salt, 4).fluidOutputs(GTBMaterials.RutheniumTetroxideLiquid.getFluid(1000)).fluidOutputs(Materials.Water.getFluid(1000)).EUt(480).duration(2000).buildAndRegister();
        RecipeMaps.FLUID_SOLIDFICATION_RECIPES.recipeBuilder().fluidInputs(GTBMaterials.RutheniumTetroxideLiquid.getFluid(1000)).notConsumable(MetaItems.SHAPE_MOLD_BALL).output(dust, Materials.RutheniumTetroxide).duration(200).EUt(120).buildAndRegister();
        RecipeMaps.BLAST_RECIPES.recipeBuilder().input(dust, Materials.IridiumMetalResidue, 5).output(dust, GTBMaterials.IridiumDioxide, 6).output(dust, Materials.PlatinumSludgeResidue, 5).blastFurnaceTemp(775).duration(200).EUt(30).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().input(dust, GTBMaterials.IridiumDioxide, 6).fluidInputs(Materials.HydrochloricAcid.getFluid(1000)).fluidOutputs(GTBMaterials.AcidicIridiumDioxide.getFluid(1000)).duration(200).EUt(100).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().input(dust, GTBMaterials.IridiumDioxide, 6).fluidInputs(Materials.HydrochloricAcid.getFluid(1000)).fluidOutputs(GTBMaterials.AcidicIridiumDioxide.getFluid(1000)).duration(200).EUt(100).buildAndRegister();
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder().input(dust, Materials.AmmoniumChloride, 4).fluidInputs(GTBMaterials.AcidicIridiumDioxide.getFluid(1000)).fluidOutputs(Materials.Water.getFluid(1000)).fluidOutputs(Materials.Ammonia.getFluid(4000)).duration(800).EUt(900).buildAndRegister();
        RecipeMaps.LARGE_CHEMICAL_RECIPES.recipeBuilder().input(dust, Materials.AmmoniumChloride, 4).fluidInputs(GTBMaterials.AcidicIridiumDioxide.getFluid(1000)).fluidOutputs(Materials.Water.getFluid(1000)).fluidOutputs(Materials.Ammonia.getFluid(4000)).output(dust, Materials.IridiumChloride, 8).duration(800).EUt(900).buildAndRegister();











    }}
