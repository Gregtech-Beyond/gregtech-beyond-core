package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class ZincProcessing {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Sphalerite, 2) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Zincite, 2) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Zincite, 2)
                .output(dust, Zinc)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(20)
                .EUt(7)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Zincite, 2)
                .output(dust, Zinc)
                .circuitMeta(0)
                .duration(20)
                .EUt(7)
                .buildAndRegister();
    }
}
