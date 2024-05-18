package gtb.api.unification.materials;

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

        NovolacsPhotoresist = new Material.Builder(getMaterialsId(), gregtechId("novolacs_photoresist"))
                .fluid()
                .color(0xAF877B)
                .build();
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
