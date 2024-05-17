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
                .liquid(new FluidBuilder())
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
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C20H12O3", true);

        EthyleneOxide = new Material.Builder(getMaterialsId(), gregtechId("ethylene_oxide"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredMethanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_methanol"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredButanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_butanol"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        HundredEthanol = new Material.Builder(getMaterialsId(), gregtechId("hundred_ethanol"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        ActivatedCarbon = new Material.Builder(getMaterialsId(), gregtechId("activated_carbon"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C", true);

        HotWater = new Material.Builder(getMaterialsId(), gregtechId("hot_water"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("H2O", true);

        EthyleneGlycol = new Material.Builder(getMaterialsId(), gregtechId("ethylene_glycol"))
                .liquid(new FluidBuilder())
                .color(0x9DD6D0)
                .build().setFormula("C2H6O2", true);

        SodiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("sodium_hydroxide_solution"))
                .liquid(new FluidBuilder())
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
                .liquid(new FluidBuilder())
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
                .liquid(new FluidBuilder())
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
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C4H10O2", true);

        OneFourButynediol = new Material.Builder(getMaterialsId(), gregtechId("one_four_butynediol"))
                .liquid(new FluidBuilder())
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
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x313031)
                .build().setFormula("HCl", true);

        FullerenePolymerTetrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_tetrix"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0x1D181E)
                .build().setFormula("HCl", true);

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
                .color(0xBEA0D0)
                .build().setFormula("P(H2O)", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
