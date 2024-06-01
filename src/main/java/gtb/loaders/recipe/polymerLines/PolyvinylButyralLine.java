package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;

public class PolyvinylButyralLine {

    public static void init() {
        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(PolyvinylAcetate.getFluid(144))
                .fluidInputs(Butyraldehyde.getFluid(255))
                .fluidOutputs(PolyvinylButyral.getFluid(144))
                .notConsumable(dust, ZieglerNattaCatalyst)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new FluidStack[] { PolyvinylAcetate.getFluid(144), Butyraldehyde.getFluid(250) });
    }
}
