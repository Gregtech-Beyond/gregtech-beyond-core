package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.IngotProperty;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        IndiumPhosphide.setProperty(PropertyKey.INGOT, new IngotProperty());

    }

}
