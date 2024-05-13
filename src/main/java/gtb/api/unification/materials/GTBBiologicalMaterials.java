package gtb.api.unification.materials;

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

        DepletedBacterialGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("depleted_bacterial_growth_medium"))
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

        BasicFibroblastGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("basic_fibroglast_growth_medium"))
                        .liquid(new FluidBuilder())
                        .color(0xEF5350)
                        .build().setFormula("bFGF", true);

        EpidermalGrowthFactor = new Material.Builder(getMaterialsId(), gregtechId("epidermal_growth_factora"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("C257H381N73O83S7", true);

        CupriavidusNecatorBacteriaSample = new Material.Builder(getMaterialsId(),
                gregtechId("cupriavidus_necator_bacteria_sample"))
                        .dust()
                        .color(0xEF5350)
                        .build().setFormula("Bacteria", true);

        Cuproquin = new Material.Builder(getMaterialsId(), gregtechId("cuproquin"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C18H13CuN2O", true);

        Sulfanilamide = new Material.Builder(getMaterialsId(), gregtechId("sulfanilamide"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C6H8N2O2S", true);

        AcetylsulfanilylChloride = new Material.Builder(getMaterialsId(), gregtechId("acetylsulfanilyl_chloride"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C8H8ClNO3S", true);

        ChlorosulfonicAcid = new Material.Builder(getMaterialsId(), gregtechId("chlorosulfonic_acid"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("HSO3Cl", true);

        AceticAnhydride = new Material.Builder(getMaterialsId(), gregtechId("acetic_anhydride"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("(CH3CO)2O", true);

        Aniline = new Material.Builder(getMaterialsId(), gregtechId("aniline"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C6H5NH2", true);

        AmmoniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_nitrate"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("NH4NO3", true);

        B_27_Supplement = new Material.Builder(getMaterialsId(), gregtechId("b_27_supplement"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C142H230N36O44S", true);

        Glutamine = new Material.Builder(getMaterialsId(), gregtechId("glutamine"))
                .dust()
                .color(0x191919)
                .build().setFormula("C5H10N2O3", true);

        LinoleicAcid = new Material.Builder(getMaterialsId(), gregtechId("linoleic_acid"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C18H32O2", true);

        Biotin = new Material.Builder(getMaterialsId(), gregtechId("biotin"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C10H16N2O3S", true);

        Ethanolamine = new Material.Builder(getMaterialsId(), gregtechId("ethanolamine"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("HOCH2CH2NH2", true);

        VitaminA = new Material.Builder(getMaterialsId(), gregtechId("vitamin_a"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C20H30O", true);

        BetaIonone = new Material.Builder(getMaterialsId(), gregtechId("beta_ionone"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C13H20O", true);

        PropargylChloride = new Material.Builder(getMaterialsId(), gregtechId("PropargylChloride"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("HC2CH2Cl", true);

        Citral = new Material.Builder(getMaterialsId(), gregtechId("citral"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C10H16O", true);

        BetaPinene = new Material.Builder(getMaterialsId(), gregtechId("beta_pinene"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C10H16", true);

        Turpentine = new Material.Builder(getMaterialsId(), gregtechId("turpentine"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C10H16", true);

        PropargylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("propargyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("CHCCH2OH", true);

        Acetylene = new Material.Builder(getMaterialsId(), gregtechId("acetylene"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H2", true);

        CleanAmmoniaSolution = new Material.Builder(getMaterialsId(), gregtechId("clean_ammonia_solution"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("NH3(H2O)", true);

        Leucine = new Material.Builder(getMaterialsId(), gregtechId("leucine"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C20H12O3", true);

        Yeast = new Material.Builder(getMaterialsId(), gregtechId("yeast"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("???", true);

        BrevibacteriumFlavium = new Material.Builder(getMaterialsId(), gregtechId("brevibacterium_flavium"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C20H12O3", true);

        YEEMSolution = new Material.Builder(getMaterialsId(), gregtechId("yeem_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        YeastExtractMannitolMedium = new Material.Builder(getMaterialsId(), gregtechId("yeast_extract_mannitol_medium"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        YeastExtractMannitolAgarSolution = new Material.Builder(getMaterialsId(),
                gregtechId("yeast_extract_mannitol_agar_solution"))
                        .liquid(new FluidBuilder())
                        .color(0x4A148C)
                        .build().setFormula("C20H12O3", true);

        DissolvedYeastExtractMannitolMixture = new Material.Builder(getMaterialsId(),
                gregtechId("dissolved_yeast_extract_mannitol_mixture"))
                        .liquid(new FluidBuilder())
                        .color(0x4A148C)
                        .build().setFormula("C20H12O3", true);

        YeastExtract = new Material.Builder(getMaterialsId(), gregtechId("yeast_extract"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Mannitol = new Material.Builder(getMaterialsId(), gregtechId("mannitol"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        YeastMixture = new Material.Builder(getMaterialsId(), gregtechId("yeast_mixture"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        WasteWater = new Material.Builder(getMaterialsId(), gregtechId("waste_water"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        NutrientRichSolution = new Material.Builder(getMaterialsId(), gregtechId("nutrient_rich_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        MaltExtract = new Material.Builder(getMaterialsId(), gregtechId("malt_extract"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Peptone = new Material.Builder(getMaterialsId(), gregtechId("peptone"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Wort = new Material.Builder(getMaterialsId(), gregtechId("wort"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        HotGristSolution = new Material.Builder(getMaterialsId(), gregtechId("hot_grist_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        GristPowder = new Material.Builder(getMaterialsId(), gregtechId("grist_powder"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        SolidGrain = new Material.Builder(getMaterialsId(), gregtechId("solid_grain"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Glucose = new Material.Builder(getMaterialsId(), gregtechId("glucose"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Nonoxynol_9 = new Material.Builder(getMaterialsId(), gregtechId("nonoxynol_9"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Nonoxynol_9_Solution = new Material.Builder(getMaterialsId(), gregtechId("nonoxynol_9_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        EthoxylatedNonylphenol = new Material.Builder(getMaterialsId(), gregtechId("ethoxylated_nonylphenol"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        Nonylphenol = new Material.Builder(getMaterialsId(), gregtechId("nonylphenol"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C20H12O3", true);

        EschericiaColi = new Material.Builder(getMaterialsId(), gregtechId("eschericia_coli"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        Iriditus = new Material.Builder(getMaterialsId(), gregtechId("iriditus"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        Fructose = new Material.Builder(getMaterialsId(), gregtechId("fructose"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        SheepBlood = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        SheepBloodPlasma = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood_plasma"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        SheepBloodCells = new Material.Builder(getMaterialsId(), gregtechId("sheep_blood_cells"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        DefibernatedSheepBlood = new Material.Builder(getMaterialsId(), gregtechId("defibernated_sheep_blood"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        EdeticAcid = new Material.Builder(getMaterialsId(), gregtechId("edetic_acid"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        SolidifiedSterileDefibernatedSheepBlood = new Material.Builder(getMaterialsId(), gregtechId("edetic_acid"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        DissolvedPhenylEthylAlcoholAgar = new Material.Builder(getMaterialsId(), gregtechId("dissolved_phenyl_ethyl_alcohol_agar"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        PhenylEthylAlcoholAgarSolution = new Material.Builder(getMaterialsId(), gregtechId("phenyl_ethyl_alcohol_agar_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        PhenylEthylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("phenyl_ethyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        Xerizin = new Material.Builder(getMaterialsId(), gregtechId("xerizin"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        SolidMilkResidues = new Material.Builder(getMaterialsId(), gregtechId("solid_milk_residues"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        HeatedMilkSlurry = new Material.Builder(getMaterialsId(), gregtechId("heated_milk_slurry"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        PeptoneMixture = new Material.Builder(getMaterialsId(), gregtechId("peptone_mixture"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        AlphaLinolenicAcid = new Material.Builder(getMaterialsId(), gregtechId("alpha_linolenic_acid"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        MilkOil = new Material.Builder(getMaterialsId(), gregtechId("milk_oil"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        HomogenizedPancreasMixture = new Material.Builder(getMaterialsId(), gregtechId("homogenized_pancreas_mixture"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        Trypsin = new Material.Builder(getMaterialsId(), gregtechId("trypsin"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        BeanSlurry = new Material.Builder(getMaterialsId(), gregtechId("bean_slurry"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        Rhizobium = new Material.Builder(getMaterialsId(), gregtechId("rhizobium"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        PapaicDigestOfSoybeanMeal = new Material.Builder(getMaterialsId(), gregtechId("papair_digest_of_soybean_meal"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        DefattedSoybeanFlour = new Material.Builder(getMaterialsId(), gregtechId("defatted_soybean_flour"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        SoybeanOil = new Material.Builder(getMaterialsId(), gregtechId("soybean_oil"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        CrushedSoybean = new Material.Builder(getMaterialsId(), gregtechId("crushed_soybean"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("?", true);

        MethyleneDiphosphoricAcid = new Material.Builder(getMaterialsId(), gregtechId("methylene_diphosphoric_acid"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        OrthophosphoricAcid = new Material.Builder(getMaterialsId(), gregtechId("orthophosphoric_acid"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        OrthophosphoricAcidSolution = new Material.Builder(getMaterialsId(), gregtechId("orthophosphoric_acid_solution"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        PhosphoricAnihydride = new Material.Builder(getMaterialsId(), gregtechId("phosphoric_anihydride"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        PolyhydroxylAlkanoate = new Material.Builder(getMaterialsId(), gregtechId("polyhydroxylalkanoate"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        YButyrolacetone = new Material.Builder(getMaterialsId(), gregtechId("y_butyralacetone"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);

        PalmOil = new Material.Builder(getMaterialsId(), gregtechId("y_butyralacetone"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("?", true);



    }


    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
