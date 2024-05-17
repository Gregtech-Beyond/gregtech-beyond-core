package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.common.block.blocks.GTBExplosive.CasingType.*;
import static gtb.common.item.GTBMetaItems.*;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Material;
import gregtech.common.items.MetaItems;

import gtb.api.unification.materials.GTBMaterials;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.item.GTBMetaItems;

public class Photolithography {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Redstone.getFluid(1000))
                .input(MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER)
                .output(NANO_CPU_WAFER)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.NovolacsPhotoresist.getFluid(144))
                .input(PHOTOCOATED_HASSIUM_WAFER)
                .output(TREATED_PHOTOCOATED_HASSIUM_WAFER)
                .duration(200)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(UHPIC_BASE_WAFER)
                .output(UHPIC_BASE, 16)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(BARIUM_TITANTE_SEED_CRYSTAL)
                .input(ingot, GTBMaterials.BariumTitanate, 4)
                .output(BARIUM_TITANATE_BOULE)
                .blastFurnaceTemp(2000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(BARIUM_TITANATE_BOULE)
                .output(BARIUM_TITANATE_SUBSTRATE_WAFER, 16).output(BARIUM_TITANTE_SEED_CRYSTAL)
                .duration(200)
                .EUt(1299)
                .fluidInputs(GTBMaterials.ExtraDistilledWater.getFluid(1000))
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.SiliconCarbide.getFluid(144))
                .circuitMeta(1)
                .fluidOutputs(GTBMaterials.SiliconCarbideVapor.getFluid(144))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(WIRED_SUBSTRATE_WAFER)
                .fluidInputs(GTBMaterials.LiquidXenon.getFluid(1000))
                .output(UHPIC_BASE_WAFER)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(RAM_LITHOGRAPHY_MASK)
                .input(MetaItems.SILICON_WAFER)
                .output(ENGRAVED_RAM_WAFER)
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(wireGtSingle, UraniumTriplatinum, 2)
                .input(UHPIC_BASE)
                .input(MetaItems.FIELD_GENERATOR_UV)
                .input(plate, Polytetrafluoroethylene)
                .input(plate, Duranium)
                .input(wireFine, Naquadah)
                .fluidInputs(NaquadahAlloy.getFluid(144))
                .output(MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT)
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(DOPED_POWER_IC_WAFER)
                .fluidInputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
                .output(MetaItems.POWER_INTEGRATED_CIRCUIT_WAFER)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(Nitrogen.getFluid(1000))
                .circuitMeta(1)
                .fluidOutputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_WAFER)
                .output(ENGRAVED_RAM_WAFER)
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(DOPED_RAM_WAFER)
                .fluidInputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
                .output(MetaItems.RANDOM_ACCESS_MEMORY_WAFER)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(DOPED_CPU_WAFER)
                .fluidInputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
                .output(MetaItems.CENTRAL_PROCESSING_UNIT_WAFER)
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(CPU_LITHOGRAPHY_MASK)
                .input(MetaItems.SILICON_WAFER)
                .output(ENGRAVED_CPU_WAFER)
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(PHOTOPOLYMER_PLATE)
                .output(foil, Mica)
                .duration(80)
                .EUt(8000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
                .output(CELAUWAFER, 16)
                .fluidInputs(Water.getFluid(64))
                .duration(800)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
                .output(CELAUWAFER, 16)
                .fluidInputs(DistilledWater.getFluid(32))
                .duration(600)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
                .output(CELAUWAFER, 16)
                .fluidInputs(Lubricant.getFluid(16))
                .duration(400)
                .EUt(90000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(CELAUWAFER)
                .fluidInputs(Acetone.getFluid(1000))
                .output(FCELAUWAFER)
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(FCELAUWAFER)
                .fluidInputs(Methanol.getFluid(1000))
                .output(CELAWAFER)
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(CELAWAFER)
                .fluidInputs(GTBMaterials.PhotopolymerSolution.getFluid(1000))
                .output(PHOTOGENALLY_ENHANCED_WAFER)
                .fluidOutputs(GTBMaterials.UsedPhotopolymerSolution.getFluid(1000))
                .duration(800)
                .EUt(24000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.UsedPhotopolymerSolution.getFluid(1000))
                .circuitMeta(1)
                .fluidOutputs(GTBMaterials.PhotopolymerSolution.getFluid(500))
                .duration(1000)
                .EUt(24000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Aluminium)
                .input(plate, BorosilicateGlass)
                .circuitMeta(1)
                .output(LITHOGRAPHY_BASE_MASK)
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(1)
                .output(PIC_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(2)
                .output(CPU_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(3)
                .output(RAM_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(4)
                .output(SINGLE_JOSEPHSON_JUNCTION_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(5)
                .output(LPIC_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(6)
                .output(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK)
                .input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(7)
                .output(NANOCPU_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(8)
                .output(HASOC_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(Xenon.getFluid(1000))
                .fluidOutputs(GTBMaterials.VeryHotXenon.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.SILICON_WAFER)
                .output(ENGRAVED_RAM_WAFER).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.PHOSPHORUS_WAFER)
                .output(ENGRAVED_RAM_WAFER, 4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.NAQUADAH_WAFER)
                .output(ENGRAVED_RAM_WAFER, 8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.NEUTRONIUM_WAFER)
                .output(ENGRAVED_RAM_WAFER, 12).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(PIC_LITHOGRAPHY_MASK).input(POLYSILICON_WAFER)
                .output(ENGRAVED_POWER_IC_WAFER).duration(20).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.SILICON_WAFER)
                .output(ENGRAVED_CPU_WAFER).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.PHOSPHORUS_WAFER)
                .output(ENGRAVED_CPU_WAFER, 4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.NAQUADAH_WAFER)
                .output(ENGRAVED_CPU_WAFER, 8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.NEUTRONIUM_WAFER)
                .output(ENGRAVED_CPU_WAFER, 12).duration(20).EUt(12).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.VeryHotArgon.getFluid(1000))
                .input(DOPED_HIGH_POWER_IC_WAFER)
                .output(MetaItems.HIGH_POWER_INTEGRATED_CIRCUIT)
                .fluidOutputs(Argon.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(dust, Graphite, 3)
                .fluidInputs(GTBMaterials.GrapheneOxidationSolution.getFluid(100))
                .output(dust, GTBMaterials.GraphiteOxide)
                .chancedOutput(dust, GTBMaterials.GrapheneOxidationResidues, 8000, 100)
                .duration(200)
                .EUt(2000)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(dust, GTBMaterials.GraphiteOxide)
                .notConsumable(NICKEL_BREEDING_BED)
                .fluidInputs(Methane.getFluid(1000))
                .output(dust, GTBMaterials.GrapheneOxide)
                .duration(200)
                .EUt(2000)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.GrapheneOxidationResidues)
                .fluidOutputs(GTBMaterials.GrapheneOxidationSolution.getFluid(100))
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(ENGRAVED_TITANATE_SUBSTRATE_WAFER)
                .input(dust, EnrichedNaquadahTriniumEuropiumDuranide)
                .fluidInputs(GTBMaterials.SiliconCarbideVapor.getFluid(144))
                .output(SUPERCONDUCTOR_COATED_SUBSTRATE_WAFER)
                .duration(800)
                .EUt(1800)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(MetaItems.POWER_INTEGRATED_CIRCUIT)
                .input(dust, GTBMaterials.SilverBromide)
                .input(dust, IndiumGalliumPhosphide)
                .output(DOPED_HIGH_POWER_IC_WAFER)
                .duration(400)
                .EUt(200)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .input(MetaItems.SILICON_WAFER)
                .output(SILICON_DIOXIDE_WAFER)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .input(MetaItems.PHOSPHORUS_WAFER)
                .output(GTBMetaItems.SILICON_DIOXIDE_WAFER, 2)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(4000))
                .input(MetaItems.NAQUADAH_WAFER)
                .output(GTBMetaItems.SILICON_DIOXIDE_WAFER, 4)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(6000))
                .input(MetaItems.NEUTRONIUM_WAFER)
                .output(GTBMetaItems.SILICON_DIOXIDE_WAFER, 6)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.Silane.getFluid(1000))
                .input(N_DOPED_SILICON_DIOXIDE_WAFER)
                .output(POLYSILICON_WAFER)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.SILICON_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.PHOSPHORUS_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 4).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NAQUADAH_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 8).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NEUTRONIUM_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 12).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.SILICON_WAFER)
                .notConsumable(GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK).output(ENGRAVED_NANOCPU_WAFER).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.PHOSPHORUS_WAFER)
                .notConsumable(GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK).output(ENGRAVED_NANOCPU_WAFER, 4).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NAQUADAH_WAFER)
                .notConsumable(GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK).output(ENGRAVED_NANOCPU_WAFER, 8).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NEUTRONIUM_WAFER)
                .notConsumable(GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK).output(ENGRAVED_NANOCPU_WAFER, 12).duration(400)
                .EUt(480).buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(DOPED_NANOCPU_WAFER)
                .fluidInputs(GTBMaterials.Trichlorosilane.getFluid(1000))
                .output(GATED_NANOCPU_WAFER)
                .duration(499)
                .EUt(80)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(GATED_NANOCPU_WAFER)
                .fluidInputs(GTBMaterials.Trichlorosilane.getFluid(1000), Oxygen.getFluid(1000))
                .output(INSULATED_NANOCPU_WAFER)
                .duration(499)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(INSULATED_NANOCPU_WAFER)
                .notConsumable(lens, MarkerMaterials.Color.Red)
                .output(TRENCHED_INSULATED_NANOCPU_WAFER).duration(200).EUt(12).buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(TRENCHED_INSULATED_NANOCPU_WAFER)
                .input(dust, Copper)
                .output(UNPLANARIZED_NANOCPU_WAFER)
                .duration(20)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(UNPLANARIZED_NANOCPU_WAFER)
                .fluidInputs(DilutedSulfuricAcid.getFluid(1000))
                .output(MetaItems.NANO_CENTRAL_PROCESSING_UNIT_WAFER)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.ENGRAVED_NAND_WAFER)
                .fluidInputs(DilutedSulfuricAcid.getFluid(1000))
                .output(MetaItems.NAND_MEMORY_CHIP_WAFER)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.ENGRAVED_NOR_WAFER)
                .fluidInputs(DilutedSulfuricAcid.getFluid(1000))
                .output(MetaItems.NOR_MEMORY_CHIP_WAFER)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.SILICON_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.PHOSPHORUS_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 4).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NAQUADAH_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 8).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(MetaItems.NEUTRONIUM_WAFER)
                .notConsumable(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK).output(ENGRAVED_IC_WAFER, 12).duration(400).EUt(12)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(NICKEL_NITRIDE_WAFER)
                .notConsumable(GTBMetaItems.NOR_PHOTOLITHOGRAPHY_MASK).output(ENGRAVED_NOR_WAFER).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().input(NICKEL_NITRIDE_WAFER)
                .notConsumable(GTBMetaItems.NAND_PHOTOLITHOGRAPHY_MASK).output(ENGRAVED_NAND_WAFER).duration(400)
                .EUt(12).buildAndRegister();

        // ASOC chain

        // Chloronaquadic acid

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(AquaRegia.getFluid(1000))
                .fluidOutputs(GTBMaterials.VeryHotAquaRegia.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Naquadah)
                .fluidInputs(GTBMaterials.VeryHotAquaRegia.getFluid(1000))
                .fluidOutputs(GTBMaterials.ChloronaquadicAcid.getFluid(1000))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.ChloronaquadicAcid.getFluid(1000))
                .input(dust, GTBMaterials.SodiumNitrate)
                .output(dust, GTBMaterials.NaquadahDioxide)
                .fluidOutputs(SaltWater.getFluid(1000))
                .fluidInputs(NitrogenDioxide.getFluid(1000))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Seed Crystal

        BLAST_RECIPES.recipeBuilder()
                .input(dustSmall, GTBMaterials.BariumTitanate)
                .output(BARIUM_TITANTE_SEED_CRYSTAL)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(7)
                .output(NOR_PHOTOLITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(8)
                .output(NAND_PHOTOLITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(9)
                .output(SOC_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(10)
                .output(PRE_ENGRAVING_OGANESSON_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK).input(dye, MarkerMaterials.Color.Black)
                .circuitMeta(11)
                .output(UHASOC_LITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plateDense, NaquadahEnriched)
                .input(plate, Glass)
                .circuitMeta(1)
                .output(ENRICHED_NAQUADAH_PHOTOLITHOGRAPHY_MASK)
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.HydrogenChloride.getFluid(1000))
                .input(dust, Flerovium)
                .fluidOutputs(GTBMaterials.Trichloroflerane.getFluid(1000)).fluidOutputs(Hydrogen.getFluid(1000))
                .EUt(120)
                .duration(800)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.Trichloroflerane.getFluid(100))
                .fluidOutputs(GTBMaterials.HydrogenChloride.getFluid(100))
                .input(PRE_ENGRAVED_NQO2_WAFER)
                .output(FLEROVIUM_LAYERED_WAFER)
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.VeryHotKrypton.getFluid(1000))
                .input(DOPED_ARAM_WAFER)
                .output(GTBMetaItems.ARAM_WAFER)
                .fluidOutputs(Krypton.getFluid(1000))
                .duration(90)
                .EUt(6000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(Krypton.getFluid(1000))
                .fluidOutputs(GTBMaterials.VeryHotKrypton.getFluid(1000))
                .circuitMeta(1)
                .duration(80)
                .EUt(12000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dustSmall, GTBMaterials.NaquadahDioxide)
                .output(NAQUADAH_DIOXDE_SEED_CRYSTAL)
                .blastFurnaceTemp(1800)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Boule

        BLAST_RECIPES.recipeBuilder()
                .input(NAQUADAH_DIOXDE_SEED_CRYSTAL)
                .input(dust, GTBMaterials.NaquadahDioxide)
                .blastFurnaceTemp(1800)
                .output(NAQUADAH_DIOXDE_BOULE)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Wafer

        CUTTER_RECIPES.recipeBuilder()
                .input(NAQUADAH_DIOXDE_BOULE)
                .output(NAQUADAH_DIOXIDE_WAFER, 16)
                .output(NAQUADAH_DIOXDE_SEED_CRYSTAL)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Pre-engraved Naquadah Dioxide Wafer

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(1000))
                .fluidOutputs(GTBMaterials.Helium_4.getFluid(1000))
                .input(NAQUADAH_DIOXIDE_WAFER)
                .output(TRENCHED_NAQUADAH_DIOXIDE_WAFER)
                .duration(200)
                .EUt(129)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(TRENCHED_NAQUADAH_DIOXIDE_WAFER)
                .notConsumable(SOC_LITHOGRAPHY_MASK)
                .output(PRE_ENGRAVED_NQO2_WAFER)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Superfluid helium 4

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.LiquidEnrichedHelium_4.getFluid(1000))
                .fluidInputs(GTBMaterials.LiquidNitrogen.getFluid(1000))
                .fluidOutputs(GTBMaterials.SuperFluidHelium_4.getFluid(1000))
                .fluidOutputs(Helium3.getFluid(1000))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Liquid Enriched Helium 4

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.Helium_4.getFluid(1000), Helium.getFluid(1000))
                .fluidOutputs(GTBMaterials.LiquidEnrichedHelium_4.getFluid(1000))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Engraved ASOC wafer

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(PRE_ENGRAVED_NQO2_WAFER)
                .notConsumable(ENRICHED_NAQUADAH_PHOTOLITHOGRAPHY_MASK)
                .output(ENGRAVED_ASOC_WAFER)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // ASOC wafer

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(DOPED_ASOC_WAFER)
                .fluidInputs(GTBMaterials.VeryHotXenon.getFluid(1000))
                .output(MetaItems.ADVANCED_SYSTEM_ON_CHIP_WAFER)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_BOULE)
                .output(MetaItems.SILICON_WAFER, 16)
                .output(MONOCRYSTALLINE_SEED_CRYSTAL)
                .fluidInputs(Water.getFluid(12))
                .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_BOULE)
                .output(MetaItems.SILICON_WAFER, 16)
                .output(MONOCRYSTALLINE_SEED_CRYSTAL)
                .fluidInputs(DistilledWater.getFluid(6))
                .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_BOULE)
                .output(MetaItems.SILICON_WAFER, 16)
                .output(MONOCRYSTALLINE_SEED_CRYSTAL)
                .fluidInputs(Lubricant.getFluid(5))
                .duration(50)
                .EUt(8)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Nitrogen.getFluid(1000))
                .input(dust, Nickel)
                .output(dust, GTBMaterials.NickelNitride)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidOutputs(Nitrogen.getFluid(1000))
                .output(dust, Nickel)
                .input(dust, GTBMaterials.NickelNitride)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(1000))
                .input(dust, GTBMaterials.NickelNitride, 1)
                .input(DOPED_POLYSILICON_WAFER)
                .output(NICKEL_NITRIDE_WAFER)
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(Argon.getFluid(1000))
                .fluidOutputs(GTBMaterials.VeryHotArgon.getFluid(1000))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dustSmall, Sapphire)
                .output(SAPPHIRE_SEED_CRYSTAL)
                .duration(40)
                .EUt(80)
                .blastFurnaceTemp(900)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(SAPPHIRE_SEED_CRYSTAL)
                .input(dust, Sapphire, 4)
                .output(SAPPHIRE_BOULE)
                .fluidInputs(Argon.getFluid(1000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
                .output(MONOCRYSTALLINE_SAPPHIRE_INGOT, 32)
                .fluidInputs(Water.getFluid(12))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
                .output(MONOCRYSTALLINE_SAPPHIRE_INGOT, 32)
                .fluidInputs(DistilledWater.getFluid(8))
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
                .output(MONOCRYSTALLINE_SAPPHIRE_INGOT, 32)
                .fluidInputs(Lubricant.getFluid(6))
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_SAPPHIRE_INGOT)
                .output(SAPPHIRE_WAFER)
                .fluidInputs(Water.getFluid(12))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_SAPPHIRE_INGOT)
                .output(SAPPHIRE_WAFER)
                .fluidInputs(DistilledWater.getFluid(8))
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_SAPPHIRE_INGOT)
                .output(SAPPHIRE_WAFER)
                .fluidInputs(Lubricant.getFluid(6))
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(SAPPHIRE_WAFER).notConsumable(QBIT_CPU_LITHOGRAPHY_MASK)
                .output(ENGRAVED_QBIT_CPU_WAFER).duration(80).EUt(900).buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(ENGRAVED_CPU_WAFER)
                .input(dust, GTBMaterials.VanadiumTrichloride)
                .input(dust, GTBMaterials.IndiumChloride)
                .output(DOPED_QBIT_CPU_WAFER)
                .duration(800)
                .EUt(1000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.VeryHotArgon.getFluid(1000))
                .input(DOPED_QBIT_CPU_WAFER)
                .fluidOutputs(Argon.getFluid(1000))
                .output(SUPERCONDUCTOR_COATED_QBIT_CPU_WAFER)
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(SUPERCONDUCTOR_COATED_QBIT_CPU_WAFER)
                .input(U_TWOFOURTY_ELECTRON_SOURCE)
                .output(GTBMetaItems.QBIT_CPU_WAFER)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.QBIT_CPU_WAFER)
                .output(QBIT_CPU_DIE, 5)
                .fluidInputs(Water.getFluid(12))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.QBIT_CPU_WAFER)
                .output(QBIT_CPU_DIE, 5)
                .fluidInputs(DistilledWater.getFluid(8))
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.QBIT_CPU_WAFER)
                .output(QBIT_CPU_DIE, 5)
                .fluidInputs(Lubricant.getFluid(6))
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(QBIT_CPU_DIE)
                .input(plate, Polytetrafluoroethylene)
                .output(COVERED_QBIT_CPU)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.LiquidHelium.getFluid(1000))
                .fluidOutputs(Helium.getFluid(1000))
                .input(COVERED_QBIT_CPU)
                .output(QBIT_CPU)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dustSmall, GTBMaterials.MetastableOganesson, 1)
                .circuitMeta(1)
                .output(OGANESSON_SEED_CRYSTAL)
                .duration(200)
                .EUt(500000)
                .blastFurnaceTemp(8000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(OGANESSON_SEED_CRYSTAL)
                .input(dust, GTBMaterials.MetastableOganesson, 4)
                .output(OGANESSON_BOULE)
                .duration(200)
                .EUt(500000)
                .blastFurnaceTemp(8000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT, 16).output(OGANESSON_SEED_CRYSTAL)
                .fluidInputs(Water.getFluid(12)).duration(2000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT, 16).output(OGANESSON_SEED_CRYSTAL)
                .fluidInputs(DistilledWater.getFluid(6)).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT, 16).output(OGANESSON_SEED_CRYSTAL)
                .fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER)
                .input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Water.getFluid(12)).duration(2000).EUt(80000)
                .buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER)
                .input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(DistilledWater.getFluid(6)).duration(1000)
                .EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER)
                .input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.Trichloroflerane.getFluid(1000))
                .input(OGANESSON_WAFER)
                .output(GTBMetaItems.TREATED_OGANESSON_WAFER)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(1000))
                .fluidOutputs(GTBMaterials.LiquidHelium.getFluid(1000))
                .input(TREATED_OGANESSON_WAFER)
                .output(BATHED_TREATED_OGANESSON_WAFER)
                .duration(800)
                .EUt(9000)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(BATHED_TREATED_OGANESSON_WAFER)
                .output(PRE_ENGRAVED_OGANESSON_WAFER)
                .notConsumable(PRE_ENGRAVING_OGANESSON_LITHOGRAPHY_MASK)
                .duration(1200)
                .EUt(800)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(PRE_ENGRAVED_OGANESSON_WAFER)
                .input(dust, GTBMaterials.UEVSuperconductor, 1)
                .output(RAW_OGANESSON_WAFER)
                .duration(800)
                .EUt(77000)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(UNPOLARIZED_HASOC_WAFER)
                .output(HIGHLY_ADVANCED_SOC_WAFER)
                .duration(7000)
                .EUt(8112)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(HIGHLY_ADVANCED_SOC_WAFER)
                .output(HASOC_DIE, 6)
                .fluidInputs(Water.getFluid(12))
                .duration(2000)
                .EUt(80000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().input(HIGHLY_ADVANCED_SOC_WAFER).output(GTBMetaItems.HASOC_DIE, 6)
                .fluidInputs(DistilledWater.getFluid(6)).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(HIGHLY_ADVANCED_SOC_WAFER).output(GTBMetaItems.HASOC_DIE, 6)
                .fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HASOC_DIE).input(NEUROLOGICAL_LIFE_SUPPORT_UNIT).input(plate, Polybenzimidazole)
                .input(wireFine, NaquadahAlloy, 4).input(MetaItems.STEM_CELLS)
                .fluidInputs(SterileGrowthMedium.getFluid(144))
                .output(NEURAL_IMPLANTED_HASOC_DIE)
                .duration(200)
                .EUt(280000)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .input(dust, NaquadahEnriched, 1)
                .fluidOutputs(GTBMaterials.NaquadahRichSterileGrowthMedium.getFluid(1000))
                .duration(80)
                .EUt(120000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(DistilledWater.getFluid(1000))
                .input(GROWN_HASOC_DIE)
                .output(CLEAN_HASOC_DIE)
                .duration(800)
                .EUt(90080)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.NaquadahRichSterileGrowthMedium.getFluid(144))
                .input(NEURAL_IMPLANTED_HASOC_DIE)
                .output(GROWN_HASOC_DIE)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(BIOSAFE_PROTECTIVE_PLATING)
                .input(CLEAN_HASOC_DIE)
                .output(MetaItems.HIGHLY_ADVANCED_SOC)
                .duration(8000)
                .EUt(1200)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(plate, GTBMaterials.HighDensityPolyethylene).input(plate, Tritanium).input(plate, NaquadahAlloy)
                .input(plate, Iridium).input(plate, Osmium)
                .output(BIOSAFE_PROTECTIVE_PLATING)
                .duration(129)
                .EUt(80)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(RAW_OGANESSON_WAFER)
                .output(DOPED_OGANESSON_WAFER)
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(ENGRAVED_QBIT_CPU_WAFER).input(dust, GTBMaterials.VanadiumTrichloride)
                .input(dust, GTBMaterials.IndiumChloride, 1)
                .output(DOPED_QBIT_CPU_WAFER)
                .duration(280)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.VeryHotKrypton.getFluid(1000))
                .input(PRE_ENGRAVED_NQO2_WAFER)
                .output(SOC_WAFER_BASE)
                .fluidOutputs(Krypton.getFluid(1000))
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.VeryHotKrypton.getFluid(1000))
                .input(DOPED_SOC_WAFER)
                .output(MetaItems.SYSTEM_ON_CHIP_WAFER)
                .fluidOutputs(Krypton.getFluid(1000))
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(PRE_ENGRAVED_OGANESSON_WAFER).input(dust, RutheniumTriniumAmericiumNeutronate, 1)
                .output(SUPERCONDUCTOR_LAYERED_UHASOC_WAFER)
                .duration(800)
                .EUt(2000001)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(GTBMetaItems.SUPERCONDUCTOR_LAYERED_UHASOC_WAFER)
                .input(ingot, GTBMaterials.ElectronDegenerateRhenium)
                .output(DEGENERATE_UHASOC_WAFER)
                .duration(80000)
                .EUt(700)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(GTBMetaItems.DEGENERATE_UHASOC_WAFER).input(CONTROLLED_SHAPED_NAQUADRIA_CHARGE)
                .input(SHAPED_HIGH_ENERGY_GAMMA_SHIELD)
                .output(CELLED_UHASOC_WAFER)
                .duration(80000)
                .EUt(700)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(CELLED_UHASOC_WAFER)
                .output(SPIN_ALIGNED_UHASOC_WAFER)
                .duration(1200)
                .EUt(90000)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(GTBMetaItems.SPIN_ALIGNED_UHASOC_WAFER)
                .input(ingot, GTBMaterials.ElectronDegenerateRhenium)
                .output(RELAYERED_UHASOC_WAFER)
                .duration(1200)
                .EUt(90000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, GTBMaterials.MetastableOganesson)
                .input(lens, MarkerMaterials.Color.Yellow)
                .circuitMeta(1)
                .output(UHASOC_POST_ENGRAVING_MASK)
                .duration(90)
                .EUt(120000)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .input(FULLY_CONNECTED_UHASOC_WAFER)
                .output(SUPERCOOLED_UHASOC_WAFER)
                .duration(799)
                .EUt(1800)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.SUPERCOOLED_UHASOC_WAFER)
                .output(GTBMetaItems.UHASOC_WAFER)
                .duration(80000)
                .EUt(7200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dustSmall, Indium)
                .input(dustSmall, Phosphate)
                .output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
                .circuitMeta(1)
                .duration(800)
                .EUt(1200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(ingot, IndiumPhosphide, 4)
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
                .circuitMeta(1)
                .duration(800)
                .EUt(1200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT, 16)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
                .fluidInputs(Water.getFluid(12))
                .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT, 16)
                .output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
                .fluidInputs(DistilledWater.getFluid(9))
                .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT, 16)
                .output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
                .fluidInputs(Lubricant.getFluid(5))
                .duration(50)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT)
                .output(INDIUM_PHOSPHIDE_WAFER)
                .fluidInputs(Water.getFluid(12))
                .duration(300)
                .EUt(89012)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT)
                .output(GTBMetaItems.INDIUM_PHOSPHIDE_WAFER)
                .fluidInputs(DistilledWater.getFluid(9))
                .duration(150)
                .EUt(89012)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT)
                .output(GTBMetaItems.INDIUM_PHOSPHIDE_WAFER)
                .fluidInputs(Lubricant.getFluid(5))
                .duration(50)
                .EUt(89012)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(INDIUM_PHOSPHIDE_WAFER)
                .input(ingot, GTBMaterials.ZBLAN)
                .output(ZBLAN_LAYERED_INP_WAFER)
                .duration(80)
                .EUt(71232890)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, BorosilicateGlass)
                .input(circuit, MarkerMaterials.Tier.LuV)
                .output(GTBMetaItems.OPTICAL_LITHOGRAPHY_MASK)
                .duration(890)
                .EUt(78004523)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(dust, GTBMaterials.DopedNanotubeDepositionMixture).input(GTBMetaItems.INTERCONNECTED_INP_WAFER)
                .output(RESONANT_INP_WAFER)
                .duration(560)
                .EUt(12864590)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(RESONANT_INP_WAFER).input(dust, GTBMaterials.NanotubeDepositionMix)
                .output(INSULATED_INP_WAFER)
                .duration(720)
                .EUt(8134590)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.CarbonNanotubes)
                .fluidInputs(Xenon.getFluid(2000))
                .output(dust, GTBMaterials.DopedNanotubeDepositionMix)
                .EUt(8003490)
                .duration(120)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(dust, GTBMaterials.DopedNanotubeDepositionMix).input(RE_EXPOSED_INP_WAFER)
                .output(ELECTROLUMINESCENT_INP_WAFER)
                .duration(1200)
                .EUt(80901234)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(ELECTROLUMINESCENT_INP_WAFER).input(dust, GTBMaterials.DopedNanotubeDepositionMixture)
                .output(RECOATED_INP_WAFER)
                .duration(1200)
                .EUt(80129012)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(CONTACT_READY_INP_WAFER)
                .fluidInputs(Tritanium.getFluid(144))
                .output(GTBMetaItems.OPTICAL_SOC_WAFER)
                .duration(120)
                .EUt(70901212)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.OPTICAL_SOC_WAFER)
                .output(UNINSULATED_OPTICAL_SOC, 4)
                .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        CVD_UNIT.recipeBuilder()
                .input(GTBMetaItems.UNINSULATED_OPTICAL_SOC)
                .input(plate, GTBMaterials.FullerenePolymerMatrix)
                .input(plate, GTBMaterials.FullerenePolymerTetrix)
                .fluidInputs(GTBMaterials.LiquidCrystalDetector.getFluid(144))
                .output(INSULATED_OPTICAL_SOC)
                .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        ION_IMPLANTER.recipeBuilder()
                .input(CONTACTLESS_OPTICAL_SOC)
                .input(dust, GTBMaterials.NaquadriaticTaranium)
                .output(GTBMetaItems.OPTICAL_SOC)
                .duration(1202)
                .EUt(2096012)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, GTBMaterials.ChromaticGlass)
                .fluidInputs(Xenon.getFluid(1000))
                .fluidInputs(GTBMaterials.SeaborgiumDopedNanotubes.getFluid(1000))
                .output(dust, GTBMaterials.DopedNanotubeDepositionMix)
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(wireFine, GTBMaterials.CarbonNanotubes)
                .fluidInputs(Xenon.getFluid(1000))
                .output(dust, GTBMaterials.NanotubeDepositionMix)
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(wireFine, GTBMaterials.CarbonNanotubes)
                .fluidInputs(Krypton.getFluid(1000))
                .output(dust, GTBMaterials.DopedNanotubeDepositionMixture)
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(gemExquisite, Glass)
                .notConsumable(lens, MarkerMaterials.Color.Magenta)
                .output(gemExquisite, GTBMaterials.ChromaticGlass)
                .duration(800)
                .EUt(901275)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(BARIUM_TITANATE_SUBSTRATE_WAFER)
                .output(ENGRAVED_TITANATE_SUBSTRATE_WAFER)
                .notConsumable(UHPIC_LITHOGRAPHY_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(SUPERCONDUCTOR_COATED_SUBSTRATE_WAFER)
                .output(WIRED_SUBSTRATE_WAFER)
                .notConsumable(UHPIC_LITHOGRAPHY_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(FLEROVIUM_LAYERED_WAFER)
                .output(SPINORIAL_MEMORY_WAFER)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(SOC_WAFER_BASE)
                .output(ENGRAVED_SOC_WAFER)
                .notConsumable(SOC_LITHOGRAPHY_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(DOPED_OGANESSON_WAFER)
                .output(ENGRAVED_HASOC_WAFER)
                .notConsumable(UHASOC_LITHOGRAPHY_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(RELAYERED_UHASOC_WAFER)
                .output(FULLY_CONNECTED_UHASOC_WAFER)
                .notConsumable(UHASOC_POST_ENGRAVING_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(ZBLAN_LAYERED_INP_WAFER)
                .output(INTERCONNECTED_INP_WAFER)
                .notConsumable(OPTICAL_LITHOGRAPHY_MASK)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(INSULATED_INP_WAFER)
                .output(OPTICAL_LITHOGRAPHY_MASK)
                .notConsumable(RE_EXPOSED_INP_WAFER)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(RECOATED_INP_WAFER)
                .output(CONTACT_READY_INP_WAFER)
                .buildAndRegister();

        ENGRAVING_UNIT.recipeBuilder()
                .fluidInputs(GTBMaterials.SuperFluidHelium_4.getFluid(4000))
                .fluidOutputs(Helium.getFluid(4000))
                .duration(1200)
                .EUt(8000)
                .input(INSULATED_OPTICAL_SOC)
                .output(CONTACTLESS_OPTICAL_SOC)
                .buildAndRegister();

        List<Material> N_DOPANT_MATERIALS = new ArrayList<>();
        N_DOPANT_MATERIALS.add(GTBMaterials.WhitePhosphorus);
        N_DOPANT_MATERIALS.add(Arsenic);
        N_DOPANT_MATERIALS.add(Antimony);
        N_DOPANT_MATERIALS.add(Bismuth);
        N_DOPANT_MATERIALS.add(Moscovium);
        N_DOPANT_MATERIALS.add(Antimony);

        List<Material> P_DOPANT_MATERIALS = new ArrayList<>();
        P_DOPANT_MATERIALS.add(Aluminium);
        P_DOPANT_MATERIALS.add(Boron);
        P_DOPANT_MATERIALS.add(Gallium);
        P_DOPANT_MATERIALS.add(Thallium);
        P_DOPANT_MATERIALS.add(Nihonium);
        P_DOPANT_MATERIALS.add(Indium);

        for (Material nDopantMaterial : N_DOPANT_MATERIALS) {
            for (Material pDopantMaterial : P_DOPANT_MATERIALS) {

                CVD_UNIT.recipeBuilder()
                        .input(ENGRAVED_POWER_IC_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_POWER_IC_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT.recipeBuilder()
                        .input(POLYSILICON_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_POLYSILICON_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT.recipeBuilder()
                        .input(ENGRAVED_RAM_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_RAM_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT.recipeBuilder()
                        .input(ENGRAVED_CPU_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_CPU_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT.recipeBuilder()
                        .input(ENGRAVED_IC_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_IC_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CHEMICAL_BATH_RECIPES.recipeBuilder()
                        .fluidInputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
                        .fluidOutputs(Nitrogen.getFluid(1000))
                        .input(DOPED_IC_WAFER)
                        .output(INTEGRATED_LOGIC_CIRCUIT_WAFER)
                        .duration(200)
                        .EUt(12)
                        .buildAndRegister();

                ION_IMPLANTER.recipeBuilder()
                        .input(ENGRAVED_NANOCPU_WAFER)
                        .fluidInputs(GTBMaterials.VeryHotArgon.getFluid(1000))
                        .fluidOutputs(Argon.getFluid(1000))
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_NANOCPU_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER.recipeBuilder()
                        .input(ENGRAVED_SPINORIAL_MEMORY_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_ARAM_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER.recipeBuilder()
                        .input(ENGRAVED_HASOC_WAFER)
                        .input(dust, Naquadah)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(UNPOLARIZED_HASOC_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER.recipeBuilder()
                        .input(ENGRAVED_SOC_WAFER)
                        .input(dust, nDopantMaterial)
                        .input(dust, pDopantMaterial)
                        .output(DOPED_SOC_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER.recipeBuilder()
                        .input(SILICON_DIOXIDE_WAFER)
                        .input(dust, nDopantMaterial)
                        .output(N_DOPED_SILICON_DIOXIDE_WAFER)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

            }
        }
        // Recipe Removals
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.LightBlue),
                SILICON_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.LightBlue),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.LightBlue),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.LightBlue),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Green),
                SILICON_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Green),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Green),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Green),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Red),
                SILICON_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Red),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Red),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Red),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Gray),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Gray),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Gray),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Pink),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Pink),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Pink),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Yellow),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Yellow),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Yellow),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                PHOSPHORUS_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Brown),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Purple),
                NAQUADAH_WAFER.getStackForm(1));
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Purple),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Black),
                NEUTRONIUM_WAFER.getStackForm(1));

        GTRecipeHandler.removeRecipesByInputs(LARGE_CHEMICAL_RECIPES,
                new ItemStack[] { HIGH_POWER_INTEGRATED_CIRCUIT_WAFER.getStackForm(1),
                        OreDictUnifier.get(dust, IndiumGalliumPhosphide, 8) },
                new FluidStack[] { Naquadah.getFluid(576) });

        FUSION_RECIPES.recipeBuilder()
                .EUToStart(160000000)
                .fluidInputs(Helium3.getFluid(12))
                .fluidInputs(Helium3.getFluid(12))
                .fluidOutputs(GTBMaterials.Helium_4.getFluid(12))
                .duration(200)
                .EUt(820)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(SPINORIAL_MEMORY_WAFER)
                .notConsumable(lens, MarkerMaterials.Color.Yellow)
                .output(ENGRAVED_SPINORIAL_MEMORY_WAFER)
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .fluidInputs(Tritanium.getFluid(1296))
                .input(plate, GTBMaterials.ElectronDegenerateRhenium, 1)
                .input(FIELD_GENERATOR_LuV)
                .input(plate, Osmiridium)
                .input(plate, RhodiumPlatedPalladium, 1)
                .output(CONTROLLED_SHAPED_NAQUADRIA_CHARGE_CASING)
                .duration(800)
                .EUt(612)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(CONTROLLED_SHAPED_NAQUADRIA_CHARGE_CASING)
                .inputs(GTBMetaBlocks.GTB_EXPLOSIVE.getItemVariant(NAQUADRIA_CHARGE))
                .output(CONTROLLED_SHAPED_NAQUADRIA_CHARGE)
                .EUt(800000)
                .duration(120)
                .circuitMeta(2)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Titanium)
                .input(dust, Barium)
                .fluidInputs(Oxygen.getFluid(2000))
                .output(dust, GTBMaterials.BariumTitanate, 4)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Silicon)
                .input(dust, Carbon)
                .fluidOutputs(GTBMaterials.SiliconCarbide.getFluid(1000))
                .EUt(120)
                .duration(600)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(2000))
                .input(dust, Phosphorus, 2)
                .fluidOutputs(GTBMaterials.PhosphorusSolution.getFluid(2000))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CRYSTALLIZATION.recipeBuilder()
                .fluidInputs(GTBMaterials.PhosphorusSolution.getFluid(1000))
                .output(dust, GTBMaterials.WhitePhosphorus)
                .fluidOutputs(Water.getFluid(1000))
                .duration(90)
                .EUt(70)
                .buildAndRegister();
    }
}
