package gtb.api.unification.materials.info;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Cupronickel;

import java.util.Arrays;

import org.jetbrains.annotations.ApiStatus;

import gregtech.api.unification.material.Material;
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

    public static final MaterialFlag GENERATE_COIL = new MaterialFlag.Builder("generate_coil")
            .requireFlags(MaterialFlags.GENERATE_FINE_WIRE)
            .build();
    public static final MaterialFlag GENERATE_CURVED_PLATE = new MaterialFlag.Builder("generate_curved_plate")
            .requireFlags(MaterialFlags.GENERATE_PLATE)
            .build();
    public static final MaterialFlag DISABLE_CRYSTALLIZATION = new MaterialFlag.Builder("no_crystallization")
            .requireFlags(MaterialFlags.CRYSTALLIZABLE)
            .requireProps(PropertyKey.GEM)
            .build();
    public static final MaterialFlag GENERATE_BOULE = new MaterialFlag.Builder("generate_boule")
            .requireProps(PropertyKey.GEM)
            .build();

    public static void addToMaterials() {
        addFlag(MaterialFlags.GENERATE_FOIL, Titanium, Graphene, Mica);

        addFlag(MaterialFlags.GENERATE_FINE_WIRE, NaquadahAlloy, Tungsten);

        Cupronickel.addFlags(MaterialFlags.GENERATE_LONG_ROD);

        addFlag(GTBMaterialFlags.GENERATE_SIFTED, GTBMaterialFlags.GENERATE_FLOATED, Pyrochlore, Tantalite);

        addFlag(GTBMaterialFlags.GENERATE_ITEM_CASING, Steel, Aluminium, StainlessSteel, Titanium, TungstenSteel);

        addFlag(MaterialFlags.GENERATE_PLATE, SiliconDioxide, BorosilicateGlass, Zirconium, Holmium, Hafnium, Scandium,
                Dysprosium, Erbium, Gadolinium, Rhenium, Germanium, Strontium, Rutherfordium);
    }

    private static void addFlag(MaterialFlag flag, Material... materials) {
        Arrays.stream(materials).forEach(material -> material.addFlags(flag));
    }

    private static void addFlag(MaterialFlag flag, MaterialFlag flag2, Material... materials) {
        Arrays.stream(materials).forEach(material -> {
            material.addFlags(flag);
            material.addFlags(flag2);
        });
    }
}
