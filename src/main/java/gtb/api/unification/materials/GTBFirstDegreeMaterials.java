package gtb.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

public class GTBFirstDegreeMaterials {

    public static void register() {
        //  Range 24001-24500
    }
        private static int startId = 24001;
        private static final int END_ID = startId + 500;;
    public static void init() {

        PalladiumExtract = new Material.Builder(getMaterialsId(), gregtechId("palladium_extract"))
                .liquid(new FluidBuilder())
                .color(0x626262)
                .build();

        PlatinumExtract = new Material.Builder(getMaterialsId(), gregtechId("platinum_extract"))
                .liquid(new FluidBuilder())
                .color(0xEAE6C3)
                .build();

        PlatinumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("platinum_concentrate"))
                .liquid(new FluidBuilder())
                .color(0xC4BB93)
                .build();

    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
