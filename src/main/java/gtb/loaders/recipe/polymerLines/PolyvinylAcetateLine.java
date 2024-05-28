package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;

public class PolyvinylAcetateLine {

    public static void init() {
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Oxygen.getFluid(1000))
                .fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Air.getFluid(1000))
                .fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(144)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, KaminskyCatalyst)
                .fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(576)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PhilipsCatalyst).fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(288)).duration(500).EUt(800).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, ZieglerNattaCatalyst)
                .fluidInputs(VinylAcetate.getFluid(144))
                .fluidOutputs(PolyvinylAcetate.getFluid(432)).duration(500).EUt(800).buildAndRegister();

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
    }
}
