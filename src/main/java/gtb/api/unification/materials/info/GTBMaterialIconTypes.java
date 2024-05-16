package gtb.api.unification.materials.info;

import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.info.MaterialIconType;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTBMaterialIconTypes {

    //IconSets Here
    public static final MaterialIconSet DAMASCUS = new MaterialIconSet("damascus", SHINY);

    //IconTypes Here
    public static final MaterialIconType coil = new MaterialIconType("coil");
    public static final MaterialIconType milled = new MaterialIconType("milled");
    public static final MaterialIconType floated = new MaterialIconType("floated");
    public static final MaterialIconType seedCrystal = new MaterialIconType("seedCrystal");
    public static final MaterialIconType boule = new MaterialIconType("boule");

}
