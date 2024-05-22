package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;

public class GTBFirstDegreeMaterials {

    private static int startId = 24001;
    private static final int END_ID = startId + 500;;

    public static void register() {
        PalladiumExtract = new Material.Builder(getMaterialsId(), gregtechId("palladium_extract"))
                .fluid()
                .color(0xEF5350)
                .build();

        PlatinumExtract = new Material.Builder(getMaterialsId(), gregtechId("platinum_extract"))
                .fluid()
                .color(0xF1EED4)
                .build();

        PlatinumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("platinum_concentrate"))
                .fluid()
                .color(0xDBD49B)
                .build();

        PlatinumResidues = new Material.Builder(getMaterialsId(), gregtechId("platinum_residues"))
                .dust()
                .color(0xC2BFA7)
                .build().setFormula("Ir2??", true);

        PotassiumDisulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_disulfate"))
                .dust()
                .color(0xD84315)
                .components(Potassium, 2, Sulfur, 2, Oxygen, 7)
                .build();

        LeachResidue = new Material.Builder(getMaterialsId(), gregtechId("leach_residues"))
                .dust()
                .color(0x8D8333)
                .build().setFormula("Ir2??", true);

        SodiumRuthenate = new Material.Builder(getMaterialsId(), gregtechId("sodium_ruthenate"))
                .dust()
                .color(0x9DA1C7)
                .build().setFormula("Na2O4Ru", true);

        RutheniumTetroxideLiquid = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_liquid"))
                .fluid()
                .color(0x5C6BC0)
                .build().setFormula("RuO4", true);

        IridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("iridium_dioxide"))
                .dust()
                .color(0xEA8B56)
                .build().setFormula("IrO2", true);

        PlatinumSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_solution"))
                .fluid()
                .color(0xFAF3BD)
                .build().setFormula("Pt??", true);

        PlatinumSalt = new Material.Builder(getMaterialsId(), gregtechId("platinum_salt"))
                .dust()
                .color(0xFAF3BD)
                .build().setFormula("Pt?", true);

        PalladiumSalt = new Material.Builder(getMaterialsId(), gregtechId("palladium_salt"))
                .dust()
                .color(0xB4B4B4)
                .build().setFormula("Pd?", true);

        PalladiumMetallicPowder = new Material.Builder(getMaterialsId(), gregtechId("palladium_metallic_powder"))
                .dust()
                .color(0x616161)
                .build().setFormula("Pd?", true);

        Nonene = new Material.Builder(getMaterialsId(), gregtechId("nonene"))
                .fluid()
                .color(0xAF91B7)
                .build().setFormula("C9H18", true);

        Propylene = new Material.Builder(getMaterialsId(), gregtechId("propylene"))
                .fluid()
                .color(0xE2DFC7)
                .build().setFormula("C3H6", true);

        Hexane = new Material.Builder(getMaterialsId(), gregtechId("hexane"))
                .fluid()
                .color(0xBD89A5)
                .build().setFormula("C3H6", true);

        Pentane = new Material.Builder(getMaterialsId(), gregtechId("pentane"))
                .fluid()
                .color(0xE9C6C6)
                .build().setFormula("C3H6", true);

        NHexadecane = new Material.Builder(getMaterialsId(), gregtechId("nhexadecane"))
                .fluid()
                .color(0x8F8F8F)
                .build().setFormula("C16H34", true);

        NOctane = new Material.Builder(getMaterialsId(), gregtechId("noctane"))
                .fluid()
                .color(0xE57373)
                .build().setFormula("C8H18", true);

        NHeptane = new Material.Builder(getMaterialsId(), gregtechId("nheptane"))
                .fluid()
                .color(0xD57777)
                .build().setFormula("C7H16", true);

        ZSM5 = new Material.Builder(getMaterialsId(), gregtechId("zsm_5"))
                .dust()
                .fluid()
                .color(0x7D967F)
                .build().setFormula("C7H16", true);

        MXylene = new Material.Builder(getMaterialsId(), gregtechId("mxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        OXylene = new Material.Builder(getMaterialsId(), gregtechId("oxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        PXylene = new Material.Builder(getMaterialsId(), gregtechId("pxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        MPXylene = new Material.Builder(getMaterialsId(), gregtechId("opxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        NPropanol = new Material.Builder(getMaterialsId(), gregtechId("npropanol"))
                .fluid()
                .color(0xF8EC7F)
                .build().setFormula("CH10O", true);

        NButanol = new Material.Builder(getMaterialsId(), gregtechId("nbutanol"))
                .fluid()
                .color(0xC87A7A)
                .build().setFormula("CH10O", true);

        IsoamylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isoamyl_alcohol"))
                .fluid()
                .color(0x004D40)
                .build().setFormula("C5H12O", true);

        IsobutylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isobutyl_alcohol"))
                .fluid()
                .color(0xF57F17)
                .build().setFormula("C5H12O", true);

        Formaldehyde = new Material.Builder(getMaterialsId(), gregtechId("formaldehyde"))
                .fluid()
                .color(0x66BB6A)
                .build().setFormula("CH20", true);

        Dicyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("dicyclopentadiene"))
                .fluid()
                .color(0xBA68C8)
                .build().setFormula("C10H12", true);

        Cyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("cyclopentadiene"))
                .fluid()
                .color(0x625664)
                .build().setFormula("C5H6", true);

        TungstenTrioxide = new Material.Builder(getMaterialsId(), gregtechId("tungstentrioxide"))
                .dust()
                .color(0x6E9C46)
                .build().setFormula("WO3", true);

        HydrogenPeroxide = new Material.Builder(getMaterialsId(), gregtechId("hydrogenperoxide"))
                .fluid()
                .color(0x64B5F6)
                .build().setFormula("H2O2", true);

        CalciumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("calciumhydroxide"))
                .dust()
                .color(0x1A237E)
                .build().setFormula("Ca(OH)2", true);

        LithiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxide"))
                .dust()
                .build().setFormula("LiOH", true);

        SodiumTungstate = new Material.Builder(getMaterialsId(), gregtechId("sodiumtungstate"))
                .fluid()
                .color(0x6A6A6A)
                .build().setFormula("Na2WO4", true);

        CalciumTungstate = new Material.Builder(getMaterialsId(), gregtechId("calciumtungstate"))
                .dust()
                .color(0x909393)
                .build().setFormula("WCaO4", true);

        LithiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxidesolution"))
                .fluid()
                .color(0x667678)
                .build().setFormula("WCaO4", true);

        LithiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxidesolution"))
                .dust()
                .fluid()
                .color(0x0277BD)
                .build().setFormula("(H2O)LiOH", true);

        LithiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("lithiumfluoride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("LiF3", true);

        Polyetheretherketone = new Material.Builder(getMaterialsId(), gregtechId("polyetheretherketone"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C20H12O3", true);

        EthyleneOxide = new Material.Builder(getMaterialsId(), gregtechId("ethylene_oxide"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredMethanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_methanol"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredButanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_butanol"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredEthanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_ethanol"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        ActivatedCarbon = new Material.Builder(getMaterialsId(), gregtechId("activated_carbon"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C", true);

        HotWater = new Material.Builder(getMaterialsId(), gregtechId("hot_water"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("H2O", true);

        EthyleneGlycol = new Material.Builder(getMaterialsId(), gregtechId("ethylene_glycol"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H6O2", true);

        SodiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("sodium_hydroxide_solution"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("(H2O)NaOH", true);

        SodiumBorohydride = new Material.Builder(getMaterialsId(), gregtechId("sodium_borohydride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("NaBH4", true);

        SodiumHydride = new Material.Builder(getMaterialsId(), gregtechId("sodium_hydride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("NaH", true);

        BoricAcid = new Material.Builder(getMaterialsId(), gregtechId("boric_acid"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("H3BO3", true);

        SodiumEthoxide = new Material.Builder(getMaterialsId(), gregtechId("sodium_ethoxide"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C2H5ONa", true);

        PotassiumManganate = new Material.Builder(getMaterialsId(), gregtechId("potassium_manganate"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("K2MnO4", true);

        PotassiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("potassium_hydroxide"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("KOH", true);

        AluminiumChloride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_chloride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("AlCl3", true);

        CucrmgbaCatalyst = new Material.Builder(getMaterialsId(), gregtechId("cucrmgba_catalyst"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("CuCrMgBa", true);

        OneFourButanediol = new Material.Builder(getMaterialsId(), gregtechId("one_four_butanediol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C4H10O2", true);

        OneFourButynediol = new Material.Builder(getMaterialsId(), gregtechId("one_four_butynediol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C4H6O2", true);

        NaquadahDioxide = new Material.Builder(getMaterialsId(), gregtechId("naquadah_dioxide"))
                .dust()
                .color(0x6A1B9A)
                .build().setFormula("NqO2", true);

        ElectronDegenerateRhenium = new Material.Builder(getMaterialsId(), gregtechId("electron_degenerate_rhenium"))
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xDCD4EA)
                .build().setFormula("Re-", true);

        ElectronDegenerateRheniumPlasma = new Material.Builder(getMaterialsId(),
                gregtechId("electron_degenerate_rhenium_plasma"))
                        .fluid()
                        .color(0x7986CB)
                        .build().setFormula("Re-", true);

        HighPurityArsenic = new Material.Builder(getMaterialsId(), gregtechId("high_purity_arsenic"))
                .dust()
                .color(0xD7CCC8)
                .build().setFormula("As", true);

        IndiumChloride = new Material.Builder(getMaterialsId(), gregtechId("indium_chloride"))
                .dust()
                .color(0x8E24AA)
                .build().setFormula("InCl", true);

        WhitePhosphorus = new Material.Builder(getMaterialsId(), gregtechId("white_phosphorus"))
                .dust()
                .fluid()
                .color(0xE6D9A0)
                .build().setFormula("P4", true);

        LiquidXenon = new Material.Builder(getMaterialsId(), gregtechId("liquid_xenon"))
                .fluid()
                .color(0x29B6F6)
                .build().setFormula("Xe", true);

        SiliconCarbide = new Material.Builder(getMaterialsId(), gregtechId("silicon_carbide"))
                .fluid()
                .color(0x43535A)
                .build().setFormula("SiC", true);

        SiliconCarbideVapor = new Material.Builder(getMaterialsId(), gregtechId("silicon_carbide_vapor"))
                .fluid()
                .color(0x5A707A)
                .build().setFormula("SiC", true);

        VeryHotNitrogen = new Material.Builder(getMaterialsId(), gregtechId("very_hot_nitrogen"))
                .fluid()
                .color(0x73CBF2)
                .build().setFormula("N", true);

        PhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("photopolymer_solution"))
                .fluid()
                .color(0x4DB6AC)
                .build().setFormula("C149H97N10O2(TiBF20)", true);

        UsedPhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("used_photopolymer_solution"))
                .fluid()
                .color(0xCE93D8)
                .build().setFormula("C149H97N10O2(TiBF20)?", true);

        VeryHotXenon = new Material.Builder(getMaterialsId(), gregtechId("very_hot_xenon"))
                .fluid()
                .color(0xAED5F5)
                .build().setFormula("Xe", true);

        VeryHotArgon = new Material.Builder(getMaterialsId(), gregtechId("very_hot_argon"))
                .fluid()
                .color(0x7CB342)
                .build().setFormula("Ar", true);

        NickelNitride = new Material.Builder(getMaterialsId(), gregtechId("nickel_nitride"))
                .dust()
                .fluid()
                .color(0xFFF176)
                .build().setFormula("NiN3", true);

        LiquidHelium = new Material.Builder(getMaterialsId(), gregtechId("liquid_helium"))
                .fluid()
                .color(0xFDF8CC)
                .build().setFormula("He", true);

        MetastableOganesson = new Material.Builder(getMaterialsId(), gregtechId("metastable_oganesson"))
                .fluid()
                .flags(MaterialFlags.GENERATE_PLATE)
                .dust()
                .color(0xB71C1C)
                .build().setFormula("Og", true);

        VeryHotKrypton = new Material.Builder(getMaterialsId(), gregtechId("very_hot_krypton"))
                .fluid()
                .color(0x81C784)
                .build().setFormula("Kr", true);

        SuperFluidHelium_4 = new Material.Builder(getMaterialsId(), gregtechId("super_fluid_helium_4"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("He-4", true);

        Helium_4 = new Material.Builder(getMaterialsId(), gregtechId("helium_4"))
                .fluid()
                .color(0x928550)
                .build().setFormula("He-4", true);

        LiquidEnrichedHelium_4 = new Material.Builder(getMaterialsId(), gregtechId("liquid_enriched_helium_4"))
                .fluid()
                .color(0xC0CA33)
                .build().setFormula("He-4", true);

        Trichloroflerane = new Material.Builder(getMaterialsId(), gregtechId("trichloroflerane"))
                .fluid()
                .color(0x6C3090)
                .build().setFormula("Cl3HFl", true);

        NaquadahRichSterileGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_rich_sterile_growth_medium"))
                        .fluid()
                        .color(0x272529)
                        .build();

        HighDensityPolyethylene = new Material.Builder(getMaterialsId(), gregtechId("high_density_polyethylene"))
                .fluid()
                .flags(MaterialFlags.GENERATE_PLATE)
                .dust()
                .color(0xBDBDBD)
                .build().setFormula("C2H4", true);

        LiquidNitrogen = new Material.Builder(getMaterialsId(), gregtechId("liquid_nitrogen"))
                .fluid()
                .color(0xA5C8DA)
                .build().setFormula("N", true);

        GraphiteOxide = new Material.Builder(getMaterialsId(), gregtechId("graphite_oxide"))
                .dust()
                .color(0x707272)
                .build().setFormula("C(O2)", true);

        GrapheneOxide = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxide"))
                .dust()
                .color(0x5C5D5D)
                .build().setFormula("C(O2)", true);

        GrapheneOxidationResidues = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxidation_residues"))
                .dust()
                .color(0x827717)
                .build().setFormula("C(O2)", true);

        GrapheneOxidationSolution = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxidation_solution"))
                .fluid()
                .color(0xA29A56)
                .build().setFormula("C(O2)", true);

        SilverBromide = new Material.Builder(getMaterialsId(), gregtechId("silver_bromides"))
                .dust()
                .color(0xD19E9E)
                .build().setFormula("AgBr", true);

        Silane = new Material.Builder(getMaterialsId(), gregtechId("silane"))
                .fluid()
                .color(0xA9A8A8)
                .build().setFormula("SiCl4", true);

        VeryHotAquaRegia = new Material.Builder(getMaterialsId(), gregtechId("very_hot_aqua_regia"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("(HNO3)(HCL)2", true);

        ChloronaquadicAcid = new Material.Builder(getMaterialsId(), gregtechId("chloronaquadic_acid"))
                .fluid()
                .color(0x616161)
                .build().setFormula("SiCl4", true);

        SodiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("sodium_nitrate"))
                .dust()
                .color(0x65899A)
                .build().setFormula("NaN2", true);

        BariumTitanate = new Material.Builder(getMaterialsId(), gregtechId("barium_titanate"))
                .dust()
                .ingot()
                .color(0x88B68A)
                .build().setFormula("BaTiO2", true);

        HydrogenChloride = new Material.Builder(getMaterialsId(), gregtechId("hydrogen_chloride"))
                .fluid()
                .color(0xC5CAE9)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMix = new Material.Builder(getMaterialsId(), gregtechId("doped_nanotube_deposition_mix"))
                .dust()
                .color(0xFF9800)
                .build().setFormula("HCl", true);

        NanotubeDepositionMix = new Material.Builder(getMaterialsId(), gregtechId("nanotube_deposition_mix"))
                .dust()
                .color(0xB71C1C)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMixture = new Material.Builder(getMaterialsId(),
                gregtechId("doped_nanotube_deposition_mixture"))
                        .dust()
                        .color(0x1B5E20)
                        .build().setFormula("HCl", true);

        CarbonNanotubes = new Material.Builder(getMaterialsId(), gregtechId("carbon_nanotubes"))
                .dust()
                .color(0x1A1A1A)
                .build().setFormula("HCl", true);

        LiquidCrystalDetector = new Material.Builder(getMaterialsId(), gregtechId("liquid_crystal_detector"))
                .fluid()
                .color(0x9C27B0)
                .build().setFormula("?", true);

        FullerenePolymerMatrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_matrix"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME, MaterialFlags.GENERATE_FOIL)
                .color(0x313031)
                .build().setFormula("PdFeC153C36NO2", true);

        FullerenePolymerTetrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_tetrix"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME, MaterialFlags.GENERATE_FOIL)
                .color(0x1D181E)
                .build().setFormula("C61HRhNO2", true);

        Tetrapropylammoniumbromide = new Material.Builder(getMaterialsId(), gregtechId("tetrapropylammoniumbromide"))
                .fluid()
                .dust()
                .color(0xAD77C3)
                .build().setFormula("C12H28BrN", true);

        SeaborgiumDopedNanotubes = new Material.Builder(getMaterialsId(), gregtechId("seaborgium_doped_nanotubes"))
                .fluid()
                .dust()
                .color(0x0D47A1)
                .build().setFormula("HCl", true);

        NaquadriaticTaranium = new Material.Builder(getMaterialsId(), gregtechId("naquadriatic_taranium"))
                .fluid()
                .dust()
                .color(0x4A4B4B)
                .build().setFormula("NqTr", true);

        ExtraDistilledWater = new Material.Builder(getMaterialsId(), gregtechId("extra_distilled_water"))
                .fluid()
                .color(0x265399)
                .build().setFormula("H20", true);

        Trichlorosilane = new Material.Builder(getMaterialsId(), gregtechId("trichlorosilane"))
                .fluid()
                .color(0x444545)
                .build().setFormula("HCl4", true);

        SuperFluidHelium = new Material.Builder(getMaterialsId(), gregtechId("super_fluid_helium"))
                .fluid()
                .color(0xFFC107)
                .build().setFormula("He", true);

        ChromaticGlass = new Material.Builder(getMaterialsId(), gregtechId("chromatic_glass"))
                .gem()
                .dust()
                .color(0xBEA0D0)
                .build().setFormula("(SiO2)*", true);

        PhosphorusSolution = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_solution"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("P(H2O)", true);

        Photopolymer = new Material.Builder(getMaterialsId(), gregtechId("photopolymer"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("P(H2O)", true);

        BioPlastic = new Material.Builder(getMaterialsId(), gregtechId("bio_plastic"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("P(H2O)", true);

        DampBromine = new Material.Builder(getMaterialsId(), gregtechId("damp_bromine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("Br(H2O)", true);

        SaltFreeBrine = new Material.Builder(getMaterialsId(), gregtechId("salt_free_brine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        BoronFreeSolution = new Material.Builder(getMaterialsId(), gregtechId("boron_free_solution"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        Ozone = new Material.Builder(getMaterialsId(), gregtechId("ozone"))
                .fluid()
                .color(0x2182BC)
                .build().setFormula("O3", true);

        DarmstadtiumCatalyst = new Material.Builder(getMaterialsId(), gregtechId("darmstadtium_catalyst"))
                .dust()
                .color(0x333537)
                .build().setFormula("O3", true);

        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME)
                .color(0x333537)
                .build().setFormula("Ad", true);

        FluorodarmstadticAcid = new Material.Builder(getMaterialsId(), gregtechId("fluorodarmstadtic_acid"))
                .fluid()
                .color(0x333537)
                .build().setFormula("Ad", true);

        AntimonyPentafluoride = new Material.Builder(getMaterialsId(), gregtechId("antimony_pentafluoride"))
                .fluid()
                .color(0x333537)
                .build().setFormula("SbF5", true);

        Triphenylphosphine = new Material.Builder(getMaterialsId(), gregtechId("triphenylphosphine"))
                .fluid()
                .dust()
                .color(0x333537)
                .build().setFormula("(C6H5)3P", true);

        NaquadriaticCompound = new Material.Builder(getMaterialsId(), gregtechId("naquadriatic_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("*Nq*?", true);

        EnrichedNaquadahCompound = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("Nq+?", true);

        SodiumIsobutylXanthate = new Material.Builder(getMaterialsId(), gregtechId("sodium_isobutyl_xanthate"))
                .dust()
                .color(0xA7933D)
                .build().setFormula("C5H9NaOS2", true);

        AlkylatedAdamantanes = new Material.Builder(getMaterialsId(), gregtechId("alkylated_adamantanes"))
                .fluid()
                .color(0x3949AB)
                .build().setFormula("C10H16(?)", true);

        Adamantane = new Material.Builder(getMaterialsId(), gregtechId("adamantane"))
                .fluid()
                .color(0x0288D1)
                .build().setFormula("C10H16", true);

        IsoOctane = new Material.Builder(getMaterialsId(), gregtechId("iso_octane"))
                .fluid()
                .color(0x33691E)
                .build().setFormula("C8H18", true);

        Tributylamine = new Material.Builder(getMaterialsId(), gregtechId("tributylamine"))
                .fluid()
                .color(0xAD1457)
                .build().setFormula("C12H27N", true);

        CarbonSulfide = new Material.Builder(getMaterialsId(), gregtechId("carbon_sulfide"))
                .fluid()
                .color(0x353222)
                .build().setFormula("CS2", true);

        KaminskyCatalyst = new Material.Builder(getMaterialsId(), gregtechId("kaminsky_catalyst"))
                .dust()
                .color(0x675952)
                .build().setFormula("(Zr(C5H5)2Cl2(AlCH3O)", true);

        PhilipsCatalyst = new Material.Builder(getMaterialsId(), gregtechId("philips_catalyst"))
                .dust()
                .color(0x6C73AD)
                .build().setFormula("(SiO2)(CrO3)", true);

        ZieglerNattaCatalyst = new Material.Builder(getMaterialsId(), gregtechId("ziegler_natta_catalyst"))
                .dust()
                .color(0x7A5D9F)
                .build().setFormula("Al2(C2H5)6)(TiCl4)", true);

        SodiumSulfideDichloroBenzeneMixture = new Material.Builder(getMaterialsId(),
                gregtechId("sodium_sulfide_solution_dichloro_benzene_mixture"))
                        .fluid()
                        .color(0x635E46)
                        .build().setFormula("(C6H4Cl2)(NaS2(H2O))", true);

        ChloroSilane = new Material.Builder(getMaterialsId(), gregtechId("chloro_silane"))
                .fluid()
                .color(0xAFC9D5)
                .build().setFormula("HClSi", true);

        DisproportionatedChloroSilane = new Material.Builder(getMaterialsId(),
                gregtechId("disproportionated_chloro_silane"))
                        .fluid()
                        .color(0xD7E8F0)
                        .build().setFormula("HClSi", true);

        PolybenzimidazolePrePolymerFoam = new Material.Builder(getMaterialsId(),
                gregtechId("polybenzimidazole_pre_polymer_foam"))
                        .dust()
                        .color(0x2B2B2B)
                        .build().setFormula("?", true);

        ImpurePolybenzimidazoleSolution = new Material.Builder(getMaterialsId(),
                gregtechId("impure_polybenzimidazole_solution"))
                        .fluid()
                        .color(0x353637)
                        .build().setFormula("?", true);

        PolybenzimidazoleSolution = new Material.Builder(getMaterialsId(), gregtechId("polybenzimidazole_solution"))
                .fluid()
                .color(0x232425)
                .build().setFormula("?", true);

        PolybenzimidazoleWaste = new Material.Builder(getMaterialsId(), gregtechId("polybenzimidazole_waste"))
                .fluid()
                .color(0x565453)
                .build().setFormula("?", true);

        PhenyleneSulfidePrePolymerMixture = new Material.Builder(getMaterialsId(),
                gregtechId("phenylene_sulfide_pre_polymer_mixture"))
                        .fluid()
                        .color(0x565453)
                        .build().setFormula("?", true);

        NitrogenizedCaprolactam = new Material.Builder(getMaterialsId(), gregtechId("nitrogenized_caprolactam"))
                .dust()
                .color(0x71777D)
                .build().setFormula("(CH2)5C(O)NH", true);

        Benzylbromide = new Material.Builder(getMaterialsId(), gregtechId("benzyl_bromide"))
                .fluid()
                .color(0x4A4B4C)
                .build().setFormula("C8H8Br", true);

        Butanal = new Material.Builder(getMaterialsId(), gregtechId("butanal"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("C4H8O", true);

        TriarylPhosphine = new Material.Builder(getMaterialsId(), gregtechId("triaryl_phosphine"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P", true);

        DiethylEther = new Material.Builder(getMaterialsId(), gregtechId("diethyl_ether"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        ArylmagnesiumHalides = new Material.Builder(getMaterialsId(), gregtechId("arylmagnesium_halides"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        PhosphorusTrichloride = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_trichloride"))
                .fluid()
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        TriarylPhosphineSolution = new Material.Builder(getMaterialsId(), gregtechId("triaryl_phosphine_solution"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P(H2O)?", true);

        PrePolymerizedCaprolactam = new Material.Builder(getMaterialsId(), gregtechId("pre_polymerized_caprolactam"))
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        Ether = new Material.Builder(getMaterialsId(), gregtechId("ether"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        Grisium = new Material.Builder(getMaterialsId(), gregtechId("grisium"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.GENERATE_FRAME, MaterialFlags.GENERATE_FOIL)
                .color(0x575979)
                .build().setFormula("Ti9C9K9Li9S9H5", true);

        SodiumSulfideSolution = new Material.Builder(getMaterialsId(), gregtechId("sodium_sulfide_solution"))
                .fluid()
                .color(0xC1A86B)
                .build().setFormula("Na2S(H2O)", true);

        MethylAluminoxane = new Material.Builder(getMaterialsId(), gregtechId("methyl_aluminoxane"))
                .dust()
                .color(0x508B91)
                .build().setFormula("AlCH30", true);

        RecrystallizedZirconiumDioxide = new Material.Builder(getMaterialsId(),
                gregtechId("recrystallized_zirconium_dioxide"))
                        .dust()
                        .color(0xAA245F)
                        .build().setFormula("Zr*O2", true);

        ZirconiumChloride = new Material.Builder(getMaterialsId(), gregtechId("zirconium_chlorine"))
                .fluid()
                .color(0x5A8882)
                .build().setFormula("ZrCl", true);

        ZirconiumDioxideSolution = new Material.Builder(getMaterialsId(), gregtechId("zirconium_dioxide_solution"))
                .fluid()
                .color(0xAD1457)
                .build().setFormula("ZrO2?", true);

        StyreneButadieneSolution = new Material.Builder(getMaterialsId(), gregtechId("styrene_butadiene_solution"))
                .fluid()
                .color(0xCD846D)
                .build().setFormula("(C8H8)(C4H6)(C2H6O)", true);

        nButyllithium = new Material.Builder(getMaterialsId(), gregtechId("n_butyllithium"))
                .fluid()
                .color(0x64817C)
                .build().setFormula("C4H9Li", true);

        PolymerizedStyreneButadieneSolution = new Material.Builder(getMaterialsId(),
                gregtechId("polymerized_styrene_butadiene_solution"))
                        .fluid()
                        .color(0x454545)
                        .build();

        TriethylAluminium = new Material.Builder(getMaterialsId(),
                gregtechId("triethylaluminium"))
                        .fluid()
                        .color(0x4780B9)
                        .build().setFormula("Al2(C2H5)6", true);

        TrimethylAluminium = new Material.Builder(getMaterialsId(),
                gregtechId("trimethylaluminium"))
                        .fluid()
                        .color(0x0097A7)
                        .build().setFormula("Al(CH3)3", true);

        OneButane = new Material.Builder(getMaterialsId(),
                gregtechId("one_butane"))
                        .fluid()
                        .color(0x995C57)
                        .build().setFormula("C4H9", true);

        PlatinumMetallicPowder = new Material.Builder(getMaterialsId(),
                gregtechId("platinum_metallic_powder"))
                        .dust()
                        .color(0xFAD28F)
                        .build().setFormula("Pt?", true);

        CrudeRhodiumMetal = new Material.Builder(getMaterialsId(), gregtechId("crude_rhodium_metal"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSalt = new Material.Builder(getMaterialsId(), gregtechId("rhodium_salt"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSaltSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_salt_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("rhodium_nitrate"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("RhN", true);

        RhodiumFilterCake = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("RhN", true);

        RhodiumFilterCakeSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("Rh", true);

        FluorohydrideAmmoniumCarbama = new Material.Builder(getMaterialsId(), gregtechId("fluorohydride_ammonium_carbama"))
                .fluid()
                .color(0x729A74)
                .build().setFormula("Rh", true);

        HydrogenatedCarbontetrafluoride = new Material.Builder(getMaterialsId(), gregtechId("hydrogenated_carbon_tetrafluoride"))
                .fluid()
                .color(0x788C79)
                .build().setFormula("HCF4", true);

        PCBB = new Material.Builder(getMaterialsId(), gregtechId("pcbb"))
                .fluid()
                .color(0x3C2A51)
                .build().setFormula("pcbb", true);

        Rhodium_II_Acetate = new Material.Builder(getMaterialsId(), gregtechId("rhodium_ii_acetate"))
                .dust()
                .color(0xAB9E7F)
                .build().setFormula("Rh2(OOCCH3)4", true);

        HydrofluoricMethane = new Material.Builder(getMaterialsId(), gregtechId("hydrofluoric_methane"))
                .fluid()
                .color(0xAB9E7F)
                .build().setFormula("HF(CH4)", true);

        Rhodium_III_Chloride = new Material.Builder(getMaterialsId(), gregtechId("rhodium_iii_chloride"))
                .dust()
                .color(0xAB9E7F)
                .build().setFormula("Rh3(Cl2)", true);

        Dimethylsiloxane = new Material.Builder(getMaterialsId(), gregtechId("dimethylsiloxane"))
                .fluid()
                .color(0xAB9E7F)
                .build().setFormula("Si(CH3)2O", true);

        UrethanePrePolymer = new Material.Builder(getMaterialsId(), gregtechId("urethane_pre_polymer"))
                .dust()
                .color(0xAB9E7F)
                .build().setFormula("Si(CH3)2O", true);

        Polyurethane = new Material.Builder(getMaterialsId(), gregtechId("polyurethane"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAB9E7F)
                .build().setFormula("C17H16N2O2", true);

        Polystyrene = new Material.Builder(getMaterialsId(), gregtechId("polystyrene"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAB9E7F)
                .build().setFormula("C17H16N2O2", true);


        // fluid
        ThionylChloride = new Material.Builder(getMaterialsId(), gregtechId("thionyl_chloride")).fluid().color(0x79A29F)
                .build().setFormula("SOCl2", true);
        SuccinicAcid = new Material.Builder(getMaterialsId(), gregtechId("succinic_acid")).dust().color(0xEDCD3B)
                .build().setFormula("C4H6O4", true);
        EthylBenzene = new Material.Builder(getMaterialsId(), gregtechId("ethyl_benzene")).fluid().color(0x7D7C79)
                .build().setFormula("C8H10", true);
        Naphthaldehyde = new Material.Builder(getMaterialsId(), gregtechId("naphthal_dehyde")).fluid().color(0xF3D036)
                .build().setFormula("C10H7CHO", true);
        HydrobromicAcid = new Material.Builder(getMaterialsId(), gregtechId("hydrobromic_acid")).fluid().color(0xE89089)
                .build().setFormula("HBr", true);
        SodiumCyanide = new Material.Builder(getMaterialsId(), gregtechId("sodium_cyanide")).fluid().color(0x3F51B5)
                .build().setFormula("NaCN", true);
        HydrogenCyanide = new Material.Builder(getMaterialsId(), gregtechId("hydrogen_cyanide")).fluid().color(0xA4ABD2)
                .build().setFormula("HCN", true);
        Dimethylsulfide = new Material.Builder(getMaterialsId(), gregtechId("dimethyl_sulfide")).fluid().color(0xCD9ED4)
                .build().setFormula("C2H6S", true);
        Methylamine = new Material.Builder(getMaterialsId(), gregtechId("methylamine")).fluid().color(0x9C53A8).build()
                .setFormula("CH3NH2", true);
        Ferrocenylfulleropyrrolidine = new Material.Builder(getMaterialsId(),
                gregtechId("ferrocenylfulleropyrrolidine")).fluid().color(0x151415).build().setFormula("RhN", true);
        Iron2Chloride = new Material.Builder(getMaterialsId(), gregtechId("iron_2_chloride")).fluid().color(0x494553)
                .build().setFormula("FeCl2", true);
        AcryloNitrile = new Material.Builder(getMaterialsId(), gregtechId("acrylo_nitrile")).fluid().color(0xC9C6A5)
                .build().setFormula("C3H3N", true);
        HydroiodicAcid = new Material.Builder(getMaterialsId(), gregtechId("hydroiodic_acid")).fluid().color(0x666CA5)
                .build().setFormula("HI", true);
        Hydrazine = new Material.Builder(getMaterialsId(), gregtechId("hydrazine")).fluid().color(0x7DB3E3).build()
                .setFormula("N2H4", true);
        BenzoylPeroxide = new Material.Builder(getMaterialsId(), gregtechId("benzyol_peroxide")).fluid().color(0x31516D)
                .build().setFormula("C14H10O4", true);
        BenzoylChloride = new Material.Builder(getMaterialsId(), gregtechId("benzyol_chloride")).fluid().color(0x324834)
                .build().setFormula("C7H5ClO", true);
        IronChloride = new Material.Builder(getMaterialsId(), gregtechId("iron_chloride")).fluid().color(0x2A5170)
                .build().setFormula("FeCl", true);
        Dichloromethane = new Material.Builder(getMaterialsId(), gregtechId("dichloromethane")).fluid().color(0x725E76)
                .build().setFormula("CH2Cl2", true);
        Dimethylaminopyridine = new Material.Builder(getMaterialsId(), gregtechId("dimethylaminopyridine")).fluid()
                .color(0xFFA000).build().setFormula("C7H10N2", true);
        Pyridine = new Material.Builder(getMaterialsId(), gregtechId("pyridine")).fluid().color(0xFE9F01).build()
                .setFormula("C5H5N", true);
        Diisopropylcarbodiimide = new Material.Builder(getMaterialsId(), gregtechId("diisopropylcarbodiimide")).fluid()
                .color(0xD32F2F).build().setFormula(" (CH3)2CHN=C=NCH(CH3)2", true);
        IsopropylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isopropyl_alcohol")).fluid()
                .color(0xA4B1A5).build().setFormula("C3H8O", true);
        Silvertetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("silvertetrafluoroborate")).fluid()
                .color(0xDADBDA).build().setFormula("AgBF4", true);
        TrimethyltinChloride = new Material.Builder(getMaterialsId(), gregtechId("trimethyl_tin_chloride")).fluid()
                .color(0x7986CB).build().setFormula("C3H9SnCl", true);
        Phenylpentanoicacid = new Material.Builder(getMaterialsId(), gregtechId("phenylpentanoicacid")).fluid()
                .color(0xFCF2DC).build().setFormula("C11H14O2", true);

        // dusts
        Fullerene = new Material.Builder(getMaterialsId(), gregtechId("fullerene")).dust().color(0xF9D16E).build()
                .setFormula("C60", true);
        TiAlChloride = new Material.Builder(getMaterialsId(), gregtechId("ti_al_chloride")).dust().color(0x1E88E5)
                .build().setFormula("TiAlCl3", true);
        UnfoldedFullerene = new Material.Builder(getMaterialsId(), gregtechId("unfolded_fullerene")).dust()
                .color(0x4527A0).build().setFormula("C60", true);
        Succinimide = new Material.Builder(getMaterialsId(), gregtechId("succinimide")).dust().color(0x163217).build()
                .setFormula("C4H5NO2", true);
        PotassiumBromide = new Material.Builder(getMaterialsId(), gregtechId("potassium_bromide")).dust()
                .color(0xDEBDBD).build().setFormula("KBr", true);
        Benzophenanthrenylacetonitrile = new Material.Builder(getMaterialsId(),
                gregtechId("benzophenanthrenylacetonitrile")).dust().color(0xC62828).build().setFormula("?", true);
        Bromosuccinimide = new Material.Builder(getMaterialsId(), gregtechId("bromosuccinimide")).dust().color(0x315458)
                .build().setFormula("C4H4BrNO2", true);
        PotassiumCyanide = new Material.Builder(getMaterialsId(), gregtechId("potassium_cyanide")).dust()
                .color(0xFFCA28).build().setFormula("KCN", true);
        Methylbenzophenanthrene = new Material.Builder(getMaterialsId(), gregtechId("methylbenzophenanthrene")).dust()
                .color(0x327F89).build().setFormula("RhN", true);
        TinChloride = new Material.Builder(getMaterialsId(), gregtechId("tin_chloride")).dust().color(0x9A8FBA).build()
                .setFormula("TnCl", true);
        DisodiumPhosphate = new Material.Builder(getMaterialsId(), gregtechId("disodium_phosphate")).dust()
                .color(0x3A77AD).build().setFormula("Na2HPO4", true);
        Cyanonaphthalene = new Material.Builder(getMaterialsId(), gregtechId("cyanonaphthalene")).dust().color(0x554B67)
                .build().setFormula("C10H7CN", true);
        SodiumBromide = new Material.Builder(getMaterialsId(), gregtechId("sodium_bromide")).dust().color(0x837798)
                .build().setFormula("NaBr", true);
        PotassiumPermanganate = new Material.Builder(getMaterialsId(), gregtechId("potassium_permanganate")).dust()
                .color(0xE6EE9C).build().setFormula("KMnO4", true);
        PdFullereneMatrix = new Material.Builder(getMaterialsId(), gregtechId("palladium_fullerene_matrix")).dust()
                .color(0x4527A0).build().setFormula("RhN", true);
        AluminoSilicateWool = new Material.Builder(getMaterialsId(), gregtechId("alumino_silicate_wool")).dust()
                .color(0x4DD0E1).build().setFormula("RhN", true);
        Sarcosine = new Material.Builder(getMaterialsId(), gregtechId("sarcosine")).dust().color(0x3D8540).build()
                .setFormula("C3H7NO2", true);
        Ferrocene = new Material.Builder(getMaterialsId(), gregtechId("ferrocene")).fluid().color(0xD1C4E9).build()
                .setFormula("C10H10Fe", true);
        PdIrReOCeOS = new Material.Builder(getMaterialsId(), gregtechId("pd_ir_re_o_ce_o_s")).dust().color(0xF9C528)
                .build().setFormula("RhN", true);
        LithiumAluminiumHydride = new Material.Builder(getMaterialsId(), gregtechId("lithium_aluminium_hydride")).dust()
                .color(0xFF5722).build().setFormula("LiAlH4", true);
        PCBS = new Material.Builder(getMaterialsId(), gregtechId("pcbs")).fluid().color(0x113B61).build()
                .setFormula("RhN", true);
        Phosgene = new Material.Builder(getMaterialsId(), gregtechId("phosgene")).fluid().color(0x2E7D32).build()
                .setFormula("COCl2", true);
        SilverOxide = new Material.Builder(getMaterialsId(), gregtechId("silver_oxide")).dust().color(0xB5B4B7).build()
                .setFormula("AgO2", true);
        BoronFluoride = new Material.Builder(getMaterialsId(), gregtechId("boron_fluoride")).fluid().color(0x170E32)
                .build().setFormula("BoF2", true);
        SilverChloride = new Material.Builder(getMaterialsId(), gregtechId("silver_chloride")).dust().color(0x2A632D)
                .build().setFormula("AgCl", true);
        PCBA = new Material.Builder(getMaterialsId(), gregtechId("pcba")).fluid().color(0x8E711A).build()
                .setFormula("RhN", true);
        LithiumIodide = new Material.Builder(getMaterialsId(), gregtechId("lithium_iodide")).dust().color(0xDEBDBD)
                .build().setFormula("LiI", true);
        AluminiumHydride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_hydride")).dust()
                .color(0x98BEE0).build().setFormula("AlH4", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
