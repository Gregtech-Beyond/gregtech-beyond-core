package gtb.api.unification.materials;

import gregtech.api.unification.material.Material;

public class GTBMaterials {

    // Element Materials

    // FD Materials

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

    // SD Materials
    public static Material PalladiumEnrichedAmmonia;
    public static Material AcidicIridiumDioxide;
    public static Material ReprecipitatedPalladium;
    public static Material RutheniumTetroxideSolution;
    public static Material RhodiumSulfateSolution;
    public static Material Tetrapropylammoniumbromide;

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
