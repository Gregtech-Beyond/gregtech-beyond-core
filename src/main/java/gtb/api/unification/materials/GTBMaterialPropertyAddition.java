package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.*;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Cadmium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        PhosphorusPentoxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        SodiumSulfide.setProperty(PropertyKey.FLUID, new FluidProperty());
        IndiumPhosphide.setProperty(PropertyKey.INGOT, new IngotProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        Titanium.addFlags(MaterialFlags.GENERATE_FOIL);
        NaquadahAlloy.addFlags(MaterialFlags.GENERATE_FINE_WIRE);
        Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
        Mica.addFlags(MaterialFlags.GENERATE_FOIL);
        BorosilicateGlass.addFlags(MaterialFlags.GENERATE_PLATE);
        Cupronickel.addFlags(MaterialFlags.GENERATE_LONG_ROD);
        AmmoniumChloride.setProperty(PropertyKey.FLUID, new FluidProperty());
        Mica.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Pre-Registered Materials ????????

        // Zirconium
        Zirconium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Zirconium.addFlags(MaterialFlags.GENERATE_PLATE);
        Zirconium.addFlags(MaterialFlags.GENERATE_FRAME);
        Zirconium.addFlags(MaterialFlags.GENERATE_ROD);

        // Holmium

        Holmium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Holmium.addFlags(MaterialFlags.GENERATE_PLATE);
        Holmium.addFlags(MaterialFlags.GENERATE_FRAME);
        Holmium.addFlags(MaterialFlags.GENERATE_ROD);

        // Hafnium

        Hafnium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hafnium.addFlags(MaterialFlags.GENERATE_PLATE);
        Hafnium.addFlags(MaterialFlags.GENERATE_FRAME);
        Hafnium.addFlags(MaterialFlags.GENERATE_ROD);
    }
}
