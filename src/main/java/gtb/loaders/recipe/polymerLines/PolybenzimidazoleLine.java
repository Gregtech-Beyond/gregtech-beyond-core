package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;

public class PolybenzimidazoleLine {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { Diaminobenzidine.getFluid(1000),
                        DiphenylIsophtalate.getFluid(1000) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Diaminobenzidine.getFluid(1000))
                .fluidInputs(DiphenylIsophtalate.getFluid(1000))
                .output(dust, PolybenzimidazolePrePolymerFoam, 4)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .input(dust, PolybenzimidazolePrePolymerFoam, 1)
                .fluidOutputs(ImpurePolybenzimidazoleSolution.getFluid(1000))
                .duration(700)
                .EUt(2008)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ImpurePolybenzimidazoleSolution.getFluid(7000))
                .fluidOutputs(PolybenzimidazoleWaste.getFluid(3000))
                .fluidOutputs(PolybenzimidazoleSolution.getFluid(4000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PolybenzimidazoleSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Polybenzimidazole)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PolybenzimidazoleWaste.getFluid(3000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(Toluene.getFluid(1000))
                .fluidOutputs(Phenol.getFluid(1000))
                .duration(120)
                .EUt(700)
                .buildAndRegister();
    }
}
