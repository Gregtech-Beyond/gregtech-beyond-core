package gtb.api.unification.materials;

import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import org.jetbrains.annotations.ApiStatus;
import gregtech.api.unification.material.info.MaterialFlags;

import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.info.GTBMaterialIconTypes.*;


@ApiStatus.Internal
public final class GTBMaterialFlagAddition {

    public static void addFlags() {
        Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
    }

    public static void setIcon() {
        DamascusSteel.setMaterialIconSet(DAMASCUS);
    }

    public static void setFormula() {
        DamascusSteel.setFormula("Fe8(Ni(AuAgCu3)Fe3)8", true);
    }

    public static void setProperty() {
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
    }
}
