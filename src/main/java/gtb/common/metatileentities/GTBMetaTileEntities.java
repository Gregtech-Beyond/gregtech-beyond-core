package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.*;
import static gtb.api.utils.GTBUtil.gtb;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.metatileentities.MetaTileEntities;

import crafttweaker.annotations.ZenRegister;
import gtb.api.metatileentity.BasicSteamMachine;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.api.utils.GTBUtil;
import gtb.common.metatileentities.multiblocks.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.gtb.common.metatileentities.GTBMetaTileEntities")
@ZenRegister
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    private static int basicSteamRelativeId = 0;

    public static MetaTileEntityCatalyticCrackingUnit CATALYTIC_CRACKING_UNIT;
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
    public static MetaTileEntityEnzymaticHydrolysisTank ENZYMATIC_HYDROLISIS_TANK;
    public static MetaTileEntityCuringOven CURING_OVEN;
    public static MetaTileEntityVulcanizedPress VULCANIZED_PRESS;
    public static MetaTileEntityGravitySettlerTank GRAVITY_SETTLER_TANK;
    public static MetaTileEntityVisBreaker VIS_BREAKER;
    public static MetaTileEntityVacuumMetallizer VACUUM_METALLIZER;
    public static MetaTileEntityOxidationFurnace OXIDATION_FURNACE;
    public static MetaTileEntityMOCVDUnit MOCVD_UNIT;
    public static MetaTileEntityHighTemperaturePolymerizationTank HIGH_TEMP_POLYMERIZATION_TANK;
    public static MetaTileEntityElectrowinningCell ELECTROWINNING_CELL;
    public static MetaTileEntityHotTower HOT_TOWER;
    public static MetaTileEntityColdTower COLD_TOWER;
    public static MetaTileEntitySealedReactionChamber SEALED_REACTION_CHAMBER;
    public static MetaTileEntityMeteoritePredictionMatrix METEORITE_PREDICTION_MATRIX;
    public static MetaTileEntityMeteoriteMiningStation METEORITE_MINING_STATION;
    public static MetaTileEntityFractionalDistillationUnit FRACTIONAL_DISTILLATION_UNIT;

    public static SimpleMachineMetaTileEntity[] CRYSTALLIZERS = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] DEHYDRATORS = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ION_IMPLANTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] CVD_UNIT = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROASTER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] MICROSCOPE = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ROTARY_EVAPORATOR = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] DRYER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] ELECTRON_BEAM_LITHOGRAPHER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] BIO_REACTOR_SINGLE = new SimpleMachineMetaTileEntity[6];
    public static SimpleMachineMetaTileEntity[] VACUUM_EJECTOR = new SimpleMachineMetaTileEntity[4];
    public static SimpleMachineMetaTileEntity[] ION_EXCHANGE_UNIT = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] UV_LIGHT = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] FLUID_COMPRESSOR = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] PLASMA_ETCHER = new SimpleMachineMetaTileEntity[15];
    public static SimpleMachineMetaTileEntity[] SPACE_COMPONENT_ASSEMBLER = new SimpleMachineMetaTileEntity[15];

    public static final int MAX_BASIC_MACHINES = 100;
    public static BasicSteamMachine[] BASIC_STEAM_MACHINES = new BasicSteamMachine[MAX_BASIC_MACHINES];
    public static int BASIC_STEAM_MACHINES_START_ID = 10000;

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
        ENZYMATIC_HYDROLISIS_TANK = registerMetaTileEntity(3038,
                new MetaTileEntityEnzymaticHydrolysisTank(gtb("enzymatic_hydrolysis_tank")));
        CURING_OVEN = registerMetaTileEntity(3039, new MetaTileEntityCuringOven(gtb("curing_oven")));
        CATALYTIC_CRACKING_UNIT = registerMetaTileEntity(3040,
                new MetaTileEntityCatalyticCrackingUnit(gtb("catalytic_cracking_unit")));
        VULCANIZED_PRESS = registerMetaTileEntity(3041, new MetaTileEntityVulcanizedPress(gtb("vulcanized_press")));
        GRAVITY_SETTLER_TANK = registerMetaTileEntity(3042,
                new MetaTileEntityGravitySettlerTank(gtb("gravity_settler_tank")));
        VIS_BREAKER = registerMetaTileEntity(3043, new MetaTileEntityVisBreaker(gtb("vis_breaker")));
        VACUUM_METALLIZER = registerMetaTileEntity(3044, new MetaTileEntityVacuumMetallizer(gtb("vacuum_metallizer")));
        OXIDATION_FURNACE = registerMetaTileEntity(3045, new MetaTileEntityOxidationFurnace(gtb("oxidation_furnace")));
        MOCVD_UNIT = registerMetaTileEntity(3046, new MetaTileEntityMOCVDUnit(gtb("mocvd_unit")));
        HIGH_TEMP_POLYMERIZATION_TANK = registerMetaTileEntity(3047,
                new MetaTileEntityHighTemperaturePolymerizationTank(gtb("high_temp_polymerization_tank")));
        ELECTROWINNING_CELL = registerMetaTileEntity(3048,
                new MetaTileEntityElectrowinningCell(gtb("electrowinning_cell")));
        HOT_TOWER = registerMetaTileEntity(3049,
                new MetaTileEntityHotTower(gtb("hot_tower")));
        COLD_TOWER = registerMetaTileEntity(3050,
                new MetaTileEntityColdTower(gtb("cold_tower")));
        SEALED_REACTION_CHAMBER = registerMetaTileEntity(3051,
                new MetaTileEntitySealedReactionChamber(gtb("sealed_reaction_chamber")));
        METEORITE_PREDICTION_MATRIX = registerMetaTileEntity(3052,
                new MetaTileEntityMeteoritePredictionMatrix(gtb("meteorite_prediction_matrix")));
        METEORITE_MINING_STATION = registerMetaTileEntity(3053,
                new MetaTileEntityMeteoriteMiningStation(gtb("meteorite_mining_station")));
        FRACTIONAL_DISTILLATION_UNIT = registerMetaTileEntity(3054,
                new MetaTileEntityFractionalDistillationUnit(gtb("fractional_distillation_unit")));

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
                GTBRecipeMaps.MICROSCOPE_RECIPES, GTBTextures.MICROSCOPE_OVERLAY,
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
                GTBTextures.ROASTER_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(DRYER, 4150, "dryer", GTBRecipeMaps.DRYER_RECIPES,
                GTBTextures.DRYER_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(ELECTRON_BEAM_LITHOGRAPHER, 4170, "electron_beam_lithographer",
                GTBRecipeMaps.ELECTRON_BEAM_LITHOGRAPHER_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(BIO_REACTOR_SINGLE, 4190, "bio_reactor_single",
                GTBRecipeMaps.BIO_REACTOR_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(VACUUM_EJECTOR, 4200, "vacuum_ejector",
                GTBRecipeMaps.VACUUM_EJECTION_RECIPES,
                GTBTextures.DEHYDRATOR_OVERLAY, true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                ION_EXCHANGE_UNIT, 4220, "ion_exchange_unit",
                GTBRecipeMaps.ION_EXCHANGE_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                UV_LIGHT, 4240, "uv_light",
                GTBRecipeMaps.UV_LIGHT_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                FLUID_COMPRESSOR, 4260, "fluid_compressor",
                GTBRecipeMaps.FLUID_COMPRESSOR_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                PLASMA_ETCHER, 4280, "plasma_etcher",
                GTBRecipeMaps.PLASMA_ETCHER_RECIPES, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        registerSimpleMetaTileEntity(
                SPACE_COMPONENT_ASSEMBLER, 4300, "space_component_assembler",
                GTBRecipeMaps.SPACE_COMPONENT_ASSEMBLING, Textures.ASSEMBLER_OVERLAY,
                true, GTBUtil::gtb, GTUtility.hvCappedTankSizeFunction);

        /**
         * Machine ids from {@link #BASIC_STEAM_MACHINES_START_ID} are reserved for {@link #BASIC_STEAM_MACHINES}.
         * They are added via {@link #addSteamMachine(String, boolean, RecipeMap)}.
         */
    }

    @ZenMethod
    public static void addSteamMachine(String machineName, boolean isHighPressure, @NotNull RecipeMap<?> recipeMap) {
        GTBMetaTileEntities.BASIC_STEAM_MACHINES[basicSteamRelativeId] = MetaTileEntities.registerMetaTileEntity(
                GTBMetaTileEntities.BASIC_STEAM_MACHINES_START_ID + basicSteamRelativeId,
                BasicSteamMachine.addSteamMachine(machineName, isHighPressure, recipeMap));
        basicSteamRelativeId++;
    }
}
