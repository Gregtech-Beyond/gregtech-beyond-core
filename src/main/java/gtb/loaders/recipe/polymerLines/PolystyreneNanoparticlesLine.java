package gtb.loaders.recipe.polymerLines;


import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class PolystyreneNanoparticlesLine {

    public static void init() {
        MIXER_RECIPES.recipeBuilder().duration(160).EUt(960)
                .notConsumable(dust, Nickel)
                .fluidInputs(Methanol.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidOutputs(AmineMixture.getFluid(2000))
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().duration(200).EUt(480)
                .fluidInputs(AmineMixture.getFluid(2000))
                .fluidOutputs(Trimethylamine.getFluid(500))
                .fluidOutputs(Dimethylamine.getFluid(800))
                .fluidOutputs(Methylamine.getFluid(700))
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder().duration(180).EUt(1920)
                .fluidInputs(SodiumTungstate.getFluid(12000))
                .fluidInputs(PhosphoricAcid.getFluid(1000))
                .output(dust, SodiumPhosphotungstate, 56)
                .output(dust, SodiumHydroxide, 3)
                .output(dust, SodiumOxide, 30)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(480)
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(IsopropylAlcohol.getFluid(1000))
                .notConsumable(dust, SodiumPhosphomolybdate)
                .notConsumable(dust, SodiumPhosphotungstate)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(100).EUt(120)
                .input(dust, IridiumChloride, 8)
                .fluidInputs(Cyclooctadiene.getFluid(2000))
                .output(dust, IridiumCyclooctadienylChlorideDimer, 44)
                .fluidOutputs(Chlorine.getFluid(4000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(140).EUt(500)
                .input(dust, Lithium, 4)
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(PhosphorusTrichloride.getFluid(1000))
                .fluidInputs(IsopropylAlcohol.getFluid(2000))
                .output(dust, LithiumChloride, 4)
                .fluidOutputs(LithiumHydroxideSolution.getFluid(2000))
                .fluidOutputs(ChlorodiisopropylPhosphine.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(200).EUt(1200)
                .input(dust, IridiumCyclooctadienylChlorideDimer, 22)
                .fluidInputs(ChlorodiisopropylPhosphine.getFluid(2000))
                .fluidInputs(Mercaptophenol.getFluid(1000))
                .notConsumable(dust, BerylliumFluoride)
                .output(dust, DehydrogenationCatalyst, 56)
                .fluidOutputs(Cyclooctadiene.getFluid(2000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(190).EUt(120)
                .notConsumable(dust, DehydrogenationCatalyst)
                .fluidInputs(Butene.getFluid(1000))
                .fluidInputs(Octane.getFluid(1000))
                .fluidOutputs(Butane.getFluid(1000))
                .fluidOutputs(Oct_1_ene.getFluid(1000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().duration(300).EUt(480)
                .fluidInputs(Trimethylamine.getFluid(1000))
                .fluidInputs(Bromine.getFluid(1000))
                .fluidInputs(Octane.getFluid(1000))
                .fluidInputs(Oct_1_ene.getFluid(1000))
                .fluidOutputs(CetaneTrimethylAmmoniumBromide.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidInputs(CetaneTrimethylAmmoniumBromide.getFluid(20))
                .notConsumable(dust, AmmoniumPersulfate)
                .output(dust, PolystyreneNanoParticles)
                .EUt(480)
                .duration(50)
                .buildAndRegister();
    }
}
