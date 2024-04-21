package gtb.api.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.GTValues;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.*;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBRecipeMaps {

    /**
     * {@link gregtech.api.recipes.RecipeMaps}
     * e.g.:
     * public static final RecipeMap<BlastRecipeBuilder> ALLOY_BLAST_RECIPES = new RecipeMap<>("alloy_blast_smelter", 9,
     * 0,
     * 3, 1, new BlastRecipeBuilder(), false)
     * .setSlotOverlay(false, false, false, GuiTextures.FURNACE_OVERLAY_1)
     * .setSlotOverlay(false, false, true, GuiTextures.FURNACE_OVERLAY_1)
     * .setSlotOverlay(false, true, false, GuiTextures.FURNACE_OVERLAY_2)
     * .setSlotOverlay(false, true, true, GuiTextures.FURNACE_OVERLAY_2)
     * .setSlotOverlay(true, true, false, GuiTextures.FURNACE_OVERLAY_2)
     * .setSlotOverlay(true, true, true, GuiTextures.FURNACE_OVERLAY_2)
     * .setSound(GTSoundEvents.FURNACE);
     */

    public static final RecipeMap<NoEnergyRecipeBuilder> WATER_TANK = new RecipeMap<>("water_tank",
            1, 0, 0, 1, new NoEnergyRecipeBuilder(), false);

    public static final RecipeMap<NoEnergyRecipeBuilder> SOLAR_THERMAL_CONCENTRATOR = new RecipeMap<>("solar_thermal_concentrator",
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

    public static final RecipeMap<SimpleRecipeBuilder> CATALYTIC_REFORMATION_UNIT = new RecipeMap<>("catalytic_reformation_unit",
            1, 1, 2, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> SOLID_FUEL_GENERATOR = new RecipeMap<>("solid_fuel_generator",
            2, 0, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> COKER = new RecipeMap<>("coker",
            1, 1, 1, 1, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> VACUUM_DISTILLATION_TOWER = new RecipeMap<>("vacuum_distillation_tower",
            1, 3, 1, 5, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> DILUTION_TANK = new RecipeMap<>("dilution_tank",
            1, 2, 1, 2, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> FERMENTATION_VAT = new RecipeMap<>("fermentation_vat",
            2, 1, 2, 1, new SimpleRecipeBuilder(), false);


    public static void init(){
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setSlotOverlay(false, true, false, GuiTextures.CENTRIFUGE_OVERLAY);
}}
