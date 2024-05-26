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

public class PolyphenyleneSulfideLine {

    public static void init(){

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
    }
}
