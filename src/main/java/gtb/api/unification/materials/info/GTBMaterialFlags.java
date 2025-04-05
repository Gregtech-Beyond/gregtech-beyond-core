package gtb.api.unification.materials.info;

import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.GTBMaterials.*;

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

    public static MaterialFlag GENERATE_CONCENTRATE = (new MaterialFlag.Builder("concentrate"))
            .requireProps(PropertyKey.ORE)
            .build();

    public static MaterialFlag GENERATE_FLOATED = (new MaterialFlag.Builder("floated"))
            .requireProps(PropertyKey.ORE)
            .build();

    public static MaterialFlag GENERATE_ITEM_CASING = (new MaterialFlag.Builder("item_casing"))
            .requireFlags(MaterialFlags.GENERATE_PLATE)
            .build();

    public static MaterialFlag GENERATE_SEED_CRYSTAL = (new MaterialFlag.Builder("seed_crystal"))
            .build();

    public static MaterialFlag GENERATE_BOULE = (new MaterialFlag.Builder("boule"))
            .build();

    public static MaterialFlag DISABLE_SEED_CRYSTAL = (new MaterialFlag.Builder("disable_crystal"))
            .build();

    public static MaterialFlag DISABLE_BOULE = (new MaterialFlag.Builder("disable_crystal"))
            .build();

    public static MaterialFlag GENERATE_BEADS = (new MaterialFlag.Builder("beads"))
            .build();

    public static void addToMaterials() {
        addFlag(MaterialFlags.GENERATE_FOIL, Titanium, Graphene, Mica);

        addFlag(MaterialFlags.GENERATE_FINE_WIRE, NaquadahAlloy, Tungsten, Iron, Titanium);

        addFlag(MaterialFlags.GENERATE_FRAME, Lead);

        Cupronickel.addFlags(MaterialFlags.GENERATE_LONG_ROD);

        addFlag(GTBMaterialFlags.GENERATE_SIFTED, GTBMaterialFlags.GENERATE_FLOATED, Pyrochlore, Tantalite, Pollucite);

        addFlag(GTBMaterialFlags.GENERATE_ITEM_CASING, Steel, Aluminium, StainlessSteel, Titanium, TungstenSteel);

        addFlag(MaterialFlags.GENERATE_PLATE, SiliconDioxide, BorosilicateGlass, Zirconium, Holmium, Hafnium, Scandium,
                Dysprosium, Erbium, Gadolinium, Rhenium, Germanium, Strontium, Rutherfordium);

        addFlag(DISABLE_BOULE, DISABLE_SEED_CRYSTAL, Coke, Charcoal, Salt, RockSalt, Coal, Sugar, Flint);
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
