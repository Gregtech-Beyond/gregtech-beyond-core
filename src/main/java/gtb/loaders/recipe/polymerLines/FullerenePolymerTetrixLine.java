package gtb.loaders.recipe.polymerLines;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class FullerenePolymerTetrixLine {

    public static void init() {
        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(Ferrocene.getFluid(1000))
                .fluidInputs(FluorohydrideAmmoniumCarbama.getFluid(1000))
                .fluidInputs(Dichloromethane.getFluid(1000))
                .fluidInputs(Phenylpentanoicacid.getFluid(1000))
                .fluidOutputs(PCBB.getFluid(1000))
                .input(dust, Fullerene, 1)
                .input(dust, Rhodium_II_Acetate, 1)
                .notConsumable(plate, Platinum)
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidInputs(HydrofluoricAcid.getFluid(1000))
                .fluidOutputs(HydrofluoricMethane.getFluid(1000))
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrofluoricMethane.getFluid(1000))
                .fluidInputs(NitricOxide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(FluorohydrideAmmoniumCarbama.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Chlorine.getFluid(3000))
                .input(dust, Rhodium, 2)
                .output(dust, Rhodium_III_Chloride, 2)
                .blastFurnaceTemp(1900)
                .EUt(700)
                .duration(102)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(AceticAcid.getFluid(1000))
                .output(dust, Rhodium_II_Acetate)
                .input(dust, Rhodium_III_Chloride)
                .blastFurnaceTemp(2700)
                .duration(1200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PCBB.getFluid(1000))
                .input(dust, PdFullereneMatrix)
                .output(dust, FullerenePolymerTetrix)
                .duration(120)
                .EUt(800)
                .buildAndRegister();
    }
}
