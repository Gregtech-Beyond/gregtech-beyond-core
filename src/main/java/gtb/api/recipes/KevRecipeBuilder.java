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

import gtb.api.recipes.properties.KevRecipeProperty;

public class KevRecipeBuilder extends RecipeBuilder<KevRecipeBuilder> {

    @SuppressWarnings("unused")
    public KevRecipeBuilder() {}

    @SuppressWarnings("unused")
    public KevRecipeBuilder(Recipe recipe, RecipeMap<KevRecipeBuilder> recipeMap) {
        super(recipe, recipeMap);
    }

    public KevRecipeBuilder(KevRecipeBuilder builder) {
        super(builder);
    }

    @Override
    public KevRecipeBuilder copy() {
        return new KevRecipeBuilder(this);
    }

    @NotNull
    public KevRecipeBuilder kEv(int kev) {
        if (kev <= 0) {
            GTLog.logger.error(KevRecipeProperty.KEY + " cannot be less than 0.",
                    new IllegalArgumentException());
            recipeStatus = EnumValidationResult.INVALID;
        }
        this.applyProperty(KevRecipeProperty.getInstance(), kev);
        return this;
    }

    @Override
    public ValidationResult<Recipe> build() {
        if (this.recipePropertyStorage == null) this.recipePropertyStorage = new RecipePropertyStorage();
        if (this.recipePropertyStorage.hasRecipeProperty(KevRecipeProperty.getInstance())) {
            if (this.recipePropertyStorage.getRecipePropertyValue(KevRecipeProperty.getInstance(), 0) < 0) {
                this.recipePropertyStorage.store(KevRecipeProperty.getInstance(), 0);
            }
        } else {
            this.recipePropertyStorage.store(KevRecipeProperty.getInstance(), 0);
        }
        return super.build();
    }

    @Override
    public boolean applyProperty(@NotNull String key, Object value) {
        if (key.equals(KevRecipeProperty.KEY)) {
            this.kEv(((Number) value).intValue());
            return true;
        }
        return super.applyProperty(key, value);
    }

    public int getKeV() {
        return this.recipePropertyStorage == null ? 0 :
                this.recipePropertyStorage.getRecipePropertyValue(KevRecipeProperty.getInstance(), 0);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("", getKeV())
                .toString();
    }
}
