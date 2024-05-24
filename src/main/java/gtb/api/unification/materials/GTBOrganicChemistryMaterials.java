package gtb.api.unification.materials;

import static gregtech.api.fluids.attribute.FluidAttributes.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;

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

        Bistrichloromethylbenzene = new Material.Builder(getMaterialsId(), gregtechId("bistrichloromethylbenzene"))
                .fluid()
                .color(0xCF8498)
                .components(Carbon, 8, Hydrogen, 4, Chlorine, 6)
                .build()
                .setFormula("C6H4(CCl3)2", true);

        Tetrabromoethane = new Material.Builder(getMaterialsId(), gregtechId("tetrabromoethane"))
                .fluid()
                .color(0x5AAADA)
                .components(Carbon, 2, Hydrogen, 2, Bromine, 4)
                .build();

        TerephthalicAcid = new Material.Builder(getMaterialsId(), gregtechId("terephthalic_acid"))
                .dust()
                .color(0x5ACCDA)
                .iconSet(MaterialIconSet.ROUGH)
                .components(Carbon, 8, Hydrogen, 6, Oxygen, 4)
                .build()
                .setFormula("C6H4(CO2H)2", true);

        TerephthaloylChloride = new Material.Builder(getMaterialsId(), gregtechId("terephthaloyl_chloride"))
                .dust()
                .color(0xFAC4DA)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 8, Hydrogen, 4, Oxygen, 2, Chlorine, 2)
                .build()
                .setFormula("C6H4(COCl)2", true);

        Butanediol = new Material.Builder(getMaterialsId(), gregtechId("butanediol"))
                .fluid()
                .color(0xAAC4DA)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 2)
                .build()
                .setFormula("C4H8(OH)2", true);

        GammaButyrolactone = new Material.Builder(getMaterialsId(), gregtechId("gamma_butyrolactone"))
                .fluid()
                .color(0xAF04D6)
                .components(Carbon, 4, Hydrogen, 6, Oxygen, 2)
                .build();

        NMethylPyrrolidone = new Material.Builder(getMaterialsId(), gregtechId("n_methyl_pyrrolidone"))
                .fluid()
                .color(0xA504D6)
                .components(Carbon, 5, Hydrogen, 9, Nitrogen, 1, Oxygen, 1)
                .build();

        Kevlar = new Material.Builder(getMaterialsId(), gregtechId( "kevlar"))
                .ingot().fluid()
                .color(0xF0F078)
                .flags(DISABLE_DECOMPOSITION, NO_SMASHING, NO_SMELTING, GENERATE_PLATE)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        KevlarConcentrate = new Material.Builder(getMaterialsId(), gregtechId("kevlar_concentrate"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        KevlarBlend = new Material.Builder(getMaterialsId(), gregtechId("kevlar_blend"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
