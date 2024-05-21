package gtb.api.recipes.properties;

import static gtb.api.recipes.properties.RecipePropertiesKey.KEV_OUTPUT;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;

import org.jetbrains.annotations.NotNull;

import gregtech.api.recipes.recipeproperties.RecipeProperty;

public class KevOutputRecipeProperty extends RecipeProperty<Integer> {

    @Override
    public String getKey() {
        return KEV_OUTPUT.name();
    }

    public static KevOutputRecipeProperty INSTANCE;

    private KevOutputRecipeProperty() {
        super(KEV_OUTPUT.name(), Integer.class);
    }

    public static KevOutputRecipeProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KevOutputRecipeProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(@NotNull Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(I18n.format("gtb.recipe." + this.getKey(), castValue(value)), x, y, color);
    }
}
