package gtb.api.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBRecipeMaps {

    public static final RecipeMap<NoEnergyRecipeBuilder> WATER_TANK = new RecipeMap<>("water_tank",
            1, 0, 0, 1, new NoEnergyRecipeBuilder(), false);

    public static final RecipeMap<NoEnergyRecipeBuilder> SOLAR_THERMAL_CONCENTRATOR = new RecipeMap<>(
            "solar_thermal_concentrator",
            1, 0, 1, 1, new NoEnergyRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ASTRO_MINING_STATION = new RecipeMap<>("astro_mining_station",
            4, 9, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_FURNACE = new RecipeMap<>("vacuum_furnace",
            1, 1, 0, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BACTERIAL_VAT = new RecipeMap<>("bacterial_vat",
            1, 1, 0, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BEDROCK_PUMP = new RecipeMap<>("bedrock_pump",
            1, 0, 0, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BLACK_HOLE_COMPRESSOR = new RecipeMap<>("black_hole_compressor",
            2, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CATALYTIC_REFORMATION_UNIT = new RecipeMap<>(
            "catalytic_reformation_unit",
            1, 1, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> SOLID_FUEL_GENERATOR = new RecipeMap<>("solid_fuel_generator",
            2, 0, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COKER = new RecipeMap<>("coker",
            1, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_DISTILLATION_TOWER = new RecipeMap<>(
            "vacuum_distillation_tower",
            1, 3, 1, 5, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DILUTION_TANK = new RecipeMap<>("dilution_tank",
            1, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FERMENTATION_VAT = new RecipeMap<>("fermentation_vat",
            2, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> NEUTRON_ACCELERATOR = new RecipeMap<>("neutron_accelerator",
            2, 3, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FISCHER_TROPSCH_REACTOR = new RecipeMap<>(
            "fischer_tropsch_reactor",
            2, 1, 2, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYSTALLIZATION = new RecipeMap<>("crystallization",
            3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DEHYDRATOR = new RecipeMap<>(
            "dehydrator",
            3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> MICROSCOPE = new RecipeMap<>(
            "microscope",
            1, 9, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> BIO_REACTOR = new RecipeMap<>(
            "bio_reactor",
            3, 3, 5, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ELECTROLYTIC_CELL = new RecipeMap<>(
            "electrolytic_cell",
            3, 4, 2, 6, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ROTARY_EVAPORATOR = new RecipeMap<>(
            "rotary_evaporator",
            1, 2, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> TEXTILE_FACTORY = new RecipeMap<>(
            "textile_factory",
            4, 1, 2, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ION_IMPLANTER = new RecipeMap<>("ion_implanter",
            4, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CVD_UNIT = new RecipeMap<>("cvd_unit",
            3, 2, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ROASTER = new RecipeMap<>("roaster",
            2, 4, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ENGRAVING_UNIT = new RecipeMap<>("engraving_unit",
            2, 4, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CHEMICAL_PLANT = new RecipeMap<>("chemical_plant",
            6, 4, 5, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CLARIFIER = new RecipeMap<>("clarifier",
            1, 6, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FROTH_FLOTATION_UNIT = new RecipeMap<>("froth_flotation_unit",
            4, 4, 4, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DIGESTER = new RecipeMap<>("digester",
            4, 4, 4, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> MOLECULAR_BEAM_RECIPES = new RecipeMap<>(
            "molecular_beam_recipes",
            4, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> HIGH_TEMP_DISTILLATION = new RecipeMap<>(
            "high_temp_distillation",
            1, 1, 1, 12, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> POLYMERIZATION_TANK = new RecipeMap<>("polymerization_tank",
            2, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> THERMAL_PRESS = new RecipeMap<>("thermal_press",
            4, 2, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CONDENSATION_UNIT = new RecipeMap<>("condensation_unit",
            1, 0, 2, 4, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYOGENIC_DISTILLATION_PLANT = new RecipeMap<>(
            "cryogenic_distillation_plant",
            1, 0, 9, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PRESSURE_SWING_ADSORBER = new RecipeMap<>(
            "pressure_swing_adsorber",
            1, 1, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> RARE_GAS_STRIPPING_COLUMN = new RecipeMap<>(
            "rare_gas_stripping_column",
            0, 0, 3, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> PHASE_SEPARATOR = new RecipeMap<>("phase_separator",
            0, 0, 1, 3, new SimpleRecipeBuilder(), false);
}
