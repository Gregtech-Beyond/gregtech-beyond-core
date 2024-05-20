package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class OrganicChemistry {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(SodiumFormate.getFluid(1000))
                .fluidOutputs(FormicAcid.getFluid(1000))
                .output(dust, SodiumFormate, 7)
                .duration(80).EUt(120).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(Water.getFluid(2000))
                .input(dust, CalciumHydroxide, 5)
                .output(dust, CalciumChloride, 3)
                .fluidInputs(HydrochloricAcid.getFluid(2000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(dust, Zeolite)
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(NButanol.getFluid(1000))
                .fluidOutputs(Tributylamine.getFluid(1000))
                .duration(120)
                .EUt(600)
                .buildAndRegister();

    }
}
