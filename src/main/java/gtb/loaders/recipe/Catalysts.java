package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class Catalysts {

    public static void init() {
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(Tetrapropylammoniumbromide.getFluid(1000))
                .input(dust, SodiumHydroxide, 1)
                .input(dust, SiliconDioxide, 6)
                .input(dust, AluminiumSulfite, 51)
                .output(dust, ZSM5, 1)
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidInputs(Tripropylamine.getFluid(1000))
                .fluidOutputs(Tetrapropylammoniumbromide.getFluid(1000))
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidInputs(Tripropylamine.getFluid(1000))
                .fluidOutputs(Tetrapropylammoniumbromide.getFluid(1000))
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NPropanol.getFluid(1500))
                .fluidInputs(Ammonia.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .fluidOutputs(Tripropylamine.getFluid(500))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NPropanol.getFluid(1500))
                .fluidInputs(Ammonia.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .fluidOutputs(Tripropylamine.getFluid(500))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Pyrolusite, 3)
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(PotassiumHydroxide.getFluid(2000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, PotassiumManganate, 7)
                .duration(80)
                .EUt(120)
                .buildAndRegister();
    }
}
