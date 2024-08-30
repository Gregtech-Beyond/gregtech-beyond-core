package gtb.loaders.recipe;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;

public class HydrogenPeroxideLine {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(DISTILLATION_RECIPES,
                new FluidStack[] { CoalTar.getFluid(1000) });

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(CoalTar.getFluid(1000))
                .fluidOutputs(Phenol.getFluid(100))
                .fluidOutputs(Naphthalene.getFluid(400))
                .fluidOutputs(Anthracene.getFluid(100))
                .fluidOutputs(HydrogenSulfide.getFluid(200))
                .chancedOutput(dust, Coke, 2000, 20)
                .fluidOutputs(Phenol.getFluid(100))
                .duration(100)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthylBenzene.getFluid(1000))
                .input(dust, PhthalicAnhydride, 15)
                .fluidOutputs(Ethylanthraquinone.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylanthraquinone.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(Ethylanthrahydroquinone.getFluid(1000))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylanthrahydroquinone.getFluid(1000))
                .notConsumable(Anthracene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(2000))
                .fluidOutputs(HydrogenPeroxide.getFluid(2000))
                .fluidOutputs(Ethylanthraquinone.getFluid(1000))
                .duration(299)
                .EUt(800)
                .buildAndRegister();
    }
}
