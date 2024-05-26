package gtb.loaders.recipe.polymerLines;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class PolydimethylsiloxaneLine {

    public static void init(){
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

    }
}
