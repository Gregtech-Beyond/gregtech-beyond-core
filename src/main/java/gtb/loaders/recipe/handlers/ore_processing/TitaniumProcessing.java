package gtb.loaders.recipe.handlers.ore_processing;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidEvent;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

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
                        OreDictUnifier.get(dust, Magnesium, 2)},
                new FluidStack[] { TitaniumTetrachloride.getFluid(1000)});

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Carbon, 2),
                OreDictUnifier.get(dust, Rutile, 1)},
                new FluidStack[] { Chlorine.getFluid(4000)});


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








    }
}
