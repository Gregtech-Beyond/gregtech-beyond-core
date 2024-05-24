package gtb.loaders.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.recipes.RecipeMaps;

import gtb.loaders.recipe.handlers.ore_processing.*;

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
        RecipeMaps.CHEMICAL_RECIPES.setMaxOutputs(3);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxFluidOutputs(1);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxFluidInputs(1);
        RecipeMaps.LARGE_CHEMICAL_RECIPES.setMaxInputs(4);

        SeleniumTelluriumProcessing.init();
        AlcoholLine.init();
        CadmiumProcessing.init();
        GermaniumProcessing.init();
        MolybdenumProcessing.init();
        ThalliumProcessing.init();
        RubidiumProcessing.init();
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
        AdamantiumLine.init();
        Metallurgy.init();
        Photolithography.init();
        DamascusSteelLine.init();
        MachineRecipes.init();
        BrineLine.init();
        PolymerizationRework.init();
    }
}
