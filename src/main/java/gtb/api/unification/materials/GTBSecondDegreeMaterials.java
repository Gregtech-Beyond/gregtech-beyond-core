package gtb.api.unification.materials;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

public class GTBSecondDegreeMaterials {

    // Range: 25401 - 25500
    private static int startId = 25401;
    private static final int END_ID = startId + 100;

    public static void register() {
        RhodiumSulfateSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_sulfate_solution"))
                .liquid(new FluidBuilder())
                .color(0xC7C7C7)
                .build().setFormula("(RhSO4?)(H2O)", true);

        RutheniumTetroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_solution"))
                .fluid()
                .dust()
                .color(0xAAC0BC)
                .build().setFormula("(NaCl)2RuO4", true);

        AcidicIridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("acidic_iridium_dioxide"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xD4CAB0)
                .build().setFormula("(HCl)2(IrO2)2", true);

        PalladiumEnrichedAmmonia = new Material.Builder(getMaterialsId(), gregtechId("palladium_enriched_ammonia"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0x7B7C7C)
                .build().setFormula("Pd(NH3)?", true);

        ReprecipitatedPalladium = new Material.Builder(getMaterialsId(), gregtechId("reprecipitated_palladium"))
                .dust()
                .color(0xB1AC9E)
                .build().setFormula("Pd?(NH3)", true);

        Tetrapropylammoniumbromide = new Material.Builder(getMaterialsId(), gregtechId("tetrapropylammoniumbromide"))
                .fluid()
                .dust()
                .color(0xEF5350)
                .build().setFormula("?", true);

        Ethylenediamine = new Material.Builder(getMaterialsId(), gregtechId("ethylenediamine"))
                .dust()
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C2H4(NH2)2", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
