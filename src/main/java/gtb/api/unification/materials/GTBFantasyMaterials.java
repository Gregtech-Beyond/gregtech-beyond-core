package gtb.api.unification.materials;

import gregtech.api.unification.material.Material;
import gtb.api.utils.GTBUtil;
import static gtb.api.unification.materials.GTBMaterials.*;


public class GTBFantasyMaterials {

    public static void init() {


        AwakenedDraconium = new Material.Builder(14002, GTBUtil.gtb("awakened_draconium"))
                .ingot()
                .build().setFormula("AwDr", true);

        Adamantium = new Material.Builder(14003, GTBUtil.gtb("adamantium"))
                .ingot()
                .build().setFormula("Ad", true);

        CosmicNeutronium = new Material.Builder(14004, GTBUtil.gtb("cosmic_neutronium"))
                .ingot()
                .build().setFormula("SpNt", true);

        Infinity = new Material.Builder(14005, GTBUtil.gtb("infinity"))
                .ingot()
                .build().setFormula("If", true);

        Eternal = new Material.Builder(14006, GTBUtil.gtb("eternal"))
                .ingot()
                .build().setFormula("Et*", true);

        TemporallyConstrainedAntiMatter = new Material.Builder(14007,
                GTBUtil.gtb("temporally_constrained_anti_matter"))
                .ingot()
                .build().setFormula("Am**", true);

        CataclysmInducedMixedMatter = new Material.Builder(14008,
                GTBUtil.gtb("cataclysm_induced_mixed_matter"))
                .ingot()
                .build().setFormula("Mm***", true);

    }
    )
}
