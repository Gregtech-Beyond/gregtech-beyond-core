package gtb.api.unification.ore;

import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

import gregtech.api.unification.ore.OrePrefix;

import gtb.api.unification.materials.info.GTBMaterialIconType;

public class GTBOrePrefix {

    public static final OrePrefix floated = new OrePrefix("dustFloated", -1, null, GTBMaterialIconType.floated,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_FLOATED));
    public static final OrePrefix sifted = new OrePrefix("dustSifted", -1, null, GTBMaterialIconType.sifted,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_SIFTED));
}
