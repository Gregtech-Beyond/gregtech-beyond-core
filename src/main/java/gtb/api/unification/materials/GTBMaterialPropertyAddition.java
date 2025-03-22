package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.properties.*;
import net.minecraftforge.gradle.GradleForgeHacks;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Bromine.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        AmmoniumChloride.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        Sodium.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        Cadmium.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        PhosphorusPentoxide.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        SodiumSulfide.setProperty(PropertyKey.FLUID,
                new FluidProperty(FluidStorageKeys.LIQUID, new FluidBuilder()));

        Selenium.setProperty(PropertyKey.DUST, new DustProperty());
        Iron3Chloride.setProperty(PropertyKey.DUST, new DustProperty());
        Tellurium.setProperty(PropertyKey.DUST, new DustProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Rubidium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        Mica.setProperty(PropertyKey.INGOT, new IngotProperty());
        BandedIron.setProperty(PropertyKey.INGOT, new IngotProperty());
        PlatinumRaw.setProperty(PropertyKey.INGOT, new IngotProperty());

        // Zirconium
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());

        //Graphene

        Graphene.setProperty(PropertyKey.INGOT, new IngotProperty());

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

        // Rubidium
        Rubidium.setProperty(PropertyKey.INGOT, new IngotProperty());
    }
}
