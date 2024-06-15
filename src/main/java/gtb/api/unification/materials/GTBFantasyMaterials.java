package gtb.api.unification.materials;

import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.Material;

public class GTBFantasyMaterials {

    // Range 25001-25200
    private static int startId = 2601;
    private static final int END_ID = startId + 50;

    public static void register() {
        AwakenedDraconium = new Material.Builder(getMaterialsId(), gregtechId("awakened_draconium"))
                .ingot()
                .build().setFormula("AwDr", true);

        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .ingot()
                .build().setFormula("Ad", true);

        CosmicNeutronium = new Material.Builder(getMaterialsId(), gregtechId("cosmic_neutronium"))
                .ingot()
                .build().setFormula("SpNt", true);

        Infinity = new Material.Builder(getMaterialsId(), gregtechId("infinity"))
                .ingot()
                .build().setFormula("If", true);

        Eternal = new Material.Builder(getMaterialsId(), gregtechId("eternal"))
                .ingot()
                .build().setFormula("Et*", true);

        TemporallyConstrainedAntiMatter = new Material.Builder(getMaterialsId(),
                gregtechId("temporally_constrained_anti_matter"))
                        .ingot()
                        .build().setFormula("Am**", true);

        CataclysmInducedMixedMatter = new Material.Builder(getMaterialsId(),
                gregtechId("cataclysm_induced_mixed_matter"))
                        .ingot()
                        .build().setFormula("Mm***", true);

        NaquadahWaste = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_waste"))
                        .fluid()
                        .color(0x2d690b).build();

        RareNaquadahWaste = new Material.Builder(getMaterialsId(),
                gregtechId("rare_naquadah_waste"))
                        .fluid()
                        .color(0x0c2100).build();

        NaqHydrochloricAcid = new Material.Builder(getMaterialsId(),
                gregtechId("naq_hydrochloric_acid"))
                        .fluid()
                        .color(0x1d4f00).build();

        RareNaqFluoroantimonicAcid = new Material.Builder(getMaterialsId(),
                gregtechId("rare_naq_fluoroantimonic_acid"))
                        .fluid()
                        .color(0xa1c9a5).build();
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
