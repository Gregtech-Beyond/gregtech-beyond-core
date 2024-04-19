package gtb.api.unification.materials;
import gregtech.api.unification.material.Material;

public class GTBMaterials {
    //Element Materials

    //FD Materials
    public static Material PlatinumConcentrate;
    public static Material PlatinumExtract;
    public static Material PalladiumExtract;
    public static Material PlatinumResidues;
    public static Material PotassiumDisulfate;
    public static Material LeachResidue;
    public static Material RhodiumSulfateSolution;
    public static Material SodiumRuthenate;
    public static Material RutheniumTetroxideSolution;
    public static Material RutheniumTetroxideLiquid;
    public static Material IridiumDioxide;
    public static Material AcidicIridiumDioxide;

    //SD Materials

    //Unknown Materials
    public static Material PlatinumExtractionMixture;

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
