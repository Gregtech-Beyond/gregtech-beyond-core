package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;
import gtb.api.recipes.GTBRecipeMaps;

public class GTBBiologicalMaterials {

    // Range 25601-25800
    private static int startId = 20001;
    private static final int END_ID = startId + 2000;

    public static void register() {
        CupriavidusNecator = new Material.Builder(getMaterialsId(), gregtechId("cupriavidus_necator"))
                .dust()
                .color(0x6B8D6E)
                .build().setFormula("Bacteria", true);

        BacterialGrowthMedium = new Material.Builder(getMaterialsId(), gregtechId("bacterial_growth_medium"))
                .fluid()
                .color(0x1B5E20)
                .build().setFormula("For Bacteria", true);

        DepletedBacterialGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("depleted_bacterial_growth_medium"))
                        .fluid()
                        .color(0x376B3B)
                        .build().setFormula("For Bacteria", true);

        Blood = new Material.Builder(getMaterialsId(), gregtechId("blood"))
                .fluid()
                .color(0xAA2424)
                .build();

        BloodCells = new Material.Builder(getMaterialsId(), gregtechId("blood_cells"))
                .fluid()
                .color(0xC66868)
                .build();

        BloodPlasma = new Material.Builder(getMaterialsId(), gregtechId("blood_plasma"))
                .plasma()
                .color(0x9D3939)
                .build();

        Catalase = new Material.Builder(getMaterialsId(), gregtechId("catalase"))
                .fluid()
                .color(0xD599AE)
                .build();

        BasicFibroblastGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("basic_fibroglast_growth_medium"))
                        .fluid()
                        .color(0x8C52A5)
                        .build().setFormula("bFGF", true);

        EpidermalGrowthFactor = new Material.Builder(getMaterialsId(), gregtechId("epidermal_growth_factora"))
                .fluid()
                .color(0xA05FBC)
                .build().setFormula("C257H381N73O83S7", true);

        CupriavidusNecatorBacteriaSample = new Material.Builder(getMaterialsId(),
                gregtechId("cupriavidus_necator_bacteria_sample"))
                        .dust()
                        .color(0x00695C)
                        .build().setFormula("Bacteria", true);

        Cuproquin = new Material.Builder(getMaterialsId(), gregtechId("cuproquin"))
                .fluid()
                .color(0x8AA5A0)
                .build().setFormula("C18H13CuN2O", true);

        DryRedAlgae = new Material.Builder(getMaterialsId(), gregtechId("dry_red_algae"))
                .dust()
                .color(0x880808)
                .build();
        //  25602 Red Algae
        RedAlgae = new Material.Builder(getMaterialsId(), gregtechId("red_algae"))
                .dust()
                .color(0xAA4A44)
                .build();
        //  25603 Dry Green Algae
        DryGreenAlgae = new Material.Builder(getMaterialsId(), gregtechId("dry_green_algae"))
                .dust()
                .color(0x4F7942)
                .build();
        //  25604 Green Algae
        GreenAlgae = new Material.Builder(getMaterialsId(), gregtechId("green_algae"))
                .dust()
                .color(0x5F8575)
                .build();
        //  25605 Dry Golden Algae
        DryGoldenAlgae = new Material.Builder(getMaterialsId(), gregtechId("dry_golden_algae"))
                .dust()
                .color(0xDAA520)
                .build();
        //  25606 Golden Algae
        GoldenAlgae = new Material.Builder(getMaterialsId(), gregtechId("golden_algae"))
                .dust()
                .color(0xEEDC82)
                .build();
        //  25607 Dry Brown Algae
        DryBrownAlgae = new Material.Builder(getMaterialsId(), gregtechId("dry_brown_algae"))
                .dust()
                .color(0x5C4033)
                .build();
        //  25608 Brown Algae
        BrownAlgae = new Material.Builder(getMaterialsId(), gregtechId("brown_algae"))
                .dust()
                .color(0x988558)
                .build();
        //  25609 UraeMix
        UreaMix = new Material.Builder(getMaterialsId(), gregtechId("urea_mix"))
                .liquid(new FluidBuilder().temperature(200))
                .color(0x443610)
                .build();
        //  25610 Fermentation Base
        FermentationBase = new Material.Builder(getMaterialsId(), gregtechId("fermentation_base"))
                .liquid(new FluidBuilder().temperature(200))
                .color(0x5E5839)
                .build();
        // Resin
        Resin = new Material.Builder(getMaterialsId(), gregtechId("resin"))
                .liquid(new FluidBuilder().temperature(200))
                .color(0x353533)
                .build();
        // CaCO3
        CalciumCarbonate = new Material.Builder(getMaterialsId(), gregtechId("calcium_carbonate"))
                .dust()
                .components(Calcium, 1, Carbon, 1, Oxygen, 3)
                .color(0xE8E8CB)
                .build();
        // Propionic Acid
        PropionicAcid = new Material.Builder(getMaterialsId(), gregtechId("propionic_acid"))
                .liquid(new FluidBuilder().temperature(200))
                .color(0xB3BC88)
                .build();
        //Sodium Aluminate
        SodiumAluminate = new Material.Builder(getMaterialsId(), gregtechId("sodium_aluminate"))
                .dust()
                .colorAverage()
                .components(Sodium, 1, Aluminium, 1, Oxygen, 2)
                .build();
        // RedMud
        RedMud = new Material.Builder(getMaterialsId(), gregtechId("red_mud"))
                .fluid()
                .colorAverage()
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .components(Rutile, 1, HydrochloricAcid, 2)
                .build();
        //  Pine oil
        PineOil = new Material.Builder(getMaterialsId(), gregtechId("pine_oil"))
                .fluid()
                .colorAverage()
                .color(0xd6ac37)
                .build();

        Sulfanilamide = new Material.Builder(getMaterialsId(), gregtechId("sulfanilamide"))
                .fluid()
                .color(0x3E2723)
                .build().setFormula("C6H8N2O2S", true);

        AcetylsulfanilylChloride = new Material.Builder(getMaterialsId(), gregtechId("acetylsulfanilyl_chloride"))
                .fluid()
                .color(0x6F3C2D)
                .build().setFormula("C8H8ClNO3S", true);

        ChlorosulfonicAcid = new Material.Builder(getMaterialsId(), gregtechId("chlorosulfonic_acid"))
                .fluid()
                .color(0xAA803D)
                .build().setFormula("HSO3Cl", true);

        AceticAnhydride = new Material.Builder(getMaterialsId(), gregtechId("acetic_anhydride"))
                .fluid()
                .color(0xB8B7B7)
                .build().setFormula("(CH3CO)2O", true);

        Aniline = new Material.Builder(getMaterialsId(), gregtechId("aniline"))
                .fluid()
                .color(0x43A047)
                .build().setFormula("C6H5NH2", true);

        B_27_Supplement = new Material.Builder(getMaterialsId(), gregtechId("b_27_supplement"))
                .fluid()
                .color(0x2C572D)
                .build().setFormula("C142H230N36O44S", true);

        Glutamine = new Material.Builder(getMaterialsId(), gregtechId("glutamine"))
                .dust()
                .color(0xF6E5B9)
                .build().setFormula("C5H10N2O3", true);

        LinoleicAcid = new Material.Builder(getMaterialsId(), gregtechId("linoleic_acid"))
                .fluid()
                .color(0xFFEB3B)
                .build().setFormula("C18H32O2", true);

        Biotin = new Material.Builder(getMaterialsId(), gregtechId("biotin"))
                .fluid()
                .color(0x191919)
                .build().setFormula("C10H16N2O3S", true);

        Ethanolamine = new Material.Builder(getMaterialsId(), gregtechId("ethanolamine"))
                .fluid()
                .color(0x191919)
                .build().setFormula("HOCH2CH2NH2", true);

        VitaminA = new Material.Builder(getMaterialsId(), gregtechId("vitamin_a"))
                .fluid()
                .color(0x43A047)
                .build().setFormula("C20H30O", true);

        BetaIonone = new Material.Builder(getMaterialsId(), gregtechId("beta_ionone"))
                .fluid()
                .color(0x880E4F)
                .build().setFormula("C13H20O", true);

        PropargylChloride = new Material.Builder(getMaterialsId(), gregtechId("PropargylChloride"))
                .fluid()
                .color(0xFBC02D)
                .build().setFormula("HC2CH2Cl", true);

        Citral = new Material.Builder(getMaterialsId(), gregtechId("citral"))
                .fluid()
                .color(0xEFCD37)
                .build().setFormula("C10H16O", true);

        BetaPinene = new Material.Builder(getMaterialsId(), gregtechId("beta_pinene"))
                .dust()
                .color(0x44A048)
                .build().setFormula("C10H16", true);

        Turpentine = new Material.Builder(getMaterialsId(), gregtechId("turpentine"))
                .fluid()
                .color(0x689F38)
                .build().setFormula("C10H16", true);

        PropargylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("propargyl_alcohol"))
                .fluid()
                .color(0xB79134)
                .build().setFormula("CHCCH2OH", true);

        CleanAmmoniaSolution = new Material.Builder(getMaterialsId(), gregtechId("clean_ammonia_solution"))
                .fluid()
                .color(0xB7CD9F)
                .build().setFormula("NH3(H2O)", true);

        Leucine = new Material.Builder(getMaterialsId(), gregtechId("leucine"))
                .dust()
                .color(0x4A5E31)
                .build().setFormula("C20H12O3", true);

        Yeast = new Material.Builder(getMaterialsId(), gregtechId("yeast"))
                .dust()
                .color(0xFFEB3B)
                .build().setFormula("???", true);

        BrevibacteriumFlavium = new Material.Builder(getMaterialsId(), gregtechId("brevibacterium_flavium"))
                .dust()
                .color(0x004D40)
                .build().setFormula("Bacteria", true);

        YEEMSolution = new Material.Builder(getMaterialsId(), gregtechId("yeem_solution"))
                .fluid()
                .color(0x6A1B9A)
                .build().setFormula("C20H12O3", true);

        YeastExtractMannitolMedium = new Material.Builder(getMaterialsId(), gregtechId("yeast_extract_mannitol_medium"))
                .dust()
                .color(0x531E73)
                .build().setFormula("C20H12O3", true);

        YeastExtractMannitolAgarSolution = new Material.Builder(getMaterialsId(),
                gregtechId("yeast_extract_mannitol_agar_solution"))
                        .fluid()
                        .color(0x7D4C9A)
                        .build().setFormula("C20H12O3", true);

        DissolvedYeastExtractMannitolMixture = new Material.Builder(getMaterialsId(),
                gregtechId("dissolved_yeast_extract_mannitol_mixture"))
                        .fluid()
                        .color(0x1565C0)
                        .build().setFormula("C20H12O3", true);

        YeastExtract = new Material.Builder(getMaterialsId(), gregtechId("yeast_extract"))
                .fluid()
                .color(0x00BCD4)
                .build().setFormula("C20H12O3", true);

        Mannitol = new Material.Builder(getMaterialsId(), gregtechId("mannitol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        YeastMixture = new Material.Builder(getMaterialsId(), gregtechId("yeast_mixture"))
                .fluid()
                .color(0x00796B)
                .build().setFormula("C20H12O3", true);

        WasteWater = new Material.Builder(getMaterialsId(), gregtechId("waste_water"))
                .fluid()
                .color(0x06383E)
                .build().setFormula("(H2O)?", true);

        NutrientRichSolution = new Material.Builder(getMaterialsId(), gregtechId("nutrient_rich_solution"))
                .fluid()
                .color(0x80A954)
                .build().setFormula("C20H12O3", true);

        MaltExtract = new Material.Builder(getMaterialsId(), gregtechId("malt_extract"))
                .fluid()
                .color(0xA4A5A3)
                .build().setFormula("C20H12O3", true);

        Peptone = new Material.Builder(getMaterialsId(), gregtechId("peptone"))
                .fluid()
                .color(0x5C6BC0)
                .build().setFormula("C20H12O3", true);

        Wort = new Material.Builder(getMaterialsId(), gregtechId("wort"))
                .fluid()
                .color(0xA09D83)
                .build().setFormula("C20H12O3", true);

        HotGristSolution = new Material.Builder(getMaterialsId(), gregtechId("hot_grist_solution"))
                .fluid()
                .color(0xA6A063)
                .build().setFormula("C20H12O3", true);

        GristPowder = new Material.Builder(getMaterialsId(), gregtechId("grist_powder"))
                .dust()
                .color(0x98904A)
                .build().setFormula("C20H12O3", true);

        SolidGrain = new Material.Builder(getMaterialsId(), gregtechId("solid_grain"))
                .dust()
                .color(0xCECAAC)
                .build().setFormula("C20H12O3", true);

        Nonoxynol_9 = new Material.Builder(getMaterialsId(), gregtechId("nonoxynol_9"))
                .fluid()
                .color(0x336635)
                .build().setFormula("C20H12O3", true);

        Nonoxynol_9_Solution = new Material.Builder(getMaterialsId(), gregtechId("nonoxynol_9_solution"))
                .fluid()
                .color(0x2F5A31)
                .build().setFormula("C20H12O3", true);

        EthoxylatedNonylphenol = new Material.Builder(getMaterialsId(), gregtechId("ethoxylated_nonylphenol"))
                .fluid()
                .color(0x78AA7A)
                .build().setFormula("C20H12O3", true);

        Nonylphenol = new Material.Builder(getMaterialsId(), gregtechId("nonylphenol"))
                .fluid()
                .color(0x5F5351)
                .build().setFormula("C20H12O3", true);

        EschericiaColi = new Material.Builder(getMaterialsId(), gregtechId("eschericia_coli"))
                .dust()
                .color(0x00695C)
                .build().setFormula("?", true);

        Iriditus = new Material.Builder(getMaterialsId(), gregtechId("iriditus"))
                .dust()
                .color(0x1976D2)
                .build().setFormula("?", true);

        SheepBlood = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood"))
                .fluid()
                .color(0x561A1A)
                .build();

        SheepBloodPlasma = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood_plasma"))
                .fluid()
                .color(0xBF6969)
                .build();

        SheepBloodCells = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood_cells"))
                .fluid()
                .color(0x572424)
                .build();

        DefibernatedSheepBlood = new Material.Builder(getMaterialsId(), gregtechId("defibernated_sheep_blood"))
                .fluid()
                .color(0xB72A2A)
                .build();

        EdeticAcid = new Material.Builder(getMaterialsId(), gregtechId("edetic_acid"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("?", true);

        PhenylEthylAlcoholBloodAgar = new Material.Builder(getMaterialsId(), gregtechId("phenyl_ethyl_alcohol_agar"))
                .fluid()
                .color(0x880E4F)
                .build().setFormula("?", true);

        SolidifiedSterileDefibernatedSheepBlood = new Material.Builder(getMaterialsId(),
                gregtechId("solidified_sterile_defibernated_sheep_blood"))
                        .dust()
                        .color(0xEF9A9A)
                        .build().setFormula("?", true);

        DissolvedPhenylEthylAlcoholAgar = new Material.Builder(getMaterialsId(),
                gregtechId("dissolved_phenyl_ethyl_alcohol_agar"))
                        .fluid()
                        .color(0x974B74)
                        .build().setFormula("?", true);

        PhenylEthylAlcoholAgarSolution = new Material.Builder(getMaterialsId(),
                gregtechId("phenyl_ethyl_alcohol_agar_solution"))
                        .fluid()
                        .color(0x913867)
                        .build().setFormula("?", true);

        PhenylEthylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("phenyl_ethyl_alcohol"))
                .fluid()
                .color(0x7C1A4E)
                .build().setFormula("?", true);

        Xerizin = new Material.Builder(getMaterialsId(), gregtechId("xerizin"))
                .fluid()
                .color(0x673AB7)
                .build().setFormula("?", true);

        SolidMilkResidues = new Material.Builder(getMaterialsId(), gregtechId("solid_milk_residues"))
                .dust()
                .color(0xD0CED2)
                .build().setFormula("?", true);

        HeatedMilkSlurry = new Material.Builder(getMaterialsId(), gregtechId("heated_milk_slurry"))
                .fluid()
                .color(0xE5E4E6)
                .build().setFormula("?", true);

        PeptoneMixture = new Material.Builder(getMaterialsId(), gregtechId("peptone_mixture"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("?", true);

        AlphaLinolenicAcid = new Material.Builder(getMaterialsId(), gregtechId("alpha_linolenic_acid"))
                .fluid()
                .color(0xCCAE2D)
                .build().setFormula("?", true);

        MilkOil = new Material.Builder(getMaterialsId(), gregtechId("milk_oil"))
                .fluid()
                .color(0xBCB9AC)
                .build().setFormula("?", true);

        HomogenizedPancreasMixture = new Material.Builder(getMaterialsId(), gregtechId("homogenized_pancreas_mixture"))
                .fluid()
                .color(0xFBD736)
                .build().setFormula("?", true);

        Trypsin = new Material.Builder(getMaterialsId(), gregtechId("trypsin"))
                .fluid()
                .color(0xCCB965)
                .build().setFormula("?", true);

        BeanSlurry = new Material.Builder(getMaterialsId(), gregtechId("bean_slurry"))
                .fluid()
                .color(0xC1C07D)
                .build().setFormula("?", true);

        Rhizobium = new Material.Builder(getMaterialsId(), gregtechId("rhizobium"))
                .dust()
                .color(0x00796B)
                .build().setFormula("?", true);

        PapaicDigestOfSoybeanMeal = new Material.Builder(getMaterialsId(), gregtechId("papair_digest_of_soybean_meal"))
                .dust()
                .color(0x5F5F1F)
                .build().setFormula("?", true);

        DefattedSoybeanFlour = new Material.Builder(getMaterialsId(), gregtechId("defatted_soybean_flour"))
                .dust()
                .color(0xF2E39D)
                .build().setFormula("?", true);

        SoybeanOil = new Material.Builder(getMaterialsId(), gregtechId("soybean_oil"))
                .fluid()
                .color(0x6F6F25)
                .build().setFormula("?", true);

        CrushedSoybean = new Material.Builder(getMaterialsId(), gregtechId("crushed_soybean"))
                .dust()
                .color(0xD6D6B1)
                .build().setFormula("?", true);

        MethyleneDiphosphoricAcid = new Material.Builder(getMaterialsId(), gregtechId("methylene_diphosphoric_acid"))
                .fluid()
                .color(0xE53935)
                .build().setFormula("?", true);

        OrthophosphoricAcid = new Material.Builder(getMaterialsId(), gregtechId("orthophosphoric_acid"))
                .fluid()
                .color(0xBAAC6D)
                .build().setFormula("?", true);

        OrthophosphoricAcidSolution = new Material.Builder(getMaterialsId(),
                gregtechId("orthophosphoric_acid_solution"))
                        .fluid()
                        .color(0xA89A60)
                        .build().setFormula("?", true);

        PhosphoricAnihydride = new Material.Builder(getMaterialsId(), gregtechId("phosphoric_anihydride"))
                .fluid()
                .color(0x736B23)
                .build().setFormula("?", true);

        PolyhydroxylAlkanoate = new Material.Builder(getMaterialsId(), gregtechId("polyhydroxylalkanoate"))
                .fluid()
                .color(0xEF5350)
                .build().setFormula("?", true);

        YButyrolacetone = new Material.Builder(getMaterialsId(), gregtechId("y_butyralacetone"))
                .fluid()
                .color(0x673AB7)
                .build().setFormula("C4H6O2", true);

        PalmOil = new Material.Builder(getMaterialsId(), gregtechId("palm_oil"))
                .fluid()
                .color(0xFFEB3B)
                .build().setFormula("?", true);

        BetaPineneSolution = new Material.Builder(getMaterialsId(), gregtechId("beta_pinene_solution"))
                .fluid()
                .color(0x388E3C)
                .build().setFormula("?", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
