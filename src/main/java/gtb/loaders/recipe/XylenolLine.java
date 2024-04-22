package gtb.loaders.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.loaders.recipe.handlers.GTBMaterialRecipeHandler;

public class XylenolLine {

    public static void init() {
        GTBMaterialRecipeHandler.register();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Gasoline.getFluid(1000))
                .fluidOutputs(GTBMaterials.NHeptane.getFluid(400))
                .fluidOutputs(GTBMaterials.NOctane.getFluid(400))
                .fluidOutputs(GTBMaterials.NHexadecane.getFluid(50))
                .fluidOutputs(GTBMaterials.MXylene.getFluid(50))
                .fluidOutputs(Toluene.getFluid(9))
                .fluidOutputs(Ethylbenzene.getFluid(20))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        GTBRecipeMaps.CATALYTIC_REFORMATION_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.MXylene.getFluid(1000))
                .notConsumable(dust, GTBMaterials.ZSM5, 1)
                .fluidOutputs(GTBMaterials.PXylene.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .input(dust, Wood, 4)
                .fluidOutputs(GTBMaterials.Furfural.getFluid(5000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .input(dust, Wood, 4)
                .fluidOutputs(GTBMaterials.Furfural.getFluid(5000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Furfural.getFluid(1000))
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidOutputs(GTBMaterials.BTEX.getFluid(1000))
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.BTEX.getFluid(2000))
                .fluidOutputs(Benzene.getFluid(300))
                .fluidOutputs(Ethylbenzene.getFluid(200))
                .fluidOutputs(Toluene.getFluid(500))
                .fluidOutputs(GTBMaterials.OXylene.getFluid(200))
                .fluidOutputs(GTBMaterials.MPXylene.getFluid(800))
                .duration(500)
                .EUt(120)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.MPXylene.getFluid(4000))
                .fluidOutputs(GTBMaterials.PXylene.getFluid(1000))
                .fluidOutputs(GTBMaterials.MXylene.getFluid(3000))
                .duration(80)
                .EUt(190)
                .buildAndRegister();
    }
}
