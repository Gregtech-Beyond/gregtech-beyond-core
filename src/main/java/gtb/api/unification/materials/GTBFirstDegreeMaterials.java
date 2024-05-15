package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.unification.material.Material;

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
                .color(0xC87A7A)
                .build().setFormula("C5H12O", true);

        IsobutylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isobutyl_alcohol"))
                .fluid()
                .color(0xAB47BC)
                .build().setFormula("C5H12O", true);

        Formaldehyde = new Material.Builder(getMaterialsId(), gregtechId("formaldehyde"))
                .fluid()
                .color(0xAB47BC)
                .build().setFormula("CH20", true);

        Dicyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("dicyclopentadiene"))
                .fluid()
                .color(0xAB47BC)
                .build().setFormula("C10H12", true);

        Cyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("cyclopentadiene"))
                .fluid()
                .color(0xAB47BC)
                .build().setFormula("C5H6", true);

        TungstenTrioxide = new Material.Builder(getMaterialsId(), gregtechId("tungstentrioxide"))
                .dust()
                .color(0x6E9C46)
                .build().setFormula("WO3", true);

        HydrogenPeroxide = new Material.Builder(getMaterialsId(), gregtechId("hydrogenperoxide"))
                .fluid()
                .color(0xC2E2F0)
                .build().setFormula("H2O2", true);

        CalciumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("calciumhydroxide"))
                .dust()
                .color(0x9FC0A1)
                .build().setFormula("Ca(OH)2", true);

        LithiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxide"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("LiOH", true);

        SodiumTungstate = new Material.Builder(getMaterialsId(), gregtechId("sodiumtungstate"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("Na2WO4", true);

        CalciumTungstate = new Material.Builder(getMaterialsId(), gregtechId("calciumtungstate"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("WCaO4", true);

        LithiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxidesolution"))
                .dust()
                .fluid()
                .color(0x1A4051)
                .build().setFormula("(H2O)LiOH", true);

        LithiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("lithiumfluoride"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("(H2O)LiOH", true);

        NaquadahDioxide = new Material.Builder(getMaterialsId(), gregtechId("naquadah_dioxide"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        Nylon = new Material.Builder(getMaterialsId(), gregtechId("nylon"))
                .dust()
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        ElectronDegenerateRhenium = new Material.Builder(getMaterialsId(), gregtechId("electron_degenerate_rhenium"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        ElectronDegenerateRheniumPlasma = new Material.Builder(getMaterialsId(),
                gregtechId("electron_degenerate_rhenium_plasma"))
                        .fluid()
                        .color(0x1A4051)
                        .build().setFormula("NqO2", true);

        HighPurityArsenic = new Material.Builder(getMaterialsId(), gregtechId("high_purity_arsenic"))
                .dust()
                .color(0xB0B0B1)
                .build().setFormula("NqO2", true);

        IndiumChloride = new Material.Builder(getMaterialsId(), gregtechId("indium_chloride"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        NovolacsPhotoresist = new Material.Builder(getMaterialsId(), gregtechId("novolacs_photoresist"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        WhitePhosphorus = new Material.Builder(getMaterialsId(), gregtechId("white_phosphorus"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("P4", true);

        LiquidXenon = new Material.Builder(getMaterialsId(), gregtechId("liquid_xenon"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        SiliconCarbide = new Material.Builder(getMaterialsId(), gregtechId("silicon_carbide"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        SiliconCarbideVapor = new Material.Builder(getMaterialsId(), gregtechId("silicon_carbide_vapor"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        VeryHotNitrogen = new Material.Builder(getMaterialsId(), gregtechId("very_hot_nitrogen"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("N", true);

        PhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("photopolymer_solution"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        UsedPhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("used_photopolymer_solution"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("NqO2", true);

        VeryHotXenon = new Material.Builder(getMaterialsId(), gregtechId("very_hot_xenon"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("Xe", true);

        VeryHotArgon = new Material.Builder(getMaterialsId(), gregtechId("very_hot_xenon"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("Ar", true);

        NickelNitride = new Material.Builder(getMaterialsId(), gregtechId("nickel_nitride"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("Ar", true);

        LiquidHelium = new Material.Builder(getMaterialsId(), gregtechId("liquid_helium"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        MetastableOganesson = new Material.Builder(getMaterialsId(), gregtechId("metastable_oganesson"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        VeryHotKrypton = new Material.Builder(getMaterialsId(), gregtechId("very_hot_krypton"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("Kr", true);

        SuperFluidHelium_4 = new Material.Builder(getMaterialsId(), gregtechId("super_fluid_helium_4"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        Helium_4 = new Material.Builder(getMaterialsId(), gregtechId("helium_4"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        LiquidEnrichedHelium_4 = new Material.Builder(getMaterialsId(), gregtechId("liquid_enriched_helium_4"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        Trichloroflerane = new Material.Builder(getMaterialsId(), gregtechId("trichloroflerane"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("He", true);

        NaquadahRichSterileGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_rich_sterile_growth_medium"))
                        .fluid()
                        .color(0x1A4051)
                        .build().setFormula("He", true);

        HighDensityPolyethylene = new Material.Builder(getMaterialsId(), gregtechId("high_density_polyethylene"))
                .fluid()
                .dust()
                .color(0x1A4051)
                .build().setFormula("He", true);

        LiquidNitrogen = new Material.Builder(getMaterialsId(), gregtechId("liquid_nitrogen"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("N", true);

        GraphiteOxide = new Material.Builder(getMaterialsId(), gregtechId("graphite_oxide"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("C(O2)", true);

        GrapheneOxide = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxide"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("C(O2)", true);

        GrapheneOxidationResidues = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxidation_residues"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("C(O2)", true);

        SilverBromide = new Material.Builder(getMaterialsId(), gregtechId("silver_bromides"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("C(O2)", true);

        Silane = new Material.Builder(getMaterialsId(), gregtechId("silane"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("SiCl4", true);

        VeryHotAquaRegia = new Material.Builder(getMaterialsId(), gregtechId("very_hot_aqua_regia"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("SiCl4", true);

        ChloronaquadicAcid = new Material.Builder(getMaterialsId(), gregtechId("chloronaquadic_acid"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("SiCl4", true);

        SodiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("sodium_nitrate"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("SiCl4", true);

        BariumTitanate = new Material.Builder(getMaterialsId(), gregtechId("barium_titanate"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("SiCl4", true);

        HydrogenChloride = new Material.Builder(getMaterialsId(), gregtechId("hydrogen_chloride"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMix = new Material.Builder(getMaterialsId(), gregtechId("doped_nanotube_deposition_mix"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        NanotubeDepositionMix = new Material.Builder(getMaterialsId(), gregtechId("nanotube_deposition_mix"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMixture = new Material.Builder(getMaterialsId(),
                gregtechId("doped_nanotube_deposition_mixture"))
                        .dust()
                        .color(0x1A4051)
                        .build().setFormula("HCl", true);

        CarbonNanotubes = new Material.Builder(getMaterialsId(), gregtechId("carbon_nanotubes"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        LiquidCrystalDetector = new Material.Builder(getMaterialsId(), gregtechId("liquid_crystal_detector"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        FullerenePolymerMatrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_matrix"))
                .fluid()
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        FullerenePolymerTetrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_tetrix"))
                .fluid()
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        SeaborgiumDopedNanotubes = new Material.Builder(getMaterialsId(), gregtechId("seaborgium_doped_nanotubes"))
                .fluid()
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        NaquadriaticTaranium = new Material.Builder(getMaterialsId(), gregtechId("naquadadriatic_taranium"))
                .fluid()
                .dust()
                .color(0x1A4051)
                .build().setFormula("HCl", true);

        ExtraDistilledWater = new Material.Builder(getMaterialsId(), gregtechId("extra_distilled_water"))
                .fluid()
                .color(0x1A4051)
                .build().setFormula("HCl", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
