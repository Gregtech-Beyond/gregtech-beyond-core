package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gtb.common.metatileentities.GTBMetaTileEntities;
import net.minecraft.init.Items;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.item.GTBMetaItems;

public class BiologyLines {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(GTBMetaItems.PETRI_DISH_MOLD)
                .fluidInputs(Polybenzimidazole.getFluid(144))
                .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                .fluidInputs(GTBMaterials.Polyetheretherketone.getFluid(144))
                .output(GTBMetaItems.PETRI_DISH)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.PETRI_DISH)
                .output(GTBMetaItems.STERILIZED_PETRI_DISH)
                .fluidInputs(GTBMaterials.HundredEthanol.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.STERILIZED_PETRI_DISH)
                .output(GTBMetaItems.PLUS_STERILIZED_PETRI_DISH)
                .fluidInputs(GTBMaterials.HundredButanol.getFluid(1000))
                .fluidInputs(GTBMaterials.HundredMethanol.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(GTBMetaItems.PLUS_STERILIZED_PETRI_DISH)
                .input(dust, GTBMaterials.CupriavidusNecatorBacteriaSample)
                .output(GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
                .duration(40)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
                .fluidInputs(GTBMaterials.Cuproquin.getFluid(1000))
                .output(GTBMetaItems.CUPRIAVIDUS_NECATOR_CULTURE)
                .duration(1200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(RawGrowthMedium.getFluid(1000))
                .fluidInputs(GTBMaterials.Sulfanilamide.getFluid(1000))
                .fluidOutputs(SterileGrowthMedium.getFluid(1000))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        GTBRecipeMaps.BIO_REACTOR.recipeBuilder()
                .input(GTBMetaItems.CUPRIAVIDUS_NECATOR_CULTURE)
                .fluidInputs(GTBMaterials.BacterialGrowthMedium.getFluid(1000))
                .fluidOutputs(GTBMaterials.DepletedBacterialGrowthMedium.getFluid(1000))
                .duration(200)
                .output(dust, GTBMaterials.CupriavidusNecator, 1)
                .output(GTBMetaItems.CONTAMINATED_STERILIZED_PETRI_DISH)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.ChlorosulfonicAcid.getFluid(1000))
                .fluidInputs(GTBMaterials.AceticAnhydride.getFluid(1000))
                .fluidInputs(GTBMaterials.Aniline.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(1000))
                .fluidOutputs(GTBMaterials.AcetylsulfanilylChloride.getFluid(1000))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.AcetylsulfanilylChloride.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .input(dust, SodiumBicarbonate, 6)
                .output(dust, Salt, 2)
                .fluidOutputs(GTBMaterials.Sulfanilamide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(1000))
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.BasicFibroblastGrowthMedium.getFluid(1000))
                .fluidInputs(GTBMaterials.AmmoniumNitrate.getFluid(1000))
                .fluidInputs(GTBMaterials.EpidermalGrowthFactor.getFluid(1000))
                .fluidInputs(GTBMaterials.B_27_Supplement.getFluid(1000))
                .input(dust, GTBMaterials.Glutamine, 20)
                .fluidOutputs(RawGrowthMedium.getFluid(4000))
                .duration(1000)
                .EUt(28000)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.BloodPlasma.getFluid(1000))
                .fluidOutputs(GTBMaterials.Catalase.getFluid(200))
                .fluidOutputs(GTBMaterials.BasicFibroblastGrowthMedium.getFluid(200))
                .fluidOutputs(GTBMaterials.EpidermalGrowthFactor.getFluid(200))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Catalase.getFluid(1000))
                .fluidOutputs(GTBMaterials.LinoleicAcid.getFluid(1000))
                .fluidOutputs(GTBMaterials.Biotin.getFluid(1000))
                .fluidOutputs(GTBMaterials.Ethanolamine.getFluid(1000))
                .fluidOutputs(GTBMaterials.VitaminA.getFluid(1000))
                .fluidOutputs(GTBMaterials.B_27_Supplement.getFluid(5000))
                .duration(200)
                .EUt(2400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.PropargylAlcohol.getFluid(5000))
                .fluidInputs(GTBMaterials.BetaIonone.getFluid(25000))
                .fluidOutputs(Oxygen.getFluid(8000))
                .fluidOutputs(HydrochloricAcid.getFluid(5000))
                .fluidOutputs(GTBMaterials.VitaminA.getFluid(17000))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Citral.getFluid(1000))
                .fluidInputs(Acetone.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(GTBMaterials.BetaIonone.getFluid(1000))
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs()
                .input(dust, GTBMaterials.BetaPinene, 26)
                .fluidOutputs(Isoprene.getFluid(2000))
                .fluidOutputs(Oxygen.getFluid(2000))
                .fluidOutputs(GTBMaterials.Citral.getFluid(2000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(GTBMaterials.BetaPineneSolution.getFluid(2000))
                .fluidInputs(GTBMaterials.Turpentine.getFluid(1000))
                .duration(80)
                .EUt(790)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.BetaPineneSolution.getFluid(2000))
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .output(dust, GTBMaterials.BetaPinene, 26)
                .duration(600)
                .EUt(1200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Resin.getFluid(1000))
                .fluidOutputs(Isoprene.getFluid(20))
                .fluidOutputs(GTBMaterials.Turpentine.getFluid(200))
                .output(dust, RawRubber, 1)
                .duration(600)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.Yeast, 1)
                .fluidInputs(Biomass.getFluid(1000))
                .fluidOutputs(GTBMaterials.LinoleicAcid.getFluid(1000))
                .notConsumable(GTBMetaItems.ULTRASONIC_HOMOGENIZER)
                .duration(2000)
                .EUt(7)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.EthyleneOxide.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidOutputs(GTBMaterials.Ethanolamine.getFluid(1000))
                .duration(212)
                .EUt(112)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(Items.APPLE)
                .output(dust, GTBMaterials.Yeast)
                .EUt(12)
                .duration(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidOutputs(GTBMaterials.CleanAmmoniaSolution.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        //YEEM Line

        MACERATOR_RECIPES.recipeBuilder()
                .input(GTBMetaItems.BARLEY)
                .output(dust, GTBMaterials.GristPowder)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.HotWater.getFluid(1000))
                .input(dust, GTBMaterials.GristPowder)
                .fluidOutputs(GTBMaterials.HotGristSolution.getFluid(1000))
                .duration(1280)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.HotGristSolution.getFluid(1000))
                .notConsumable(dust, GTBMaterials.ActivatedCarbon, 1)
                .fluidOutputs(GTBMaterials.Wort.getFluid(200))
                .output(dust, GTBMaterials.SolidGrain, 1)
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        GTBRecipeMaps.FERMENTATION_VAT.recipeBuilder()
                .fluidInputs(GTBMaterials.Wort.getFluid(1000))
                .fluidOutputs(GTBMaterials.MaltExtract.getFluid(1000))
                .duration(900)
                .EUt(2)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust,GTBMaterials.Glucose, 2)
                .fluidInputs(GTBMaterials.HotWater.getFluid(1000))
                .fluidInputs(GTBMaterials.Peptone.getFluid(1000))
                .fluidOutputs(GTBMaterials.NutrientRichSolution.getFluid(4000))
                .fluidInputs(GTBMaterials.MaltExtract.getFluid(1000))
                .duration(800)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(100))
                .fluidInputs(Milk.getFluid(1000))
                .fluidOutputs(GTBMaterials.Peptone.getFluid(1000))
                .notConsumable(GTBMaterials.Nonoxynol_9.getFluid(1000))
                .duration(90)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Nonoxynol_9_Solution.getFluid(2000))
                .fluidOutputs(GTBMaterials.Nonoxynol_9.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .duration(800)
                .EUt(7120)
                .buildAndRegister();

        GTBRecipeMaps.ELECTROLYTIC_CELL.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(GTBMaterials.EthoxylatedNonylphenol.getFluid(1000))
                .fluidOutputs(GTBMaterials.Nonylphenol.getFluid(800))
                .fluidOutputs(GTBMaterials.EthyleneGlycol.getFluid(800))
                .fluidOutputs(GTBMaterials.Nonoxynol_9_Solution.getFluid(200))
                .fluidOutputs(Hydrogen.getFluid(200))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.NutrientRichSolution.getFluid(1000))
                .input(dust, GTBMaterials.Yeast, 1)
                .input(GTBMetaItems.PLUS_STERILIZED_PETRI_DISH)
                .output(GTBMetaItems.GROWN_YEAST_CULTURE)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(GTBMetaItems.GROWN_YEAST_CULTURE)
                .output(GTBMetaItems.YEAST_CELLS)
                .fluidOutputs(GTBMaterials.WasteWater.getFluid(12))
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(GTBMetaItems.YEAST_CELLS)
                .output(GTBMetaItems.CONTAMINATED_STERILIZED_PETRI_DISH)
                .fluidOutputs(GTBMaterials.YeastExtract.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        GTBRecipeMaps.ROTARY_EVAPORATOR.recipeBuilder()
                .fluidInputs(GTBMaterials.YeastMixture.getFluid(1000))
                .fluidOutputs(GTBMaterials.YeastExtract.getFluid(1000))
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.YeastExtract.getFluid(1000))
                .fluidInputs(Water.getFluid(200))
                .fluidInputs(GTBMaterials.Mannitol.getFluid(1000))
                .fluidOutputs(GTBMaterials.DissolvedYeastExtractMannitolMixture.getFluid(2200))
                .EUt(590)
                .duration(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.DissolvedYeastExtractMannitolMixture.getFluid(1000))
                .input(dust, Agar, 2)
                .fluidOutputs(GTBMaterials.YeastExtractMannitolAgarSolution.getFluid(1000))
                .duration(228)
                .EUt(9012)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.YeastExtractMannitolAgarSolution.getFluid(1000))
                .notConsumable(dust, Iron, 1)
                .output(dust, GTBMaterials.YeastExtractMannitolMedium, 2)
                .duration(900)
                .EUt(8000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, GTBMaterials.YeastExtractMannitolMedium, 1)
                .fluidOutputs(GTBMaterials.YEEMSolution.getFluid(1000))
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.SodiumHydroxideSolution.getFluid(1000))
                .input(dust, GTBMaterials.Fructose, 6)
                .notConsumable(dust, GTBMaterials.SodiumBorohydride, 1)
                .duration(200)
                .fluidOutputs(GTBMaterials.Mannitol.getFluid(1000))
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .fluidOutputs(GTBMaterials.SodiumHydroxideSolution.getFluid(1000))
                .circuitMeta(0)
                .duration(120)
                .EUt(300)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000))
                .input(dust, Sodium, 1)
                .output(dust, GTBMaterials.SodiumHydride, 2)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.SodiumHydride, 2)
                .notConsumable(SulfuricAcid.getFluid(1000))
                .fluidInputs(Ethanol.getFluid(3000))
                .fluidInputs(GTBMaterials.BoricAcid.getFluid(1000))
                .output(dust, GTBMaterials.SodiumEthoxide, 27)
                .output(dust, GTBMaterials.SodiumBorohydride, 6)
                .fluidOutputs(Water.getFluid(3000))
                .duration(60)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(GTBMaterials.EthoxylatedNonylphenol.getFluid(2000))
                .fluidInputs(GTBMaterials.Nonylphenol.getFluid(1000))
                .fluidInputs(GTBMaterials.EthyleneOxide.getFluid(1000))
                .notConsumable(dust, GTBMaterials.PotassiumManganate, 1)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        GTBRecipeMaps.BIO_REACTOR.recipeBuilder()
                .notConsumable(GTBMaterials.YeastExtract.getFluid(1000))
                .fluidInputs(GTBMaterials.BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(GTBMaterials.DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, GTBMaterials.CupriavidusNecator, 1)
                .output(dust, GTBMaterials.CupriavidusNecator, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        GTBRecipeMaps.BIO_REACTOR.recipeBuilder()
                .notConsumable(GTBMaterials.YeastExtract.getFluid(1000))
                .fluidInputs(GTBMaterials.BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(GTBMaterials.DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, GTBMaterials.Iriditus, 1)
                .output(dust, GTBMaterials.Iriditus, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        GTBRecipeMaps.BIO_REACTOR.recipeBuilder()
                .notConsumable(GTBMaterials.YeastExtract.getFluid(1000))
                .fluidInputs(GTBMaterials.BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(GTBMaterials.DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, GTBMaterials.EschericiaColi, 1)
                .output(dust, GTBMaterials.EschericiaColi, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        
    }
}
