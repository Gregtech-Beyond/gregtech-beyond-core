package gtb.api.unification.materials.material.info;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

public class GTBMaterialFlags {

    public static final MaterialFlag GENERATE_COIL = new MaterialFlag.Builder("generate_coil")
            .requireFlags(MaterialFlags.GENERATE_FINE_WIRE)
            .build();
    public static final MaterialFlag GENERATE_FOATED = new MaterialFlag.Builder("generate_floated")
            .build();
    public static final MaterialFlag DISABLE_CRYSTALLIZATION = new MaterialFlag.Builder("no_crystallization")
            .requireFlags(MaterialFlags.CRYSTALLIZABLE)
            .requireProps(PropertyKey.GEM)
            .build();
    public static final MaterialFlag GENERATE_BOULE = new MaterialFlag.Builder("generate_boule")
            .requireProps(PropertyKey.GEM)
            .build();
}

