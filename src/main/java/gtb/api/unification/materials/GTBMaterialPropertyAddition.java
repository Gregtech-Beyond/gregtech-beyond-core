package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

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
        AmmoniumChloride.setProperty(PropertyKey.FLUID, new FluidProperty());
        Mica.setProperty(PropertyKey.INGOT, new IngotProperty());
        BandedIron.setProperty(PropertyKey.INGOT, new IngotProperty());
        PlatinumRaw.setProperty(PropertyKey.INGOT, new IngotProperty());
        Sodium.setProperty(PropertyKey.FLUID, new FluidProperty());

        // Pre-Registered Materials ????????

        // Zirconium
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Holmium

        Holmium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Hafnium

        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Scandium

        Scandium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Dysprosium

        Dysprosium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Erbium

        Erbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        // Gadolinium

        Gadolinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        // Rhenium

        Rhenium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Germanium

        Germanium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Strontium

        Strontium.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Rutherfordium
        Rutherfordium.setProperty(PropertyKey.INGOT, new IngotProperty());
    }
}
