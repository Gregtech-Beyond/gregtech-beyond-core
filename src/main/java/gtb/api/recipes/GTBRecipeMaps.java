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
            1, 0, 1, 0, new SimpleRecipeBuilder(), false);

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
            2, 1, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FISCHER_TROPSCH_REACTOR = new RecipeMap<>(
            "fischer_tropsch_reactor",
            2, 1, 2, 9, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CRYSTALLIZATION = new RecipeMap<>("crystallization",
            3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DEHYDRATOR = new RecipeMap<>("dehydrator",
            3, 3, 3, 3, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ION_IMPLANTER = new RecipeMap<>("ion_implanter",
            4, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CVD_UNIT = new RecipeMap<>("cvd_unit",
            3, 2, 2, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ROASTER = new RecipeMap<>("roaster",
            2, 4, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> ENGRAVING_UNIT = new RecipeMap<>("engraving_unit",
            2, 4, 2, 2, new SimpleRecipeBuilder(), false);
}
