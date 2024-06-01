package gtb.loaders.recipe.handlers.ore_processing;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class PitchblendeProcessing {

    public static void init() {

        MIXER_RECIPES.recipeBuilder()
                .fluidOutputs(ImpurePitchblendeSlurry.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .input(dust, Pitchblende, 4)
                .duration(290)
                .EUt(700)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(ImpurePitchblendeSlurry.getFluid(1000))
                .notConsumable(dust, CalciumDioxide, 2)
                .notConsumable(SodiumIsopropylXanthate.getFluid(1000))
                .notConsumable(MethylIsobutylCarbonyl.getFluid(1000))
                .fluidOutputs(PitchblendeSlurry.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(PitchblendeSlurry.getFluid(1000))
                .fluidOutputs(WasteWater.getFluid(1000))
                .output(dust, PitchblendeFiltrate, 2)
                .output(dust, UraniumThoriumFiltrate, 2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, PitchblendeFiltrate)
                .output(dust, LeadMetallicPowder)
                .output(dust, UraniumMetallicPowder)
                .duration(200)
                .EUt(200)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, UraniumMetallicPowder)
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .output(dust, UraniumResidues)
                .output(dust, Uraninite)
                .duration(200)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(UraniumExtractionMixture.getFluid(1000))
                .input(dust, Uraninite, 2)
                .fluidOutputs(UraniniteExtract.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(UraniniteExtract.getFluid(1000))
                .fluidOutputs(UranylSulfide.getFluid(1000))
                .fluidOutputs(UraniumExtractionMixture.getFluid(1000))
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(UranylSulfide.getFluid(1000))
                .fluidOutputs(AmmoniaSulfateSolution.getFluid(1000))
                .output(dust, UraniumDioxide, 3)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Fluorine.getFluid(2000))
                .input(dust, UraniumDioxide, 2)
                .fluidInputs(HydrofluoricAcid.getFluid(4000))
                .fluidOutputs(UraniumHexafluoride.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Kerosene.getFluid(1000))
                .fluidInputs(TributylPhosphate.getFluid(100))
                .input(dust, PhosphorusPentoxide, 5)
                .fluidOutputs(UraniumExtractionMixture.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Uraninite, 3) },
                new FluidStack[] { HydrofluoricAcid.getFluid(4000),
                                    Fluorine.getFluid(2000)});

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .input(dust, UraniumResidues, 2)
                .fluidInputs(Oxygen.getFluid(1000))
                .chancedOutput(dust, UraniumDioxide, 120, 90)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, LeadMetallicPowder)
                .output(dust, Lead)
                .duration(200)
                .EUt(280)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(UraniumExtractionMixture.getFluid(1000))
                .input(dust, UraniumThoriumFiltrate, 2)
                .fluidOutputs(ThoriumPhosphateCakeSolution.getFluid(1000))
                .fluidOutputs(UraniumSolution.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ThoriumPhosphateCakeSolution.getFluid(1000))
                .output(dust, ThoriumPhosphateCake)
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(UraniumExtractionMixture.getFluid(500))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(UraniumSolution.getFluid(1000))
                .output(dust, UraniumDioxide)
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(UraniumExtractionMixture.getFluid(500))
                .duration(200)
                .EUt(700)
                .buildAndRegister();


    }
}
