package gtb.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.util.text.TextFormatting;

import static gtb.api.unification.materials.info.GTBMaterialFlags.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.*;
import static gtb.api.unification.materials.info.GTBMaterialIconType.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class GTBSecondDegreeMaterials {
    // Range: 25401 - 25500
    private static int startId = 25401;
    private static final int END_ID = startId + 100;
    public static void register() {

        RhodiumSulfateSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_sulfate_solution"))
                .liquid(new FluidBuilder())
                .color(0x52514F)
                .build().setFormula("(RhSO4?)(H2O)", true);

        RutheniumTetroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_solution"))
                .dust()
                .color(0x52514F)
                .build().setFormula("(NaCl)2Ru04", true);

        AcidicIridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("acidic_iridium_dioxide"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0x52514F)
                .build().setFormula("(HCl)2(Ir02)2", true);

        PalladiumEnrichedAmmonia = new Material.Builder(getMaterialsId(), gregtechId("palladium_enriched_ammonia"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0x52514F)
                .build().setFormula("Pd(NH3)?", true);

        ReprecipitatedPalladium = new Material.Builder(getMaterialsId(), gregtechId("reprecipitated_palladium"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Pd?(NH3)", true);

        Tetrapropylammoniumbromide = new Material.Builder(getMaterialsId(), gregtechId("tetrapropylammoniumbromide"))
                .dust()
                .color(0x52514F)
                .build().setFormula("?", true);


    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}


