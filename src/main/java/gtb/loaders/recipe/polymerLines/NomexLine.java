package gtb.loaders.recipe.polymerLines;


import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class NomexLine {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, IsophthalicAcid, 18)
                .fluidInputs(Phosgene.getFluid(2000))
                .output(dust, IsophthaloylChloride, 16)
                .fluidOutputs(CarbonDioxide.getFluid(2000))
                .fluidOutputs(HydrogenChloride.getFluid(2000))
                .duration(200)
                .EUt(890)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, OneThreeDinitrobenzene)
                .fluidInputs(Hydrogen.getFluid(4000))
                .notConsumable(dust, ActivatedRaneyNickel)
                .output(dust, mPhenyleneDiamine, 16)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel)
                .fluidInputs(Aluminium.getFluid(144))
                .output(dust, RaneyNickel)
                .duration(600)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, RaneyNickel, 4)
                .input(dust, SodiumHydroxide, 6)
                .fluidInputs(Water.getFluid(6000))
                .fluidOutputs(Hydrogen.getFluid(6000))
                .output(dust, SodiumAluminate, 20)
                .output(dust, ActivatedRaneyNickel, 4)
                .duration(900)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Nitrobenzene.getFluid(1000))
                .fluidInputs(NitrationMixture.getFluid(1000))
                .output(dust, DinitrobenzeneMixture, 2)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SodiumHydroxideSolution.getFluid(100))
                .input(dust, DinitrobenzeneMixture)
                .output(dust, OneThreeDinitrobenzene)
                .EUt(80)
                .duration(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .input(dust, mPhenyleneDiamine, 4)
                .input(dust, IsophthaloylChloride, 4)
                .fluidOutputs(NomexPolymerizationBase.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .fluidInputs(NomexPolymerizationBase.getFluid(1000))
                .input(ROTARRY_SPINNING_WHISKER)
                .output(plate, Nomex)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();
    }
}
