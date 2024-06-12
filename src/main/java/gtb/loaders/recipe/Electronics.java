package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.stack.UnificationEntry;

import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.BlockCoolingCoil;

public class Electronics {

    public static void init() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Polybenzimidazole)
                .input(ELECTRIC_MOTOR_HV)
                .input(dye, DyeOrange)
                .input(stick, Steel, 4)
                .output(ROTARRY_SPINNING_WHISKER)
                .duration(2000)
                .EUt(700)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .notConsumable(SHAPE_MOLD_INGOT)
                .input(dust, Silver)
                .output(ingot, SinteredSilver)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(dust, Cobalt, 2)
                .input(dust, Silver, 5)
                .input(dust, Steel, 1)
                .output(dust, SilverAlloy, 8)
                .circuitMeta(3)
                .duration(80)
                .EUt(500)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .input(dust, SilverAlloy, 1)
                .output(ingot, SilverAlloy, 1)
                .blastFurnaceTemp(2000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Nomex.getFluid(1000))
                .input(plate, SilverAlloy, 4)
                .input(SINTERED_SILVER_COIL)
                .input(foil, Zylon, 2)
                .output(GTBMetaBlocks.COOLING_COIL.getState(BlockCoolingCoil.CoolingCoilType.SILVER_ALLOY).getBlock())
                .duration(400)
                .EUt(2000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Silvertetrafluoroborate.getFluid(144))
                .input(foil, Mica, 2)
                .input(stick, SinteredSilver, 2)
                .output(SINTERED_SILVER_COIL)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ModHandler.removeRecipeByOutput(ITEM_FILTER.getStackForm());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Zinc, 16)
                .input(plate, Steel)
                .output(ITEM_FILTER)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ModHandler.addShapedRecipe("vacuum_tube_component_recipe", VACUUM_TUBE_COMPONENTS.getStackForm(),
                " F ", "C C", "B B",
                'B', new UnificationEntry(bolt, Steel),
                'C', new UnificationEntry(cableGtSingle, Copper),
                'F', new UnificationEntry(wireFine, RedAlloy));

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                .input(SILICON_DIOXIDE_WAFER)
                .output(THICK_FILM_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(THICK_FILM_WAFER)
                .output(THICK_FILM_RESISTOR_BASE_WAFER)
                .duration(200)
                .fluidInputs(Lubricant.getFluid(100))
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(wireFine, Tantalum, 2)
                .input(THICK_FILM_RESISTOR_BASE_WAFER)
                .input(dust, Carbon)
                .output(THICK_FILM_RESISTOR_WAFER, 2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(wireFine, Electrum, 2)
                .input(THICK_FILM_RESISTOR_BASE_WAFER)
                .input(dust, Carbon)
                .output(THICK_FILM_RESISTOR_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(THICK_FILM_RESISTOR_WAFER)
                .output(SMD_RESISTOR, 16)
                .fluidInputs(Lubricant.getFluid(20))
                .duration(80)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Copper, 8)
                .output(TRANSISTOR_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Aluminium, 8)
                .output(TRANSISTOR_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Tantalum, 6)
                .output(TRANSISTOR_BASE_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Platinum, 5)
                .output(TRANSISTOR_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Titanium, 4)
                .output(TRANSISTOR_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(SILICON_DIOXIDE_WAFER)
                .input(wireFine, Tungsten, 2)
                .output(TRANSISTOR_WAFER)
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(TRANSISTOR_WAFER)
                .output(SMD_TRANSISTOR, 16)
                .fluidInputs(Lubricant.getFluid(60))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, FerriteMixture, 1) },
                new FluidStack[] { Oxygen.getFluid(1000) });

        ARC_FURNACE_RECIPES.recipeBuilder()
                .input(dust, FerriteMixture)
                .fluidInputs(Oxygen.getFluid(1000))
                .output(dust, NickelZincFerrite)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
                .input(N_DOPED_SILICON_DIOXIDE_WAFER)
                .fluidInputs(NovolacsPhotoresist.getFluid(144))
                .output(PATTERENED_SILICON_DIOXIDE_WAFER)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(N_DOPED_SILICON_DIOXIDE_WAFER)
                .notConsumable(INDUCTOR_LITHOGRAPHY_MASK)
                .fluidInputs(NovolacsPhotoresist.getFluid(144))
                .output(PATTERENED_SILICON_DIOXIDE_WAFER)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(PATTERENED_SILICON_DIOXIDE_WAFER)
                .fluidInputs(NitricAcid.getFluid(100))
                .output(ETCHED_INDUCTOR_WAFER)
                .duration(90)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ETCHED_INDUCTOR_WAFER)
                .input(wireFine, Cupronickel, 4)
                .input(ring, NickelZincFerrite)
                .output(INDUCTOR_WAFER)
                .fluidInputs(Polyethylene.getFluid(144))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(INDUCTOR_WAFER)
                .fluidInputs(Lubricant.getFluid(72))
                .output(SMD_INDUCTOR, 16)
                .duration(90)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(N_DOPED_SILICON_DIOXIDE_WAFER)
                .input(foil, Molybdenum)
                .output(REINFORCED_BASE_WAFER)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(N_DOPED_SILICON_DIOXIDE_WAFER)
                .input(foil, Palladium)
                .output(REINFORCED_BASE_WAFER, 2)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(REINFORCED_BASE_WAFER)
                .fluidInputs(NovolacsPhotoresist.getFluid(144))
                .output(PATTERENED_BASE_WAFER)
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(PATTERENED_BASE_WAFER)
                .input(wireFine, Copper, 4)
                .output(DIODE_WAFER)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(Lubricant.getFluid(80))
                .input(DIODE_WAFER)
                .output(SMD_DIODE, 16)
                .duration(200)
                .EUt(249)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(foil, Aluminium, 4)
                .input(Items.PAPER)
                .output(RAW_CAPACITOR_ROLL, 8)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(BoricAcid.getFluid(72))
                .input(RAW_CAPACITOR_ROLL, 8)
                .output(ALUMINIUM_CAPACITOR, 8)
                .duration(240)
                .EUt(180)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ALUMINIUM_CAPACITOR, 16)
                .input(ring, SiliconeRubber, 2)
                .input(foil, Aluminium, 2)
                .output(SMD_CAPACITOR, 16)
                .duration(800)
                .EUt(270)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ALUMINIUM_CAPACITOR, 16)
                .input(ring, StyreneButadieneRubber)
                .input(foil, Aluminium, 2)
                .output(SMD_CAPACITOR, 16)
                .duration(800)
                .EUt(270)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(ALUMINIUM_CAPACITOR, 16)
                .input(ring, Rubber, 8)
                .input(foil, Aluminium, 2)
                .output(SMD_CAPACITOR, 16)
                .duration(800)
                .EUt(270)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Copper, 4),
                        OreDictUnifier.get(plate, Polyethylene) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Copper, 4),
                        OreDictUnifier.get(plate, PolyvinylChloride) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Copper, 4),
                        OreDictUnifier.get(plate, Polytetrafluoroethylene) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Copper, 4),
                        OreDictUnifier.get(plate, Polybenzimidazole) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(foil, Copper, 4)
                .input(plate, Polyethylene)
                .output(PLASTIC_BOARD)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(foil, Copper, 4)
                .input(plate, PolyvinylChloride)
                .output(PLASTIC_BOARD, 2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(foil, Copper, 4)
                .input(plate, Polytetrafluoroethylene)
                .output(PLASTIC_BOARD, 4)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(foil, Copper, 4)
                .input(plate, Polybenzimidazole)
                .output(PLASTIC_BOARD, 8)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(Iron3Chloride.getFluid(100))
                .input(PLASTIC_BOARD)
                .output(PLASTIC_CIRCUIT_BOARD)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(SodiumBisulfateSolution.getFluid(100))
                .input(PLASTIC_BOARD)
                .output(PLASTIC_CIRCUIT_BOARD)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000))
                .input(dust, SodiumBisulfate, 3)
                .fluidOutputs(SodiumBisulfateSolution.getFluid(1000))
                .duration(190)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SodiumBisulfateSolution.getFluid(1000))
                .output(dust, SodiumBisulfate, 3)
                .fluidOutputs(Water.getFluid(1000))
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(Iron3Chloride.getFluid(100))
                .input(PATTERENED_PHENOLIC_CIRCUIT_BOARD)
                .output(GOOD_CIRCUIT_BOARD)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(SodiumBisulfateSolution.getFluid(100))
                .input(PATTERENED_PHENOLIC_CIRCUIT_BOARD)
                .output(GOOD_CIRCUIT_BOARD)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .fluidInputs(NovolacsPhotoresist.getFluid(100))
                .input(PHENOLIC_BOARD)
                .output(PATTERENED_PHENOLIC_CIRCUIT_BOARD)
                .duration(299)
                .EUt(12)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(wireFine, Electrum, 4),
                        OreDictUnifier.get(dust, Carbon) },
                new FluidStack[] { Polyethylene.getFluid(288) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(wireFine, Tantalum, 4),
                        OreDictUnifier.get(dust, Carbon) },
                new FluidStack[] { Polyethylene.getFluid(288) });

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(EPOXY_BOARD)
                .input(foil, Gold)
                .output(LAMINATED_EPOXY_BOARD)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(LAMINATED_EPOXY_BOARD)
                .output(ENGRAVED_EPOXY_BOARD)
                .duration(200)
                .EUt(490)
                .buildAndRegister();

        ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
                .fluidInputs(NovolacsPhotoresist.getFluid(144))
                .input(ENGRAVED_EPOXY_BOARD)
                .circuitMeta(0)
                .output(PATTERENED_EPOXY_BOARD)
                .duration(200)
                .EUt(470)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(Iron3Chloride.getFluid(100))
                .input(PATTERENED_EPOXY_BOARD)
                .output(ADVANCED_CIRCUIT_BOARD)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(SodiumBisulfateSolution.getFluid(100))
                .input(PATTERENED_EPOXY_BOARD)
                .output(ADVANCED_CIRCUIT_BOARD)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(plate, Epoxy)
                .input(plate, Polyetheretherketone)
                .output(plate, EpoxidPCBBase)
                .duration(210)
                .EUt(520)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(500))
                .input(foil, Gold, 8)
                .input(plate, EpoxidPCBBase)
                .output(EPOXY_BOARD)
                .duration(340)
                .EUt(78)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, Epoxy, 1),
                        OreDictUnifier.get(foil, Gold, 8) },
                new FluidStack[] { SulfuricAcid.getFluid(500) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { EPOXY_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Electrum, 8) },
                new FluidStack[] { SodiumPersulfate.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { EPOXY_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Electrum, 8) },
                new FluidStack[] { Iron3Chloride.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(BLAST_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dustSmall, GalliumArsenide, 1),
                        IntCircuitIngredient.getIntegratedCircuit(2),
                        OreDictUnifier.get(dust, Silicon, 32) });

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(dust, GalliumArsenide)
                .input(dust, Silicon, 32)
                .input(MONOCRYSTALLINE_SEED_CRYSTAL)
                .output(UNBAKED_MONOCRYSTALLINE_SILICON_BOULE)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(800)
                .input(UNBAKED_MONOCRYSTALLINE_SILICON_BOULE)
                .output(SILICON_BOULE)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Polyethylene.getFluid(288))
                .input(TRANSISTOR_BASE_WAFER)
                .input(foil, Gallium, 8)
                .output(TRANSISTOR_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Polytetrafluoroethylene.getFluid(144))
                .input(TRANSISTOR_BASE_WAFER)
                .input(foil, Gallium, 4)
                .output(TRANSISTOR_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Polybenzimidazole.getFluid(72))
                .input(TRANSISTOR_BASE_WAFER)
                .input(foil, Gallium, 2)
                .output(TRANSISTOR_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(FullerenePolymerMatrix.getFluid(36))
                .input(TRANSISTOR_BASE_WAFER)
                .input(foil, Gallium, 2)
                .output(TRANSISTOR_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Gallium, 1),
                        OreDictUnifier.get(wireFine, AnnealedCopper, 8) },
                new FluidStack[] { Polyethylene.getFluid(144) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Gallium, 1),
                        OreDictUnifier.get(wireFine, Tantalum, 8) },
                new FluidStack[] { Polyethylene.getFluid(144) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, SiliconeRubber, 1),
                        OreDictUnifier.get(foil, Aluminium, 1) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, PolyvinylChloride, 1),
                        OreDictUnifier.get(foil, Tantalum, 1) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, PolyvinylChloride, 1),
                        OreDictUnifier.get(foil, Tantalum, 1) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(dust, GalliumArsenide, 1),
                        OreDictUnifier.get(wireFine, Platinum, 8) },
                new FluidStack[] { Polyethylene.getFluid(288) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(ring, NickelZincFerrite, 1),
                        OreDictUnifier.get(wireFine, Cupronickel, 4) },
                new FluidStack[] { Polyethylene.getFluid(144) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(ring, NickelZincFerrite, 1),
                        OreDictUnifier.get(wireFine, Tantalum, 4) },
                new FluidStack[] { Polyethylene.getFluid(144) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { PLASTIC_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Copper, 6) },
                new FluidStack[] { SodiumPersulfate.getFluid(500) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { PLASTIC_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Copper, 6) },
                new FluidStack[] { Iron3Chloride.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, Polyethylene, 1),
                        OreDictUnifier.get(foil, Copper, 4) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, PolyvinylChloride, 1),
                        OreDictUnifier.get(foil, Copper, 4) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, Polytetrafluoroethylene, 1),
                        OreDictUnifier.get(foil, Copper, 4) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, Polybenzimidazole, 1),
                        OreDictUnifier.get(foil, Copper, 4) },
                new FluidStack[] { SulfuricAcid.getFluid(250) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { OreDictUnifier.get(plate, Epoxy, 1),
                        OreDictUnifier.get(foil, Gold, 8) },
                new FluidStack[] { SulfuricAcid.getFluid(500) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Aluminium, 1),
                        OreDictUnifier.get(foil, PolyvinylChloride, 2) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Tantalum, 1),
                        OreDictUnifier.get(foil, SiliconeRubber, 1) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(ASSEMBLER_RECIPES,
                new ItemStack[] { OreDictUnifier.get(foil, Tantalum, 1),
                        OreDictUnifier.get(foil, PolyvinylChloride, 2) },
                new FluidStack[] { Polyethylene.getFluid(72) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { EPOXY_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Electrum, 8) },
                new FluidStack[] { SodiumPersulfate.getFluid(1000) });

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { EPOXY_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Electrum, 8) },
                new FluidStack[] { Iron3Chloride.getFluid(500) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { PHENOLIC_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Silver, 4) },
                new FluidStack[] { SodiumPersulfate.getFluid(200) });

        GTRecipeHandler.removeRecipesByInputs(CHEMICAL_RECIPES,
                new ItemStack[] { PHENOLIC_BOARD.getStackForm(),
                        OreDictUnifier.get(foil, Silver, 4) },
                new FluidStack[] { Iron3Chloride.getFluid(100) });

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Formaldehyde.getFluid(1000))
                .fluidInputs(Phenol.getFluid(1000))
                .fluidOutputs(NovolacsPhotoresist.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .input(ANNEALED_NICKEL_PLATE)
                .output(NICKEL_BREEDING_BED)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .input(plate, Nickel)
                .output(ANNEALED_NICKEL_PLATE)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(SolderingAlloy.getFluid(1296))
                .input(gemExquisite, NetherQuartz)
                .input(wireFine, Gold, 4)
                .output(PIEZOELECTRIC_CRYSTAL)
                .duration(1000)
                .EUt(1700)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(SolderingAlloy.getFluid(144))
                .output(ULTRASONIC_HOMOGENIZER)
                .input(stick, RhodiumPlatedPalladium)
                .input(PIEZOELECTRIC_CRYSTAL)
                .duration(1000)
                .EUt(1700)
                .buildAndRegister();
    }
}
