package gtb.api.unification.materials;

import static gregtech.api.fluids.attribute.FluidAttributes.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

public class GTBBiologicalMaterials {

    // Range 25601-25800
    private static int startId = 25601;
    private static final int END_ID = startId + 200;

    public static void register() {
        CupriavidusNecator = new Material.Builder(getMaterialsId(), gregtechId("cupriavidus_necator"))
                .dust()
                .color(0xEF5350)
                .build().setFormula("Bacteria", true);

        BacterialGrowthMedium = new Material.Builder(getMaterialsId(), gregtechId("bacterial_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("For Bacteria", true);

        DepletedBacterialGrowthMedium = new Material.Builder(getMaterialsId(), gregtechId("depleted_bacterial_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("For Bacteria", true);

        Blood = new Material.Builder(getMaterialsId(), gregtechId("blood"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("?", true);

        BloodCells = new Material.Builder(getMaterialsId(), gregtechId("blood"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("?", true);

        BloodPlasma = new Material.Builder(getMaterialsId(), gregtechId("blood"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("?", true);

        Catalase = new Material.Builder(getMaterialsId(), gregtechId("catalase"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("?", true);

        BasicFibroblastGrowthMedium = new Material.Builder(getMaterialsId(), gregtechId("basic_fibroglast_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("bFGF", true);

        EpidermalGrowthFactor = new Material.Builder(getMaterialsId(), gregtechId("epidermal_growth_factora"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("C257H381N73O83S7", true);

        CupriavidusNecatorBacteriaSample = new Material.Builder(getMaterialsId(), gregtechId("cupriavidus_necator_bacteria_sample"))
                .dust()
                .color(0xEF5350)
                .build().setFormula("Bacteria", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
