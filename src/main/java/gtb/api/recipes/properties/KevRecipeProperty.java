package gtb.api.recipes.properties;

import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import org.jetbrains.annotations.NotNull;

public class KevRecipeProperty extends RecipeProperty<Integer> {

    public static final String KEY = "kev";
    public static KevRecipeProperty INSTANCE;

    private KevRecipeProperty() {
        super(KEY, Integer.class);
    }

    public static KevRecipeProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KevRecipeProperty();
        }
        return INSTANCE;
    }

    @Override
    public void drawInfo(@NotNull Minecraft minecraft, int x, int y, int color, Object value) {
        minecraft.fontRenderer.drawString(I18n.format("gtb.recipe." + KEY, castValue(value)), x, y, color);
    }
}
