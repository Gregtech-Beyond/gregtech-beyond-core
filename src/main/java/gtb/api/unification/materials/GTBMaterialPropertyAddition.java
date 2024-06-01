package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.*;

import gtb.api.unification.materials.info.GTBMaterialFlags;

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
        BandedIron.setProperty(PropertyKey.INGOT, new IngotProperty());
        PlatinumRaw.setProperty(PropertyKey.INGOT, new IngotProperty());
        Sodium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Pyrochlore.addFlags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED);
        Tantalite.addFlags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED);

        // Pre-Registered Materials ????????

        // Zirconium
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Zirconium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Holmium

        Holmium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Holmium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Hafnium

        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hafnium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Scandium

        Scandium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Scandium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Dysprosium

        Dysprosium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dysprosium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Erbium

        Erbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Erbium.addFlags(MaterialFlags.GENERATE_PLATE);
        // Gadolinium

        Gadolinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Gadolinium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Rhenium

        Rhenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rhenium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Germanium

        Germanium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Germanium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Strontium

        Strontium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Strontium.addFlags(MaterialFlags.GENERATE_PLATE);

        // Rutherfordium
        Rutherfordium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rutherfordium.addFlags(MaterialFlags.GENERATE_PLATE);
    }
}
