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
    private static int startId = 20754;
    private static final int END_ID = startId + 200;

    public static void register() {
        Tripropylamine = new Material.Builder(getMaterialsId(), gregtechId("tripropylamine"))
                .liquid(new FluidBuilder())
                .color(0x8D8D8E)
                .build().setFormula("C8H10", true);

        Butanediol = new Material.Builder(getMaterialsId(), gregtechId("butanediol"))
                .fluid()
                .color(0xAAC4DA)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 2)
                .build()
                .setFormula("C4H8(OH)2", true);

        KevlarConcentrate = new Material.Builder(getMaterialsId(), gregtechId("kevlar_concentrate"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        PurifiedKevlarConcentrate = new Material.Builder(getMaterialsId(), gregtechId("purified_kevlar_concentrate"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("((C6H4)2(CO)2(NH)2)+", true);

        KevlarBlend = new Material.Builder(getMaterialsId(), gregtechId("kevlar_blend"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(MaterialIconSet.SHINY)
                .components(Carbon, 14, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        PyromelliticDianhydride = new Material.Builder(getMaterialsId(), gregtechId("pyromellitic_dianhydride")) // TODO
                .dust()
                .color(0xF0EAD6)
                .iconSet(MaterialIconSet.ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 10, Hydrogen, 2, Oxygen, 6)
                .build()
                .setFormula("C6H2(C2O3)2", true);

        Aminophenol = new Material.Builder(getMaterialsId(), gregtechId("aminophenol"))
                .fluid()
                .color(0xFF7F50)
                .components(Carbon, 6, Hydrogen, 7, Nitrogen, 1, Oxygen, 1)
                .build()
                .setFormula("HOC6H4NH2", true);

        PhosphorusOxychloride = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_oxychloride"))
                .fluid()
                .color(0xD9D086).build()
                .setFormula("POCl3", true);

        AcetoneSolution = new Material.Builder(getMaterialsId(), gregtechId("acetone_solution"))
                .fluid()
                .color(0xD9D086).build()
                .setFormula("(C3H6O)H?", true);

        DilutedAcetone = new Material.Builder(getMaterialsId(), gregtechId("diluted_acetone"))
                .fluid()
                .color(0xBAD5E1).build()
                .setFormula("(C3H6O)(H2O)", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
