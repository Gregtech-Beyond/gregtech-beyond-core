package gtb.api.unification.ore;

import static gregtech.api.GTValues.M;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

import gtb.api.unification.materials.info.GTBMaterialIconType;

public class GTBOrePrefix {

    public static final OrePrefix floated = new OrePrefix("floated", M, null, GTBMaterialIconType.floated,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_FLOATED));
    public static final OrePrefix sifted = new OrePrefix("sifted", M, null, GTBMaterialIconType.sifted,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_SIFTED));
    public static final OrePrefix item_casing = new OrePrefix("item_casing", M / 2, null,
            GTBMaterialIconType.item_casing,
            OrePrefix.Flags.ENABLE_UNIFICATION, mat -> mat.hasFlag(GENERATE_ITEM_CASING));

    public static void register() {
        MetaItems.addOrePrefix(GTBOrePrefix.floated);
        MetaItems.addOrePrefix(GTBOrePrefix.sifted);
        MetaItems.addOrePrefix(GTBOrePrefix.item_casing);
    }
}
