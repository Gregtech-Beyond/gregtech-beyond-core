package gtb.loaders.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;

import gtb.api.recipes.GTBRecipeMaps;

public final class GTBRecipeLoader {

    public static void editGTCEuRecipeMaps() {
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setSlotOverlay(false, true, false, GuiTextures.CENTRIFUGE_OVERLAY);
    }

    public static void init() {
        AlcoholLine.init();
        Catalysts.init();
        NaquadahLine.init();
        OilLine.init();
        OrganicChemistry.init();
        PlatinumLine.init();
        XylenolLine.init();

        GTBRecipeMaps.WATER_TANK.recipeBuilder().circuitMeta(1).duration(20).fluidOutputs(Materials.Water.getFluid(200))
                .buildAndRegister();
        GTBRecipeMaps.SOLAR_THERMAL_CONCENTRATOR.recipeBuilder().circuitMeta(1).duration(20)
                .fluidInputs(Materials.Water.getFluid(10)).fluidOutputs(Materials.Steam.getFluid(5000))
                .buildAndRegister();
    }
}
