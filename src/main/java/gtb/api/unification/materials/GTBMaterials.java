package gtb.api.unification.materials;
import gregtech.api.unification.material.Material;
import gtb.api.unification.materials.GTBMaterialFlagAddition;
import gtb.api.unification.materials.GTBElementMaterials;

public class GTBMaterials {

    //Element Materials

    //FD Materials

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


    //SD Materials

    public static Material PalladiumEnrichedAmmonia;
    public static Material AcidicIridiumDioxide;
    public static Material ReprecipitatedPalladium;
    public static Material RutheniumTetroxideSolution;
    public static Material RhodiumSulfateSolution;


    //Unknown Materials
    public static Material PlatinumExtractionMixture;
    public static Material DilutedOil;
    public static Material DesaltedOil;
    public static Material SulfuricKerosene;
    public static Material SulfuricDiesel;
    public static Material SulfuricOilResidues;
    public static Material SulfuricGasoline;

    //Organic Chemistry Materials

    public static Material FormicAcid;
    public static Material SodiumFormate;



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
