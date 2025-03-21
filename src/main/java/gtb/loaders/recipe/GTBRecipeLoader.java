package gtb.loaders.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.recipes.RecipeMaps;

import gtb.loaders.recipe.circuitry.*;
import gtb.loaders.recipe.handlers.ore_processing.*;
import gtb.loaders.recipe.polymerLines.*;

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

        MinecraftOverhauls.init();
        NaquadahProcessing.init();
        IndiumProcessing.init();
        CrystalCircuitry.init();
        WetwareCircuitry.init();
        Electronics.init();
        FullerenePolymerTetrixLine.init();
        FullerenePolymerMatrixLine.init();
        KaptonLine.init();
        KevlarLine.init();
        NomexLine.init();
        PolybenzimidazoleLine.init();
        PolycaprolactamLine.init();
        PolydimethylsiloxaneLine.init();
        PolyethyleneLine.init();
        PolyphenyleneSulfideLine.init();
        PolystyreneLine.init();
        PolystyreneNanoparticlesLine.init();
        PolytetrafluoroethyleneLine.init();
        PolyurethaneLine.init();
        PolyvinylAcetateLine.init();
        PolyvinylButyralLine.init();
        PolyvinylChlorideLine.init();
        StyreneButadieneRubberLine.init();
        ZylonLine.init();
        SeleniumTelluriumProcessing.init();
        CryogenicAirDistillation.init();
        AlcoholLine.init();
        CadmiumProcessing.init();
        GermaniumProcessing.init();
        MolybdenumProcessing.init();
        ThalliumProcessing.init();
        Catalysts.init();
        MonaziteProcessing.init();
        NaquadahProcessing.init();
        NaturalGasLine.init();
        OilLine.init();
        OrganicChemistry.init();
        RubidiumProcessing.init();
        PlatinumProcessing.init();
        MonaziteProcessing.init();
        TungstenProcessing.init();
        XylenolLine.init();
        MaterialBenefication.init();
        RandomRecipes.init();
        BiologyLines.init();
        MolybdenumProcessing.init();
        AdamantiumProcessing.init();
        Metallurgy.init();
        Photolithography.init();
        GermaniumProcessing.init();
        DamascusSteelProcessing.init();
        MachineRecipes.init();
        BrineLine.init();
        BastnasiteProcessing.init();
        HydrogenPeroxideLine.init();
        GadoliniteProcessing.init();
        MonaziteProcessing.init();
        IronProcessing.init();
        NiobiumTantalumProcessing.init();
        AluminiumProcessing.init();
        TitaniumProcessing.init();
        ChromeProcessing.init();
        NickelProcessing.init();
        PitchblendeProcessing.init();
        ManganeseProcessing.init();
        ZirconiumHafniumProcessing.init();
        ZincProcessing.init();
        TinProcessing.init();
        StrontiumProcessing.init();
        LeadProcessing.init();
        CopperProcessing.init();
        BasicOreProcessingOverhaul.init();
        ArsenicProcessing.init();
        AntimonyProcessing.init();

        KevTestRecipes.register();
    }
}
