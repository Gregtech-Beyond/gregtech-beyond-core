package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
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

        ROASTER.recipeBuilder()
                .fluidInputs(HydrogenChloride.getFluid(1000))
                .input(dust, Silicon)
                .fluidOutputs(ChloroSilane.getFluid(1000))
                .duration(600)
                .EUt(48)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ChloroSilane.getFluid(1000))
                .notConsumable(dust, AluminiumChloride)
                .fluidOutputs(DisproportionatedChloroSilane.getFluid(1000))
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidOutputs(Silane.getFluid(1000))
                .fluidOutputs(ChloroSilane.getFluid(1000))
                .fluidInputs(DisproportionatedChloroSilane.getFluid(2000))
                .duration(120)
                .EUt(70)
                .buildAndRegister();
    }
}
