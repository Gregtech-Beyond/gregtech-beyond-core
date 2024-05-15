package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.IngotProperty;
import gregtech.api.unification.material.properties.PropertyKey;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        IndiumPhosphide.setProperty(PropertyKey.INGOT, new IngotProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
    }
}
