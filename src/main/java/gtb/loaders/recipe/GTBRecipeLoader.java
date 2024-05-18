package gtb.loaders.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.recipes.RecipeMaps;

public final class GTBRecipeLoader {

    public static void init() {
        RecipeMaps.BLAST_RECIPES.setMaxInputs(4);
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setSlotOverlay(false, true, false, GuiTextures.CENTRIFUGE_OVERLAY);
        RecipeMaps.CHEMICAL_BATH_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CHEMICAL_BATH_RECIPES.setSlotOverlay(false, true, false, GuiTextures.FLUID_TANK_OVERLAY);
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(4);
        RecipeMaps.EXTRACTOR_RECIPES.setMaxInputs(2);

        AlcoholLine.init();
        Catalysts.init();
        NaquadahLine.init();
        NaturalGasLine.init();
        OilLine.init();
        OrganicChemistry.init();
        PlatinumLine.init();
        TungstenLine.init();
        XylenolLine.init();
        MaterialBenefication.init();
        RandomRecipes.init();
        BiologyLines.init();
        AdamntiumLine.init();
        Metallurgy.init();
        Photolithography.init();
        DamascusSteelLine.init();
    }
}
