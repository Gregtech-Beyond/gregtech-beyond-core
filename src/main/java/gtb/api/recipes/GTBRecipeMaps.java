package gtb.api.recipes;

import gregtech.api.recipes.RecipeMap;

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
}
