package gtb.loaders.recipe;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import java.util.ArrayList;
import java.util.List;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class PolymerizationRework {

    public static void init() {

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(Ethylene.getFluid(144)).fluidOutputs(Polyethylene.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(Ethylene.getFluid(144)).fluidOutputs(Polyethylene.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(Ethylene.getFluid(144)).fluidOutputs(Polyethylene.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(Ethylene.getFluid(144)).fluidOutputs(Polyethylene.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(Ethylene.getFluid(144)).fluidOutputs(Polyethylene.getFluid(432)).duration(500).EUt(800).buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(VinylAcetate.getFluid(144)).fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(VinylAcetate.getFluid(144)).fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(VinylAcetate.getFluid(144)).fluidOutputs(PolyvinylAcetate.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(VinylAcetate.getFluid(144)).fluidOutputs(PolyvinylAcetate.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(VinylAcetate.getFluid(144)).fluidOutputs(PolyvinylAcetate.getFluid(432)).duration(500).EUt(800).buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Air.getFluid(1000)).fluidInputs(VinylChloride.getFluid(144)).fluidOutputs(PolyvinylChloride.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(Oxygen.getFluid(1000)).fluidInputs(VinylChloride.getFluid(144)).fluidOutputs(PolyvinylChloride.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, KaminskyCatalyst).fluidInputs(VinylChloride.getFluid(144)).fluidOutputs(PolyvinylChloride.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(VinylChloride.getFluid(144)).fluidOutputs(PolyvinylChloride.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().input(dust, ZieglerNattaCatalyst).fluidInputs(VinylChloride.getFluid(144)).fluidOutputs(PolyvinylChloride.getFluid(432)).duration(500).EUt(800).buildAndRegister();


        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Air.getFluid(1000), Ethylene.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Oxygen.getFluid(1000), Ethylene.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(3)}, new FluidStack[]{Air.getFluid(7500), Ethylene.getFluid(2160), TitaniumTetrachloride.getFluid(100)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(3)}, new FluidStack[]{Oxygen.getFluid(7500), Ethylene.getFluid(2160), TitaniumTetrachloride.getFluid(100)});

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Air.getFluid(1000), VinylAcetate.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Oxygen.getFluid(1000), VinylAcetate.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(2)}, new FluidStack[]{Air.getFluid(7500), VinylAcetate.getFluid(2160), TitaniumTetrachloride.getFluid(100)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(2)}, new FluidStack[]{Oxygen.getFluid(7500), VinylAcetate.getFluid(2160), TitaniumTetrachloride.getFluid(100)});

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Air.getFluid(1000), VinylChloride.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(1)}, new FluidStack[]{Oxygen.getFluid(1000), VinylChloride.getFluid(144)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(2)}, new FluidStack[]{Air.getFluid(7500), VinylChloride.getFluid(2160), TitaniumTetrachloride.getFluid(100)});
        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES, new ItemStack[]{ IntCircuitIngredient.getIntegratedCircuit(2)}, new FluidStack[]{Oxygen.getFluid(7500), VinylChloride.getFluid(2160), TitaniumTetrachloride.getFluid(100)});

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ OreDictUnifier.get(dust, SodiumSulfide, 3)}, new FluidStack[]{Air.getFluid(16000), Dichlorobenzene.getFluid(1000)});
        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES, new ItemStack[]{ OreDictUnifier.get(dust, SodiumSulfide, 3)}, new FluidStack[]{Oxygen.getFluid(8000), Dichlorobenzene.getFluid(1000)});


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
                .duration(1200)
                .EUt(280)
                .buildAndRegister();

        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144)).notConsumable(dust, KaminskyCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(576)).duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144)).notConsumable(dust, PhilipsCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(288)).duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144)).notConsumable(dust, ZieglerNattaCatalyst).fluidOutputs(PolyphenyleneSulfide.getFluid(432)).duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144)).fluidInputs(Oxygen.getFluid(1000)).fluidOutputs(PolyphenyleneSulfide.getFluid(144)).duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK.recipeBuilder().fluidInputs(SodiumSulfideDichloroBenzeneMixture.getFluid(144)).fluidInputs(Air.getFluid(1000)).fluidOutputs(PolyphenyleneSulfide.getFluid(144)).duration(120).EUt(670).buildAndRegister();

    }

}