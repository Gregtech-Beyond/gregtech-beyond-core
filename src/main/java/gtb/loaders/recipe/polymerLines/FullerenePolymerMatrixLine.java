package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.MarkerMaterials.Color.Magenta;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.GELLED_TOLUENE;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.UVA_HALIDE_LAMP;

public class FullerenePolymerMatrixLine {

    public static void init() {
        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Naphthalene.getFluid(1000))
                .fluidInputs(SodiumCyanide.getFluid(1000))
                .fluidInputs(Bromine.getFluid(2000))
                .output(dust, SodiumBromide, 2)
                .notConsumable(UVA_HALIDE_LAMP)
                .fluidOutputs(HydrobromicAcid.getFluid(1000))
                .output(dust, Cyanonaphthalene, 19)
                .EUt(1920)
                .duration(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrobromicAcid.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(1000))
                .fluidOutputs(Bromine.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .duration(160)
                .EUt(125)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumBromide, 4)
                .fluidInputs(PhosphoricAcid.getFluid(1000))
                .fluidOutputs(HydrobromicAcid.getFluid(2000))
                .output(dust, DisodiumPhosphate, 8)
                .duration(190)
                .EUt(125)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Cyanonaphthalene, 19)
                .notConsumable(dust, TinChloride)
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .fluidOutputs(Naphthaldehyde.getFluid(1000))
                .fluidOutputs(AmmoniumChloride.getFluid(1000))
                .fluidOutputs(Chlorine.getFluid(2000))
                .EUt(1920)
                .duration(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(AmmoniumChloride.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(Ammonia.getFluid(1000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Naphthaldehyde.getFluid(1000))
                .fluidInputs(EthylBenzene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .notConsumable(dust, Iodine)
                .notConsumable(dust, Triphenylphosphine, 1)
                .fluidOutputs(Water.getFluid(2000))
                .output(dust, Methylbenzophenanthrene, 33)
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Methylbenzophenanthrene, 33)
                .input(dust, PotassiumCyanide, 3)
                .input(dust, Bromosuccinimide, 12)
                .output(dust, Benzophenanthrenylacetonitrile, 34)
                .output(dust, PotassiumBromide, 2)
                .output(dust, Succinimide, 12)
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Benzophenanthrenylacetonitrile, 102)
                .notConsumable(dust, TiAlChloride, 1)
                .output(dust, UnfoldedFullerene, 1)
                .fluidOutputs(Ammonia.getFluid(3000))
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(craftingLens, Magenta)
                .input(dust, UnfoldedFullerene, 1)
                .fluidInputs(Nitrogen.getFluid(10000))
                .output(dust, Fullerene, 1)
                .fluidOutputs(Ammonia.getFluid(10000))
                .EUt(2000000)
                .duration(200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Sodium, 6)
                .fluidInputs(PhosphorusTrichloride.getFluid(1000))
                .fluidInputs(Chlorobenzene.getFluid(3000))
                .output(dust, Salt, 12)
                .output(dust, Triphenylphosphine, 34)
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        BIO_REACTOR.recipeBuilder()
                .input(dust, EschericiaColi, 1)
                .input(dust, Sugar)
                .EUt(480)
                .output(dust, SuccinicAcid, 14)
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, SuccinicAcid, 14)
                .fluidInputs(Ammonia.getFluid(1000))
                .output(dust, Succinimide, 12)
                .fluidOutputs(Water.getFluid(2000))
                .EUt(120)
                .duration(500)
                .blastFurnaceTemp(2100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Succinimide, 12)
                .fluidInputs(Bromine.getFluid(2000))
                .output(dust, Bromosuccinimide, 12)
                .fluidOutputs(HydrobromicAcid.getFluid(1000))
                .EUt(480)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, Bromosuccinimide, 12)
                .output(dust, Carbon, 4)
                .fluidOutputs(Hydrogen.getFluid(3000))
                .fluidOutputs(HydrobromicAcid.getFluid(1000))
                .fluidOutputs(NitrogenDioxide.getFluid(1000))
                .duration(158)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfurTrioxide.getFluid(1000))
                .input(dust, Sulfur)
                .fluidInputs(Chlorine.getFluid(2000))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .fluidOutputs(ThionylChloride.getFluid(1000))
                .EUt(480)
                .duration(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TitaniumTetrachloride.getFluid(1000))
                .input(dust, AluminiumChloride, 4)
                .EUt(7680)
                .duration(50)
                .output(dust, TiAlChloride, 9)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenCyanide.getFluid(1000))
                .fluidInputs(PotassiumHydroxide.getFluid(1000))
                .circuitMeta(1)
                .output(dust, PotassiumCyanide, 3)
                .fluidOutputs(Water.getFluid(1000))
                .EUt(1920)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, PotassiumCyanide, 3)
                .output(dust, Potassium)
                .output(dust, Carbon)
                .fluidOutputs(Nitrogen.getFluid(1000))
                .duration(150)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, RockSalt, 2)
                .fluidInputs(Water.getFluid(1000))
                .fluidOutputs(PotassiumHydroxide.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .EUt(480)
                .duration(270)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Potassium)
                .fluidInputs(Chlorine.getFluid(1000))
                .output(dust, RockSalt, 2)
                .EUt(30)
                .duration(220)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(40).EUt(30)
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidInputs(IronChloride.getFluid(1000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(dust, Zeolite, 1)
                .notConsumable(dust, PdIrReOCeOS, 1)
                .fluidInputs(Iron2Chloride.getFluid(1000))
                .fluidInputs(Cyclopentadiene.getFluid(2000))
                .fluidOutputs(Ferrocene.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .EUt(30720)
                .duration(100)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Palladium)
                .input(dust, Iridium)
                .input(dust, Rhenium)
                .input(dust, Cerium)
                .input(dust, Osmium)
                .input(dust, Silicon)
                .fluidInputs(Oxygen.getFluid(4000))
                .output(dust, PdIrReOCeOS, 10)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Fullerene, 1)
                .input(dust, Sarcosine, 13)
                .input(dust, SodiumEthoxide, 27)
                .fluidInputs(Chloroform.getFluid(1000))
                .fluidInputs(Ferrocene.getFluid(1000))
                .notConsumable(TitaniumTetrachloride.getFluid(1000))
                .notConsumable(GELLED_TOLUENE)
                .output(dust, Salt, 6)
                .fluidOutputs(Ferrocenylfulleropyrrolidine.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(Ethanol.getFluid(3000))
                .EUt(500000)
                .duration(750)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .fluidInputs(Ethanol.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, SodiumEthoxide, 9)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methylamine.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(2000))
                .fluidInputs(AceticAcid.getFluid(1000))
                .notConsumable(AceticAnhydride.getFluid(1000))
                .output(dust, Sarcosine, 13)
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .EUt(7680)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ammonia.getFluid(1000))
                .fluidInputs(Methanol.getFluid(1000))
                .notConsumable(dust, AluminoSilicateWool)
                .circuitMeta(3)
                .fluidOutputs(Methylamine.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(7680)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ferrocenylfulleropyrrolidine.getFluid(1000))
                .input(dust, Palladium)
                .notConsumable(AceticAcid.getFluid(100))
                .notConsumable(NitricAcid.getFluid(100))
                .output(dust, PdFullereneMatrix, 1)
                .EUt(2000000)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenSulfide.getFluid(1000))
                .fluidInputs(Methanol.getFluid(2000))
                .fluidOutputs(Dimethylsulfide.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PotassiumPermanganate, 24)
                .fluidInputs(ThionylChloride.getFluid(1000))
                .fluidInputs(Toluene.getFluid(2000))
                .output(dust, Pyrolusite, 12)
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(PotassiumHydroxide.getFluid(4000))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .fluidOutputs(BenzoylChloride.getFluid(2000))
                .EUt(480)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .fluidInputs(BenzoylChloride.getFluid(2000))
                .fluidOutputs(BenzoylPeroxide.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .EUt(1920)
                .duration(160)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Iodine, 4)
                .fluidInputs(Hydrazine.getFluid(1000))
                .fluidOutputs(Nitrogen.getFluid(2000))
                .fluidOutputs(HydroiodicAcid.getFluid(4000))
                .duration(210)
                .EUt(500)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AcryloNitrile.getFluid(1000))
                .fluidInputs(HydroiodicAcid.getFluid(1000))
                .fluidInputs(Water.getFluid(2000))
                .fluidInputs(Styrene.getFluid(1000))
                .input(dust, LithiumAluminiumHydride, 6)
                .notConsumable(TrimethyltinChloride.getFluid(100))
                .fluidOutputs(Phenylpentanoicacid.getFluid(1000))
                .fluidOutputs(Ammonia.getFluid(1000))
                .output(dust, AluminiumHydride, 4)
                .output(dust, LithiumIodide, 2)
                .EUt(3840)
                .duration(110)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Fullerene, 2)
                .fluidInputs(Phenylpentanoicacid.getFluid(2000))
                .fluidInputs(Dimethylsulfide.getFluid(1000))
                .fluidInputs(Chlorobenzene.getFluid(2000))
                .notConsumable(BenzoylPeroxide.getFluid(1000))
                .fluidOutputs(Toluene.getFluid(2000))
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .fluidOutputs(PCBA.getFluid(2000))
                .EUt(500000)
                .duration(450)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(80).EUt(120)
                .input(dust, Silver)
                .fluidInputs(Chlorine.getFluid(1000))
                .output(dust, SilverChloride, 2)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(BoronFluoride.getFluid(8000))
                .input(dust, SilverOxide, 9)
                .notConsumable(Benzene.getFluid(1000))
                .fluidOutputs(Silvertetrafluoroborate.getFluid(6000))
                .output(dust, BoronOxide, 5)
                .EUt(7680)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ammonia.getFluid(2000))
                .fluidInputs(Phosgene.getFluid(1000))
                .fluidInputs(IsopropylAlcohol.getFluid(2000))
                .notConsumable(dust, Triphenylphosphine, 1)
                .fluidOutputs(DilutedHydrochloricAcid.getFluid(4000))
                .fluidOutputs(Diisopropylcarbodiimide.getFluid(1000))
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidInputs(Chlorine.getFluid(2000))
                .notConsumable(dust, ActivatedCarbon)
                .fluidOutputs(Phosgene.getFluid(1000))
                .EUt(1920)
                .duration(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Dimethylamine.getFluid(1000))
                .fluidInputs(Pyridine.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(2000))
                .output(dust, Dimethylaminopyridine, 19)
                .EUt(7680)
                .duration(200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(dust, Dimethylaminopyridine, 1)
                .notConsumable(Diisopropylcarbodiimide.getFluid(10))
                .fluidInputs(PCBA.getFluid(1000))
                .fluidInputs(Styrene.getFluid(1000))
                .fluidInputs(Dichloromethane.getFluid(1000))
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .fluidOutputs(PCBS.getFluid(1000))
                .EUt(500000)
                .duration(400)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(PCBS.getFluid(1000))
                .input(dust, PdFullereneMatrix, 1)
                .output(dust, FullerenePolymerMatrix, 2)
                .EUt(8000000)
                .duration(40)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NButanol.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(1000))
                .fluidOutputs(OneButane.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(OneButane.getFluid(1000))
                .input(dust, Lithium)
                .fluidOutputs(nButyllithium.getFluid(1000))
                .duration(201)
                .EUt(700)
                .buildAndRegister();

        VACUUM_DISTILLATION_TOWER.recipeBuilder()
                .input(dust, Carbon)
                .output(dust, ActivatedCarbon)
                .duration(200)
                .EUt(822)
                .buildAndRegister();

        
    }
}
