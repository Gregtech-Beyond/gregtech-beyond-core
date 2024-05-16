package gtb.api.unification.materials.info;

import static gregtech.api.unification.material.Materials.DamascusSteel;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

import gregtech.api.unification.material.info.MaterialIconSet;

public class GTBMaterialIconSet {

    public static final MaterialIconSet DAMASCUS = new MaterialIconSet("damascus", SHINY);

    public static void set() {
        DamascusSteel.setMaterialIconSet(DAMASCUS);
    }
}
