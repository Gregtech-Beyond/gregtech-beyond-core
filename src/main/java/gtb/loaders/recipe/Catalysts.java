package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

import gtb.api.unification.materials.GTBMaterials;

public class Catalysts {

    public static void init() {
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
    }
}
