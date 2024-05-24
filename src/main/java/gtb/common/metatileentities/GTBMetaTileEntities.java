package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.*;
import static gtb.api.utils.GTBUtil.gtb;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.api.utils.GTBUtil;
import gtb.common.metatileentities.multiblockpart.MetaTileEntityKevHatch;
import gtb.common.metatileentities.multiblocks.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    public static MetaTileEntityWaterTank WATER_TANK;
    public static MetaTileEntitySolarThermalConcentrator SOLAR_THERMAL_CONCENTRATOR;
    public static MetaTileEntityBacterialVat BACTERIAL_VAT;
    public static MetaTileEntityVacuumFurnace VACUUM_FURNACE;
    public static MetaTileEntityAstroMiningStation ASTRO_MINING_STATION;
    public static MetaTileEntityBedrockPump BEDROCK_PUMP;
    public static MetaTileEntityBlackHoleCompressor BLACK_HOLE_COMPRESSOR;
    public static MetaTileEntityCatalyticReformationUnit CATALYTIC_REFORMATION_UNIT;
    public static MetaTileEntitySolidFuelGenerator SOLID_FUEL_GENERATOR;
    public static MetaTileEntityCoker COKER;
    public static MetaTileEntityVacuumDistillationTower VACUUM_DISTILLATION_TOWER;
    public static MetaTileEntityDilutionTank DILUTION_TANK;
    public static MetaTileEntityFermentationVat FERMENTATION_VAT;
    public static MetaTileEntityFischerTropschReactor FISCHER_TROPSCH_REACTOR;
    public static MetaTileEntityBioReactor BIO_REACTOR;
    public static MetaTileEntityTextileFactory TEXTILE_FACTORY;
    public static MetaTileEntityElectrolyticCell ELECTROLYTIC_CELL;
    public static MetaTileEntityNeutronAccelerator NEUTRON_ACCELERATOR;
    public static MetaTileEntityEngravingUnit ENGRAVING_UNIT;
    public static MetaTileEntityClarifier CLARIFIER;
    public static MetaTileEntityFrothFlotationUnit FROTH_FLOTATION_UNIT;
    public static MetaTileEntityDigester DIGESTER;
    public static MetaTileEntityChemicalPlant CHEMICAL_PLANT;
    public static MetaTileEntityKevGenerator KEV_GENERATOR;

    public static SimpleMachineMetaTileEntity[] CRYSTALLIZERS = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] DEHYDRATORS = new SimpleMachineMetaTileEntity[15];
    public static MetaTileEntityKevHatch KEV_INPUT_HATCH;
    public static MetaTileEntityKevHatch KEV_OUTPUT_HATCH;
    public static SimpleMachineMetaTileEntity[] ION_IMPLANTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] CVD_UNIT = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROASTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] MICROSCOPE = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROTARY_EVAPORATOR = new SimpleMachineMetaTileEntity[15];

    public static void init() {
        // Multiblocks
        WATER_TANK = registerMetaTileEntity(3000, new MetaTileEntityWaterTank(gtb("water_tank")));
        SOLAR_THERMAL_CONCENTRATOR = registerMetaTileEntity(3001,
                new MetaTileEntitySolarThermalConcentrator(gtb("solar_thermal_concentrator")));
        BACTERIAL_VAT = registerMetaTileEntity(3002, new MetaTileEntityBacterialVat(gtb("bacterial_vat")));
        VACUUM_FURNACE = registerMetaTileEntity(3003, new MetaTileEntityVacuumFurnace(gtb("vacuum_furnace")));
        ASTRO_MINING_STATION = registerMetaTileEntity(3004,
                new MetaTileEntityAstroMiningStation(gtb("astro_mining_station")));
        BEDROCK_PUMP = registerMetaTileEntity(3005, new MetaTileEntityBedrockPump(gtb("bedrock_pump")));
        BLACK_HOLE_COMPRESSOR = registerMetaTileEntity(3006,
                new MetaTileEntityBlackHoleCompressor(gtb("black_hole_compressor")));
        CATALYTIC_REFORMATION_UNIT = registerMetaTileEntity(3007,
                new MetaTileEntityCatalyticReformationUnit(gtb("catalytic_reformation_unit")));
        SOLID_FUEL_GENERATOR = registerMetaTileEntity(3008,
                new MetaTileEntitySolidFuelGenerator(gtb("solid_fuel_generator")));
        COKER = registerMetaTileEntity(3009, new MetaTileEntityCoker(gtb("coker")));
        VACUUM_DISTILLATION_TOWER = registerMetaTileEntity(3010,
                new MetaTileEntityVacuumDistillationTower(gtb("vacuum_distillation_tower")));
        DILUTION_TANK = registerMetaTileEntity(3011, new MetaTileEntityDilutionTank(gtb("dilution_tank")));
        FERMENTATION_VAT = registerMetaTileEntity(3012, new MetaTileEntityFermentationVat(gtb("fermentation_vat")));
        FISCHER_TROPSCH_REACTOR = registerMetaTileEntity(3013,
                new MetaTileEntityFischerTropschReactor(gtb("fischer_tropsch_reactor")));
        BIO_REACTOR = registerMetaTileEntity(3014, new MetaTileEntityBioReactor(gtb("bio_reactor")));
        TEXTILE_FACTORY = registerMetaTileEntity(3015, new MetaTileEntityTextileFactory(gtb("textile_factory")));
        ELECTROLYTIC_CELL = registerMetaTileEntity(3016, new MetaTileEntityElectrolyticCell(gtb("electrolytic_cell")));
        NEUTRON_ACCELERATOR = registerMetaTileEntity(3017,
                new MetaTileEntityNeutronAccelerator(gtb("neutron_accelerator")));
        ENGRAVING_UNIT = registerMetaTileEntity(3018,
                new MetaTileEntityEngravingUnit(gtb("engraving_unit")));
        CHEMICAL_PLANT = registerMetaTileEntity(3019,
                new MetaTileEntityChemicalPlant(gtb("chemical_plant")));
        CLARIFIER = registerMetaTileEntity(3020,
                new MetaTileEntityClarifier(gtb("clarifier")));
        FROTH_FLOTATION_UNIT = registerMetaTileEntity(3021,
                new MetaTileEntityFrothFlotationUnit(gtb("froth_flotation_unit")));
        DIGESTER = registerMetaTileEntity(3022,
                new MetaTileEntityDigester(gtb("digester")));
        KEV_GENERATOR = registerMetaTileEntity(3023, new MetaTileEntityKevGenerator(gtb("kev_generator")));

        registerSimpleMetaTileEntity(
                CRYSTALLIZERS, 4012, "crystallizers",
                GTBRecipeMaps.CRYSTALLIZATION, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                DEHYDRATORS, 4028, "dehydrator",
                GTBRecipeMaps.DEHYDRATOR, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                MICROSCOPE, 4044, "microscope",
                GTBRecipeMaps.MICROSCOPE, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                ROTARY_EVAPORATOR, 4060, "rotary_evaporator",
                GTBRecipeMaps.ROTARY_EVAPORATOR, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(CVD_UNIT, 4090, "cvd_unit", GTBRecipeMaps.CVD_UNIT,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ION_IMPLANTER, 4110, "ion_implanter", GTBRecipeMaps.ION_IMPLANTER,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ROASTER, 4130, "roaster", GTBRecipeMaps.ROASTER,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        for (int i = GTValues.IV; i < GTValues.UXV; i++) {
            KEV_OUTPUT_HATCH = registerMetaTileEntity(4145 + i,
                    new MetaTileEntityKevHatch(gtb("kev_output_hatch_" + GTValues.VN[i]), i,
                            false));
            KEV_INPUT_HATCH = registerMetaTileEntity(4160 + i,
                    new MetaTileEntityKevHatch(gtb("kev_input_hatch_" + GTValues.VN[i]), i, true));
        }
    }
}
