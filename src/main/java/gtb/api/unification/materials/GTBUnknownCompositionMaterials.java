package gtb.api.unification.materials;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import net.minecraft.util.text.TextFormatting;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

public class GTBUnknownCompositionMaterials {
    //  Range 25201-25400
    private static int startId = 25201;
    private static final int END_ID = startId + 200;

    public static void register() {


        // 25201 Platinum Extraction Mixture
        PlatinumExtractionMixture = new Material.Builder(getMaterialsId(), gregtechId("platinum_extraction_mixture"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xFFB546)
                .build();
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
