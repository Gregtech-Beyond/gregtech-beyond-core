package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;

import gregtech.api.unification.material.properties.*;

public class GTBMaterialPropertyAddition {

    public static void init() {
        Cadmium.setProperty(PropertyKey.FLUID, new FluidProperty());
        PhosphorusPentoxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        SodiumSulfide.setProperty(PropertyKey.FLUID, new FluidProperty());
        IndiumPhosphide.setProperty(PropertyKey.INGOT, new IngotProperty());
        Mica.setProperty(PropertyKey.INGOT, new IngotProperty());
        PlatinumRaw.setProperty(PropertyKey.INGOT, new IngotProperty());
        Graphene.setProperty(PropertyKey.INGOT, new IngotProperty());
    }
}
