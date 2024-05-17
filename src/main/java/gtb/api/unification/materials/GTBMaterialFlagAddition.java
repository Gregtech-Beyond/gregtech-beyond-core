package gtb.api.unification.materials;

import org.jetbrains.annotations.ApiStatus;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;

import gtb.api.unification.materials.info.GTBMaterialFlags;

@ApiStatus.Internal
public final class GTBMaterialFlagAddition {

    private GTBMaterialFlagAddition() {}

    public static void init() {}

    public static void initLate() {
        Materials.Graphene.addFlags(MaterialFlags.GENERATE_FOIL);
        GTBMaterials.CupriavidusNecator.addFlags(GTBMaterialFlags.GENERATE_PETRI);
        Materials.Mica.addFlags(MaterialFlags.GENERATE_FOIL);
        Materials.BorosilicateGlass.addFlags(MaterialFlags.GENERATE_PLATE);
    }
}
