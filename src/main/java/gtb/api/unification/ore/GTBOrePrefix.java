package gtb.api.unification.ore;

import static gregtech.api.GTValues.M;
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasGemProperty;
import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;
import static gtb.api.unification.materials.info.GTBMaterialFlags.GENERATE_BOULE;

import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.ore.OrePrefix;

import gtb.api.unification.materials.info.GTBMaterialFlags;
import gtb.api.unification.materials.info.GTBMaterialIconTypes;

public class GTBOrePrefix {

    public static final OrePrefix seedCrystal = new OrePrefix("seedCrystal", M / 9, null,
            GTBMaterialIconTypes.seedCrystal, ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) &&
                    !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));

    public static final OrePrefix boule = new OrePrefix("boule", M * 4, null, GTBMaterialIconTypes.boule,
            ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) &&
                    !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));
}
