package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.FINE;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gtb.api.unification.materials.info.GTBMaterialFlags;

public class GTBUnknownCompositionMaterials {

    // Range 25201-25400
    private static int startId = 30201;
    private static final int END_ID = startId + 1000;

    public static void register() {
        // 25201 Platinum Extraction Mixture
        PlatinumExtractionMixture = new Material.Builder(getMaterialsId(), gregtechId("platinum_extraction_mixture"))
                .liquid(new FluidBuilder())
                .color(0x009688)
                .build();

        PalladiumMotherLiqour = new Material.Builder(getMaterialsId(), gregtechId("palladium_mother_liqour"))
                .liquid(new FluidBuilder())
                .color(0x6B7271)
                .build().setFormula("(NH4Cl)2(ZnCl)2(HCl4)(H2O)16", true);

        DilutedOil = new Material.Builder(getMaterialsId(), gregtechId("diluted_oil"))
                .liquid(new FluidBuilder())
                .color(0x141414)
                .build();

        DesaltedOil = new Material.Builder(getMaterialsId(), gregtechId("desalted_oil"))
                .liquid(new FluidBuilder())
                .color(0x2C2C2C)
                .build();

        SulfuricDiesel = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_diesel"))
                .liquid(new FluidBuilder())
                .color(0xA19355)
                .build();

        SulfuricGasoline = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_gasoline"))
                .liquid(new FluidBuilder())
                .color(0xA8A374)
                .build();

        SulfuricKerosene = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        SulfuricOilResidues = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_oil_residues"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        Resin = new Material.Builder(getMaterialsId(), gregtechId("resin"))
                .liquid(new FluidBuilder())
                .color(0xBBA177)
                .build();

        Kerosene = new Material.Builder(getMaterialsId(), gregtechId("kerosene"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build();

        SulfuricFuelOil = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0xFFB546)
                .build();

        FuelOil = new Material.Builder(getMaterialsId(), gregtechId("fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        SteamCrackedKerosene = new Material.Builder(getMaterialsId(), gregtechId("steam_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        HydroCrackedKerosene = new Material.Builder(getMaterialsId(), gregtechId("hydro_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        Furfural = new Material.Builder(getMaterialsId(), gregtechId("furfural"))
                .liquid(new FluidBuilder())
                .color(0x3949AB)
                .build().setFormula("C5H4O2", true);

        BTEX = new Material.Builder(getMaterialsId(), gregtechId("btex"))
                .liquid(new FluidBuilder())
                .color(0x605C35)
                .build();

        EthanolWaterAzeotrope = new Material.Builder(getMaterialsId(), gregtechId("ethanol_water_azeotrope"))
                .liquid(new FluidBuilder())
                .color(0xD88267)
                .build().setFormula("(C2H6O)91(H2O)9", true);

        FuselOil = new Material.Builder(getMaterialsId(), gregtechId("fusel_oil"))
                .liquid(new FluidBuilder())
                .color(0xa62403)
                .build();

        ImpureEthanol = new Material.Builder(getMaterialsId(), gregtechId("impure_ethanol"))
                .liquid(new FluidBuilder())
                .color(0x6F6936)
                .build();

        GrainSolution = new Material.Builder(getMaterialsId(), gregtechId("grain_solution"))
                .liquid(new FluidBuilder())
                .color(0xCDCDC8)
                .build();

        Vinegar = new Material.Builder(getMaterialsId(), gregtechId("vinegar"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        FractionC_5 = new Material.Builder(getMaterialsId(), gregtechId("fraction_c_5"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        LubricantMixture = new Material.Builder(getMaterialsId(), gregtechId("lubricant_mixture"))
                .liquid(new FluidBuilder())
                .color(0x837D4A)
                .build();

        SlackWax = new Material.Builder(getMaterialsId(), gregtechId("slack_wax"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        AlkylatedNaturalGas = new Material.Builder(getMaterialsId(), gregtechId("alkylated_natural_gas"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        Syngas = new Material.Builder(getMaterialsId(), gregtechId("syngas"))
                .liquid(new FluidBuilder())
                .color(0xE8D6D1)
                .build();

        NovolacsPhotoresist = new Material.Builder(getMaterialsId(), gregtechId("novolacs_photoresist"))
                .fluid()
                .color(0xAF877B)
                .build();

        IodizedOil = new Material.Builder(getMaterialsId(), gregtechId("iodized_oil"))
                .fluid()
                .color(0x41403C)
                .build().setFormula("I?", true);

        IodizedBrine = new Material.Builder(getMaterialsId(), gregtechId("iodized_brine"))
                .fluid()
                .color(0x535147)
                .build().setFormula("I?", true);

        IodineSlurry = new Material.Builder(getMaterialsId(), gregtechId("iodine_slurry"))
                .fluid()
                .color(0x2B2E43)
                .build().setFormula("I??", true);

        BrominatedBrine = new Material.Builder(getMaterialsId(), gregtechId("brominated_brine"))
                .fluid()
                .color(0xE79E9D)
                .build().setFormula("I??", true);

        Brine = new Material.Builder(getMaterialsId(), gregtechId("brine"))
                .fluid()
                .color(0xFDE785)
                .build().setFormula("I??", true);

        CrudeBromineSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_bromine_solution"))
                .fluid()
                .color(0xD29898)
                .build().setFormula("I??", true);

        ConcentratedBrine = new Material.Builder(getMaterialsId(), gregtechId("concentrated_brine"))
                .fluid()
                .color(0xDBCF99)
                .build().setFormula("Br?", true);

        Brine = new Material.Builder(getMaterialsId(), gregtechId("brine"))
                .fluid()
                .color(0xa88539)
                .build().setFormula("?", true);

        CrudeBromineSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_bromine_solution"))
                .fluid()
                .color(0xeb5a21)
                .build().setFormula("H2SO4Br(H2O)Cl", true);

        ConcentratedBrine = new Material.Builder(getMaterialsId(), gregtechId("concentrated_brine"))
                .fluid()
                .color(0xebc221)
                .build().setFormula("?", true);

        BedrockContaminatedOil = new Material.Builder(getMaterialsId(), gregtechId("bedrock_contaminated_oil"))
                .fluid()
                .color(0x888D83)
                .build();

        Perfluorotributylamine = new Material.Builder(getMaterialsId(), gregtechId("perfluorotributylamine"))
                .fluid()
                .color(0x80638B)
                .build();

        BedrockSlurry = new Material.Builder(getMaterialsId(), gregtechId("bedrock_slurry"))
                .fluid()
                .color(0x383739)
                .build();

        PurifiedBedrockSlurry = new Material.Builder(getMaterialsId(), gregtechId("purified_bedrock_slurry"))
                .fluid()
                .color(0x2D2B2E)
                .build();

        AdamantaneRichOilSolution = new Material.Builder(getMaterialsId(), gregtechId("adamantane_rich_oil_solution"))
                .fluid()
                .color(0x516B95)
                .build();

        LiquidOzone = new Material.Builder(getMaterialsId(), gregtechId("liquid_ozone"))
                .fluid()
                .color(0x0288D1)
                .build();

        TriniumSolution = new Material.Builder(getMaterialsId(), gregtechId("trinium_solution"))
                .fluid()
                .color(0xB8BCBE)
                .build();

        AdamantiumPentoxide = new Material.Builder(getMaterialsId(), gregtechId("adamantiun_pentoxide"))
                .fluid()
                .dust()
                .color(0x04273B)
                .build();

        AdamantiumPhosphorusHydrogenPlasma = new Material.Builder(getMaterialsId(),
                gregtechId("admantium_phosphorus_hydrogen_plasma"))
                        .plasma()
                        .color(0x1B4F6B)
                        .build();

        GaseousAdamantane = new Material.Builder(getMaterialsId(), gregtechId("gaseous_adamantane"))
                .fluid()
                .color(0x5C7786)
                .build();

        MoltenAdamantiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("molten_adamantium_dioxide"))
                .fluid()
                .color(0x0F374C)
                .build();

        MithrilFluoride = new Material.Builder(getMaterialsId(), gregtechId("mithril_fluoride"))
                .fluid()
                .color(0x0F5A83)
                .build();

        AdamantaneLubricant = new Material.Builder(getMaterialsId(), gregtechId("adamantane_lubricant"))
                .fluid()
                .color(0xB3AC87)
                .build();

        IodizedOil = new Material.Builder(getMaterialsId(), gregtechId("iodized_oil"))
                .fluid()
                .color(0x32312F)
                .build();

        WetBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("wet_bedrock_dust"))
                .dust()
                .color(0x121212)
                .build();

        OilyBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("oily_bedrock_dust"))
                .dust()
                .color(0x7A7D7F)
                .build();

        FineBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("fine_bedrock_dust"))
                .dust()
                .color(0x010101)
                .build();

        Adamantite = new Material.Builder(getMaterialsId(), gregtechId("adamantite"))
                .dust()
                .color(0x27374F)
                .build();

        EnrichedNaquadahNitrate = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_nitrate"))
                .dust()
                .color(0x212121)
                .build();

        NaquadriaNitrate = new Material.Builder(getMaterialsId(), gregtechId("naquadria_nitrate"))
                .dust()
                .color(0x1C1C1E)
                .build();

        PrecipitateMithril = new Material.Builder(getMaterialsId(), gregtechId("precipitate_mithril"))
                .dust()
                .color(0x0277BD)
                .build();

        RoughenMithril = new Material.Builder(getMaterialsId(), gregtechId("roughen_mithril"))
                .dust()
                .color(0x7DAAC4)
                .build();

        ExcitedRoughenMithril = new Material.Builder(getMaterialsId(), gregtechId("excited_roughen_mithril"))
                .dust()
                .color(0x667F8E)
                .build();

        ExcitedMithril = new Material.Builder(getMaterialsId(), gregtechId("excited_mithril"))
                .dust()
                .color(0x75AACA)
                .build();

        Mithril = new Material.Builder(getMaterialsId(), gregtechId("mithril"))
                .dust()
                .color(0x0478BC)
                .build();

        GrainsOfInfinity = new Material.Builder(getMaterialsId(), gregtechId("grains_of_infinity"))
                .dust()
                .color(0x292B2C)
                .build();

        MolybdenumFlue = new Material.Builder(getMaterialsId(), gregtechId("molybdenum_flue"))
                .fluid()
                .color(0x39194A)
                .build();

        TraceRheniumFlue = new Material.Builder(getMaterialsId(), gregtechId("trace_rhenium_flue"))
                .fluid()
                .color(0x96D6D5)
                .build();

        CrudeZinc = new Material.Builder(getMaterialsId(), gregtechId("crude_zinc"))
                .fluid()
                .color(0xF3F3F3)
                .build();

        CadmiumRichZinc = new Material.Builder(getMaterialsId(), gregtechId("cadmium_rich_zinc"))
                .fluid()
                .color(0x7A787B)
                .build();

        ChalcogenAnodeMud = new Material.Builder(getMaterialsId(), gregtechId("chalcogen_anode_mud"))
                .dust().color(0x8A3324)
                .iconSet(FINE)
                .build();

        BlueVitriol = new Material.Builder(getMaterialsId(), gregtechId("blue_vitriol"))
                .fluid()
                .color(0x1565C0)
                .build();

        ColdAir = new Material.Builder(getMaterialsId(), gregtechId("cold_air"))
                .fluid()
                .color(0xBBDEFB)
                .build();

        SupercooledLiquidNitrogen = new Material.Builder(getMaterialsId(), gregtechId("supercooled_liquid_nitrogen"))
                .fluid()
                .color(0x4FC3F7)
                .build();

        UntreatedLiquidOxygen = new Material.Builder(getMaterialsId(), gregtechId("untreated_liquid_oxygen"))
                .fluid()
                .color(0x6CA4BE)
                .build();

        ColdWasteGasouesNitrogen = new Material.Builder(getMaterialsId(), gregtechId("cold_waste_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build();

        ColdGasouesNitrogen = new Material.Builder(getMaterialsId(), gregtechId("cold_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build();

        ArgonRichGas = new Material.Builder(getMaterialsId(), gregtechId("argon_rich_gas"))
                .fluid()
                .color(0x6B976D)
                .build();

        CrudeArgonVapor = new Material.Builder(getMaterialsId(), gregtechId("crude_argon_vapor"))
                .fluid()
                .color(0x388E3C)
                .build();

        SupercooledOxygen = new Material.Builder(getMaterialsId(), gregtechId("supercooled_oxygen"))
                .fluid()
                .color(0x32312F)
                .build();

        LiquidWasteNitrogen = new Material.Builder(getMaterialsId(), gregtechId("liquid_waste_nitrogen"))
                .fluid()
                .color(0x29B6F6)
                .build();

        RareGasRichGaseousNitrogen = new Material.Builder(getMaterialsId(),
                gregtechId("rare_gas_rich_gaseous_nitrogen"))
                        .fluid()
                        .color(0x7E57C2)
                        .build();

        RareGasMixture = new Material.Builder(getMaterialsId(), gregtechId("rare_gas_mixture"))
                .fluid()
                .color(0x8F78B6)
                .build();

        LiquidKrypton = new Material.Builder(getMaterialsId(), gregtechId("liquid_krypton"))
                .fluid()
                .color(0x0277BD)
                .build();

        NitrogenStrippedRareGasMixture = new Material.Builder(getMaterialsId(),
                gregtechId("nitrogen_stripped_rare_gas_mixture"))
                        .fluid()
                        .color(0x7B1FA2)
                        .build();

        CrudeKrypton = new Material.Builder(getMaterialsId(), gregtechId("crude_krypton"))
                .fluid()
                .color(0x81C784)
                .build();

        UEVSuperconductor = new Material.Builder(getMaterialsId(), gregtechId("uev_superconductor"))
                .fluid()
                .dust()
                .color(0x29B6F6)
                .build().setFormula("?", true);

        ZBLAN = new Material.Builder(getMaterialsId(), gregtechId("zblan"))
                .fluid()
                .dust()
                .color(0xE0E1E1)
                .build().setFormula("?", true);

        PlatinumSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_solution"))
                .fluid()
                .color(0xFAF3BD)
                .build().setFormula("Pt??", true);

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

        CrudeNeon = new Material.Builder(getMaterialsId(), gregtechId("crude_neon"))
                .fluid()
                .color(0xF9A825)
                .build();

        LiquidCrystalDetector = new Material.Builder(getMaterialsId(), gregtechId("liquid_crystal_detector"))
                .fluid()
                .color(0x9C27B0)
                .build().setFormula("?", true);

        CrudeHelium = new Material.Builder(getMaterialsId(), gregtechId("crude_helium"))
                .fluid()
                .color(0xDCE775)
                .build();

        CrudeXenon = new Material.Builder(getMaterialsId(), gregtechId("crude_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build();

        CrudeArgon = new Material.Builder(getMaterialsId(), gregtechId("crude_argon"))
                .fluid()
                .color(0x9CCC65)
                .build();

        PartiallyLiquidKrypton = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_krypton"))
                .fluid()
                .color(0x81C784)
                .build();

        PartiallyLiquidNeon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_neon"))
                .fluid()
                .color(0xF9A825)
                .build();

        PartiallyLiquidHelium = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_helium"))
                .fluid()
                .color(0xDCE775)
                .build();

        PartiallyLiquidXenon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build();

        PartiallyLiquidArgon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_argon"))
                .fluid()
                .color(0x9CCC65)
                .build();

        LiquidArgon = new Material.Builder(getMaterialsId(), gregtechId("liquid_argon"))
                .fluid()
                .color(0x689F38)
                .build();

        LiquidNeon = new Material.Builder(getMaterialsId(), gregtechId("liquid_neon"))
                .fluid()
                .color(0xFF8F00)
                .build();

        ColdGaseousOxygen = new Material.Builder(getMaterialsId(), gregtechId("cold_gaseous_oxygen"))
                .fluid()
                .color(0xFF8F00)
                .build();

        LiquidOxygen = new Material.Builder(getMaterialsId(), gregtechId("liquid_oxygen"))
                .fluid()
                .color(0x2196F3)
                .build();

        DarmstadtiumCatalyst = new Material.Builder(getMaterialsId(), gregtechId("darmstadtium_catalyst"))
                .dust()
                .color(0x333537)
                .build().setFormula("?", true);

        SaltFreeBrine = new Material.Builder(getMaterialsId(), gregtechId("salt_free_brine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        BoronFreeSolution = new Material.Builder(getMaterialsId(), gregtechId("boron_free_solution"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        AlkylatedAdamantanes = new Material.Builder(getMaterialsId(), gregtechId("alkylated_adamantanes"))
                .fluid()
                .color(0x3949AB)
                .build().setFormula("C10H16(?)", true);

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

        CalcinatedBastnasite = new Material.Builder(getMaterialsId(), gregtechId("calcinated_bastnasite"))
                .dust()
                .color(0x944C36).build().setFormula("?", true);

        DehydrogenationCatalyst = new Material.Builder(getMaterialsId(), gregtechId("dehydragenation_catalyst"))
                .dust()
                .color(0xFFB74D).build().setFormula("?", true);

        RhodiumFilterCake = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        RhodiumFilterCakeSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        SamariumRareEarthConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("samarium_rare_earth_concentrate"))
                        .dust()
                        .color(0xC4C3BB).build().setFormula("SmO?", true);

        BastnasiteConcentrate = new Material.Builder(getMaterialsId(), gregtechId("bastnasite_concentrate"))
                .fluid()
                .color(0xD38973).build();

        CeriumRichBastnasiteConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("cerium_rich_bastnasite_concentrate"))
                        .fluid()
                        .color(0x6D2712).build();

        AcidicBastnasiteConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("acidic_bastnasite_concentrate"))
                        .fluid()
                        .color(0xAF662E).build();

        AcidicCeriumBasedMud = new Material.Builder(getMaterialsId(), gregtechId("acidic_cerium_based_mud"))
                .fluid()
                .color(0x984A0F).build().setFormula("Ce?", true);

        BastnasiteRarerEarthOxidesMixture = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_mixture"))
                        .fluid()
                        .color(0x826D67).build();

        DriedBastnasiteRarerEarthOxidesPulp = new Material.Builder(getMaterialsId(),
                gregtechId("dried_bastnasite_rarer_earth_oxides_pulp"))
                        .fluid()
                        .color(0x4E1B0C).build();

        BastnasiteRarerEarthOxidesEmulsion = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_emulsion"))
                        .fluid()
                        .color(0x8E6254).build();

        BastnasiteRarerEarthOxidesSolution = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_solution"))
                        .fluid()
                        .color(0x66210C).build();

        SamariumReducedRarerEarthOxides = new Material.Builder(getMaterialsId(),
                gregtechId("samarium_reduced_rarer_earth_oxides"))
                        .fluid()
                        .color(0x623324).build();

        CeriumSolution = new Material.Builder(getMaterialsId(), gregtechId("cerium_solution"))
                .fluid()
                .color(0xABB59E).build().setFormula("Ce?", true);

        DriedMonaziteFiltrate = new Material.Builder(getMaterialsId(), gregtechId("dried_monazite_filtrate"))
                .dust()
                .color(0x677753).build();

        CeriumOxideFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide_filtrate"))
                .dust()
                .color(0x689F38).build().setFormula("CeO2?", true);

        ThoriumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("thorium_concentrate"))
                .dust()
                .color(0x354D21).build().setFormula("ThU?", true);

        RareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_filtrate"))
                .dust()
                .color(0x6C6C6B).build().setFormula("REE?", true);

        ChlorinatedMonaziteFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("chlorinated_monazite_filtrate"))
                        .dust()
                        .color(0x345727).build().setFormula("?", true);

        SaturatedChlorinatedMonaziteFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("saturated_chlorinated_monazite_filtrate"))
                        .dust()
                        .color(0x00695C).build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("monazite_sulfide"))
                .dust()
                .color(0x2A3426).build().setFormula("?", true);

        ThoriumPhosphateCake = new Material.Builder(getMaterialsId(), gregtechId("thorium_phoshpate_cake"))
                .dust()
                .color(0x1B5E20).build().setFormula("?", true);

        UraniumFiltrate = new Material.Builder(getMaterialsId(), gregtechId("uranium_filtrate"))
                .dust()
                .color(0x1D4E20).build().setFormula("U?", true);

        ZieglerAlfolMixture = new Material.Builder(getMaterialsId(), gregtechId("ziegler_alfol_mixture"))
                .fluid()
                .color(0x424C5A).build().setFormula("?", true);

        MonaziteOreByproductSlurry = new Material.Builder(getMaterialsId(), gregtechId("monazite_ore_byproduct_slurry"))
                .fluid()
                .color(0x436436).build().setFormula("??", true);

        ImpureMonaziteOreByproductSlurry = new Material.Builder(getMaterialsId(),
                gregtechId("impure_monazite_ore_byproduct_slurry"))
                        .fluid()
                        .color(0x33691E).build().setFormula("?2", true);

        MuddyMonaziteOreByproducts = new Material.Builder(getMaterialsId(), gregtechId("muddy_monazite_ore_byproducts"))
                .dust()
                .color(0x5C423A).build().setFormula("???", true);

        CeriumOxideFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide_filtrate"))
                .fluid()
                .color(0x43A047).build().setFormula("CeO2?", true);

        CooledRareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cooled_rare_earth_filtrate"))
                .fluid()
                .color(0x936E62).build().setFormula("??", true);

        NeutralizedRareEarthFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("neutralized_rare_earth_filtrate"))
                        .fluid()
                        .color(0x7F5E54).build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("monazite_sulfide"))
                .fluid()
                .color(0x009688).build().setFormula("??", true);

        RareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_filtrate"))
                .fluid()
                .color(0x6B524B).build().setFormula("???", true);

        DilutedMonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("diluted_monazite_sulfide"))
                .fluid()
                .color(0x388E3C).build().setFormula("??", true);

        MonaziteSolution = new Material.Builder(getMaterialsId(), gregtechId("monazite_solution"))
                .fluid()
                .color(0x388E3C).build().setFormula("?", true);

        MuddyMonaziteSolution = new Material.Builder(getMaterialsId(), gregtechId("muddy_monazite_solution"))
                .fluid()
                .color(0x652A18).build().setFormula("??", true);

        SodiumSalts = new Material.Builder(getMaterialsId(), gregtechId("sodium_salts"))
                .dust()
                .color(0x30345E)
                .build().setFormula("NaCl?", true);

        NaquadriaticCompound = new Material.Builder(getMaterialsId(), gregtechId("naquadriatic_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("*Nq*?", true);

        EnrichedNaquadahCompound = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("Nq+?", true);

        LeachResidue = new Material.Builder(getMaterialsId(), gregtechId("leach_residues"))
                .dust()
                .color(0x8D8333)
                .build().setFormula("Ir2??", true);

        NaquadahRichSterileGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_rich_sterile_growth_medium"))
                        .fluid()
                        .color(0x272529)
                        .build();

        MuddyBastnasiteSolution = new Material.Builder(getMaterialsId(), gregtechId("muddy_bastnasite_solution"))
                .fluid()
                .color(0x926F64).build();

        ConditionedBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("conditioned_bastnasite_mud"))
                .fluid()
                .color(0x5B210F).build();

        DilutedBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("diluted_bastnasite_mud"))
                .fluid()
                .color(0x973314).build();

        FilteredBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("filtered_bastnasite_mud"))
                .fluid()
                .color(0xAB7564).build();

        MonaziteRarerEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("monazite_rarer_earth_filtrate"))
                .dust()
                .color(0x758A6C).build();

        AmidoEthylAlkylImidazole = new Material.Builder(getMaterialsId(), gregtechId("amido_ethyl_alkyl_imidazole"))
                .fluid()
                .color(0x442A62).build();

        PolymerizedStyreneButadieneSolution = new Material.Builder(getMaterialsId(),
                gregtechId("polymerized_styrene_butadiene_solution"))
                        .fluid()
                        .color(0x454545)
                        .build();

        DinitrobenzeneMixture = new Material.Builder(getMaterialsId(), gregtechId("dinitrobenzene_mixture"))
                .dust()
                .color(0x599B5D).build();

        NomexPolymerizationBase = new Material.Builder(getMaterialsId(), gregtechId("nomex_polymerization_base"))
                .fluid()
                .color(0x791BFF).build();

        PolymerizationReadyZylon = new Material.Builder(getMaterialsId(), gregtechId("polymerization_ready_zylon"))
                .dust()
                .color(0xD2A842).build();

        RarerEarthConcentrate = new Material.Builder(getMaterialsId(), gregtechId("rarer_earth_concentrate"))
                .fluid()
                .color(0x593F37).build();

        OxidizedOrthoXyleneMixture = new Material.Builder(getMaterialsId(), gregtechId("oxidized_ortho_xylene_mixture"))
                .fluid()
                .color(0x555555).build();

        CooledOrthoXyleneMixture = new Material.Builder(getMaterialsId(), gregtechId("cooled_ortho_xylene_mixture"))
                .fluid()
                .color(0x4C4C4C).build();

        ManganeseSulfate = new Material.Builder(getMaterialsId(), gregtechId("manganese_sulfate"))
                .dust()
                .color(0xDBD180).build().setFormula("MgSO2", true);

        Rhodocrosite = new Material.Builder(getMaterialsId(), gregtechId("rhodocrosite"))
                .dust()
                .color(0xC62828).build().setFormula("MnCO3", true);

        CassiteriteCokePellets = new Material.Builder(getMaterialsId(), gregtechId("cassiterite_coke_pellets"))
                .dust()
                .color(0x414040).build().setFormula("SnO2C?", true);

        TinSlag = new Material.Builder(getMaterialsId(), gregtechId("tin_slag"))
                .dust()
                .color(0xADAAAA).build().setFormula("NbTa?", true);

        NbTaContainingDust = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_containing_dust"))
                .dust()
                .color(0x8E7C7C).build().setFormula("NbTa?", true);

        NiobiumTantalumOxide = new Material.Builder(getMaterialsId(), gregtechId("niobium_tantalum_dust"))
                .dust()
                .color(0xC66262).build().setFormula("(Nb2O5)(Ta2O5)", true);

        AluminiumTrifluoride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_trifluoride"))
                .dust()
                .color(0x1976D2).build().setFormula("AlF3", true);

        SiliconFluoride = new Material.Builder(getMaterialsId(), gregtechId("silicon_fluoride"))
                .fluid()
                .color(0x818A91).build().setFormula("SiF2", true);

        NbTaFluorideMix = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_fluoride_mix"))
                .fluid()
                .color(0x786158).build().setFormula("(H2NbOF5)(H2TaF7)", true);

        BariumOxide = new Material.Builder(getMaterialsId(), gregtechId("barium_oxide"))
                .dust()
                .color(0xC86B69).build().setFormula("BaO2", true);

        BariumPeroxide = new Material.Builder(getMaterialsId(), gregtechId("barium_peroxide"))
                .dust()
                .color(0x9C3734).build().setFormula("BaO5", true);

        Columbite = new Material.Builder(getMaterialsId(), gregtechId("columbite"))
                .dust()
                .ore()
                .flags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED)
                .color(0xFDD835).build().setFormula("FeNb2O6", true);

        Celestine = new Material.Builder(getMaterialsId(), gregtechId("celestine"))
                .dust()
                .ore()
                .flags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED)
                .color(0xA7CFF1).build().setFormula("SrSO4", true);

        FusedColumbite = new Material.Builder(getMaterialsId(), gregtechId("fused_columbite"))
                .dust()
                .color(0xB3A460).build().setFormula("(Fe2O3)(NaO)Nb2O5", true);

        ColumbiteMinorOxideResidue = new Material.Builder(getMaterialsId(), gregtechId("columbite_minor_oxide_residue"))
                .dust()
                .color(0x8B7B33).build().setFormula("(BaO)(SnO2)(WO3)(Al2O3)", true);

        LeachedColumbite = new Material.Builder(getMaterialsId(), gregtechId("leached_columbite"))
                .dust()
                .color(0x9E925E).build().setFormula("(Nb2O5)9Ta2O5?", true);

        IronSulfate = new Material.Builder(getMaterialsId(), gregtechId("iron_sulfate"))
                .dust()
                .color(0xFFF176).build().setFormula("FeSO4", true);

        SodiumSulfate = new Material.Builder(getMaterialsId(), gregtechId("sodium_sulfate"))
                .dust()
                .color(0x2A6E8D).build().setFormula("Na2SO4", true);

        TantaliteMinorOxideResidue = new Material.Builder(getMaterialsId(), gregtechId("tantalite_minor_oxide_residue"))
                .dust()
                .color(0xFDD835).build().setFormula("(BaO)(ZrO2)(TiO2)(SiO2)", true);

        FluoroniobicAcid = new Material.Builder(getMaterialsId(), gregtechId("fluoroniobic_acid"))
                .fluid()
                .color(0x7CB342).build().setFormula("NbHF7", true);

        FusedTantalite = new Material.Builder(getMaterialsId(), gregtechId("fused_tantalite"))
                .dust()
                .color(0x57382F).build().setFormula("(Fe2O3)(NaO)Ta2O5", true);

        LeachedTantalite = new Material.Builder(getMaterialsId(), gregtechId("leached_tantalite"))
                .dust()
                .color(0x5A200E).build().setFormula("(Ta2O5)9Nb2O5?", true);

        CubicZirconia = new Material.Builder(getMaterialsId(), gregtechId("cubic_zirconia"))
                .dust()
                .gem()
                .color(0xDECAE1).build().setFormula("ZrO2", true);

        AcidicLeachedPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("acidic_leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(H2SO4)Ca12Sr6Ba6?ThUNb26O78F26", true);

        LeachedPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(Nb2O5)9Ta2O5?", true);

        PotasssiumFluoroNiobate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoro_niobate"))
                .dust()
                .color(0x72FF86).build().setFormula("K2NbF7", true);

        FluorotantalicAcid = new Material.Builder(getMaterialsId(), gregtechId("fluorotantalic_acid"))
                .fluid()
                .color(0x7CB342).build().setFormula("TaHF7", true);

        TributylPhosphate = new Material.Builder(getMaterialsId(), gregtechId("tributyl_phosphate"))
                .fluid()
                .color(0x8E422B).build().setFormula("(C4H9)3PO4", true);

        MethylIsobutylKetone = new Material.Builder(getMaterialsId(), gregtechId("methyl_isobutyl_ketone"))
                .fluid()
                .color(0x20FF2E).build().setFormula("C6H12O", true);

        NbTaSeparationMixture = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_separation_mixture"))
                .fluid()
                .color(0xFFA078).build().setFormula("C18H39O5P", true);

        OxypentafluoroNiobate = new Material.Builder(getMaterialsId(), gregtechId("oxypentafluoro_niobate"))
                .fluid()
                .color(0x70FF5E).build().setFormula("H2NbOF5", true);

        HeptafluoroTantalate = new Material.Builder(getMaterialsId(), gregtechId("heptafluoro_tantalite"))
                .fluid()
                .color(0x2AFF5E).build().setFormula("H2TaF7", true);

        PotasssiumFluoroTantalate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoro_tantalite"))
                .dust()
                .color(0x00DC51).build().setFormula("K2TaF7", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
