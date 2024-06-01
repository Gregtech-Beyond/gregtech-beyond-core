package gtb.api.unification.materials.info;

import org.jetbrains.annotations.ApiStatus;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.properties.PropertyKey;

@ApiStatus.Internal
public class GTBMaterialFlags {

    public static MaterialFlag GENERATE_SIFTED = (new MaterialFlag.Builder("sifted"))
            .requireProps(new PropertyKey[] { PropertyKey.ORE })
            .build();

    public static MaterialFlag GENERATE_FLOATED = (new MaterialFlag.Builder("floated"))
            .requireProps(new PropertyKey[] { PropertyKey.ORE })
            .build();
}
