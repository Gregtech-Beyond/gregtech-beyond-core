package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class NaquadahProcessing {

    /*
     * Should be reworked once the Neutron Accelerator is added.
     */

    public static void init() {
        // Scrapped, maybe will be re-used if naquadah reactors are added.
        /*
         * CHEMICAL_RECIPES.recipeBuilder() // Enriching naquadah
         * .input(dust, Naquadah, 1)
         * .input(dust, Uranium235, 1)
         * .fluidInput(Water.getFluid(1000))
         * .fluidOutputs(NaquadahEnriched.getFluid(2000))
         * .duration(60)
         * .EUt(480)
         * .buildAndRegister()
         * 
         * CHEMICAL_RECIPES.recipeBuilder() // Enriching depleted naquadah
         * .input(dust, NaquadahEnriched, 3)
         * .fluidInput(NaquadahDepleted.getFluid(2000))
         * .fluidOutputs(EnrichedNaquadahDepleted.getFluid(5000))
         * .duration(120)
         * .EUt(480)
         * .buildAndRegister()
         */
        // ADD NAQUADAH WASTE, RARE NAQUADAH WASTE, HYDROCHLORIC-NAQUADAH SOLUTION,

        // START
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[LuV]).duration(600)
                .fluidInputs(FluoroantimonicAcid.getFluid(1500))
                .input(dust, Naquadah, 9)
                .fluidOutputs(ImpureEnrichedNaquadahSolution.getFluid(2000))
                .fluidOutputs(ImpureNaquadriaSolution.getFluid(2000))
                .fluidOutputs(NaquadahWaste.getFluid(1800))
                .fluidOutputs(RareNaquadahWaste.getFluid(200))
                .output(dust, TitaniumTrifluoride, 6)
                .buildAndRegister();

        // RECYCLYING WASTE
        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[EV]).duration(200)
                .fluidInputs(NaquadahWaste.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(NaqHydrochloricAcid.getFluid(1000))
                .output(dust, Naquadah, 1)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder().EUt(VA[EV]).duration(300)
                .fluidInputs(NaqHydrochloricAcid.getFluid(3000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .output(dustTiny, Naquadria, 1)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[IV]).duration(300)
                .fluidInputs(FluoroantimonicAcid.getFluid(2000))
                .fluidInputs(RareNaquadahWaste.getFluid(3000))
                .fluidOutputs(RareNaqFluoroantimonicAcid.getFluid(5000))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder().EUt(VA[EV]).duration(200)
                .fluidInputs(RareNaqFluoroantimonicAcid.getFluid(5000))
                .fluidOutputs(FluoroantimonicAcid.getFluid(2000))
                .output(dust, Naquadria, 1)
                .output(dust, Naquadah, 2)
                .buildAndRegister();
    }
}
