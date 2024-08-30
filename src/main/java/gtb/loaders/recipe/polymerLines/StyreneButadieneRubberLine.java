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
import gregtech.api.unification.OreDictUnifier;

public class StyreneButadieneRubberLine {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Ethanol.getFluid(1000))
                .fluidInputs(Butadiene.getFluid(3000))
                .fluidInputs(Styrene.getFluid(1000))
                .fluidOutputs(StyreneButadieneSolution.getFluid(5000))
                .duration(800)
                .EUt(640)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
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

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(StyreneButadieneSolution.getFluid(1000))
                .notConsumable(nButyllithium.getFluid(50))
                .fluidOutputs(PolymerizedStyreneButadieneSolution.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .input(dust, RawStyreneButadieneRubber, 4)
                .input(dust, Sulfur)
                .notConsumable(dust, Zincite)
                .output(ingot, StyreneButadieneRubber, 4)
                .duration(900)
                .EUt(270)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .input(dust, RawStyreneButadieneRubber, 4)
                .input(dust, Sulfur)
                .notConsumable(dust, Magnesia)
                .output(ingot, StyreneButadieneRubber, 4)
                .duration(900)
                .EUt(270)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, RawStyreneButadieneRubber, 9),
                        OreDictUnifier.get(dust, Sulfur) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, RawStyreneButadieneRubber, 9),
                        OreDictUnifier.get(dust, Sulfur) });
    }
}
