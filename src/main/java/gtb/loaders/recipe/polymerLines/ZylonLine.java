package gtb.loaders.recipe.polymerLines;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.MarkerMaterials.Color.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class ZylonLine {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(OrthoXylene.getFluid(1000))
                .input(dust, Zeolite)
                .fluidOutputs(OrthoXyleneZeoliteMixture.getFluid(1000))
                .EUt(480)
                .duration(50)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(OrthoXyleneZeoliteMixture.getFluid(1000))
                .output(dust, Zeolite)
                .fluidOutputs(ParaXylene.getFluid(1000))
                .EUt(480)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ParaXylene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(Bromine.getFluid(2000))
                .fluidOutputs(Dibromomethylbenzene.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(7680)
                .duration(150)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Dibromomethylbenzene.getFluid(1000))
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(Bromine.getFluid(2000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(HydrogenPeroxide.getFluid(1000))
                .output(dust, Terephthalaldehyde, 16)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Gold)
                .input(dust, PdCCatalyst, 2)
                .output(dust, AuPdCCatalyst, 3)
                .EUt(2000000)
                .duration(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidInputs(Propene.getFluid(1000))
                .fluidOutputs(Isochloropropane.getFluid(1000))
                .EUt(480)
                .duration(110)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethenone.getFluid(1000))
                .fluidInputs(AceticAcid.getFluid(1000))
                .fluidOutputs(AceticAnhydride.getFluid(1000))
                .EUt(480)
                .duration(80)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Resorcinol.getFluid(1000))
                .fluidInputs(Isochloropropane.getFluid(1000))
                .fluidInputs(AceticAnhydride.getFluid(1000))
                .fluidInputs(NitricAcid.getFluid(1000))
                .fluidInputs(Propene.getFluid(1000))
                .input(dust, SodiumOxide, 3)
                .fluidOutputs(Dinitrodipropanyloxybenzene.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(1000))
                .fluidOutputs(SodiumAcetate.getFluid(1000))
                .output(dust, Salt, 2)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder().duration(80).EUt(120)
                .fluidInputs(SodiumAcetate.getFluid(1000))
                .output(dust, SodiumHydroxide, 3)
                .fluidOutputs(Ethenone.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Dinitrodipropanyloxybenzene.getFluid(1000))
                .input(dust, Terephthalaldehyde, 16)
                .notConsumable(dust, AuPdCCatalyst)
                .output(dust, PreZylon)
                .fluidOutputs(Oxygen.getFluid(6000))
                .EUt(1966080)
                .duration(50)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, PreZylon)
                .fluidOutputs(Propane.getFluid(2000))
                .output(dust, PolymerizationReadyZylon)
                .EUt(120)
                .duration(16000)
                .blastFurnaceTemp(10000)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, PolymerizationReadyZylon)
                .output(dust, Zylon)
                .fluidInputs(Air.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, PolymerizationReadyZylon)
                .output(dust, Zylon)
                .fluidInputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, PolymerizationReadyZylon)
                .output(dust, Zylon)
                .notConsumable(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, PolymerizationReadyZylon)
                .output(dust, Zylon)
                .notConsumable(dust, PhilipsCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, PolymerizationReadyZylon)
                .output(dust, Zylon)
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();
    }
}
