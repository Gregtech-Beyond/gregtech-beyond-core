package gtb.api.unification.ore;

import static gregtech.api.GTValues.M;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

import gtb.api.unification.materials.info.GTBMaterialIconType;

public class GTBOrePrefix {

    public static final OrePrefix floated = new OrePrefix("floated", M, null, GTBMaterialIconType.floated,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_FLOATED));
    public static final OrePrefix sifted = new OrePrefix("sifted", M, null, GTBMaterialIconType.sifted,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_SIFTED));
    public static final OrePrefix itemCasing = new OrePrefix("item_casing", M / 2, null,
            GTBMaterialIconType.itemCasing,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_ITEM_CASING));
    public static final OrePrefix seedCrystal = new OrePrefix("seed_crystal", -1, null,
            GTBMaterialIconType.seedCrystal,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> !mat.hasFlag(DISABLE_SEED_CRYSTAL) &&
                    (mat.hasProperty(PropertyKey.GEM) || mat.hasFlag(GENERATE_SEED_CRYSTAL)));
    public static final OrePrefix beads = new OrePrefix("beads", M, null, GTBMaterialIconType.beads,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_BEADS));
    public static final OrePrefix boule = new OrePrefix("boule", -1, null,
            GTBMaterialIconType.boule,
            OrePrefix.Flags.ENABLE_UNIFICATION,
            mat -> !mat.hasFlag(DISABLE_BOULE) && (mat.hasProperty(PropertyKey.GEM) || mat.hasFlag(GENERATE_BOULE)));
    public static final OrePrefix sponge = new OrePrefix("sponge", M, null, GTBMaterialIconType.sponge,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_SPONGE));

    public static void register() {
        MetaItems.addOrePrefix(GTBOrePrefix.floated);
        MetaItems.addOrePrefix(GTBOrePrefix.sifted);
        MetaItems.addOrePrefix(GTBOrePrefix.itemCasing);
        MetaItems.addOrePrefix(GTBOrePrefix.seedCrystal);
        MetaItems.addOrePrefix(GTBOrePrefix.boule);
        MetaItems.addOrePrefix(GTBOrePrefix.beads);
        MetaItems.addOrePrefix(GTBOrePrefix.sponge);
    }
}
