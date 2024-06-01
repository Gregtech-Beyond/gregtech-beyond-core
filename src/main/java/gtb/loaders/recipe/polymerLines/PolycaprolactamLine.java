package gtb.loaders.recipe.polymerLines;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class PolycaprolactamLine {

    public static void init() {
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

        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, KaminskyCatalyst).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, PhilipsCatalyst).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .notConsumable(dust, ZieglerNattaCatalyst).output(dust, Polycaprolactam)
                .duration(120).EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .fluidInputs(Oxygen.getFluid(1000)).output(dust, Polycaprolactam).duration(120)
                .EUt(670).buildAndRegister();
        POLYMERIZATION_TANK_RECIPES.recipeBuilder().input(dust, PrePolymerizedCaprolactam)
                .fluidInputs(Air.getFluid(1000)).output(dust, Polycaprolactam).duration(120)
                .EUt(670)
                .buildAndRegister();
    }
}
