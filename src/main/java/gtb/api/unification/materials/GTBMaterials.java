package gtb.api.unification.materials;

import gregtech.api.unification.material.Material;

public class GTBMaterials {

    public GTBMaterials() {}

    // Element Materials

    // FD Materials
    public static Material PlatinumConcentrate;
    public static Material PlatinumExtract;
    public static Material PalladiumExtract;
    // SD Materials

    // Unknown Materials
    public static Material PlatinumExtractionMixture;

    public static void init() {
        GTBMaterialPropertyAddition.init();
        GTBMaterialFlagAddition.init();

        GTBElementMaterials.register();
        GTBFirstDegreeMaterials.register();
        GTBSecondDegreeMaterials.init();
        GTBOrganicChemistryMaterials.register();
        GTBUnknownCompositionMaterials.register();
        GTBBiologicalMaterials.register();
    }
}
