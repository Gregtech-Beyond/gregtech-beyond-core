package gtb.loaders.recipe.handlers.ore_processing;

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

import gtb.api.unification.ore.GTBOrePrefix;

public class CaesiumProcessing {

    public static void init() {
        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .input(dust, Pollucite)
                .output(GTBOrePrefix.sifted, Pollucite)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(GTBOrePrefix.sifted, Pollucite, 4)
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidOutputs(ImpurePolluciteSlurry.getFluid(1000))
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(ImpurePolluciteSlurry.getFluid(1000))
                .notConsumable(Oleic_Acid.getFluid(1000))
                .notConsumable(MethylIsobutylCarbonyl.getFluid(1000))
                .notConsumable(dust, SodiumSilicate)
                .input(dust, SodiumHydride, 3)
                .fluidOutputs(PolluciteSlurry.getFluid(1000))
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(PolluciteSlurry.getFluid(1000))
                .output(GTBOrePrefix.floated, Pollucite, 10)
                .output(dust, SodiumHydroxide, 3)
                .duration(400)
                .EUt(600)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_BATH_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Pollucite, 10) },
                new FluidStack[] { HydrochloricAcid.getFluid(3000) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Pollucite, 11) });

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .input(GTBOrePrefix.floated, Pollucite, 10)
                .output(dust, SiliconDioxide)
                .fluidOutputs(HeavyAlkaliChlorideSolution.getFluid(1000))
                .duration(500)
                .EUt(700)
                .buildAndRegister();
    }
}
