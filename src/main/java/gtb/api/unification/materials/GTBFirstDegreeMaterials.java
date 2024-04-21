package gtb.api.unification.materials;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.util.text.TextFormatting;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.*;


public final class GTBFirstDegreeMaterials {

    //  Range 24001-24500
    private static int startId = 24001;
    private static final int END_ID = startId + 500;

    public static void register() {

    }
        private static int getMaterialsId() {
            if (startId < END_ID) {
                return startId++;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }
