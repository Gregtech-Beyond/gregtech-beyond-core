package gtb.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

public class GTBFirstDegreeMaterials {

        private static int getMaterialsId() {
                if (startId < END_ID) {
                    return startId++;

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















            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }


