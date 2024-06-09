package gtb.loaders.recipe.circuitry;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class WetwareCircuitry {

    public static void init(){


        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .fluidInputs(Polybenzimidazole.getFluid(1152))
                .input(wireFine, NaquadahAlloy, 16)
                .input(plate, Tritanium, 2)
                .input(pipeSmallFluid, Polybenzimidazole, 2)
                .input(dust, Shewanella, 2)
                .input(ELECTRIC_PUMP_LuV)
                .output(NEURO_SUPPORT_UNIT)
                .duration(200)
                .EUt(30000)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(NEURO_SUPPORT_UNIT)
                .input(ADVANCED_SMD_CAPACITOR, 4)
                .input(ADVANCED_SMD_DIODE, 4)
                .input(ADVANCED_SMD_INDUCTOR, 4)
                .input(ADVANCED_SMD_TRANSISTOR, 4)
                .input(ADVANCED_SMD_RESISTOR, 4)
                .input(ELECTRICALLY_WIRED_PETRI_DISH)
                .input(STEM_CELLS)
                .input(foil, Kevlar, 4)
                .input(foil, Zylon, 4)
                .input(wireFine, Electrum, 32)
                .output(NEURO_PROCESSOR, 4)
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] {
                        WETWARE_CIRCUIT_BOARD.getStackForm(),
                        STEM_CELLS.getStackForm(16),
                        OreDictUnifier.get(pipeSmallFluid, Polybenzimidazole, 8),
                        OreDictUnifier.get(plate, Electrum, 8),
                        OreDictUnifier.get(foil, SiliconeRubber, 16),
                        OreDictUnifier.get(bolt, HSSE, 8)},
                new FluidStack[] { SterileGrowthMedium.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] {
                        ADVANCED_SMD_TRANSISTOR.getStackForm(8),
                        ADVANCED_SMD_CAPACITOR.getStackForm(8),
                        NEURO_PROCESSOR.getStackForm(),
                        CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(),
                        NANO_CENTRAL_PROCESSING_UNIT.getStackForm(),
                        OreDictUnifier.get(wireFine, YttriumBariumCuprate, 8)},
                new FluidStack[] { Tin.getFluid(144) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] {
                        ADVANCED_SMD_TRANSISTOR.getStackForm(8),
                        ADVANCED_SMD_CAPACITOR.getStackForm(8),
                        NEURO_PROCESSOR.getStackForm(),
                        CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(),
                        NANO_CENTRAL_PROCESSING_UNIT.getStackForm(),
                        OreDictUnifier.get(wireFine, YttriumBariumCuprate, 8)},
                new FluidStack[] { SolderingAlloy.getFluid(72) });

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ADVANCED_SMD_TRANSISTOR,8)
                .input(ADVANCED_SMD_CAPACITOR, 8)
                .input(NEURO_PROCESSOR)
                .input(CRYSTAL_SYSTEM_ON_CHIP)
                .input(NANO_CENTRAL_PROCESSING_UNIT)
                .input(wireFine, YttriumBariumCuprate, 8)
                .output(WETWARE_PROCESSOR_LUV, 4)
                .fluidInputs(SolderingAlloy.getFluid(72))
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ADVANCED_SMD_TRANSISTOR,8)
                .input(ADVANCED_SMD_CAPACITOR, 8)
                .input(NEURO_PROCESSOR)
                .input(CRYSTAL_SYSTEM_ON_CHIP)
                .input(NANO_CENTRAL_PROCESSING_UNIT)
                .input(wireFine, YttriumBariumCuprate, 8)
                .output(WETWARE_PROCESSOR_LUV, 4)
                .fluidInputs(Tin.getFluid(144))
                .duration(200)
                .EUt(12000)
                .buildAndRegister();












    }
}
