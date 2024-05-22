package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
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
    }
}
