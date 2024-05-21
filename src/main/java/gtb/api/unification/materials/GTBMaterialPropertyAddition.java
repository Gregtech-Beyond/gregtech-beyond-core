package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.*;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        PhosphorusPentoxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        SodiumSulfide.setProperty(PropertyKey.FLUID, new FluidProperty());
        IndiumPhosphide.setProperty(PropertyKey.INGOT, new IngotProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        NaquadahAlloy.addFlags(MaterialFlags.GENERATE_FINE_WIRE);
        Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
        Mica.addFlags(MaterialFlags.GENERATE_FOIL);
        BorosilicateGlass.addFlags(MaterialFlags.GENERATE_PLATE);
        Cupronickel.addFlags(MaterialFlags.GENERATE_LONG_ROD);
    }
}
