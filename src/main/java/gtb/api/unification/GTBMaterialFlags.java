package gtb.api.unification;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

public final class GTBMaterialFlags {

    /**
     * Use to disable alloy blast recipes from generating
     */
    public static final MaterialFlag NO_ALLOY_BLAST_RECIPES = new MaterialFlag.Builder("no_alloy_blast_recipes")
            .requireProps(PropertyKey.BLAST, PropertyKey.FLUID)
            .build();

    /**
     * Use to disable everything related to alloy blasting
     */
    public static final MaterialFlag DISABLE_ALLOY_PROPERTY = new MaterialFlag.Builder("disable_alloy_property")
            .requireProps(PropertyKey.BLAST, PropertyKey.FLUID)
            .requireFlags(NO_ALLOY_BLAST_RECIPES)
            .build();

    public static final MaterialFlag DISABLE_CRYSTALLIZATION = new MaterialFlag.Builder("no_crystallization")
            .requireFlags(MaterialFlags.CRYSTALLIZABLE)
            .requireProps(PropertyKey.GEM)
            .build();
    private GTBMaterialFlags() {}
}
