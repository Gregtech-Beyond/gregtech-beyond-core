package gtb.loaders.recipe.handlers.ore_processing;

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
import gregtech.api.unification.OreDictUnifier;

public class IndiumProcessing {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, Sphalerite)
                .input(dust, Coke)
                .output(dust, ZincOreCokePellets, 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(6000))
                .input(dust, ZincOreCokePellets, 6)
                .output(dust, Zincite, 4)
                .output(dust, ZincResidualSlag)
                .fluidOutputs(ZincExhaustMixture.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ZincExhaustMixture.getFluid(1000))
                .chancedOutput(dust, ZincFlue, 4500, 750)
                .chancedOutput(dust, DarkAsh, 2500, 120)
                .fluidOutputs(CarbonMonoxide.getFluid(1000))
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .EUt(120)
                .duration(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .input(dust, ZincFlue)
                .output(dust, CadmiumZinc)
                .duration(200)
                .EUt(960)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Mercury.getFluid(1000))
                .input(dust, CadmiumZinc, 3)
                .fluidOutputs(CadmiumThalliumLiqour.getFluid(1000))
                .fluidOutputs(ZincAmalgam.getFluid(1000))
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(ZincAmalgam.getFluid(1000))
                .fluidOutputs(Mercury.getFluid(1000))
                .output(dust, Zinc)
                .duration(600)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(CadmiumThalliumLiqour.getFluid(1000))
                .output(dust, ThalliumResidues)
                .fluidOutputs(CadmiumSulfateSolution.getFluid(1000))
                .duration(290)
                .EUt(129)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(CadmiumSulfateSolution.getFluid(9000))
                .output(dust, Cadmium, 1)
                .fluidOutputs(SulfuricAcid.getFluid(9000))
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(Water.getFluid(1000))
                .input(dust, ThalliumResidues)
                .fluidOutputs(ThalliumSulfateSolution.getFluid(1000))
                .duration(600)
                .EUt(580)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrochloricAcid.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .fluidInputs(ThalliumSulfateSolution.getFluid(1000))
                .output(dust, ThalliumChloride, 4)
                .duration(500)
                .EUt(700)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Zinc)
                .output(dust, ZincChloride, 3)
                .input(dust, ThalliumChloride, 4)
                .output(dust, Thallium, 2)
                .duration(200)
                .EUt(67)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .input(dust, ZincResidualSlag)
                .output(dust, FineZincSlag)
                .duration(60)
                .EUt(17)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(dust, FineZincSlag)
                .fluidOutputs(ZincSlagSlurry.getFluid(1000))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(ZincSlagSlurry.getFluid(1000))
                .chancedOutput(dust, ZincResidualSlag, 2500, 200)
                .fluidOutputs(MetalRichSlagSlurry.getFluid(1000))
                .duration(120)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PhosphoricAcid.getFluid(1000))
                .fluidInputs(MetalRichSlagSlurry.getFluid(1000))
                .fluidOutputs(AcidicMetalRichSlagSlurry.getFluid(1000))
                .duration(600)
                .EUt(570)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PhosphoricAcid.getFluid(1000))
                .fluidInputs(AcidicMetalRichSlagSlurry.getFluid(2000))
                .fluidOutputs(SeparatedMetalRichSlagSlurry.getFluid(1000))
                .fluidOutputs(MetalRichSlagSlurry.getFluid(1000))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SeparatedMetalRichSlagSlurry.getFluid(1000))
                .input(dust, SodiumHydroxide, 18)
                .output(dust, DisodiumPhosphate, 24)
                .fluidOutputs(MetalHydroxideMix.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(MetalHydroxideMix.getFluid(1000))
                .notConsumable(wireFine, Zinc)
                .chancedOutput(dust, Zinc, 5000, 0)
                .fluidOutputs(ZincPoorMixture.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(ZincPoorMixture.getFluid(1000))
                .notConsumable(wireFine, Iron)
                .chancedOutput(dust, Iron, 5000, 0)
                .fluidOutputs(IronPoorMixture.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(IronPoorMixture.getFluid(1000))
                .notConsumable(wireFine, Copper)
                .chancedOutput(dust, Copper, 5000, 0)
                .fluidOutputs(IndiumHydroxideConcentrate.getFluid(1000))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(IndiumHydroxideConcentrate.getFluid(1000))
                .output(dust, IndiumHydroxide, 7)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .output(dust, Indium)
                .input(dust, IndiumHydroxide, 7)
                .fluidInputs(Hydrogen.getFluid(3000))
                .fluidOutputs(Steam.getFluid(3000))
                .duration(760)
                .EUt(1200)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(FLUID_HEATER_RECIPES,
                new ItemStack[] { IntCircuitIngredient.getIntegratedCircuit(4),
                        OreDictUnifier.get(dust, Aluminium, 16) },
                new FluidStack[] { IndiumConcentrate.getFluid(4000) });

        GTRecipeHandler.removeRecipesByInputs(MIXER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(crushedPurified, Sphalerite),
                        OreDictUnifier.get(crushedPurified, Galena) },
                new FluidStack[] { SulfuricAcid.getFluid(4000) });
    }
}
