package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;

public class GTBElementMaterials {

    private static int startId = 26001;
    private static final int END_ID = startId + 100;

    public static void register() {
        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0x333537)
                .build().setFormula("Ad", true);

        Rubidium = new Material.Builder(getMaterialsId(), gregtechId("rubidiium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0xB71C1C)
                .build().setFormula("Rb", true);

        Rhenium = new Material.Builder(getMaterialsId(), gregtechId("rhenium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0x6D6969)
                .build().setFormula("Re", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
