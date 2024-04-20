package gtb.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.unification.material.Materials.*;
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

        PlatinumResidues = new Material.Builder(getMaterialsId(), gregtechId("platinum_residues"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Ir2??", true);

        PotassiumDisulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_disulfate"))
                .dust()
                .color(0x52514F)
                .components(Potassium, 2, Sulfur, 2, Oxygen, 7)

                .build();
        LeachResidue = new Material.Builder(getMaterialsId(), gregtechId("potassium_disulfate"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Ir2??", true);

        SodiumRuthenate = new Material.Builder(getMaterialsId(), gregtechId("sodium_ruthenate"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Na2O4Ru", true);

        RutheniumTetroxideLiquid = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_liquid"))
                .liquid(new FluidBuilder())
                .color(0x52514F)
                .build().setFormula("RuO4", true);

        IridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("iridium_dioxide"))
                .dust()
                .color(0x52514F)
                .build().setFormula("IrO2", true);

        PlatinumSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_solution"))
                .liquid(new FluidBuilder())
                .color(0x52514F)
                .build().setFormula("Pt??", true);

        PlatinumSalt = new Material.Builder(getMaterialsId(), gregtechId("platinum_salt"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Pt?", true);

        PalladiumSalt = new Material.Builder(getMaterialsId(), gregtechId("palladium_salt"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Pd?", true);

        PalladiumMetallicPowder = new Material.Builder(getMaterialsId(), gregtechId("palladium_metallic_powder"))
                .dust()
                .color(0x52514F)
                .build().setFormula("Pd?", true);






    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
