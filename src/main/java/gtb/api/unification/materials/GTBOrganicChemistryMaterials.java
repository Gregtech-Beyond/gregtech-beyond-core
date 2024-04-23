package gtb.api.unification.materials;

import static gregtech.api.GTValues.*;
import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;
import static gtb.api.unification.materials.info.GTBMaterialIconType.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

public class GTBOrganicChemistryMaterials {

    // Range 25001-25200
    private static int startId = 25001;
    private static final int END_ID = startId + 200;

    public static void register() {
        FormicAcid = new Material.Builder(getMaterialsId(), gregtechId("formic_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xD15918)
                .build().setFormula("CH20H2", true);

        SodiumFormate = new Material.Builder(getMaterialsId(), gregtechId("sodium_formate"))
                .liquid(new FluidBuilder())
                .color(0x3F415F)
                .build().setFormula("HCOONa", true);

        Tripropylamine = new Material.Builder(getMaterialsId(), gregtechId("tripropylamine"))
                .liquid(new FluidBuilder())
                .color(0x8D8D8E)
                .build().setFormula("C8H10", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
