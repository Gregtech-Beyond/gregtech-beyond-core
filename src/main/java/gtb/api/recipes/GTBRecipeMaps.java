package gtb.api.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.BlastRecipeBuilder;
import gregtech.api.recipes.builders.FuelRecipeBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

import gregtech.core.sound.GTSoundEvents;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import mezz.jei.plugins.vanilla.furnace.FuelRecipe;
import scala.sys.process.ProcessBuilderImpl;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBRecipeMaps {

    public static final RecipeMap<NoEnergyRecipeBuilder> SOLAR_THERMAL_CONCENTRATOR_RECIPES = new RecipeMap<>(
            "solar_thermal_concentrator_recipes",
            1, 0, 1, 1, new NoEnergyRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ASTRO_MINING_STATION_RECIPES = new RecipeMap<>(
            "astro_mining_station_recipes",
            4, 9, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_FURNACE_RECIPES = new RecipeMap<>(
            "vacuum_furnace_recipes",
            1, 1, 0, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BACTERIAL_VAT_RECIPES = new RecipeMap<>("bacterial_vat_recipes",
            4, 2, 6, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BEDROCK_PUMP_RECIPES = new RecipeMap<>("bedrock_pump_recipes",
            1, 0, 0, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BLACK_HOLE_COMPRESSOR_RECIPES = new RecipeMap<>(
            "black_hole_compressor_recipes",
            2, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> SOLID_FUEL_GENERATOR_RECIPES = new RecipeMap<>(
            "solid_fuel_generator_recipes",
            2, 0, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COKER_RECIPES = new RecipeMap<>("coker_recipes",
            1, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_DISTILLATION_TOWER_RECIPES = new RecipeMap<>(
            "vacuum_distillation_tower_recipes",
            1, 3, 1, 5, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DILUTION_TANK_RECIPES = new RecipeMap<>("dilution_tank_recipes",
            1, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FERMENTATION_VAT_RECIPES = new RecipeMap<>(
            "fermentation_vat_recipes",
            2, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> NEUTRON_ACCELERATOR_RECIPES = new RecipeMap<>(
            "neutron_accelerator_recipes",
            2, 3, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FISCHER_TROPSCH_REACTOR_RECIPES = new RecipeMap<>(
            "fischer_tropsch_reactor_recipes",
            2, 1, 2, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DEHYDRATOR_RECIPES = new RecipeMap<>(
            "dehydrator_recipes",
            3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> MICROSCOPE_RECIPES = new RecipeMap<>(
            "microscope_recipes",
            1, 9, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BIO_REACTOR_RECIPES = new RecipeMap<>(
            "bio_reactor_recipes",
            3, 3, 5, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ELECTROLYTIC_CELL_RECIPES = new RecipeMap<>(
            "electrolytic_cell_recipes",
            3, 4, 2, 6, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ROTARY_EVAPORATOR_RECIPES = new RecipeMap<>(
            "rotary_evaporator_recipes",
            1, 2, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> TEXTILE_FACTORY_RECIPES = new RecipeMap<>(
            "textile_factory_recipes",
            4, 1, 2, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ION_IMPLANTER_RECIPES = new RecipeMap<>("ion_implanter_recipes",
            4, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CVD_UNIT_RECIPES = new RecipeMap<>("cvd_unit_recipes",
            3, 2, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ENGRAVING_UNIT_RECIPES = new RecipeMap<>(
            "engraving_unit_recipes",
            2, 4, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CLARIFIER_RECIPES = new RecipeMap<>("clarifier_recipes",
            1, 6, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FROTH_FLOTATION_UNIT_RECIPES = new RecipeMap<>(
            "froth_flotation_unit_recipes",
            4, 4, 4, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> HIGH_TEMP_DISTILLATION_RECIPES = new RecipeMap<>(
            "high_temp_distillation_recipes",
            1, 1, 1, 12, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> POLYMERIZATION_TANK_RECIPES = new RecipeMap<>(
            "polymerization_tank_recipes",
            2, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> THERMAL_PRESS_RECIPES = new RecipeMap<>("thermal_press_recipes",
            4, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CONDENSATION_UNIT_RECIPES = new RecipeMap<>(
            "condensation_unit_recipes",
            1, 0, 2, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYOGENIC_DISTILLATION_PLANT_RECIPES = new RecipeMap<>(
            "cryogenic_distillation_plant_recipes",
            1, 1, 9, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PRESSURE_SWING_ADSORBER_RECIPES = new RecipeMap<>(
            "pressure_swing_adsorber_recipes",
            1, 1, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> RARE_GAS_STRIPPING_COLUMN_RECIPES = new RecipeMap<>(
            "rare_gas_stripping_column_recipes",
            0, 0, 3, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PHASE_SEPARATOR_RECIPES = new RecipeMap<>(
            "phase_separator_recipes",
            0, 0, 1, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DILUTION_REFRIGERATOR_RECIPES = new RecipeMap<>(
            "dilution_refrigerator_recipes",
            2, 2, 2, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> SINTERING_OVEN_RECIPES = new RecipeMap<>(
            "sintering_oven_recipes",
            2, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> GRAVITY_SEPARATOR_RECIPES = new RecipeMap<>(
            "gravity_separator_recipes", 4, 4, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ELECTRON_BEAM_LITHOGRAPHER_RECIPES = new RecipeMap<>(
            "electron_beam_lithographer_recipes", 2, 1, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ENZYMATIC_HYDROLISIS_RECIPES = new RecipeMap<>(
            "enzymatic_hydrolisis_recipes", 1, 1, 1, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_EJECTION_RECIPES = new RecipeMap<>(
            "vacuum_ejection_recipes", 1, 1, 0, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CURING_OVEN_RECIPES = new RecipeMap<>(
            "curing_oven_recipes", 2, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BURNER_REACTOR_RECIPES = new RecipeMap<>(
            "burner_reactor_recipes", 2, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DRYER_RECIPES = new RecipeMap<>(
            "dryer_recipes", 1, 2, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_CHAMBER_RECIPES = new RecipeMap<>(
            "vacuum_chamber_recipes", 4, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DECAY_CHAMBER_RECIPES  = new RecipeMap<>(
            "decay_chamber_recipes", 1, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYSTALLIZATION_RECIPES   = new RecipeMap<>(
            "crystallization_recipes", 3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ULTRAVIOLET_LAMP_CHAMBER_RECIPES   = new RecipeMap<>(
            "ultraviolet_lamp_chamber_recipes", 2, 2, 3, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYSTALLIZER_RECIPES   = new RecipeMap<>(
            "crystallization_recipes",  6, 1, 3, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CATALYTIC_REFORMER_RECIPES   = new RecipeMap<>(
            "catalytic_reformer_recipes",  1, 0, 1, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PLASMA_CVD_RECIPES  = new RecipeMap<>(
            "plasma_cvd_recipes", 2, 2, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> LASER_CVD_RECIPES  = new RecipeMap<>(
            "laser_cvd_recipes", 2, 2, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> MOLECULAR_BEAM_RECIPES   = new RecipeMap<>(
            "molecular_beam_recipes", 5, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> SONICATION_RECIPES = new RecipeMap<>(
            "sonication_recipes", 0, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYOGENIC_REACTOR_RECIPES = new RecipeMap<>(
            "cryogenic_reactor_recipes", 3, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ISA_MILL_GRINDER = new RecipeMap<>(
            "isa_mill_recipes", 3, 3, 0, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_DRYING_FURNACE_RECIPES = new RecipeMap<>(
            "vacuum_drying_furnace_recipes", 1, 9, 2, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CHEMICAL_PLANT_RECIPES   = new RecipeMap<>(
            "chemical_plant_recipes", 4, 4, 4, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ROASTER_RECIPES    = new RecipeMap<>(
            "roaster_recipes",  3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DISSOLUTION_TANK_RECIPES    = new RecipeMap<>(
            "dissolution_tank_recipes",  2, 2, 4, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COSMIC_RAY_DETECTOR_RECIPES     = new RecipeMap<>(
            "cosmic_ray_detector_recipes",  2, 3, 2, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DIGESTER_RECIPES     = new RecipeMap<>(
            "digester_recipes",  2, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FUEL_REFINE_FACTORY_RECIPES     = new RecipeMap<>(
            "fuel_refine_factory_recipes",  3, 4, 4, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PLASMA_CONDENSER_RECIPES     = new RecipeMap<>(
            "plasma_condenser_recipes",   2, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> HEAT_EXCHANGE_RECIPES     = new RecipeMap<>(
            "heat_exchanger_recipes",  0, 0, 2, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> STELLAR_FURNACE_RECIPES     = new RecipeMap<>(
            "stellar_furnace_recipes",  6, 6, 6, 6, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DIMENSIONAL_OSCILLATOR_RECIPES = new RecipeMap<>(
            "dimensional_oscillator_recipes",  3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PRECISE_ASSEMBLER_RECIPES     = new RecipeMap<>(
            "precise_assembler_recipes",  2, 2, 4, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COMPONENT_ASSEMBLER_RECIPES    = new RecipeMap<>(
            "component_assembler_recipes",  6, 1, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COMPONENT_ASSEMBLY_LINE_RECIPES     = new RecipeMap<>(
            "component_assembly_line_recipes",  12, 1, 12, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CYCLOTRON_RECIPES   = new RecipeMap<>(
            "cyclotron_recipes",  6, 1, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DRAGON_FUSION_UNIT_RECIPES     = new RecipeMap<>(
            "dragon_fusion_unit_recipes",  6, 1, 3, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> MOLECULAR_DISTILLATION_RECIPES     = new RecipeMap<>(
            "molecular_distillation_recipes",  0, true, 1, true, 1, true, 12, false, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> QUANTUM_FORCE_TRANSFORMER_RECIPES     = new RecipeMap<>(
            "quantum_force_transformer_recipes",   6, 6, 6, 6, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> NAQUADAH_REACTOR_RECIPES  = new RecipeMap<>(
            "naquadah_reactor_recipes",   0, 0, 1, 0, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> HYPER_REACTOR_MK1_RECIPES   = new RecipeMap<>(
            "hyper_reactor_mk1_recipes",   0, 0, 1, 0, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> HYPER_REACTOR_MK2_RECIPES   = new RecipeMap<>(
            "hyper_reactor_mk2_recipes",   0, 0, 1, 0, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> HYPER_REACTOR_MK3_RECIPES   = new RecipeMap<>(
            "hyper_reactor_mk3_recipes",   0, 0, 1, 0, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> HIGH_PRESSURE_STEAM_TURBINE_FUELS    = new RecipeMap<>(
            "high_pressure_steam_turbine_fuels",   0, 0, 1, 1, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> SUPERCRITICAL_STEAM_TURBINE_FUELS    = new RecipeMap<>(
            "supercritical_steam_turbine_fuels",   0, 0, 1, 1, new FuelRecipeBuilder(), false);

    public static final RecipeMap<FuelRecipeBuilder> ROCKET_ENGINE_RECIPES    = new RecipeMap<>(
            "rocket_engine_recipes",   0, 0, 1, 0, new FuelRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ALGAE_FARM = new RecipeMap<>(
            "algae_farm", 1, 6, 1, 1, new SimpleRecipeBuilder(), false);








}
