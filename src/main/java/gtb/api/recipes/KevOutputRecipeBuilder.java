package gtb.api.recipes;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jetbrains.annotations.NotNull;

import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.recipeproperties.RecipePropertyStorage;
import gregtech.api.util.EnumValidationResult;
import gregtech.api.util.GTLog;
import gregtech.api.util.ValidationResult;

import gtb.api.recipes.properties.KevOutputRecipeProperty;
import gtb.api.recipes.properties.RecipePropertiesKey;

public class KevOutputRecipeBuilder extends RecipeBuilder<KevOutputRecipeBuilder> {

    @SuppressWarnings("unused")
    public KevOutputRecipeBuilder() {}

    @SuppressWarnings("unused")
    public KevOutputRecipeBuilder(Recipe recipe, RecipeMap<KevOutputRecipeBuilder> recipeMap) {
        super(recipe, recipeMap);
    }

    public KevOutputRecipeBuilder(KevOutputRecipeBuilder builder) {
        super(builder);
    }

    @Override
    public KevOutputRecipeBuilder copy() {
        return new KevOutputRecipeBuilder(this);
    }

    @NotNull
    public KevOutputRecipeBuilder outputKeV(int kev) {
        if (kev <= 0) {
            GTLog.logger.error(RecipePropertiesKey.KEV_OUTPUT + " cannot be less than or equal to 0",
                    new IllegalArgumentException());
            recipeStatus = EnumValidationResult.INVALID;
        }
        this.applyProperty(KevOutputRecipeProperty.getInstance(), kev);
        return this;
    }

    @Override
    public ValidationResult<Recipe> build() {
        if (this.recipePropertyStorage == null) this.recipePropertyStorage = new RecipePropertyStorage();
        if (this.recipePropertyStorage.hasRecipeProperty(KevOutputRecipeProperty.getInstance())) {
            if (this.recipePropertyStorage.getRecipePropertyValue(KevOutputRecipeProperty.getInstance(), 0) <= 0) {
                this.recipePropertyStorage.store(KevOutputRecipeProperty.getInstance(), 0);
            }
        } else {
            this.recipePropertyStorage.store(KevOutputRecipeProperty.getInstance(), 0);
        }
        return super.build();
    }

    @Override
    public boolean applyProperty(@NotNull String key, Object value) {
        if (key.equals(RecipePropertiesKey.KEV_OUTPUT.name())) {
            this.outputKeV(((Number) value).intValue());
            return true;
        }
        return super.applyProperty(key, value);
    }

    public int getKeV() {
        return this.recipePropertyStorage == null ? 0 :
                this.recipePropertyStorage.getRecipePropertyValue(KevOutputRecipeProperty.getInstance(), 0);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("", getKeV())
                .toString();
    }
}
