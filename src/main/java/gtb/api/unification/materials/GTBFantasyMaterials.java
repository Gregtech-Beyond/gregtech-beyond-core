package gtb.api.unification.materials;

import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;

import gregtech.api.unification.material.Material;

public class GTBFantasyMaterials {

    // Range 25001-25200
    private static int startId = 2601;
    private static final int END_ID = startId + 50;

    public static void init() {
        AwakenedDraconium = new Material.Builder(getMaterialsId(), gregtechId("awakened_draconium"))
                .ingot()
                .color(0xDD8639)
                .build().setFormula("AwDr", true);

        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .ingot()
                .color(0x4068A7)
                .build().setFormula("Ad", true);

        CosmicNeutronium = new Material.Builder(getMaterialsId(), gregtechId("cosmic_neutronium"))
                .ingot()
                .color(0x505050)
                .build().setFormula("SpNt", true);

        Infinity = new Material.Builder(getMaterialsId(), gregtechId("infinity"))
                .ingot()
                .color(0xEFCED9)
                .build().setFormula("If", true);

        Eternal = new Material.Builder(getMaterialsId(), gregtechId("eternal"))
                .ingot()
                .color(0x424992)
                .build().setFormula("Et*", true);

        TemporallyConstrainedAntiMatter = new Material.Builder(getMaterialsId(),
                gregtechId("temporally_constrained_anti_matter"))
                        .ingot()
                        .color(0x010101)
                        .build().setFormula("Am**", true);

        CataclysmInducedMixedMatter = new Material.Builder(getMaterialsId(),
                gregtechId("cataclysm_induced_mixed_matter"))
                        .ingot()
                        .color(0x880E4F)
                        .build().setFormula("Mm***", true);

        Pikyonium = new Material.Builder(getMaterialsId(), gregtechId("pikyonium"))
                .ingot()
                .color(0x708DBC)
                .build().setFormula("(Ni2NbAl2(Ni4Cr))8((Fe4(FeAlCr)(Fe2Ni05)10SSiC)5?4Ce3Sb2Pt2Yb(FeW)4", true);

        Tenannite = new Material.Builder(getMaterialsId(), gregtechId("tennanite"))
                .dust()
                .ore()
                .flags(GENERATE_SIFTED)
                .color(0x767676)
                .build().setFormula("Cu12As4S13", true);

        Xenotime = new Material.Builder(getMaterialsId(), gregtechId("xenotime"))
                .dust()
                .ore()
                .flags(GENERATE_FLOATED, GENERATE_SIFTED, GENERATE_CONCENTRATE)
                .color(0xF98B69)
                .build().setFormula("REE", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
