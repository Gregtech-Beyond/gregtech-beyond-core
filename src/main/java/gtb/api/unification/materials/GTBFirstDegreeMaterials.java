package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.info.MaterialIconSet;

public class GTBFirstDegreeMaterials {

    private static int startId = 24001;
    private static final int END_ID = startId + 500;;

    public static void register() {
        PotassiumDisulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_disulfate"))
                .dust()
                .color(0xD84315)
                .components(Potassium, 2, Sulfur, 2, Oxygen, 7)
                .build();

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

        LithiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("lithiumfluoride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("LiF3", true);

        Polyetheretherketone = new Material.Builder(getMaterialsId(), gregtechId("polyetheretherketone"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
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

        SilverBromide = new Material.Builder(getMaterialsId(), gregtechId("silver_bromides"))
                .dust()
                .color(0xD19E9E)
                .build().setFormula("AgBr", true);

        Silane = new Material.Builder(getMaterialsId(), gregtechId("silane"))
                .fluid()
                .color(0xA9A8A8)
                .build().setFormula("SiCl4", true);

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

        Ozone = new Material.Builder(getMaterialsId(), gregtechId("ozone"))
                .fluid()
                .color(0x2182BC)
                .build().setFormula("O3", true);

        FluorodarmstadticAcid = new Material.Builder(getMaterialsId(), gregtechId("fluorodarmstadtic_acid"))
                .fluid()
                .color(0x333537)
                .build().setFormula("Ad", true);

        AntimonyPentafluoride = new Material.Builder(getMaterialsId(), gregtechId("antimony_pentafluoride"))
                .fluid()
                .color(0x333537)
                .build().setFormula("SbF5", true);

        SodiumIsobutylXanthate = new Material.Builder(getMaterialsId(), gregtechId("sodium_isobutyl_xanthate"))
                .dust()
                .color(0xA7933D)
                .build().setFormula("C5H9NaOS2", true);

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

        Benzylbromide = new Material.Builder(getMaterialsId(), gregtechId("benzyl_bromide"))
                .fluid()
                .color(0x4A4B4C)
                .build().setFormula("C8H8Br", true);

        Butanal = new Material.Builder(getMaterialsId(), gregtechId("butanal"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("C4H8O", true);

        PhosphorusTrichloride = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_trichloride"))
                .fluid()
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        TolueneDiisocyanate = new Material.Builder(getMaterialsId(), gregtechId("toluene_diisocyanate"))
                .fluid()
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("C9H6N2O2", true);

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
                .color(0xF9A825)
                .flags(DISABLE_DECOMPOSITION)
                .build().setFormula("Na2S(H2O)", true);

        ZincOxide = new Material.Builder(getMaterialsId(), gregtechId("zinc_oxide"))
                .dust()
                .color(0xB85C34)
                .flags(DISABLE_DECOMPOSITION)
                .components(Zinc, 1, Oxygen, 1)
                .build();

        GermaniumTetrachloride = new Material.Builder(getMaterialsId(), gregtechId("germanium_tetrachloride"))
                .fluid()
                .color(0x787878)
                .flags(DISABLE_DECOMPOSITION)
                .components(Germanium, 1, Chlorine, 4)
                .build();

        GermaniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("germanium_dioxide"))
                .dust()
                .color(0x666666)
                .flags(DISABLE_DECOMPOSITION)
                .components(Germanium, 1, Oxygen, 2)
                .build();

        RoastedSphalerite = new Material.Builder(getMaterialsId(), gregtechId("roasted_sphalerite"))
                .dust()
                .color(0x666666)
                .flags(DISABLE_DECOMPOSITION)
                .components(Germanium, 1, Oxygen, 2)
                .build();

        // TODO move to first degree
        WaelzSlag = new Material.Builder(getMaterialsId(), gregtechId("waelz_slag"))
                .dust()
                .color(0xAC8B5C)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.ROUGH)
                .components(Gallium, 1, Zinc, 1, Sulfur, 1, Oxygen, 4)
                .build();

        WaelzOxide = new Material.Builder(getMaterialsId(), gregtechId("waelz_oxide"))
                .dust()
                .color(0xB8B8B8)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.FINE)
                .iconSet(MaterialIconSet.FINE)
                .build();

        StannicChloride = new Material.Builder(getMaterialsId(), gregtechId("stannic_chloride"))
                .fluid()
                .color(0x33BBF5)
                .flags(DISABLE_DECOMPOSITION)
                .components(Tin, 1, Chlorine, 4)
                .build();

        RubidiumChlorostannate = new Material.Builder(getMaterialsId(), gregtechId("rubidium_chlorostannate"))
                .dust()
                .color(0xBD888A)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.METALLIC)
                .build();

        CaesiumChlorostannate = new Material.Builder(getMaterialsId(), gregtechId("caesium_chlorostannate"))
                .dust()
                .color(0xBDAD88)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.SHINY)
                .components(Caesium, 2, Tin, 1, Chlorine, 6)
                .build();

        TinFourChloride = new Material.Builder(getMaterialsId(), gregtechId("tin_four_chloride"))
                .dust()
                .flags(DISABLE_DECOMPOSITION)
                .color(0xA9C6DE)
                .build().setFormula("SnCl2", true);

        ThalliumSulfate = new Material.Builder(getMaterialsId(), gregtechId("thallium_sulfate"))
                .dust()
                .color(0x9C222C)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Thallium, 2, Sulfur, 1, Oxygen, 4)
                .build();

        MolybdenumTrioxide = new Material.Builder(getMaterialsId(), gregtechId("molybdenum_trioxide"))
                .dust()
                .color(0xCBCFDA)
                .iconSet(MaterialIconSet.ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Molybdenum, 1, Oxygen, 3)
                .build();

        PerrhenicAcid = new Material.Builder(getMaterialsId(), gregtechId("perrhenic_acid"))
                .dust()
                .color(0xE6DC70)
                .iconSet(MaterialIconSet.SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 1, Rhenium, 1, Oxygen, 4)
                .build();

        AmmoniumPerrhenate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_perrhenate"))
                .dust()
                .color(0xA69970)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Nitrogen, 1, Hydrogen, 4, Rhenium, 1, Oxygen, 4)
                .build();

        LeadChloride = new Material.Builder(getMaterialsId(), gregtechId("lead_chloride"))
                .dust()
                .color(0xF3F3F3)
                .iconSet(MaterialIconSet.ROUGH)
                .components(Lead, 1, Chlorine, 2)
                .color(0xC1A86B)
                .build();

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
                .build().setFormula("ZrO(H2O)", true);

        nButyllithium = new Material.Builder(getMaterialsId(), gregtechId("n_butyllithium"))
                .fluid()
                .color(0x64817C)
                .build().setFormula("C4H9Li", true);

        OneButane = new Material.Builder(getMaterialsId(),
                gregtechId("one_butane"))
                        .fluid()
                        .color(0x995C57)
                        .build().setFormula("C4H9", true);

        RhodiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("rhodium_nitrate"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("RhN", true);

        FluorohydrideAmmoniumCarbama = new Material.Builder(getMaterialsId(),
                gregtechId("fluorohydride_ammonium_carbama"))
                        .fluid()
                        .color(0x729A74)
                        .build().setFormula("FH(NH3)N2O", true);

        HydrogenatedCarbontetrafluoride = new Material.Builder(getMaterialsId(),
                gregtechId("hydrogenated_carbon_tetrafluoride"))
                        .fluid()
                        .color(0x788C79)
                        .build().setFormula("HCF4", true);

        PCBB = new Material.Builder(getMaterialsId(), gregtechId("pcbb"))
                .fluid()
                .color(0x3C2A51)
                .build().setFormula("pcbb", true);

        Polyurethane = new Material.Builder(getMaterialsId(), gregtechId("polyurethane"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x809A9D)
                .build().setFormula("C17H16N2O2", true);

        Polystyrene = new Material.Builder(getMaterialsId(), gregtechId("polystyrene"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x584643)
                .build().setFormula("C8H8", true);

        LithiumTitanate = new Material.Builder(getMaterialsId(), gregtechId("lithium_titanate"))
                .dust()
                .ingot()
                .color(0xAA48BA).build().setFormula("Li2TiO3", true);

        PolystyreneNanoParticles = new Material.Builder(getMaterialsId(), gregtechId("polystyrene_nano_particles"))
                .dust()
                .color(0x7E6B67).build().setFormula("Li2TiO3", true);

        NitrogenPentoxide = new Material.Builder(getMaterialsId(), gregtechId("nitrogen_pentoxide"))
                .fluid()
                .color(0x283593).build().setFormula("N2O5", true);

        OrthoXylene = new Material.Builder(getMaterialsId(), gregtechId("ortho_xylene"))
                .fluid()
                .color(0x252525).build().setFormula("C8H10", true);

        ParaXylene = new Material.Builder(getMaterialsId(), gregtechId("para_xylene"))
                .fluid()
                .color(0x3B3B3B).build().setFormula("N2O5", true);

        Dibromomethylbenzene = new Material.Builder(getMaterialsId(), gregtechId("dibromomethylbenzene"))
                .fluid()
                .color(0x004D40).build().setFormula("N2O5", true);

        AuPdCCatalyst = new Material.Builder(getMaterialsId(), gregtechId("au_pd_c_catalyst"))
                .dust()
                .color(0xFDD835).build().setFormula("N2O5", true);

        PdCCatalyst = new Material.Builder(getMaterialsId(), gregtechId("pd_c_catalyst"))
                .dust()
                .color(0x9D8B3C).build().setFormula("N2O5", true);

        Isochloropropane = new Material.Builder(getMaterialsId(), gregtechId("isochloropropane"))
                .fluid()
                .color(0xD84315).build().setFormula("N2O5", true);

        Resorcinol = new Material.Builder(getMaterialsId(), gregtechId("resorcinol"))
                .fluid()
                .color(0x81C784).build().setFormula("N2O5", true);

        SodiumAcetate = new Material.Builder(getMaterialsId(), gregtechId("sodium_acetate"))
                .fluid()
                .color(0xCE93D8).build().setFormula("N2O5", true);

        Zylon = new Material.Builder(getMaterialsId(), gregtechId("zylon"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x584643)
                .build().setFormula("C8H8", true);

        PreZylon = new Material.Builder(getMaterialsId(), gregtechId("pre_zylon"))
                .dust()
                .color(0xF57F17).build().setFormula("C20H22N2O2", true);

        Terephthalaldehyde = new Material.Builder(getMaterialsId(), gregtechId("terephthalaldehyde"))
                .dust()
                .color(0xB0A0D3).build().setFormula("C8H6O2 ", true);

        Dinitrodipropanyloxybenzene = new Material.Builder(getMaterialsId(), gregtechId("dinitrodipropanyloxybenzene"))
                .fluid()
                .color(0xDCEDC8).build().setFormula("C9H7NO3", true);

        SodiumOxide = new Material.Builder(getMaterialsId(), gregtechId("sodium_oxide"))
                .dust()
                .color(0x88B0D8).build().setFormula("NaO2", true);

        AmineMixture = new Material.Builder(getMaterialsId(), gregtechId("amine_mixture"))
                .fluid()
                .color(0x5B1F6C).build().setFormula("C9H13N", true);

        Trimethylamine = new Material.Builder(getMaterialsId(), gregtechId("trimethylamine"))
                .fluid()
                .color(0xAE69C0).build().setFormula("C3H9N", true);

        SodiumPhosphotungstate = new Material.Builder(getMaterialsId(), gregtechId("sodium_phosphotungstate"))
                .dust()
                .color(0xF2EAA1).build().setFormula("Na3O40PW12", true);

        AmmoniumPersulfate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_persulfate"))
                .dust()
                .color(0x8C95C7).build().setFormula("(NH4)2S2O8", true);

        CetaneTrimethylAmmoniumBromide = new Material.Builder(getMaterialsId(),
                gregtechId("cetane_trimethyl_ammonium_bromide"))
                        .fluid()
                        .color(0xD81B60).build().setFormula("C19H42BrN", true);

        Oct_1_ene = new Material.Builder(getMaterialsId(), gregtechId("oct_1_ene"))
                .fluid()
                .color(0xC62828).build().setFormula("C8H16", true);

        SodiumPhosphomolybdate = new Material.Builder(getMaterialsId(), gregtechId("sodium_phosphomolybdate"))
                .dust()
                .color(0xFFB74D).build().setFormula("Mo12Na3O40P", true);

        BerylliumFluoride = new Material.Builder(getMaterialsId(), gregtechId("beryllium_fluoride"))
                .dust()
                .color(0x66BB6A).build().setFormula("BeF2", true);

        Mercaptophenol = new Material.Builder(getMaterialsId(), gregtechId("mercaptophenol"))
                .fluid()
                .color(0x827717).build().setFormula("C2H6OS", true);

        IridiumCyclooctadienylChlorideDimer = new Material.Builder(getMaterialsId(),
                gregtechId("iridium_cyclooctadienyl_chloride_dimer"))
                        .dust()
                        .color(0x00897B).build().setFormula("C16H24Cl2Ir2", true);

        Cyclooctadiene = new Material.Builder(getMaterialsId(), gregtechId("cyclooctadiene"))
                .fluid()
                .color(0x252525).build().setFormula("C8H12", true);

        IsophthalicAcid = new Material.Builder(getMaterialsId(), gregtechId("isophthalic_acid"))
                .dust()
                .color(0x7DB880).build().setFormula("C8H6O4", true);

        IsophthaloylChloride = new Material.Builder(getMaterialsId(), gregtechId("isophthaloyl_chloride"))
                .dust()
                .color(0x495749).build().setFormula("C8H4Cl2O2", true);

        OneThreeDinitrobenzene = new Material.Builder(getMaterialsId(), gregtechId("one_three_dinitrobenzene"))
                .dust()
                .color(0x67697B).build().setFormula("C6H4N2O4", true);

        ActivatedRaneyNickel = new Material.Builder(getMaterialsId(), gregtechId("activated_raney_nickel"))
                .dust()
                .color(0xCCCDD5).build().setFormula("AlNi", true);

        RaneyNickel = new Material.Builder(getMaterialsId(), gregtechId("raney_nickel"))
                .dust()
                .color(0x94959F).build().setFormula("AlNi", true);

        mPhenyleneDiamine = new Material.Builder(getMaterialsId(), gregtechId("m_phenyl_diamine"))
                .dust()
                .color(0x658BB2).build().setFormula("C6H8N2", true);

        SodiumAluminate = new Material.Builder(getMaterialsId(), gregtechId("sodium_aluminate"))
                .dust()
                .color(0xAECDAF).build().setFormula("NaAlO2", true);

        Nomex = new Material.Builder(getMaterialsId(), gregtechId("nomex"))
                .fluid()
                .dust()
                .ingot()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x584643)
                .build().setFormula("[COC6H4CONHC6H4NH]n", true);
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
        Dimethylaminopyridine = new Material.Builder(getMaterialsId(), gregtechId("dimethylaminopyridine")).dust()
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
                .color(0x4527A0).build().setFormula("PdC73H15NFe", true);
        AluminoSilicateWool = new Material.Builder(getMaterialsId(), gregtechId("alumino_silicate_wool")).dust()
                .color(0x4DD0E1).build().setFormula("Al2SiO5", true);
        Sarcosine = new Material.Builder(getMaterialsId(), gregtechId("sarcosine")).dust().color(0x3D8540).build()
                .setFormula("C3H7NO2", true);
        Ferrocene = new Material.Builder(getMaterialsId(), gregtechId("ferrocene")).fluid().color(0xD1C4E9).build()
                .setFormula("C10H10Fe", true);
        PdIrReOCeOS = new Material.Builder(getMaterialsId(), gregtechId("pd_ir_re_o_ce_o_s")).dust().color(0xF9C528)
                .build().setFormula("PdIrReOCeOS", true);
        LithiumAluminiumHydride = new Material.Builder(getMaterialsId(), gregtechId("lithium_aluminium_hydride")).dust()
                .color(0xFF5722).build().setFormula("LiAlH4", true);
        PCBS = new Material.Builder(getMaterialsId(), gregtechId("pcbs")).fluid().color(0x113B61).build()
                .setFormula("RhN", true);
        Phosgene = new Material.Builder(getMaterialsId(), gregtechId("phosgene")).fluid().color(0x2E7D32).build()
                .setFormula("COCl2", true);
        SilverOxide = new Material.Builder(getMaterialsId(), gregtechId("silver_oxide")).dust().color(0xB5B4B7).build()
                .setFormula("AgO2", true);
        BoronFluoride = new Material.Builder(getMaterialsId(), gregtechId("boron_fluoride")).fluid().color(0x170E32)
                .build().setFormula("BF2", true);
        SilverChloride = new Material.Builder(getMaterialsId(), gregtechId("silver_chloride")).dust().color(0x2A632D)
                .build().setFormula("AgCl", true);
        PCBA = new Material.Builder(getMaterialsId(), gregtechId("pcba")).fluid().color(0x8E711A).build()
                .setFormula("RhN", true);
        LithiumIodide = new Material.Builder(getMaterialsId(), gregtechId("lithium_iodide")).dust().color(0xDEBDBD)
                .build().setFormula("LiI", true);
        AluminiumHydride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_hydride")).dust()
                .color(0x98BEE0).build().setFormula("AlH4", true);
        MagnesiumSulfate = new Material.Builder(getMaterialsId(), gregtechId("magnesium_sulfate")).dust()
                .color(0x9A9997).build().setFormula("MgSO4", true);
        PotassiumSulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_sulfate")).dust()
                .color(0xE2C647).build().setFormula("K2SO4", true);
        PotassiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoride")).dust()
                .color(0x737373).build().setFormula("KF", true);
        SodiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("sodium_fluoride")).dust()
                .color(0x265583).build().setFormula("NaF", true);

        SodiumTellurite = new Material.Builder(getMaterialsId(), gregtechId("sodium_tellurite"))
                .dust()
                .color(0xC6C9BE)
                .iconSet(MaterialIconSet.ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Sodium, 2, Tellurium, 1, Oxygen, 3)
                .build();

        TelluriumDioxide = new Material.Builder(getMaterialsId(), gregtechId("tellurium_dioxide"))
                .dust()
                .color(0xE3DDB8)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Tellurium, 1, Oxygen, 2)
                .build();

        SeleniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("selenium_dioxide"))
                .dust()
                .color(0xE0DDD8)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Selenium, 1, Oxygen, 2)
                .build();

        SelenousAcid = new Material.Builder(getMaterialsId(), gregtechId("selenous_acid"))
                .dust()
                .color(0xE0E083)
                .iconSet(MaterialIconSet.SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 2, Selenium, 1, Oxygen, 3)
                .build();

        CalciumDioxide = new Material.Builder(getMaterialsId(), gregtechId("calcium_dioxide"))
                .dust()
                .color(0xBA421D).build().setFormula("CaO2", true);

        SodiumNitride = new Material.Builder(getMaterialsId(), gregtechId("sodium_nitride"))
                .dust()
                .color(0x2B4F77).build().setFormula("NaN2O", true);

        NeodymiumOxide = new Material.Builder(getMaterialsId(), gregtechId("neodymium_oxide"))
                .dust()
                .color(0x4D4B4D).build().setFormula("NdO2", true);

        LanthanumOxide = new Material.Builder(getMaterialsId(), gregtechId("lanthanum_oxide"))
                .dust()
                .color(0x667B78).build().setFormula("LaO2", true);

        SamariumOxide = new Material.Builder(getMaterialsId(), gregtechId("samarium_oxide"))
                .dust()
                .color(0xB2B1A2).build().setFormula("SmO2", true);

        HolmiumOxide = new Material.Builder(getMaterialsId(), gregtechId("holmium_oxide"))
                .dust()
                .color(0x351958).build().setFormula("HoO2", true);

        HolmiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("holmium_fluoride"))
                .dust()
                .color(0x654788).build().setFormula("HoF2", true);

        CalciumFluoride = new Material.Builder(getMaterialsId(), gregtechId("calcium_fluoride"))
                .dust()
                .color(0xACBFBD).build().setFormula("CaF2", true);

        CeriumOxide = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide"))
                .dust()
                .color(0x677753).build().setFormula("CeO2", true);

        ZincChloride = new Material.Builder(getMaterialsId(), gregtechId("zinc_chloride"))
                .dust()
                .color(0x677753).build().setFormula("ZnCl2", true);

        EuropiumOxide = new Material.Builder(getMaterialsId(), gregtechId("europium_oxide"))
                .dust()
                .color(0x58ABD4).build().setFormula("EuO2", true);

        GadoliniumOxide = new Material.Builder(getMaterialsId(), gregtechId("gadolinium_oxide"))
                .dust()
                .color(0xCE8C2C).build().setFormula("GdO2", true);

        HafniumOxide = new Material.Builder(getMaterialsId(), gregtechId("hafnium_oxide"))
                .dust()
                .color(0xFFA000).build().setFormula("HfO2", true);

        ZirconiumOxide = new Material.Builder(getMaterialsId(), gregtechId("zirconium_oxide"))
                .dust()
                .color(0x818180).build().setFormula("ZrO2", true);

        RutherfordiumOxide = new Material.Builder(getMaterialsId(), gregtechId("rutherfordium_oxide"))
                .dust()
                .color(0xC6AA68).build().setFormula("RfO2", true);

        DiacetoneAlcohol = new Material.Builder(getMaterialsId(), gregtechId("diacetone_alcohol"))
                .fluid()
                .color(0x442A62).build().setFormula("C6H12O2", true);

        Hexadecanol = new Material.Builder(getMaterialsId(), gregtechId("hexadecanol"))
                .fluid()
                .color(0x8F4923).build().setFormula("C16H34O", true);

        PalmaticAcid = new Material.Builder(getMaterialsId(), gregtechId("palmatic_acid"))
                .fluid()
                .color(0x79A0A4).build().setFormula("C16H32O2", true);

        Octanol = new Material.Builder(getMaterialsId(), gregtechId("octanol"))
                .fluid()
                .color(0xBB5D40).build().setFormula("C8H18O", true);

        Dodecanol = new Material.Builder(getMaterialsId(), gregtechId("dodecanol"))
                .fluid()
                .color(0xB43C17).build().setFormula("C12H26O", true);

        Decanol = new Material.Builder(getMaterialsId(), gregtechId("decanol"))
                .fluid()
                .color(0xA34C32).build().setFormula("C10H22O", true);

        Hexanol = new Material.Builder(getMaterialsId(), gregtechId("hexanol"))
                .fluid()
                .color(0xE65100).build().setFormula("C6H14O", true);

        CaprylicAcid = new Material.Builder(getMaterialsId(), gregtechId("caprylic_acid"))
                .fluid()
                .color(0xB71C1C).build().setFormula("C8H16O2", true);

        MethylIsobutylCarbonyl = new Material.Builder(getMaterialsId(), gregtechId("methyl_isobutyl_carbonyl"))
                .fluid()
                .color(0x388E3C).build().setFormula("C6H14O", true);

        Tetradecanol = new Material.Builder(getMaterialsId(), gregtechId("tetradecanol"))
                .fluid()
                .color(0x7D311A).build().setFormula("C14H29OH", true);

        PotassiumMagnesiumSalts = new Material.Builder(getMaterialsId(), gregtechId("potassium_magnesium_salts"))
                .dust()
                .color(0xD7D6D6)
                .build().setFormula("KClMgSO4K2SO4KF", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
