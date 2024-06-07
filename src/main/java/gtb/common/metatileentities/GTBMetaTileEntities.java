package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.*;
import static gtb.api.utils.GTBUtil.gtb;

import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.api.utils.GTBUtil;
import gtb.common.metatileentities.multiblocks.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    public static MetaTileEntityNanoscaleFabricator NANOSCALE_FABRICATOR;
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
    public static MetaTileEntityPolymerizationTank POLYMERIZATION_TANK;
    public static MetaTileEntityThermalPress THERMAL_PRESS;
    public static MetaTileEntityHighTemperatureDistillationTower HIGH_TEMP_DISTILLATION_TOWER;
    public static MetaTileEntityCVDUnit LARGE_CVD_UNIT;
    public static MetaTileEntityCryogenicDistillationPlant CRYOGENIC_DISTILLATION_PLANT;
    public static MetaTileEntityCondensationUnit CONDENSATION_UNIT;
    public static MetaTileEntityRareGasStrippingColumn RARE_GAS_STRIPPING_COLUMN;
    public static MetaTileEntityPressureSwingAdsorber PRESSURE_SWING_ADSORBER;
    public static MetaTileEntityPhaseSeparator PHASE_SEPARATOR;
    public static MetaTileEntityDissolutionTank DISSOLUTION_TANK;
    public static MetaTileEntityBurnerReactor BURNER_REACTOR;
    public static MetaTileEntityDilutionRefrigerator DILUTION_REFRIGERATOR;
    public static MetaTileEntityGravitySeparator GRAVITY_SEPARATOR;
    public static MetaTileEntitySinteringOven SINTERING_OVEN;

    public static SimpleMachineMetaTileEntity[] CRYSTALLIZERS = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] DEHYDRATORS = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ION_IMPLANTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] CVD_UNIT = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROASTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] MICROSCOPE = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROTARY_EVAPORATOR = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] DRYER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ELECTRON_BEAM_LITHOGRAPHER = new SimpleMachineMetaTileEntity[15];

    public static void init() {
        // Multiblocks
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
        NANOSCALE_FABRICATOR = registerMetaTileEntity(3023,
                new MetaTileEntityNanoscaleFabricator(gtb("nanoscale_fabricator")));
        POLYMERIZATION_TANK = registerMetaTileEntity(3024,
                new MetaTileEntityPolymerizationTank(gtb("polymerization_tank")));
        THERMAL_PRESS = registerMetaTileEntity(3025,
                new MetaTileEntityThermalPress(gtb("thermal_press")));
        HIGH_TEMP_DISTILLATION_TOWER = registerMetaTileEntity(3026,
                new MetaTileEntityHighTemperatureDistillationTower(gtb("high_temp_distillation_tower")));
        LARGE_CVD_UNIT = registerMetaTileEntity(3027,
                new MetaTileEntityCVDUnit(gtb("large_cvd_unit")));
        CONDENSATION_UNIT = registerMetaTileEntity(3028,
                new MetaTileEntityCondensationUnit(gtb("condensation_unit")));
        CRYOGENIC_DISTILLATION_PLANT = registerMetaTileEntity(3029,
                new MetaTileEntityCryogenicDistillationPlant(gtb("cryogenic_distillation_plant")));
        RARE_GAS_STRIPPING_COLUMN = registerMetaTileEntity(3030,
                new MetaTileEntityRareGasStrippingColumn(gtb("rare_gas_stripping_column")));
        PRESSURE_SWING_ADSORBER = registerMetaTileEntity(3031,
                new MetaTileEntityPressureSwingAdsorber(gtb("pressure_swing_adsorber")));
        PHASE_SEPARATOR = registerMetaTileEntity(3032,
                new MetaTileEntityPhaseSeparator(gtb("phase_separator")));
        DISSOLUTION_TANK = registerMetaTileEntity(3033,
                new MetaTileEntityDissolutionTank(gtb("dissolution_tank")));
        BURNER_REACTOR = registerMetaTileEntity(3034,
                new MetaTileEntityBurnerReactor(gtb("burner_reactor")));
        DILUTION_REFRIGERATOR = registerMetaTileEntity(3035,
                new MetaTileEntityDilutionRefrigerator(gtb("dilution_refrigerator")));
        GRAVITY_SEPARATOR = registerMetaTileEntity(3036,
                new MetaTileEntityGravitySeparator(gtb("gravity_separator")));
        SINTERING_OVEN = registerMetaTileEntity(3037,
                new MetaTileEntitySinteringOven(gtb("sintering_oven")));

        registerSimpleMetaTileEntity(
                CRYSTALLIZERS, 4012, "crystallizers",
                GTBRecipeMaps.CRYSTALLIZATION_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                DEHYDRATORS, 4028, "dehydrator",
                GTBRecipeMaps.DEHYDRATOR_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                MICROSCOPE, 4044, "microscope",
                GTBRecipeMaps.MICROSCOPE_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                ROTARY_EVAPORATOR, 4060, "rotary_evaporator",
                GTBRecipeMaps.ROTARY_EVAPORATOR_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(CVD_UNIT, 4090, "cvd_unit", GTBRecipeMaps.CVD_UNIT_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ION_IMPLANTER, 4110, "ion_implanter", GTBRecipeMaps.ION_IMPLANTER_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ROASTER, 4130, "roaster", GTBRecipeMaps.ROASTER_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(DRYER, 4150, "dryer", GTBRecipeMaps.DRYER_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ELECTRON_BEAM_LITHOGRAPHER, 4170, "electron_beam_lithographer",
                GTBRecipeMaps.ELECTRON_BEAM_LITHOGRAPHER_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);
    }
}
