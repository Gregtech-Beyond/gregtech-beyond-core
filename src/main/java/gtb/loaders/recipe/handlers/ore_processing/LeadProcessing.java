package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class LeadProcessing {

    public static void init() {
        EXTRACTOR_RECIPES.recipeBuilder()
                .input(dust, Galena)
                .fluidOutputs(MoltenGalena.getFluid(144))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(MoltenGalena.getFluid(144))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(MoltenOxidizedGalena.getFluid(144))
                .duration(208)
                .EUt(70)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(MoltenOxidizedGalena.getFluid(144))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .fluidOutputs(DesulfurizedMoltenGalena.getFluid(144))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        HIGH_TEMP_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(DesulfurizedMoltenGalena.getFluid(144))
                .fluidOutputs(Lead.getFluid(144))
                .fluidOutputs(Silver.getFluid(14))
                .duration(200)
                .EUt(70)
                .buildAndRegister();
    }
}
