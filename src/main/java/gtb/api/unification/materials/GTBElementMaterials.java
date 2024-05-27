package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
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

        Rhenium = new Material.Builder(getMaterialsId(), gregtechId("rhenium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0x6D6969)
                .build().setFormula("Re", true);

        Gadolinium = new Material.Builder(getMaterialsId(), gregtechId("gadolinium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0xFF9800)
                .build().setFormula("Gd", true);
        
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
