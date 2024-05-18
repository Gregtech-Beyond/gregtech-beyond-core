package gtb.api.unification.materials.info;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

public class GTBMaterialFlags {


    public static final MaterialFlag DISABLE_CRYSTALLIZATION = new MaterialFlag.Builder("no_crystallization")
            .requireFlags(MaterialFlags.CRYSTALLIZABLE)
            .requireProps(PropertyKey.GEM)
            .build();

}
