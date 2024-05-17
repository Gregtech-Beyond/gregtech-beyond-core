package gtb.loaders.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.recipes.RecipeMaps;

public final class GTBRecipeLoader {

    public static void init() {
        RecipeMaps.BLAST_RECIPES.setMaxInputs(4);
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setSlotOverlay(false, true, false, GuiTextures.CENTRIFUGE_OVERLAY);
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
        NaturalGasLine.init();
        TungstenLine.init();
        MaterialBenefication.init();
        RandomRecipes.init();
        Photolithography.init();
        DamascusSteelLine.init();
    }
}
