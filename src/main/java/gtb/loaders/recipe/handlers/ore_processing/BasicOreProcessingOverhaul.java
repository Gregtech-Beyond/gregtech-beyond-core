package gtb.loaders.recipe.handlers.ore_processing;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class BasicOreProcessingOverhaul {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Phosphorus, 5) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Phosphate, 5)
                .output(dust, Phosphorus)
                .fluidOutputs(Steam.getFluid(4000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Phosphate, 5)
                .output(dust, Phosphorus)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, ManganeseSulfate, 6) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ManganeseSulfate, 3)
                .fluidOutputs(SulfurDioxide.getFluid(2000))
                .output(dust, Manganese, 1)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, IronSulfate, 6) });

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, IronSulfate, 6)
                .fluidOutputs(SulfurTrioxide.getFluid(5000))
                .output(dust, Iron, 1)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ErbiumOxide, 2)
                .output(dust, Erbium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ErbiumOxide, 2)
                .output(dust, Erbium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, YttriumOxide, 2)
                .output(dust, Yttrium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, YttriumOxide, 2)
                .output(dust, Yttrium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ScandiumOxide, 2)
                .output(dust, Scandium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ScandiumOxide, 2)
                .output(dust, Scandium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, DysprosiumOxide, 2)
                .output(dust, Dysprosium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, DysprosiumOxide, 2)
                .output(dust, Dysprosium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, LanthanumOxide, 2)
                .output(dust, Lanthanum)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, LanthanumOxide, 2)
                .output(dust, Lanthanum)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, NeodymiumOxide, 2)
                .output(dust, Neodymium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, NeodymiumOxide, 2)
                .output(dust, Neodymium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, CeriumOxide, 2)
                .output(dust, Cerium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, CeriumOxide, 2)
                .output(dust, Cerium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, HafniumOxide, 2)
                .output(dust, Hafnium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, HafniumOxide, 2)
                .output(dust, Hafnium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, GadoliniumOxide, 2)
                .output(dust, Gadolinium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, GadoliniumOxide, 2)
                .output(dust, Gadolinium)
                .circuitMeta(0)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, RutherfordiumOxide, 2)
                .output(dust, Rutherfordium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, RutherfordiumOxide, 2)
                .output(dust, Rutherfordium)
                .circuitMeta(0)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ZirconiumOxide, 2)
                .output(dust, Zirconium)
                .fluidOutputs(Steam.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ZirconiumOxide, 2)
                .output(dust, Zirconium)
                .circuitMeta(0)
                .duration(200)
                .EUt(8)
                .buildAndRegister();
    }
}
