package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class ThalliumProcessing {

    public static void init() {
        // FeS2 + 6O -> Fe + Tl2SO4 + SO2
        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Pyrite, 3)
                .fluidInputs(Oxygen.getFluid(6000))
                .output(ingot, Iron)
                .chancedOutput(dust, ThalliumSulfate, 7, 200, 0)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(100).EUt(VA[HV]).buildAndRegister();

        // 2PbS + 6O -> 2Pb + Tl2SO4 + SO2
        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Galena, 4)
                .fluidInputs(Oxygen.getFluid(6000))
                .output(ingot, Lead, 2)
                .chancedOutput(dust, ThalliumSulfate, 7, 200, 0)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(100).EUt(VA[HV]).buildAndRegister();

        // Tl2SO4 + H2O -> 2Th + H2SO4 + O
        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, ThalliumSulfate, 7)
                .fluidInputs(Water.getFluid(1000))
                .notConsumable(stick, Platinum)
                .output(dust, Thallium, 2)
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(200).EUt(60).buildAndRegister();
    }
}
