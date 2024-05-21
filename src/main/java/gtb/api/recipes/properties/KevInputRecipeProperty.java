package gtb.api.recipes.properties;

import static gtb.api.recipes.properties.RecipePropertiesKey.KEV;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;

import org.jetbrains.annotations.NotNull;

import gregtech.api.recipes.recipeproperties.RecipeProperty;

public class KevInputRecipeProperty extends RecipeProperty<Integer> {

    @Override
    public String getKey() {
        return KEV.name();
    }

    public static KevInputRecipeProperty INSTANCE;

    private KevInputRecipeProperty() {
        super(KEV.name(), Integer.class);
    }

    public static KevInputRecipeProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KevInputRecipeProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(@NotNull Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(I18n.format("gtb.recipe." + this.getKey(), castValue(value)), x, y, color);
    }
}
