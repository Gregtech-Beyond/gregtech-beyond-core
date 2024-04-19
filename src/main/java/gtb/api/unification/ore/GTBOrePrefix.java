package gtb.api.unification.ore;

import gtb.api.unification.materials.material.info.GTBMaterialFlags;
import gtb.api.unification.materials.material.info.GTBMaterialIconType;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import net.minecraft.client.resources.I18n;

import java.util.Collections;
import static gtb.api.unification.materials.material.info.GTBMaterialFlags.GENERATE_BOULE;
import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;


import static gregtech.api.GTValues.M;
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasGemProperty;
public class GTBOrePrefix {
    public static final OrePrefix seedCrystal = new OrePrefix("seedCrystal", M / 9, null, GTBMaterialIconType.seedCrystal, ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) && !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));
    public static final OrePrefix boule = new OrePrefix("boule", M * 4, null, GTBMaterialIconType.boule, ENABLE_UNIFICATION,
            hasGemProperty.and(mat -> mat.hasFlag(GENERATE_BOULE) || (mat.hasFlag(MaterialFlags.CRYSTALLIZABLE) && !mat.hasFlag(GTBMaterialFlags.DISABLE_CRYSTALLIZATION))));

}
