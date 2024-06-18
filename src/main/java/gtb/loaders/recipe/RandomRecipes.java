package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class RandomRecipes {

    public static void init() {
        SOLAR_THERMAL_CONCENTRATOR_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .duration(20)
                .fluidInputs(Water.getFluid(10))
                .fluidOutputs(Steam.getFluid(5000))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(Lava.getFluid(1000))
                .input(stick, Steel)
                .output(ALUMINO_SILICATE_WOOL_SHEET)
                .duration(200)
                .EUt(250)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(ALUMINO_SILICATE_WOOL_SHEET)
                .output(dust, AluminoSilicateWool, 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide)
                .input(dust, Sapphire)
                .output(dust, AluminoSilicateWool, 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide)
                .input(dust, GreenSapphire)
                .output(dust, AluminoSilicateWool, 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide)
                .input(dust, GreenSapphire)
                .output(dust, AluminoSilicateWool, 2)
                .duration(100)
                .EUt(8)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, AluminoSilicateWool)
                .fluidOutputs(AluminoSilicateWoolSolution.getFluid(1000))
                .duration(80)
                .EUt(16)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Silver)
                .output(dust, SilverOxide, 3)
                .duration(40)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, SilverOxide, 3)
                .output(dust, Silver)
                .duration(90)
                .EUt(8)
                .buildAndRegister();
    }
}
