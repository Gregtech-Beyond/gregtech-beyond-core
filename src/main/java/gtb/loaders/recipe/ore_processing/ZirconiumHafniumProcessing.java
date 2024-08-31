package gtb.loaders.recipe.ore_processing;


import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gtb.api.unification.ore.GTBOrePrefix;

public class ZirconiumHafniumProcessing {

    public static void init() {
        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .input(dust, Zircon)
                .output(GTBOrePrefix.sifted, Zircon, 1)
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(GTBOrePrefix.sifted, Zircon, 4)
                .fluidOutputs(ImpureZirconSlurry.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(ImpureZirconSlurry.getFluid(1000))
                .notConsumable(dust, Iron3Chloride, 2)
                .notConsumable(dust, SodiumSulfate, 2)
                .fluidInputs(SodaAshSolution.getFluid(1000))
                .notConsumable(dust, SodiumEthylXanthate, 3)
                .fluidOutputs(ZirconSlurry.getFluid(1000))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(ZirconSlurry.getFluid(1000))
                .fluidOutputs(WasteWater.getFluid(1000))
                .output(GTBOrePrefix.floated, Zircon, 16)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .input(GTBOrePrefix.floated, Zircon, 1)
                .output(dust, FusedZircon, 3)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .input(dust, FusedZircon)
                .fluidOutputs(ZirconylChlorideSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ZirconylChlorideSolution.getFluid(1000))
                .fluidInputs(HafniumExtractionMixture.getFluid(1000))
                .fluidOutputs(PurifiedZirconylChlorideSolution.getFluid(1000))
                .fluidOutputs(HafniumExtract.getFluid(1000))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(200))
                .fluidInputs(HafniumExtract.getFluid(1000))
                .fluidOutputs(HafniumSulfateSolution.getFluid(200))
                .fluidOutputs(HafniumExtractionMixture.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(HafniumSulfateSolution.getFluid(1000))
                .fluidOutputs(SulfurTrioxide.getFluid(1000))
                .output(dust, HafniumDioxide, 2)
                .duration(200)
                .blastFurnaceTemp(1900)
                .EUt(1200)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .input(dust, HafniumDioxide, 2)
                .output(dust, Hafnium)
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(400)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(PurifiedZirconylChlorideSolution.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .output(dust, ZirconiumBase, 2)
                .duration(450)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, ZirconiumBase, 12)
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .output(dust, ZirconiumOxide, 5)
                .duration(60)
                .EUt(70)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, ZirconiumOxide, 2)
                .output(dust, Zirconium)
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(100)
                .EUt(80)
                .buildAndRegister();
    }
}
