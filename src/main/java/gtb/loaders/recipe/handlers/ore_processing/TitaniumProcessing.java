package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class TitaniumProcessing {

    public static void init() {
        BURNER_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(TitaniumTetrachloride.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(2000))
                .fluidOutputs(Chlorine.getFluid(4000))
                .output(dust, TitaniumDioxide, 2)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, TitaniumDioxide, 2)
                .output(dust, Titanium)
                .fluidOutputs(Steam.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Magnesium, 2) },
                new FluidStack[] { TitaniumTetrachloride.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Carbon, 2),
                        OreDictUnifier.get(dust, Rutile, 1) },
                new FluidStack[] { Chlorine.getFluid(4000) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Chlorine.getFluid(4000))
                .input(dust, Carbon, 2)
                .input(dust, Rutile)
                .fluidOutputs(GaseousTitaniumTetrachloride.getFluid(1000))
                .fluidOutputs(CarbonMonoxide.getFluid(2000))
                .duration(200)
                .EUt(400)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(GaseousTitaniumTetrachloride.getFluid(1000))
                .fluidOutputs(TitaniumTetrachloride.getFluid(1000))
                .duration(600)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, RedMudConcentrate)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(NeutralisedRedMud.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(NeutralisedRedMud.getFluid(2000))
                .fluidOutputs(IronChlorideSolution.getFluid(1000))
                .fluidOutputs(RedSlurry.getFluid(1000))
                .fluidOutputs(SaltWater.getFluid(4000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(IronChlorideSolution.getFluid(2000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .fluidOutputs(Iron3Chloride.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(2000))
                .fluidInputs(RedSlurry.getFluid(2000))
                .fluidOutputs(TitanylSulfate.getFluid(2000))
                .fluidOutputs(Water.getFluid(2000))
                .duration(400)
                .EUt(700)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(TitanylSulfate.getFluid(1000))
                .output(dust, CrystallizedTitanylSulfate, 2)
                .duration(400)
                .EUt(290)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .input(dust, CrystallizedTitanylSulfate, 1)
                .output(dust, Titanium, 1)
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .duration(460)
                .EUt(800)
                .buildAndRegister();
    }
}
