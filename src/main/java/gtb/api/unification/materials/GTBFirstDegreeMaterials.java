package gtb.api.unification.materials;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.util.text.TextFormatting;

import static gtb.api.unification.materials.material.info.GTBMaterialFlags.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.*;
import static gtb.api.unification.materials.material.info.GTBMaterialIconType.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public final class GTBFirstDegreeMaterials {

    //  Range 24001-24500
    private static int startId = 24001;
    private static final int END_ID = startId + 500;

    public static void register() {

        // 24001 Platinum Concentrate
        PlatinumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("platinum_concentrate"))
                .liquid(new FluidBuilder())
                .color(0xC1B189)
                .components(Platinum, 1)
                .build();

        //  24002 Platinum Extract
        PlatinumExtract = new Material.Builder(getMaterialsId(), gregtechId("platinum_extract"))
                .liquid(new FluidBuilder())
                .color(0xFCF5E1)
                .components(Platinum, 1)
                .build();

        //  24002 Platinum Extract
        PalladiumExtract = new Material.Builder(getMaterialsId(), gregtechId("palladium_extract"))
                .liquid(new FluidBuilder())
                .color(0x52514F)
                .components(Palladium, 1)
                .build();
    }
        private static int getMaterialsId() {
            if (startId < END_ID) {
                return startId++;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }
