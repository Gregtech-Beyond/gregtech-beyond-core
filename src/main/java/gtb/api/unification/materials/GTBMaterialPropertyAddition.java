package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.PhosphorusPentoxide;

import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        PhosphorusPentoxide.setProperty(PropertyKey.FLUID, new FluidProperty());
    }
}
