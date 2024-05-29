package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;
import static net.minecraft.init.Items.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.common.items.MetaItems;

public class BiologyLines {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(PETRI_DISH_MOLD)
                .fluidInputs(Polybenzimidazole.getFluid(144))
                .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                .fluidInputs(Polyetheretherketone.getFluid(144))
                .output(MetaItems.PETRI_DISH)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(MetaItems.PETRI_DISH)
                .output(STERILIZED_PETRI_DISH)
                .fluidInputs(Ethanol_100.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(STERILIZED_PETRI_DISH)
                .output(PLUS_STERILIZED_PETRI_DISH)
                .fluidInputs(Butanol_100.getFluid(1000))
                .fluidInputs(Methanol_100.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(PLUS_STERILIZED_PETRI_DISH)
                .input(dust, CupriavidusNecatorBacteriaSample)
                .output(CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
                .duration(40)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH)
                .fluidInputs(Cuproquin.getFluid(1000))
                .output(CUPRIAVIDUS_NECATOR_CULTURE)
                .duration(1200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(RawGrowthMedium.getFluid(1000))
                .fluidInputs(Sulfanilamide.getFluid(1000))
                .fluidOutputs(SterileGrowthMedium.getFluid(1000))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .input(CUPRIAVIDUS_NECATOR_CULTURE)
                .fluidInputs(BacterialGrowthMedium.getFluid(1000))
                .fluidOutputs(DepletedBacterialGrowthMedium.getFluid(1000))
                .duration(200)
                .output(dust, CupriavidusNecator, 1)
                .output(CONTAMINATED_STERILIZED_PETRI_DISH)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ChlorosulfonicAcid.getFluid(1000))
                .fluidInputs(AceticAnhydride.getFluid(1000))
                .fluidInputs(Aniline.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(1000))
                .fluidOutputs(AcetylsulfanilylChloride.getFluid(1000))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AcetylsulfanilylChloride.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .input(dust, SodiumBicarbonate, 6)
                .output(dust, Salt, 2)
                .fluidOutputs(Sulfanilamide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(AceticAcid.getFluid(1000))
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(BasicFibroblastGrowthMedium.getFluid(1000))
                .fluidInputs(AmmoniumNitrate.getFluid(1000))
                .fluidInputs(EpidermalGrowthFactor.getFluid(1000))
                .fluidInputs(B_27_Supplement.getFluid(1000))
                .input(dust, Agar, 4)
                .input(dust, Glutamine, 20)
                .fluidOutputs(RawGrowthMedium.getFluid(4000))
                .duration(1000)
                .EUt(28000)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(BloodPlasma.getPlasma(1000))
                .fluidOutputs(Catalase.getFluid(200))
                .fluidOutputs(BasicFibroblastGrowthMedium.getFluid(200))
                .fluidOutputs(EpidermalGrowthFactor.getFluid(200))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Catalase.getFluid(1000))
                .fluidInputs(LinoleicAcid.getFluid(1000))
                .fluidInputs(Biotin.getFluid(1000))
                .fluidInputs(Ethanolamine.getFluid(1000))
                .fluidInputs(VitaminA.getFluid(1000))
                .fluidOutputs(B_27_Supplement.getFluid(5000))
                .duration(200)
                .EUt(2400)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PropargylAlcohol.getFluid(5000))
                .fluidInputs(BetaIonone.getFluid(25000))
                .fluidOutputs(Oxygen.getFluid(8000))
                .fluidOutputs(HydrochloricAcid.getFluid(5000))
                .fluidOutputs(VitaminA.getFluid(17000))
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Citral.getFluid(1000))
                .fluidInputs(Acetone.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(BetaIonone.getFluid(1000))
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, BetaPinene, 26)
                .fluidInputs(Isoprene.getFluid(2000))
                .fluidInputs(Oxygen.getFluid(2000))
                .fluidOutputs(Citral.getFluid(2000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidOutputs(BetaPineneSolution.getFluid(2000))
                .fluidInputs(Turpentine.getFluid(1000))
                .duration(80)
                .EUt(790)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(BetaPineneSolution.getFluid(2000))
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .output(dust, BetaPinene, 26)
                .duration(600)
                .EUt(1200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Resin.getFluid(1000))
                .fluidOutputs(Isoprene.getFluid(20))
                .fluidOutputs(Turpentine.getFluid(200))
                .output(dust, RawRubber, 1)
                .duration(600)
                .EUt(120)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(DepletedBacterialGrowthMedium.getFluid(1000))
                .fluidOutputs(BacterialGrowthMedium.getFluid(500))
                .circuitMeta(1)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Yeast, 1)
                .fluidInputs(Biomass.getFluid(1000))
                .fluidOutputs(LinoleicAcid.getFluid(1000))
                .notConsumable(ULTRASONIC_HOMOGENIZER)
                .duration(2000)
                .EUt(7)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthyleneOxide.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidOutputs(Ethanolamine.getFluid(1000))
                .duration(212)
                .EUt(112)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(APPLE)
                .output(dust, Yeast)
                .EUt(12)
                .duration(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidOutputs(CleanAmmoniaSolution.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        // YEEM Line

        MACERATOR_RECIPES.recipeBuilder()
                .input(BARLEY)
                .output(dust, GristPowder)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HotWater.getFluid(1000))
                .input(dust, GristPowder)
                .fluidOutputs(HotGristSolution.getFluid(1000))
                .duration(1280)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HotGristSolution.getFluid(1000))
                .notConsumable(dust, ActivatedCarbon, 1)
                .fluidOutputs(Wort.getFluid(200))
                .output(dust, SolidGrain, 1)
                .duration(120)
                .EUt(780)
                .buildAndRegister();

        FERMENTATION_VAT_RECIPES.recipeBuilder()
                .fluidInputs(Wort.getFluid(1000))
                .fluidOutputs(MaltExtract.getFluid(1000))
                .duration(900)
                .EUt(2)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Glucose, 2)
                .fluidInputs(HotWater.getFluid(1000))
                .fluidInputs(Peptone.getFluid(1000))
                .fluidOutputs(NutrientRichSolution.getFluid(4000))
                .fluidInputs(MaltExtract.getFluid(1000))
                .duration(800)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Nonoxynol_9_Solution.getFluid(2000))
                .fluidOutputs(Nonoxynol_9.getFluid(500))
                .fluidOutputs(Water.getFluid(1500))
                .duration(800)
                .EUt(7120)
                .buildAndRegister();

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(EthoxylatedNonylphenol.getFluid(1000))
                .fluidOutputs(Nonylphenol.getFluid(800))
                .fluidOutputs(EthyleneGlycol.getFluid(800))
                .fluidOutputs(Nonoxynol_9_Solution.getFluid(200))
                .fluidOutputs(Hydrogen.getFluid(200))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NutrientRichSolution.getFluid(1000))
                .input(dust, Yeast, 1)
                .input(PLUS_STERILIZED_PETRI_DISH)
                .output(GROWN_YEAST_CULTURE)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(GROWN_YEAST_CULTURE)
                .output(YEAST_CELLS)
                .fluidOutputs(WasteWater.getFluid(12))
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(YEAST_CELLS)
                .output(CONTAMINATED_STERILIZED_PETRI_DISH)
                .fluidOutputs(YeastExtract.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .duration(700)
                .EUt(812)
                .buildAndRegister();

        ROTARY_EVAPORATOR_RECIPES.recipeBuilder()
                .fluidInputs(YeastMixture.getFluid(1000))
                .fluidOutputs(YeastExtract.getFluid(1000))
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(YeastExtract.getFluid(1000))
                .fluidInputs(Water.getFluid(200))
                .fluidInputs(Mannitol.getFluid(1000))
                .fluidOutputs(DissolvedYeastExtractMannitolMixture.getFluid(2200))
                .EUt(590)
                .duration(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(DissolvedYeastExtractMannitolMixture.getFluid(1000))
                .input(dust, Agar, 2)
                .fluidOutputs(YeastExtractMannitolAgarSolution.getFluid(1000))
                .duration(228)
                .EUt(9012)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(YeastExtractMannitolAgarSolution.getFluid(1000))
                .notConsumable(dust, Iron, 1)
                .output(dust, YeastExtractMannitolMedium, 2)
                .duration(900)
                .EUt(8000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, YeastExtractMannitolMedium, 1)
                .fluidOutputs(YEEMSolution.getFluid(1000))
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SodiumHydroxideSolution.getFluid(1000))
                .input(dust, Fructose, 6)
                .notConsumable(dust, SodiumBorohydride, 1)
                .duration(200)
                .fluidOutputs(Mannitol.getFluid(1000))
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SodiumHydroxideSolution.getFluid(1000))
                .input(dust, Glucose, 6)
                .notConsumable(dust, SodiumBorohydride, 1)
                .duration(200)
                .fluidOutputs(Mannitol.getFluid(1000))
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodiumHydroxide, 3)
                .fluidOutputs(SodiumHydroxideSolution.getFluid(1000))
                .circuitMeta(0)
                .duration(120)
                .EUt(300)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(1000))
                .input(dust, Sodium, 1)
                .output(dust, SodiumHydride, 2)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydride, 2)
                .notConsumable(SulfuricAcid.getFluid(1000))
                .fluidInputs(Ethanol.getFluid(3000))
                .fluidInputs(BoricAcid.getFluid(1000))
                .output(dust, SodiumEthoxide, 27)
                .output(dust, SodiumBorohydride, 6)
                .fluidOutputs(Water.getFluid(3000))
                .duration(60)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(EthoxylatedNonylphenol.getFluid(2000))
                .fluidInputs(Nonylphenol.getFluid(1000))
                .fluidInputs(EthyleneOxide.getFluid(1000))
                .notConsumable(dust, PotassiumManganate, 1)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(YEEMSolution.getFluid(1000))
                .fluidInputs(BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, CupriavidusNecator, 1)
                .output(dust, CupriavidusNecator, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(YEEMSolution.getFluid(1000))
                .fluidInputs(BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, Iriditus, 1)
                .output(dust, Iriditus, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(YEEMSolution.getFluid(1000))
                .fluidInputs(BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, EschericiaColi, 1)
                .output(dust, EschericiaColi, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(YEEMSolution.getFluid(1000))
                .fluidInputs(BacterialGrowthMedium.getFluid(250))
                .fluidOutputs(DepletedBacterialGrowthMedium.getFluid(250))
                .input(dust, Rhizobium, 1)
                .output(dust, Rhizobium, 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Sugar, 2)
                .fluidInputs(Water.getFluid(2000))
                .output(dust, Fructose, 24)
                .output(dust, Glucose, 24)
                .duration(200)
                .EUt(129)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(GLASS_TUBE)
                .input(stick, Steel)
                .output(SYRINGE)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(SYRINGE)
                .fluidInputs(Butanol_100.getFluid(1000))
                .fluidInputs(Methanol_100.getFluid(1000))
                .output(STERILIZED_SYRINGE)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(MUTTON)
                .input(STERILIZED_SYRINGE)
                .output(SHEEP_BLOOD_SYRINGE)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(SHEEP_BLOOD_SYRINGE)
                .fluidOutputs(SheepBlood.getFluid(1000))
                .output(SYRINGE)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(SheepBlood.getFluid(1000))
                .fluidOutputs(SheepBloodPlasma.getFluid(200))
                .fluidOutputs(SheepBloodCells.getFluid(800))
                .duration(200)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SheepBloodPlasma.getFluid(1000))
                .notConsumable(EdeticAcid.getFluid(200))
                .fluidOutputs(DefibernatedSheepBlood.getFluid(1000))
                .duration(120)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(SHAPE_MOLD_CYLINDER)
                .output(dust, SolidifiedSterileDefibernatedSheepBlood, 1)
                .notConsumable(EthyleneOxide.getFluid(200))
                .fluidInputs(DefibernatedSheepBlood.getFluid(1000))
                .duration(120)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(dust, AluminiumChloride, 1)
                .fluidInputs(Benzene.getFluid(1000))
                .fluidInputs(Ethylene.getFluid(1000))
                .fluidOutputs(PhenylEthylAlcohol.getFluid(1000))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(PhenylEthylAlcohol.getFluid(1000))
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, Agar, 1)
                .fluidOutputs(PhenylEthylAlcoholAgarSolution.getFluid(1000))
                .duration(500)
                .EUt(8000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(PhenylEthylAlcoholAgarSolution.getFluid(1000))
                .fluidOutputs(DissolvedPhenylEthylAlcoholAgar.getFluid(1000))
                .circuitMeta(0)
                .duration(80)
                .EUt(1290)
                .buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .fluidInputs(DissolvedPhenylEthylAlcoholAgar.getFluid(1000))
                .input(dust, SolidifiedSterileDefibernatedSheepBlood, 1)
                .fluidOutputs(PhenylEthylAlcoholBloodAgar.getFluid(1000))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PhenylEthylAlcoholBloodAgar.getFluid(100))
                .input(PLUS_STERILIZED_PETRI_DISH)
                .output(PAD_PETRI_DISH)
                .duration(900)
                .EUt(560)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .input(PAD_PETRI_DISH)
                .input(dust, Iriditus)
                .fluidOutputs(Xerizin.getFluid(100))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .input(COTTON)
                .output(COTTON_SHEET)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .input(COTTON_SHEET)
                .output(CHEESE_CLOTH)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(CHEESE_CLOTH)
                .fluidInputs(HeatedMilkSlurry.getFluid(1000))
                .fluidOutputs(PeptoneMixture.getFluid(400))
                .output(dust, SolidMilkResidues)
                .duration(800)
                .EUt(612)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, SolidMilkResidues)
                .fluidOutputs(AlphaLinolenicAcid.getFluid(400))
                .fluidOutputs(MilkOil.getFluid(600))
                .duration(200)
                .EUt(150)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(Trypsin.getFluid(100))
                .notConsumable(Nonoxynol_9.getFluid(20))
                .fluidInputs(PeptoneMixture.getFluid(1000))
                .fluidOutputs(Peptone.getFluid(500))
                .fluidOutputs(Water.getFluid(500))
                .duration(600)
                .EUt(560)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(HomogenizedPancreasMixture.getFluid(1000))
                .fluidOutputs(Trypsin.getFluid(50))
                .duration(200)
                .notConsumable(Nonylphenol.getFluid(100))
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(PANCREAS)
                .fluidOutputs(HomogenizedPancreasMixture.getFluid(1000))
                .notConsumable(ULTRASONIC_HOMOGENIZER)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(SOY_BEAN)
                .output(dust, CrushedSoybean, 1)
                .duration(50)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NHeptane.getFluid(1000))
                .input(dust, CrushedSoybean, 1)
                .output(dust, DefattedSoybeanFlour, 1)
                .fluidOutputs(SoybeanOil.getFluid(100))
                .duration(120)
                .EUt(500)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .input(dust, DefattedSoybeanFlour, 1)
                .output(dust, PapaicDigestOfSoybeanMeal, 1)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, PapaicDigestOfSoybeanMeal, 1)
                .fluidOutputs(BeanSlurry.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .output(dust, Wood, 1)
                .duration(800)
                .EUt(160)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .fluidInputs(BeanSlurry.getFluid(1000))
                .notConsumable(YEEM_PETRI)
                .duration(200)
                .output(dust, Rhizobium, 1)
                .EUt(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(YEEMSolution.getFluid(100))
                .input(PLUS_STERILIZED_PETRI_DISH)
                .output(YEEM_PETRI)
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(PhosphorusPentoxide.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(1000))
                .fluidOutputs(PhosphoricAnihydride.getFluid(2000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(PhosphoricAnihydride.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(1000))
                .fluidOutputs(OrthophosphoricAcid.getFluid(2000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(OrthophosphoricAcidSolution.getFluid(2000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(OrthophosphoricAcid.getFluid(1000))
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Formaldehyde, 1)
                .fluidOutputs(MethyleneDiphosphoricAcid.getFluid(1000))
                .fluidInputs(OrthophosphoricAcid.getFluid(1000))
                .duration(200)
                .EUt(7000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(Ethylenediamine.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(Ethanolamine.getFluid(1000))
                .notConsumable(dust, Palladium, 1)
                .duration(90)
                .EUt(1280)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(EthyleneOxide.getFluid(1000))
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidOutputs(Ethanolamine.getFluid(1000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ethylenediamine.getFluid(1000))
                .fluidInputs(SodiumHydroxideSolution.getFluid(1000))
                .fluidInputs(MethyleneDiphosphoricAcid.getFluid(1000))
                .fluidOutputs(EdeticAcid.getFluid(1000))
                .duration(200)
                .EUt(1280)
                .circuitMeta(1)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .input(dust, Glucose, 1)
                .notConsumable(dust, CupriavidusNecator)
                .fluidInputs(PalmOil.getFluid(20))
                .fluidInputs(YButyrolacetone.getFluid(20))
                .fluidOutputs(PolyhydroxylAlkanoate.getFluid(100))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(PolyhydroxylAlkanoate.getFluid(1000))
                .output(plate, BioPlastic)
                .notConsumable(SHAPE_MOLD_PLATE)
                .duration(240)
                .EUt(500)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(OneFourButanediol.getFluid(1000))
                .fluidOutputs(YButyrolacetone.getFluid(1000))
                .notConsumable(dust, CucrmgbaCatalyst, 1)
                .EUt(210)
                .duration(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Hydrogen.getFluid(4000))
                .fluidOutputs(OneFourButanediol.getFluid(1000))
                .fluidInputs(OneFourButynediol.getFluid(1000))
                .notConsumable(dust, Palladium, 1)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetylene.getFluid(1000))
                .circuitMeta(1)
                .notConsumable(dust, Copper)
                .fluidInputs(Formaldehyde.getFluid(1000))
                .fluidOutputs(OneFourButynediol.getFluid(1000))
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(FLUID_SOLIDFICATION_RECIPES,
                new ItemStack[] { SHAPE_MOLD_CREDIT.getStackForm() },
                new FluidStack[] { Polytetrafluoroethylene.getFluid(36) });

        GTRecipeHandler.removeRecipesByInputs(FLUID_SOLIDFICATION_RECIPES,
                new ItemStack[] { SHAPE_MOLD_CREDIT.getStackForm() },
                new FluidStack[] { Polybenzimidazole.getFluid(18) });

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .fluidOutputs(PiranhaSolution.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PiranhaSolution.getFluid(100))
                .input(CONTAMINATED_STERILIZED_PETRI_DISH)
                .output(MetaItems.PETRI_DISH)
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(FLUID_SOLIDFICATION_RECIPES,
                new ItemStack[] { SHAPE_MOLD_CYLINDER.getStackForm(1) },
                new FluidStack[] { Polytetrafluoroethylene.getFluid(36) });

        GTRecipeHandler.removeRecipesByInputs(FLUID_SOLIDFICATION_RECIPES,
                new ItemStack[] { SHAPE_MOLD_CYLINDER.getStackForm(1) },
                new FluidStack[] { Polybenzimidazole.getFluid(18) });

        GTRecipeHandler.removeRecipesByInputs(FLUID_HEATER_RECIPES,
                new FluidStack[] { RawGrowthMedium.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(MIXER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Salt, 4),
                        OreDictUnifier.get(dust, Agar, 4),
                        OreDictUnifier.get(dust, Calcium, 4),
                        OreDictUnifier.get(dust, Meat, 4) },
                new FluidStack[] { Mutagen.getFluid(4000) });
    }
}
