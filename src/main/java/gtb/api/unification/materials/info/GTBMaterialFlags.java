package gtb.api.unification.materials.info;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Cupronickel;

import org.jetbrains.annotations.ApiStatus;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;

@ApiStatus.Internal
public class GTBMaterialFlags {

    public static MaterialFlag GENERATE_SIFTED = (new MaterialFlag.Builder("sifted"))
            .requireProps(PropertyKey.ORE)
            .build();

    public static MaterialFlag GENERATE_FLOATED = (new MaterialFlag.Builder("floated"))
            .requireProps(PropertyKey.ORE)
            .build();

    public static MaterialFlag GENERATE_ITEM_CASING = (new MaterialFlag.Builder("item_casing"))
            .requireFlags(MaterialFlags.GENERATE_PLATE)
            .build();

    public static void addToMaterials() {
        Titanium.addFlags(MaterialFlags.GENERATE_FOIL);
        Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
        Mica.addFlags(MaterialFlags.GENERATE_FOIL);

        NaquadahAlloy.addFlags(MaterialFlags.GENERATE_FINE_WIRE);
        Tungsten.addFlags(MaterialFlags.GENERATE_FINE_WIRE);

        Cupronickel.addFlags(MaterialFlags.GENERATE_LONG_ROD);

        Pyrochlore.addFlags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED);
        Tantalite.addFlags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED);

        Steel.addFlags(GTBMaterialFlags.GENERATE_ITEM_CASING);

        SiliconDioxide.addFlags(MaterialFlags.GENERATE_PLATE);
        BorosilicateGlass.addFlags(MaterialFlags.GENERATE_PLATE);
        Zirconium.addFlags(MaterialFlags.GENERATE_PLATE);
        Holmium.addFlags(MaterialFlags.GENERATE_PLATE);
        Hafnium.addFlags(MaterialFlags.GENERATE_PLATE);
        Scandium.addFlags(MaterialFlags.GENERATE_PLATE);
        Dysprosium.addFlags(MaterialFlags.GENERATE_PLATE);
        Erbium.addFlags(MaterialFlags.GENERATE_PLATE);
        Gadolinium.addFlags(MaterialFlags.GENERATE_PLATE);
        Rhenium.addFlags(MaterialFlags.GENERATE_PLATE);
        Germanium.addFlags(MaterialFlags.GENERATE_PLATE);
        Strontium.addFlags(MaterialFlags.GENERATE_PLATE);
        Rutherfordium.addFlags(MaterialFlags.GENERATE_PLATE);
    }
}
