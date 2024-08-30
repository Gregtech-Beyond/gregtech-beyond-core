package gtb.loaders.recipe.polymerLines;

import static cn.gtcommunity.epimorphism.api.recipe.EPRecipeMaps.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;

public class PolytetrafluoroethyleneLine {

    public static void init() {
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

        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, KaminskyCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(576)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, PhilipsCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(288)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .notConsumable(dust, ZieglerNattaCatalyst).fluidOutputs(Polytetrafluoroethylene.getFluid(432))
                .duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .fluidInputs(Oxygen.getFluid(1000)).fluidOutputs(Polytetrafluoroethylene.getFluid(144)).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().fluidInputs(Tetrafluoroethylene.getFluid(144))
                .fluidInputs(Air.getFluid(1000)).fluidOutputs(Polytetrafluoroethylene.getFluid(144)).duration(120)
                .EUt(670)
                .buildAndRegister();
    }
}
