package gtb.api.unification.materials;

import org.jetbrains.annotations.ApiStatus;
import gregtech.api.unification.material.info.MaterialFlags;

import static gregtech.api.unification.material.Materials.*;


@ApiStatus.Internal
public final class GTBMaterialFlagAddition {

    private GTBMaterialFlagAddition() {}

    public static void init() {}

    public static void initLate() {
        Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
    }
}
