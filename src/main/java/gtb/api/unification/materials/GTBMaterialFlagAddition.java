package gtb.api.unification.materials;

import org.jetbrains.annotations.ApiStatus;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;

@ApiStatus.Internal
public final class GTBMaterialFlagAddition {

    private GTBMaterialFlagAddition() {}

    public static void init() {}

    public static void initLate() {
        Materials.Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
        Materials.Mica.addFlags(MaterialFlags.GENERATE_FOIL);
    }
}
