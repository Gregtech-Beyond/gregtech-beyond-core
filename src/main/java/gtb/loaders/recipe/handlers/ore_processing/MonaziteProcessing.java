package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class MonaziteProcessing {

    public static void init() {
        DIGESTER.recipeBuilder()
                .fluidInputs(NitricAcid.getFluid(1000))
                .input(dust, Monazite)
                .output(dust, SiliconDioxide)
                .fluidOutputs(MuddyMonaziteSolution.getFluid(1000))
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        DISSOLUTION_TANK.recipeBuilder()
                .fluidInputs(MuddyMonaziteSolution.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(2000))
                .output(dust, MuddyMonaziteOreByproducts, 1)
                .fluidOutputs(MonaziteSolution.getFluid(2000))
                .EUt(700)
                .duration(200)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(MonaziteSolution.getFluid(1000))
                .output(dust, MonaziteSulfide)
                .chancedOutput(dust, SiliconDioxide, 3220, 0)
                .chancedOutput(dust, Rutile, 4000, 0)
                .chancedOutput(dust, Ilmenite, 800, 90)
                .chancedOutput(dust, HafniumZirconiumSlag, 4000, 20)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DILUTION_TANK.recipeBuilder()
                .input(dust, MonaziteSulfide)
                .fluidInputs(Water.getFluid(2000))
                .fluidOutputs(DilutedMonaziteSulfide.getFluid(2000))
                .EUt(1200)
                .duration(500)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(DilutedMonaziteSulfide.getFluid(1000))
                .output(dust, ThoriumPhosphateCake, 2)
                .output(dust, RareEarthFiltrate, 2)
                .duration(700)
                .EUt(600)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, ThoriumPhosphateCakeDust)
                .output(dust, ThoriumConcentrate)
                .duration(200)
                .blastFurnaceTemp(1900)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, ThoriumConcentrate)
                .output(dust, Thorium)
                .output(dust, Phosphate)
                .duration(200)
                .EUt(1700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AmmoniumNitrate.getFluid(1000))
                .input(dust, RareEarthFiltrate, 2)
                .fluidOutputs(NeutralizedRareEarthFiltrate.getFluid(1000))
                .output(dust, CeriumOxideFiltrate)
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(NeutralizedRareEarthFiltrate.getFluid(1000))
                .fluidOutputs(CooledRareEarthFiltrate.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(CooledRareEarthFiltrate.getFluid(1000))
                .chancedOutput(dust, EuropiumOxide, 2000, 20)
                .output(dust, MonaziteRarerEarthFiltrate)
                .duration(800)
                .EUt(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, MonaziteRarerEarthFiltrate)
                .fluidInputs(Chlorine.getFluid(1000))
                .output(dust, ChlorinatedMonaziteFiltrate)
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Salt)
                .input(dust, ChlorinatedMonaziteFiltrate)
                .output(dust, SaturatedChlorinatedMonaziteFiltrate)
                .duration(200)
                .EUt(1800)
                .buildAndRegister();

        DRYER.recipeBuilder()
                .input(dust, SaturatedChlorinatedMonaziteFiltrate)
                .output(dust, DriedMonaziteFiltrate)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, DriedMonaziteFiltrate, 3)
                .output(dust, SamariumOxide, 2)
                .output(dust, GadoliniumOxide)
                .duration(90)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, GadoliniumOxide, 3)
                .output(dust, Gadolinium)
                .fluidOutputs(Oxygen.getFluid(2000))
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        DILUTION_TANK.recipeBuilder()
                .input(dust, CeriumOxideFiltrate)
                .fluidInputs(DistilledWater.getFluid(2000))
                .fluidOutputs(DilutedCeriumFiltrate.getFluid(2000))
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(DilutedCeriumFiltrate.getFluid(1000))
                .fluidOutputs(CeriumSolution.getFluid(1000))
                .output(dust, UraniumFiltrate, 2)
                .duration(190)
                .EUt(700)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .input(dust, UraniumFiltrate)
                .chancedOutput(dust, Uranium238, 3000, 200)
                .chancedOutput(dust, Uranium238, 2000, 100)
                .chancedOutput(dust, Uranium238, 1200, 200)
                .chancedOutput(dust, Uranium235, 1600, 150)
                .chancedOutput(dust, Uranium235, 1300, 90)
                .chancedOutput(dust, Uranium235, 900, 20)
                .duration(700)
                .EUt(120)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .input(dust, HafniumZirconiumSlag)
                .output(dust, RoastedHafniumZirconiumSlag)
                .fluidInputs(Oxygen.getFluid(1200))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, RoastedHafniumZirconiumSlag)
                .fluidInputs(Water.getFluid(1000))
                .output(dust, WetHafniumZirconiumBlend)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, WetHafniumZirconiumBlend, 1)
                .output(dust, HafniumOxide, 2)
                .output(dust, ZirconiumOxide, 2)
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, MuddyMonaziteOreByproducts)
                .fluidOutputs(ImpureMonaziteOreByproductSlurry.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT.recipeBuilder()
                .fluidInputs(ImpureMonaziteOreByproductSlurry.getFluid(1000))
                .notConsumable(MethylIsobutylCarbonyl.getFluid(200))
                .notConsumable(AmidoEthylAlkylImidazole.getFluid(200))
                .fluidOutputs(MonaziteOreByproductSlurry.getFluid(1000))
                .duration(2000)
                .EUt(70)
                .buildAndRegister();

        CLARIFIER.recipeBuilder()
                .fluidInputs(MonaziteOreByproductSlurry.getFluid(1000))
                .chancedOutput(dust, ThoriumPhosphateCake, 2, 3300, 0)
                .chancedOutput(dust, UraniumFiltrate, 2, 3300, 0)
                .chancedOutput(dust, RutherfordiumOxide, 2, 3300, 0)
                .chancedOutput(dust, MonaziteSulfide, 2, 3300, 0)
                .duration(200)
                .EUt(1080)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Ethylene.getFluid(1000))
                .fluidInputs(PalmaticAcid.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .fluidOutputs(AmidoEthylAlkylImidazole.getFluid(1000))
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Ethylene.getFluid(1000))
                .fluidInputs(CaprylicAcid.getFluid(1000))
                .fluidOutputs(Steam.getFluid(1000))
                .fluidOutputs(AmidoEthylAlkylImidazole.getFluid(1000))
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Octanol.getFluid(1500))
                .fluidInputs(Acetone.getFluid(500))
                .fluidOutputs(CaprylicAcid.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ZieglerAlfolMixture.getFluid(1000))
                .fluidOutputs(NButanol.getFluid(200))
                .fluidOutputs(Ethanol.getFluid(300))
                .fluidOutputs(Hexanol.getFluid(150))
                .fluidOutputs(Decanol.getFluid(100))
                .fluidOutputs(Octanol.getFluid(100))
                .fluidOutputs(Tetradecanol.getFluid(50))
                .fluidOutputs(Dodecanol.getFluid(60))
                .fluidOutputs(Hexadecanol.getFluid(40))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(TriethylAluminium.getFluid(1000))
                .fluidInputs(Ethylene.getFluid(6000))
                .fluidInputs(Ether.getFluid(1000))
                .fluidOutputs(ZieglerAlfolMixture.getFluid(1000))
                .output(dust, AluminiumHydroxide, 7)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetone.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(15000))
                .fluidInputs(Hexadecanol.getFluid(3000))
                .fluidOutputs(PalmaticAcid.getFluid(3000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetone.getFluid(2000))
                .notConsumable(dust, CalciumHydroxide, 2)
                .fluidOutputs(DiacetoneAlcohol.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DiacetoneAlcohol.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000))
                .notConsumable(dust, ZincChloride, 1)
                .fluidOutputs(AmidoEthylAlkylImidazole.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();
    }
}
