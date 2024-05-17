package gtb.api.unification.materials;

import gregtech.api.unification.material.Material;

public class GTBMaterials {

    // Element Materials

    // FD Materials

    public static Material Trichloroflerane;
    public static Material LiquidEnrichedHelium_4;
    public static Material Helium_4;
    public static Material SuperFluidHelium_4;
    public static Material VeryHotNitrogen;
    public static Material SiliconCarbideVapor;
    public static Material SiliconCarbide;
    public static Material LiquidXenon;
    public static Material ExtraDistilledWater;
    public static Material NaquadahDioxide;
    public static Material ElectronDegenerateRhenium;
    public static Material ElectronDegenerateRheniumPlasma;
    public static Material HighPurityArsenic;
    public static Material WhitePhosphorus;
    public static Material NovolacsPhotoresist;
    public static Material IndiumChloride;
    public static Material PlatinumConcentrate;
    public static Material PlatinumExtract;
    public static Material PalladiumExtract;
    public static Material PlatinumResidues;
    public static Material PotassiumDisulfate;
    public static Material LeachResidue;
    public static Material SodiumRuthenate;
    public static Material RutheniumTetroxideLiquid;
    public static Material IridiumDioxide;
    public static Material PlatinumSolution;
    public static Material PlatinumSalt;
    public static Material PalladiumMotherLiqour;
    public static Material PalladiumSalt;
    public static Material PalladiumMetallicPowder;
    public static Material Nonene;
    public static Material Propylene;
    public static Material Hexane;
    public static Material Pentane;
    public static Material NHexadecane;
    public static Material NHeptane;
    public static Material NOctane;
    public static Material ZSM5;
    public static Material OXylene;
    public static Material PXylene;
    public static Material MPXylene;
    public static Material MXylene;
    public static Material NPropanol;
    public static Material NButanol;
    public static Material IsoamylAlcohol;
    public static Material IsobutylAlcohol;
    public static Material Formaldehyde;
    public static Material Dicyclopentadiene;
    public static Material Cyclopentadiene;
    public static Material HydrogenPeroxide;
    public static Material TungstenTrioxide;
    public static Material CalciumHydroxide;
    public static Material LithiumHydroxide;
    public static Material SodiumTungstate;
    public static Material CalciumTungstate;
    public static Material LithiumHydroxideSolution;
    public static Material LithiumFluoride;
    public static Material PhotopolymerSolution;
    public static Material UsedPhotopolymerSolution;
    public static Material VeryHotXenon;
    public static Material VeryHotArgon;
    public static Material NickelNitride;
    public static Material VanadiumTrichloride;
    public static Material LiquidHelium;
    public static Material MetastableOganesson;
    public static Material VeryHotKrypton;
    public static Material NaquadahRichSterileGrowthMedium;
    public static Material HighDensityPolyethylene;
    public static Material LiquidNitrogen;
    public static Material GrapheneOxidationSolution;
    public static Material GraphiteOxide;
    public static Material GrapheneOxide;
    public static Material GrapheneOxidationResidues;
    public static Material SilverBromide;
    public static Material Silane;
    public static Material Trichlorosilane;
    public static Material ChloronaquadicAcid;
    public static Material VeryHotAquaRegia;
    public static Material SodiumNitrate;
    public static Material BariumTitanate;
    public static Material HydrogenChloride;
    public static Material ZBLAN;
    public static Material DopedNanotubeDepositionMixture;
    public static Material NanotubeDepositionMix;
    public static Material DopedNanotubeDepositionMix;
    public static Material CarbonNanotubes;
    public static Material LiquidCrystalDetector;
    public static Material FullerenePolymerMatrix;
    public static Material FullerenePolymerTetrix;
    public static Material SeaborgiumDopedNanotubes;
    public static Material NaquadriaticTaranium;
    public static Material ChromaticGlass;
    public static Material SuperFluidHelium;

    // SD Materials
    public static Material PalladiumEnrichedAmmonia;
    public static Material AcidicIridiumDioxide;
    public static Material ReprecipitatedPalladium;
    public static Material RutheniumTetroxideSolution;
    public static Material RhodiumSulfateSolution;
    public static Material Tetrapropylammoniumbromide;
    public static Material UEVSuperconductor;

    // Unknown Materials
    public static Material HydroCrackedKerosene;
    public static Material SteamCrackedKerosene;
    public static Material PlatinumExtractionMixture;
    public static Material DilutedOil;
    public static Material DesaltedOil;
    public static Material SulfuricKerosene;
    public static Material SulfuricDiesel;
    public static Material SulfuricOilResidues;
    public static Material SulfuricGasoline;
    public static Material Resin;
    public static Material Kerosene;
    public static Material SulfuricFuelOil;
    public static Material FuelOil;
    public static Material Furfural;
    public static Material BTEX;
    public static Material EthanolWaterAzeotrope;
    public static Material FuselOil;
    public static Material ImpureEthanol;
    public static Material GrainSolution;
    public static Material Vinegar;
    public static Material FractionC_5;
    public static Material LubricantMixture;
    public static Material SlackWax;
    public static Material AlkylatedNaturalGas;
    public static Material Syngas;
    // Organic Chemistry Materials

    public static Material FormicAcid;
    public static Material SodiumFormate;
    public static Material Tripropylamine;

    public static void init() {
        GTBMaterialPropertyAddition.init();
        GTBMaterialFlagAddition.init();
        GTBElementMaterials.register();
        GTBFirstDegreeMaterials.register();
        GTBSecondDegreeMaterials.register();
        GTBOrganicChemistryMaterials.register();
        GTBUnknownCompositionMaterials.register();
        GTBBiologicalMaterials.register();
    }
}
