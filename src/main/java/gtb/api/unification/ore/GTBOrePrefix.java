package gtb.api.unification.ore;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.ore.OrePrefix.Conditions.*;
import static gregtech.api.unification.ore.OrePrefix.Flags.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.ore.OrePrefix;

import gtb.api.unification.materials.info.GTBMaterialFlags;
import gtb.api.unification.materials.info.GTBMaterialIconType;

public class GTBOrePrefix {

    public static final OrePrefix seedCrystal = new OrePrefix("seedCrystal", M / 9, null,
            GTBMaterialIconType.seedCrystal, ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) &&
                    !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));
    public static final OrePrefix boule = new OrePrefix("boule", M * 4, null, GTBMaterialIconType.boule,
            ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) &&
                    !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));
    public static final OrePrefix floated = new OrePrefix("floated", M * 1, null, GTBMaterialIconType.floated,
            ENABLE_UNIFICATION, hasDustProperty);
    public static final OrePrefix sifted = new OrePrefix("sifted", M * 1, null, GTBMaterialIconType.sifted,
            ENABLE_UNIFICATION, hasDustProperty);
}
