package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.MarkerMaterials.Color.Magenta;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;

public class PolymerizationRework {

    public static void init() {
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(Ethylene.getFluid(144))
                .fluidOutputs(Polyethylene.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(Ethylene.getFluid(144))
                .fluidOutputs(Polyethylene.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(Ethylene.getFluid(144))
                .fluidOutputs(Polyethylene.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(Ethylene.getFluid(144))
                .fluidOutputs(Polyethylene.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(Ethylene.getFluid(144))
                .fluidOutputs(Polyethylene.getFluid(432)).duration(500).EUt(800).buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(432)).duration(500).EUt(800).buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(VinylChloride.getFluid(144))
                .fluidOutputs(PolyvinylChloride.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(VinylChloride.getFluid(144))
                .fluidOutputs(PolyvinylChloride.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(VinylChloride.getFluid(144))
                .fluidOutputs(PolyvinylChloride.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(VinylChloride.getFluid(144))
                .fluidOutputs(PolyvinylChloride.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(VinylChloride.getFluid(144))
                .fluidOutputs(PolyvinylChloride.getFluid(432)).duration(500).EUt(800).buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Air.getFluid(1000), Ethylene.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Oxygen.getFluid(1000), Ethylene.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(3) },
                new FluidStack[] { Air.getFluid(7500), Ethylene.getFluid(2160), TitaniumTetrachloride.getFluid(100) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(3) }, new FluidStack[] {
                        Oxygen.getFluid(7500), Ethylene.getFluid(2160), TitaniumTetrachloride.getFluid(100) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Air.getFluid(1000), VinylAcetate.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Oxygen.getFluid(1000), VinylAcetate.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) }, new FluidStack[] { Air.getFluid(7500),
                        VinylAcetate.getFluid(2160), TitaniumTetrachloride.getFluid(100) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) }, new FluidStack[] {
                        Oxygen.getFluid(7500), VinylAcetate.getFluid(2160), TitaniumTetrachloride.getFluid(100) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Air.getFluid(1000), VinylChloride.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Oxygen.getFluid(1000), VinylChloride.getFluid(144) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) }, new FluidStack[] { Air.getFluid(7500),
                        VinylChloride.getFluid(2160), TitaniumTetrachloride.getFluid(100) });
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) }, new FluidStack[] {
                        Oxygen.getFluid(7500), VinylChloride.getFluid(2160), TitaniumTetrachloride.getFluid(100) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, SodiumSulfide, 3) },
                new FluidStack[] { Air.getFluid(16000), Dichlorobenzene.getFluid(1000) });
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, SodiumSulfide, 3) },
                new FluidStack[] { Oxygen.getFluid(8000), Dichlorobenzene.getFluid(1000) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodiumSulfide, 3)
                .fluidOutputs(SodiumSulfideSolution.getFluid(1000))
                .duration(120)
                .EUt(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumSulfideSolution.getFluid(1000))
                .fluidInputs(Dichlorobenzene.getFluid(1000))
                .fluidOutputs(SodiumSulfideDichloroBenzeneMixture.getFluid(2000))
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(PhenyleneSulfidePrePolymerMixture.getFluid(1000))
                .fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(1000))
                .notConsumable(dust, AluminiumChloride)
                .output(dust, Salt, 4)
                .duration(120)
                .EUt(280)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144))
                .notConsumable(dust, KaminskyCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(576)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144))
                .notConsumable(dust, PhilipsCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(288)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144))
                .notConsumable(dust, ZieglerNattaCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(432))
                .duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144))
                .fluidInputs(Oxygen.getFluid(1000)).fluidOutputs(PolyphenyleneSulfide.getFluid(144)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144))
                .fluidInputs(Air.getFluid(1000)).fluidOutputs(PolyphenyleneSulfide.getFluid(144)).duration(120).EUt(670)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { Diaminobenzidine.getFluid(1000),
                        DiphenylIsophtalate.getFluid(1000) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Diaminobenzidine.getFluid(1000))
                .fluidInputs(DiphenylIsophtalate.getFluid(1000))
                .output(dust, PolybenzimidazolePrePolymerFoam, 4)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .input(dust, PolybenzimidazolePrePolymerFoam, 1)
                .fluidOutputs(ImpurePolybenzimidazoleSolution.getFluid(1000))
                .duration(700)
                .EUt(2008)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ImpurePolybenzimidazoleSolution.getFluid(7000))
                .fluidOutputs(PolybenzimidazoleWaste.getFluid(3000))
                .fluidOutputs(PolybenzimidazoleSolution.getFluid(4000))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PolybenzimidazoleSolution.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .output(dust, Polybenzimidazole)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(PolybenzimidazoleWaste.getFluid(3000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(Toluene.getFluid(1000))
                .fluidOutputs(Phenol.getFluid(1000))
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Tetrafluoroethylene.getFluid(144),
                        Air.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(1) },
                new FluidStack[] { Tetrafluoroethylene.getFluid(144),
                        Oxygen.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) },
                new FluidStack[] { Tetrafluoroethylene.getFluid(2160),
                        TitaniumTetrachloride.getFluid(100),
                        Oxygen.getFluid(7500) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(2) },
                new FluidStack[] { Tetrafluoroethylene.getFluid(2160),
                        TitaniumTetrachloride.getFluid(100),
                        Air.getFluid(7500) });

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, KaminskyCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(576)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, PhilipsCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(288)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, ZieglerNattaCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(432))
                .duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .fluidInputs(Oxygen.getFluid(1000)).fluidOutputs(Polytetrafluoroethylene.getFluid(144)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .fluidInputs(Air.getFluid(1000)).fluidOutputs(Polytetrafluoroethylene.getFluid(144)).duration(120)
                .EUt(670)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Caprolactam) },
                new FluidStack[] { Nitrogen.getFluid(1000) });

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Caprolactam)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(dust, NitrogenizedCaprolactam)
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, NitrogenizedCaprolactam)
                .notConsumable(Butanal.getFluid(1000))
                .output(dust, PrePolymerizedCaprolactam)
                .blastFurnaceTemp(1500)
                .EUt(800)
                .duration(120)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, KaminskyCatalyst).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, PhilipsCatalyst).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, ZieglerNattaCatalyst).output(dust, Polycaprolactam)
                .duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .fluidInputs(Oxygen.getFluid(1000)).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .fluidInputs(Air.getFluid(1000)).output(dust, Polycaprolactam).duration(120)
                .EUt(670)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Ethanol.getFluid(1000))
                .fluidInputs(Butadiene.getFluid(3000))
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(StyreneButadieneSolution.getFluid(5000))
                .duration(800)
                .EUt(640)
                .buildAndRegister();

        DEHYDRATOR.recipeBuilder()
                .fluidInputs(PolymerizedStyreneButadieneSolution.getFluid(5000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(1000))
                .output(dust, RawStyreneButadieneRubber, 12)
                .duration(1200)
                .EUt(20)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { Air.getFluid(15000),
                        Styrene.getFluid(1000),
                        Butadiene.getFluid(3000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { Oxygen.getFluid(15000),
                        Styrene.getFluid(1000),
                        Butadiene.getFluid(3000) });

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(StyreneButadieneSolution.getFluid(1000))
                .notConsumable(nButyllithium.getFluid(50))
                .fluidOutputs(PolymerizedStyreneButadieneSolution.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        THERMAL_PRESS.recipeBuilder()
                .input(dust, RawStyreneButadieneRubber, 4)
                .input(dust, Sulfur)
                .notConsumable(dust, Zincite)
                .output(ingot, StyreneButadieneRubber, 4)
                .duration(900)
                .EUt(270)
                .buildAndRegister();

        THERMAL_PRESS.recipeBuilder()
                .input(dust, RawStyreneButadieneRubber, 4)
                .input(dust, Sulfur)
                .notConsumable(dust, Magnesia)
                .output(ingot, StyreneButadieneRubber, 4)
                .duration(900)
                .EUt(270)
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

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, RawStyreneButadieneRubber, 9),
                        OreDictUnifier.get(dust, Sulfur) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, RawStyreneButadieneRubber, 9),
                        OreDictUnifier.get(dust, Sulfur) });

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
                .notConsumable(dust, Carbon)
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

        // Fullerene Polymer Tetrix

        CHEMICAL_PLANT.recipeBuilder()
                .fluidInputs(Ferrocene.getFluid(1000))
                .fluidInputs(FluorohydrideAmmoniumCarbama.getFluid(1000))
                .fluidInputs(Dichloromethane.getFluid(1000))
                .fluidInputs(Phenylpentanoicacid.getFluid(1000))
                .fluidOutputs(PCBB.getFluid(1000))
                .input(dust, Fullerene, 1)
                .input(dust, Rhodium_II_Acetate, 1)
                .notConsumable(plate, Platinum)
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidInputs(HydrofluoricAcid.getFluid(1000))
                .fluidOutputs(HydrofluoricMethane.getFluid(1000))
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrofluoricMethane.getFluid(1000))
                .fluidInputs(NitricOxide.getFluid(1000))
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .fluidOutputs(FluorohydrideAmmoniumCarbama.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Chlorine.getFluid(3000))
                .input(dust, Rhodium, 2)
                .output(dust, Rhodium_III_Chloride, 2)
                .blastFurnaceTemp(1900)
                .EUt(700)
                .duration(102)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(AceticAcid.getFluid(1000))
                .output(dust, Rhodium_II_Acetate)
                .input(dust, Rhodium_III_Chloride)
                .blastFurnaceTemp(2700)
                .duration(1200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PCBB.getFluid(1000))
                .input(dust, PdFullereneMatrix)
                .output(dust, FullerenePolymerTetrix)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        // Polydimethylsiloxane

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, Polydimethylsiloxane, 9),
                        OreDictUnifier.get(dust, Sulfur) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { Water.getFluid(1000), Dimethyldichlorosilane.getFluid(1000) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .fluidInputs(Dimethyldichlorosilane.getFluid(1000))
                .output(dust, Dimethylsiloxane, 3)
                .fluidOutputs(DilutedHydrochloricAcid.getFluid(1000))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, Dimethylsiloxane)
                .notConsumable(dust, ZieglerNattaCatalyst)
                .output(dust, Polydimethylsiloxane, 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, Dimethylsiloxane)
                .notConsumable(dust, PhilipsCatalyst)
                .output(dust, Polydimethylsiloxane, 2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .input(dust, Dimethylsiloxane)
                .notConsumable(dust, KaminskyCatalyst)
                .output(dust, Polydimethylsiloxane, 4)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        THERMAL_PRESS.recipeBuilder()
                .input(dust, Polydimethylsiloxane, 9)
                .input(dust, Sulfur)
                .fluidOutputs(SiliconeRubber.getFluid(1296))
                .EUt(700)
                .duration(100)
                .buildAndRegister();

        // Polyurethane

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

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(1000))
                .fluidInputs(Air.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(4000))
                .notConsumable(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(2000))
                .notConsumable(dust, PhilipsCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(UrethanePrePolymer.getFluid(1000))
                .fluidOutputs(Polyurethane.getFluid(3000))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        // Polystyrene

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(1000))
                .fluidInputs(Air.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(4000))
                .notConsumable(dust, KaminskyCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(2000))
                .notConsumable(dust, PhilipsCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(Polystyrene.getFluid(3000))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        // Polyvinyl Butyral Line

        POLYMERIZATION_TANK.recipeBuilder()
                .fluidInputs(PolyvinylAcetate.getFluid(144))
                .fluidInputs(Butyraldehyde.getFluid(255))
                .fluidOutputs(PolyvinylButyral.getFluid(144))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { PolyvinylAcetate.getFluid(144), Butyraldehyde.getFluid(250) });

        // Polystyrene Nanoparticles
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

        DEHYDRATOR.recipeBuilder().duration(180).EUt(1920)
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
        // Zylon

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
                .output(dust, Zylon)
                .EUt(120)
                .duration(16000)
                .blastFurnaceTemp(10000)
                .buildAndRegister();
    }
}
