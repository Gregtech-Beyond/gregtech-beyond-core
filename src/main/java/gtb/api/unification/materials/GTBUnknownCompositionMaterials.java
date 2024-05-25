package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.FINE;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

public class GTBUnknownCompositionMaterials {

    // Range 25201-25400
    private static int startId = 25201;
    private static final int END_ID = startId + 200;

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

        SupercooledLiquidNitrogen = new Material.Builder(getMaterialsId(), gregtechId("supercoold_liquid_nitrogen"))
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

        CrudeNeon = new Material.Builder(getMaterialsId(), gregtechId("crude_neon"))
                .fluid()
                .color(0xF9A825)
                .build();

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
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
