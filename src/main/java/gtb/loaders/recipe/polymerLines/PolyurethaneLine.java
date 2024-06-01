package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class PolyurethaneLine {

    public static void init() {
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(TolueneDiisocyanate.getFluid(1000))
                .fluidInputs(EthyleneGlycol.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidOutputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Toluene.getFluid(1000))
                .fluidInputs(Phosgene.getFluid(2000))
                .fluidInputs(Hydrogen.getFluid(10000))
                .fluidInputs(NitricAcid.getFluid(2000))
                .circuitMeta(2)
                .fluidOutputs(TolueneDiisocyanate.getFluid(2000))
                .fluidOutputs(DilutedHydrochloricAcid.getFluid(10000))
                .duration(800)
                .EUt(1900)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(1000))
                .fluidInputs(Air.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(4000))
                .notConsumable(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(2000))
                .notConsumable(dust, PhilipsCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(3000))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();
    }
}
