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
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(4);
        RecipeMaps.EXTRACTOR_RECIPES.setMaxInputs(2);
        RecipeMaps.CHEMICAL_RECIPES.setMaxOutputs(3);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxFluidOutputs(1);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxFluidInputs(1);
        RecipeMaps.LARGE_CHEMICAL_RECIPES.setMaxInputs(4);
        RecipeMaps.SIFTER_RECIPES.setMaxFluidInputs(1);
        RecipeMaps.SIFTER_RECIPES.setMaxFluidOutputs(1);
        RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES.setMaxInputs(9);
        RecipeMaps.VACUUM_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.CHEMICAL_RECIPES.setMaxFluidOutputs(3);

        MinecraftOverhauls.init();
        Electronics.init();
        CryogenicAirDistillation.init();
        AlcoholLine.init();
        Catalysts.init();
        NaturalGasLine.init();
        OrganicChemistry.init();
        XylenolLine.init();
        MaterialBenefication.init();
        RandomRecipes.init();
        BiologyLines.init();
        Metallurgy.init();
        Photolithography.init();
        MachineRecipes.init();
        BrineLine.init();
        WaterLine.init();
        FurnaceRemoveals.init();
    }
}
