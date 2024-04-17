package gtb.api.unification;

import gtb.api.unification.materials.GTBFirstDegreeMaterials;
import gtb.api.unification.materials.GTBMaterialFlagAddition;

public final class GTBMaterials {

    public static void init() {
        GTBFirstDegreeMaterials.init();

        GTBMaterialFlagAddition.init();
    }
}
