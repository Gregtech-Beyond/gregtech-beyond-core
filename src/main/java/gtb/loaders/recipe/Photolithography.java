package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.common.item.GTBMetaItems.*;

import gtb.api.unification.materials.GTBMaterials;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.common.items.MetaItems;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.item.GTBMetaItems;
import net.minecraft.client.network.NetHandlerHandshakeMemory;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class Photolithography {


    public static void init() {














        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Redstone.getFluid(1000))
                .input(MetaItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER)
                .output(NANO_PIC_WAFER)
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
                .output(UHPIC_BASE,16)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(BARIUM_TITANATE_BOULE)
                .output(BARIUM_TITANATE_SUBSTRATE_WAFER,16).output(BARIUM_TITANTE_SEED_CRYSTAL)
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



        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_WAFER)
	            .notConsumable(lens, DyeMagenta)
	            .output(ULPIC_WAFER)
                .duration(900)
                .EUt(120)
                .buildAndRegister();


        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MetaItems.PHOSPHORUS_WAFER)
	            .notConsumable(lens, DyeMagenta)
                .output(ULPIC_WAFER,4)
	            .duration(900)
                .EUt(120)
                .buildAndRegister();


        CUTTER_RECIPES.recipeBuilder()
                .input(ULPIC_WAFER)
	.output(ULPIC,6)
	.duration(900)
                .EUt(120)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MetaItems.SILICON_WAFER)
                .notConsumable(lens, DyeOrange)
	            .output(LPIC_WAFER)
	            .duration(900)
                .EUt(480)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(MetaItems.PHOSPHORUS_WAFER)
	            .notConsumable(lens, DyeOrange)
	            .output(LPIC_WAFER,4)
	            .duration(900)
                .EUt(480)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(LPIC_WAFER)
	            .output(LPIC, 4)
	            .duration(900)
                .EUt(480)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(PHOTOPOLYMER_PLATE)
                .output(foil, Mica)
                .duration(80)
                .EUt(8000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
                .output(CELAUWAFER,16)
                .fluidInputs(Water.getFluid(64))
                .duration(800)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
                .output(CELAUWAFER,16)
                .fluidInputs(DistilledWater.getFluid(32))
                .duration(600)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(CELA_SILICON_BOULE)
    .output(CELAUWAFER,16)
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
                .fluidOutputs(GTBMaterials.UsedPhotopolymerSolution.getFluid(1000))
    .circuitMeta(1)
    .fluidOutputs(GTBMaterials.PhotopolymerSolution.getFluid(500))
    .duration(1000)
                .EUt(24000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:12001,gregtech:meta_item_1:12364)
    .circuitMeta(1)
    .output(LITHOGRAPHY_BASE_MASK)
    .duration(20)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .circuitMeta(1)
    .output(PIC_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,MetaItems.DYEBLACK)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 2}))
    .output(CPU_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 3}))
    .output(RAM_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 4}))
    .output(SINGLE_JOSEPHSON_JUNCTION_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 5}))
    .output(LPIC_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 6}))
    .output(INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 7}))
    .output(NANOCPU_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 8}))
    .output(HASOC_LITHOGRAPHY_MASK)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(xenon.getFluid(1000))
    .fluidOutputs(very_hot_xenon.getFluid(1000))
    .duration(200)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.SILICON_WAFER).output(ENGRAVED_RAM_WAFER).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(MetaItems.PHOSPHORUS_WAFER).output(ENGRAVED_RAM_WAFER,4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(gregtech:meta_item_2:32442).output(ENGRAVED_RAM_WAFER,8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32333).output(ENGRAVED_RAM_WAFER,12).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32334).output(ENGRAVED_RAM_WAFER,16).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32335).output(ENGRAVED_RAM_WAFER,20).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(RAM_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32335).output(ENGRAVED_RAM_WAFER,20).duration(20).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(PIC_LITHOGRAPHY_MASK).input(POLYSILICON_WAFER).output(ENGRAVED_POWER_IC_WAFER).duration(20).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.SILICON_WAFER).output(ENGRAVED_CPU_WAFER).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(MetaItems.PHOSPHORUS_WAFER).output(ENGRAVED_CPU_WAFER,4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(gregtech:meta_item_2:32442).output(ENGRAVED_CPU_WAFER,8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32333).output(ENGRAVED_CPU_WAFER,12).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32334).output(ENGRAVED_CPU_WAFER,16).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(CPU_LITHOGRAPHY_MASK).input(gtadditions:ga_meta_item:32335).output(ENGRAVED_CPU_WAFER,20).duration(20).EUt(12).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(very_hot_argon.getFluid(1000))
    .input(DOPED_HIGH_POWER_IC_WAFER)
    .output(gregtech:meta_item_2:32465)
    .fluidOutputs(argon.getFluid(1000))
    .duration(200)
                .EUt(12)
                .buildAndRegister();


        cvd_unit.recipeBuilder()
                .input(gregtech:meta_item_1:2204,3)
    .fluidInputs(graphene_oxidation_solution,100)
    .output(gtadditions:ga_dust:358)
    .chancedOutput(gtadditions:ga_dust:107, 8000, 100)
    .duration(200)
                .EUt(2000)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(gtadditions:ga_dust:358)
    .notConsumable(NICKEL_BREEDING_BED)
    .fluidInputs(methane.getFluid(1000))
    .output(gtadditions:ga_dust:357)
    .duration(200)
                .EUt(2000)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(ENGRAVED_TITANATE_SUBSTRATE,gregtech:meta_item_1:2744,2)
    .fluidInputs(silicon_carbide_vapor.getFluid(144))
    .output(SUPERCONDUCTOR_COATED_SUBSTRATE_WAFER)
    .duration(800)
                .EUt(1800)
                .buildAndRegister();

        var PDopant as IItemStack[] = [
gregtech:meta_item_1:2001,
gregtech:meta_item_1:2009,
gregtech:meta_item_1:2025,
gregtech:meta_item_1:2031,
gregtech:meta_item_1:2761,
gregtech:meta_item_1:2678,
];

        var NDopant as IItemStack[] = [
gtadditions:ga_dust:32203,
gregtech:meta_item_1:2005,
gregtech:meta_item_1:2003,
gregtech:meta_item_1:2008,
gregtech:meta_item_1:2679,
];

        for i in NDopant {
            for I in PDopant {

                cvd_unit.recipeBuilder()
                        .input(ENGRAVED_POWER_IC_WAFER,i,I)
    .output(DOPED_POWER_IC_WAFER)
    .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                cvd_unit.recipeBuilder()
                        .input(POLYSILICON_WAFER,i,I)
    .output(DOPED_POLYSILICON_WAFER)
    .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                cvd_unit.recipeBuilder()
                        .input(ENGRAVED_RAM_WAFER,i,I)
    .output(DOPED_RAM_WAFER)
    .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                cvd_unit.recipeBuilder()
                        .input(ENGRAVED_CPU_WAFER,i,I)
    .output(DOPED_CPU_WAFER)
    .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                cvd_unit.recipeBuilder()
                        .input(ENGRAVED_IC_WAFER,i,I)
    .fluidInputs(GTBMaterials.VeryHotNitrogen.getFluid(1000))
    .output(gregtech:meta_item_2:32463)
    .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ion_implanter.recipeBuilder()
                        .input(ENGRAVED_NANOCPU_WAFER, i, I)
    .fluidInputs(very_hot_argon.getFluid(1000))
    .output(DOPED_NANOCPU_WAFER)
    .fluidOutputs(argon.getFluid(1000))
    .duration(200)
                        .EUt(60)
                        .buildAndRegister();

                ion_implanter.recipeBuilder()
                        .input(ENGRAVED_SPINORIAL_MEMORY_WAFER, i, I)
    .output(DOPED_ARAM_WAFER)
    .duration(200)
                        .EUt(600)
                        .buildAndRegister();

                ion_implanter.recipeBuilder()
                        .input(gregtech:meta_item_1:2307,GTBMetaItems.engraved_hasoc_wafer, i, I)
    .output(GTBMetaItems.unpolarized_hasoc_wafer)
    .duration(200)
                        .EUt(600)
                        .buildAndRegister();

                ion_implanter.recipeBuilder()
                        .input(GTBMetaItems.engraved_soc_wafer, i, I)
    .output(GTBMetaItems.doped_soc_wafer)
    .duration(200)
                        .EUt(600)
                        .buildAndRegister();



            }
        }

        var NDope as IItemStack[] = [
gtadditions:ga_dust:32203,
gregtech:meta_item_1:2005,
gregtech:meta_item_1:2003,
gregtech:meta_item_1:2008,
gregtech:meta_item_1:2679,
];

        for i in NDope {

            cvd_unit.recipeBuilder()
                    .input(GTBMetaItems.silicon_dioxide_wafer,i)
    .output(GTBMetaItems.n_doped_silicon_dioxide_wafer)
    .duration(800)
                    .EUt(180)
                    .buildAndRegister();


        }


        cvd_unit.recipeBuilder()
                .input(gregtech:meta_item_1:2421,gtadditions:ga_dust:32210,gregtech:meta_item_2:32469)
    .output(GTBMetaItems.raw_high_power_ic_wafer)
    .duration(400)
                .EUt(200)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen.getFluid(1000))
    .input(MetaItems.SILICON_WAFER)
    .output(GTBMetaItems.silicon_dioxide_wafer)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen,2000)
    .input(MetaItems.PHOSPHORUS_WAFER)
    .output(GTBMetaItems.silicon_dioxide_wafer,2)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen,4000)
    .input(gregtech:meta_item_2:32442)
    .output(GTBMetaItems.silicon_dioxide_wafer,4)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen,6000)
    .input(gtadditions:ga_meta_item:32333)
    .output(GTBMetaItems.silicon_dioxide_wafer,6)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen,12000)
    .input(gregtech:meta_item_2:32334)
    .output(GTBMetaItems.silicon_dioxide_wafer,12)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        roasters.recipeBuilder()
                .fluidInputs(oxygen,32000)
    .input(gregtech:meta_item_2:32335)
    .output(GTBMetaItems.silicon_dioxide_wafer,32)
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .fluidInputs(silane.getFluid(1000))
    .input(GTBMetaItems.n_doped_silicon_dioxide_wafer)
    .output(POLYSILICON_WAFER)
    .duration(200)
                .EUt(80)
                .buildAndRegister();


        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.SILICON_WAFER)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.PHOSPHORUS_WAFER)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,4)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gregtech:meta_item_2:32442)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,8)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32333)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,12)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32334)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,16)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32335)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,20)    .duration(400).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.SILICON_WAFER)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER)    .duration(400).EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.PHOSPHORUS_WAFER)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER,4)    .duration(400).EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gregtech:meta_item_2:32442)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER,8)    .duration(400).EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32333)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER,12)    .duration(400).EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32334)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER,16)    .duration(400).EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32335)    .notConsumable(GTBMetaItems.nanocpu_lithography_mask)   .output(ENGRAVED_NANOCPU_WAFER,20)    .duration(400).EUt(480).buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(DOPED_NANOCPU_WAFER)
    .fluidInputs(trichlorosilane.getFluid(1000))
    .output(GTBMetaItems.gated_nanocpu_wafer)
    .duration(499)
                .EUt(80)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(GTBMetaItems.gated_nanocpu_wafer)
    .fluidInputs(trichlorosilane.getFluid(1000),oxygen.getFluid(1000))
    .output(GTBMetaItems.insulated_nanocpu_wafer)
    .duration(499)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(GTBMetaItems.insulated_nanocpu_wafer)   .notConsumable(ore:craftingLensRed)    .output(GTBMetaItems.trenched_insulated_nanocpu_wafer)    .duration(200)    .EUt(12)    .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(GTBMetaItems.trenched_insulated_nanocpu_wafer,gregtech:meta_item_1:2018)
    .output(GTBMetaItems.unplanarized_nanocpu_wafer)
    .duration(20)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.unplanarized_nanocpu_wafer)
    .fluidInputs(diluted_sulfuric_acid.getFluid(1000))
    .output(gregtech:meta_item_2:32467)
    .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.engraved_nand_wafer)
    .fluidInputs(diluted_sulfuric_acid.getFluid(1000))
    .output(gregtech:meta_item_2:32466)
    .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GTBMetaItems.engraved_nor_wafer)
    .fluidInputs(diluted_sulfuric_acid.getFluid(1000))
    .output(gregtech:meta_item_2:32468)
    .duration(200)
                .EUt(700)
                .buildAndRegister();


        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.SILICON_WAFER)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(MetaItems.PHOSPHORUS_WAFER)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,4)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gregtech:meta_item_2:32442)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,8)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32333)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,12)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32334)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,16)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(gtadditions:ga_meta_item:32335)    .notConsumable(GTBMetaItems.integrated_circuit_photolithography_mask)   .output(GTBMetaItems.engraved_ic_wafer,20)    .duration(400).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(GTBMetaItems.nickel_nitride_wafer)    .notConsumable(GTBMetaItems.nor_photolithography_mask)   .output(GTBMetaItems.engraved_nor_wafer)    .duration(400).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder()    .input(GTBMetaItems.nickel_nitride_wafer)    .notConsumable(GTBMetaItems.nand_photolithography_mask)   .output(GTBMetaItems.engraved_nand_wafer)    .duration(400).EUt(12).buildAndRegister();


//ASOC chain

        //Chloronaquadic acid

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(aqua_regia.getFluid(1000))
    .fluidOutputs(very_hot_aqua_regia.getFluid(1000))
    .circuitMeta(1)
    .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:2307)
    .fluidInputs(very_hot_aqua_regia.getFluid(1000))
    .fluidOutputs(chloronaquadic_acid.getFluid(1000))
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Naquadah Dioxide

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(chloronaquadic_acid.getFluid(1000))
    .input(gregtech:meta_item_1:2865)
    .output(gregtech:meta_item_1:2628)
    .fluidOutputs(salt_water.getFluid(1000) , nitrogen_dioxide.getFluid(1000))
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Naquadah Dioxide Seed Crystal

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:697)
    .output(GTBMetaItems.barium_titanate_seed_crystal)
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 7}))
    .output(GTBMetaItems.nor_photolithography_mask)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 8}))
    .output(GTBMetaItems.nand_photolithography_mask)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 9}))
    .output(GTBMetaItems.soc_lithography_mask)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(LITHOGRAPHY_BASE_MASK,ore:dyeBlack)
    .notConsumable(gregtech:meta_item_1:32766.withTag({Configuration: 10}))
    .output(GTBMetaItems.pre_engraving_oganesson_lithography_mask)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:13309 , gregtech:meta_item_1:15209)
    .circuitMeta(1)
    .output(GTBMetaItems.enriched_naquadah_photolithography_mask)
    .duration(50)
                .EUt(12)
                .buildAndRegister();

#ARAM

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(hydrogen_chloride.getFluid(1000))
    .input(gregtech:meta_item_1:2706)
    .fluidOutputs(trichloroflerane.getFluid(1000),hydrogen.getFluid(1000))
    .EUt(120)
                .duration(800)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .fluidInputs(trichloroflerane,100)
    .fluidOutputs(hydrogen_chloride,100)
    .input(PRE_ENGRAVED_NQO2_WAFER)
    .output(FLEROVIUM_LAYERED_WAFER)
    .duration(200)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(very_hot_krypton.getFluid(1000))
    .input(DOPED_ARAM_WAFER)
    .output(gtadditions:ga_meta_item:32427)
    .fluidOutputs(krypton.getFluid(1000))
    .duration(90)
                .EUt(6000)
                .buildAndRegister();
    
        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(krypton.getFluid(1000))
    .fluidOutputs(very_hot_krypton.getFluid(1000))
    .circuitMeta(1)
    .duration(80)
                .EUt(12000)
                .buildAndRegister();
        
        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:628)
    .output(NAQUADAH_DIOXDE_SEED_CRYSTAL)
    .property("temperature", 1800)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Naquadah Dioxide Boule

        BLAST_RECIPES.recipeBuilder()
                .input(GTBMetaItems.NAQUADAH_DIOXIDE_SEED_CRYSTAL , gregtech:meta_item_1:2628,4)
    .property("temperature", 1800)
                .output(NAQUADAH_DIOXDE_BOULE)
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Naquadah Dioxide Wafer

        CUTTER_RECIPES.recipeBuilder()
                .input(NAQUADAH_DIOXDE_BOULE)
                .output(NAQUADAH_DIOXIDE_WAFER,16)
                .output(NAQUADAH_DIOXDE_SEED_CRYSTAL)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Pre-engraved Naquadah Dioxide Wafer

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(superfluid_helium_4.getFluid(1000))
                .fluidOutputs(helium_4.getFluid(1000))
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

        //Superfluid helium 4

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(liquid_enriched_helium_4.getFluid(1000) , liquid_nitrogen.getFluid(1000))
    .fluidOutputs(superfluid_helium_4.getFluid(1000) , helium3.getFluid(1000))
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Liquid Enriched Helium 4

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(helium_4.getFluid(1000) , helium.getFluid(1000))
    .fluidOutputs(liquid_enriched_helium_4.getFluid(1000))
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //Engraved ASOC wafer

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(PRE_ENGRAVED_NQO2_WAFER)
    .notConsumable(ENRICHED_NAQUADAH_PHOTOLITHOGRAPHY_MASK)
    .output(ENGRAVED_ASOC_WAFER)
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        //ASOC wafer

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(DOPED_ASOC_WAFER)
    .fluidInputs(very_hot_xenon.getFluid(1000))
    .output(gregtech:meta_item_2:32462)
    .duration(200)
                .EUt(100)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32439)
    .output(MetaItems.SILICON_WAFER,16, MONOCRYSTALLINE_SEED_CRYSTAL)
    .fluidInputs(water,5)
    .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32439)
    .output(MetaItems.SILICON_WAFER,16, MONOCRYSTALLINE_SEED_CRYSTAL)
    .fluidInputs(distilled_water,5)
    .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32439)
    .output(MetaItems.SILICON_WAFER,16, MONOCRYSTALLINE_SEED_CRYSTAL)
    .fluidInputs(Lubricant.getFluid(5))
    .duration(50)
                .EUt(8)
                .buildAndRegister();


        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Nitrogen.getFluid(1000)).input(gregtech:meta_item_1:2044).output(gtadditions:ga_dust:32215).duration(200).EUt(12).buildAndRegister();
        LARGE_CHEMICAL_RECIPES.recipeBuilder().fluidInputs(Nitrogen.getFluid(1000)).input(gregtech:meta_item_1:2044).output(gtadditions:ga_dust:32215).duration(200).EUt(12).buildAndRegister();
        ELECTROLYZER_RECIPES.recipeBuilder().fluidOutputs(Nitrogen.getFluid(1000)).output(gregtech:meta_item_1:2044).input(gtadditions:ga_dust:32215).duration(200).EUt(12).buildAndRegister();


        roasters.recipeBuilder()
                .fluidInputs(oxygen.getFluid(1000))
    .input(gtadditions:ga_dust:32215, DOPED_POLYSILICON_WAFER)
    .output(NICKEL_NITRIDE_WAFER)
    .duration(80)
                .EUt(90)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(argon.getFluid(1000))
    .fluidOutputs(very_hot_argon.getFluid(1000))
    .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:524)
    .output(SAPPHIRE_SEED_CRYSTAL)
    .duration(40)
                .EUt(80)
                .property("temperature", 900)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(SAPPHIRE_SEED_CRYSTAL,gregtech:meta_item_1:2524,4)
    .output(SAPPHIRE_BOULE)
    .fluidInputs(argon.getFluid(1000))
    .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
    .output(MONOCRYSTALLINE_SAPPHIRE_INGOT,32)
    .fluidInputs(Water.getFluid(12))
    .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
    .output(MONOCRYSTALLINE_SAPPHIRE_INGOT,32)
    .fluidInputs(DistilledWater.getFluid(8))
    .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(SAPPHIRE_BOULE)
    .output(MONOCRYSTALLINE_SAPPHIRE_INGOT,32)
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

        LASER_ENGRAVER_RECIPES.recipeBuilder().input(SAPPHIRE_WAFER).notConsumable(QBIT_CPU_LITHOGRAPHY_MASK).output(ENGRAVED_QBIT_CPU_WAFER).duration(80).EUt(900).buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(ENGRAVED_CPU_WAFER,gtadditions:ga_dust:32217,gtadditions:ga_dust:32214)
    .output(DOPED_QBIT_CPU_WAFER)
    .duration(800)
                .EUt(1000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(very_hot_argon.getFluid(1000))
    .input(DOPED_QBIT_CPU_WAFER)
    .fluidOutputs(argon.getFluid(1000))
    .output(SUPERCONDUCTOR_COATED_QBIT_WAFER)
    .duration(200)
                .EUt(900)
                .buildAndRegister();

        ion_implanter.recipeBuilder()
                .input(SUPERCONDUCTOR_COATED_QBIT_WAFER, U_TWOFOURTY_ELECTRON_SOURCE)
    .output(gregtech:meta_item_2:32470)
    .duration(200)
                .EUt(90)
                .buildAndRegister();


        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32470)
    .output(QBIT_CPU_DIE, 5)
    .fluidInputs(Water.getFluid(12))
    .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32470)
    .output(QBIT_CPU_DIE,5)
                .fluidInputs(DistilledWater.getFluid(8))
    .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:32470)
    .output(QBIT_CPU_DIE, 5)
                .fluidInputs(Lubricant.getFluid(6))
    .duration(60)
                .EUt(60)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(QBIT_CPU_DIE,gregtech:meta_item_1:12145)
    .output(COVERED_QBIT_CPU)
    .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(liquid_helium.getFluid(1000))
    .fluidOutputs(helium.getFluid(1000))
    .input(QBIT_CPU_DIE)
    .output(gregtech:meta_item_2:32484)
    .duration(120)
                .EUt(70)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:707)
    .circuitMeta(1)
    .output(OGANESSON_SEED_CRYSTAL)
    .duration(200)
                .EUt(500000)
                .property("temperature", 8000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:2707, OGANESSON_SEED_CRYSTAL)
    .output(OGANESSON_BOULE)
    .duration(200)
                .EUt(500000)
                .property("temperature", 8000)
                .buildAndRegister();


        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Water.getFluid(12)).duration(2000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(DistilledWater.getFluid(6)).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(OGANESSON_BOULE).output(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER).output(OGANESSON_SEED_CRYSTAL).input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Water.getFluid(12)).duration(2000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER).output(OGANESSON_SEED_CRYSTAL).input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(DistilledWater.getFluid(6)).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().output(OGANESSON_WAFER).output(OGANESSON_SEED_CRYSTAL).input(MONOCRYSTALLINE_OGANESSON_INGOT).fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000).buildAndRegister();

        cvd_unit.recipeBuilder()
                .fluidInputs(trichloroflerane.getFluid(1000))
    .input(OGANESSON_WAFER)
    .output(GTBMetaItems.TREATED_OGANESSON_WAFER)
    .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(superfluid_helium_4.getFluid(1000))
    .fluidOutputs(liquid_helium_4.getFluid(1000))
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


        ion_implanter.recipeBuilder()
                .input(PRE_ENGRAVED_OGANESSON_WAFER,gregtech:meta_item_1:2740)
    .output(RAW_OGANESSON_WAFER)
    .duration(800)
                .EUt(77000)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(UNPOLARIZED_HASOC_WAFER)
    .output(gtadditions:ga_meta_item:32421)
    .duration(7000)
                .EUt(8112)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().input(gtadditions:ga_meta_item:32421).output(HASOC_DIE,6).fluidInputs(Water.getFluid(12)).duration(2000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(gtadditions:ga_meta_item:32421).output(GTBMetaItems.HASOC_DIE,6).fluidInputs(DistilledWater.getFluid(6)).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().input(gtadditions:ga_meta_item:32421).output(GTBMetaItems.HASOC_DIE,6).fluidInputs(Lubricant.getFluid(6)).duration(600).EUt(60000).buildAndRegister();


        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HASOC_DIE, NEUROLOGICAL_LIFE_SUPPORT,gregtech:meta_item_2:16308,4,gregtech:meta_item_1:12840,gtadditions:ga_meta_item:32018)
    .fluidInputs(SterileGrowthMedium.getFluid(144))
    .output(NEURAL_IMPLANTED_HASOC_DIE)
    .duration(200)
                .EUt(280000)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
    .input(gregtech:meta_item_1:2309)
    .fluidOutputs(naquadah_rich_sterile_growth_medium.getFluid(1000))
    .duration(80)
                .EUt(120000)
                .buildAndRegister();

        lmixer.recipeBuilder()
                .fluidInputs(sterilized_growth_medium.getFluid(1000))
    .input(gregtech:meta_item_1:2309)
    .fluidOutputs(naquadah_rich_sterile_growth_medium.getFluid(1000))
    .duration(80)
                .EUt(120000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(distilled_water.getFluid(1000))
    .input(GROWN_HASOC_DIE)
    .output(CLEAN_HASOC_DIE)
    .duration(800)
                .EUt(90080)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(naquadah_rich_sterile_growth_medium.getFluid(144))
    .input(NEURAL_IMPLANTED_HASOC_DIE)
    .output(GROWN_HASOC_DIE)
    .duration(120)
                .EUt(80)
                .buildAndRegister();

        forming_press.recipeBuilder()
                .input(BIOSAFE_PROTECTIVE_PLATING)
                .input(CLEAN_HASOC_DIE)
    .output(gtadditions:ga_meta_item:32420)
    .duration(8000)
                .EUt(1200)
                .buildAndRegister();

        forming_press.recipeBuilder()
                .input(gregtech:meta_item_1:12617,gregtech:meta_item_1:12311,gregtech:meta_item_1:12308,gregtech:meta_item_2:32435,gregtech:meta_item_1:12047)
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

        cvd_unit.recipeBuilder()
                .input(ENGRAVED_QBIT_CPU_WAFER,gtadditions:ga_dust:32217,gtadditions:ga_dust:32214)
    .output(DOPED_QBIT_CPU_WAFER)
    .duration(280)
                .EUt(120)
                .buildAndRegister();



        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(very_hot_krypton.getFluid(1000))
    .input(PRE_ENGRAVED_NQO2_WAFER)
    .output(SOC_WAFER_BASE)
    .fluidOutputs(krypton.getFluid(1000))
    .duration(200)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(very_hot_krypton.getFluid(1000))
    .input(DOPED_SOC_WAFER)
    .output(gregtech:meta_item_2:32472)
    .fluidOutputs(krypton.getFluid(1000))
    .duration(200)
                .EUt(480)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(PRE_ENGRAVED_OGANESSON_WAFER,gregtech:meta_item_1:2738)
    .output(SUPERCONDUCTOR_LAYERED_UHASOC_WAFER)
    .duration(800)
                .EUt(2000001)
                .buildAndRegister();

        ion_implanter.recipeBuilder()
                .input(GTBMetaItems.SUPERCONDUCTOR_LAYERED_UHASOC_WAFER,gregtech:meta_item_1:10629)
    .output(DEGENERATE_UHASOC_WAFER)
    .duration(80000)
                .EUt(700)
                .buildAndRegister();

        ion_implanter.recipeBuilder()
                .input(GTBMetaItems.DEGENERATE_UHASOC_WAFER, CONTROLLED_SHAPED_NAQUADRIA_CHARGE, SHAPED_HIGH_ENERGY_GAMMA_SHIELD)
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

        cvd_unit.recipeBuilder()
                .input(GTBMetaItems.SPIN_ALIGNED_UHASOC_WAFER,gregtech:meta_item_1:10629)
    .output(RELAYERED_UHASOC_WAFER)
    .duration(1200)
                .EUt(90000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:12707,gregicalityoreaddon:gaoe_meta_item:10)
    .circuitMeta(1)
    .output(UHASOC_POST_ENGRAVING_MASK)
    .duration(90)
                .EUt(120000)
                .buildAndRegister();

        vacfreezer.recipeBuilder()
                .input(FULLY_CONNECTED_UHASOC_WAFER)
    .output(SUPERCOOLED_UHASOC_WAFER)
    .duration(799)
                .EUt(1800)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.SUPERCOOLED_UHASOC_WAFER)
    .output(gtadditions:ga_meta_item:32423)
    .duration(80000)
                .EUt(7200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:31,gregtech:meta_item_1:50)
    .output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
    .circuitMeta(1)
    .duration(800)
                .EUt(1200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:2684,4,)
        .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
    .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
    .circuitMeta(1)
    .duration(800)
                .EUt(1200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
    .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT,16)
                .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
    .fluidInputs(Water.getFluid(12))
    .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
    .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT,16).output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
    .fluidInputs(DistilledWater.getFluid(9))
    .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE)
    .output(GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT,16).output(MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL)
    .fluidInputs(Lubricant.getFluid(5)
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

        cvd_unit.recipeBuilder()
                .input(INDIUM_PHOSPHIDE_WAFER,gtadditions:ga_meta_item:32436)
    .output(ZBLAN_LAYERED_INP_WAFER)
    .duration(80)
                .EUt(71232890)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gtadditions:ga_meta_item:32430,ore:circuitMaster)
    .output(GTBMetaItems.OPTICAL_LITHOGRAPHY_MASK)
    .duration(890)
                .EUt(78004523)
                .buildAndRegister();

        ion_implanter.recipeBuilder()
                .input(gtadditions:ga_dust:32221,GTBMetaItems.INTERCONNCETED_INP_WAFER)
    .output(RESONANT_INP_WAFER)
    .duration(560)
                .EUt(12864590)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(RESONANT_INP_WAFER,gtadditions:ga_dust:32218)
    .output(INSULATED_INP_WAFER)
    .duration(720)
                .EUt(8134590)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:2709)
    .fluidInputs(xenon,2000)
    .output(gtadditions:ga_dust:32218)
    .EUt(8003490)
                .duration(120)
                .buildAndRegister();

        lmixer.recipeBuilder()
                .input(gregtech:meta_item_1:2709)
    .fluidInputs(xenon,2000)
    .output(gtadditions:ga_dust:32218)
    .EUt(800390)
                .duration(120)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(gtadditions:ga_dust:32219, RE_EXPOSED_INP_WAFER)
    .output(ELECTROLUMINSECENT_WAFER)
    .duration(1200)
                .EUt(80901234)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(ELECTROLUMINSECENT_WAFER,gtadditions:ga_dust:32220)
    .output(RECOATED_INP_WAFER)
    .duration(1200)
                .EUt(80129012)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(CONTACT_READY_INP_WAFER)
    .fluidInputs(tritanium.getFluid(144))
    .output(gtadditions:ga_meta_item:32498)
    .duration(120)
                .EUt(70901212)
                .buildAndRegister();


        CUTTER_RECIPES.recipeBuilder()
                .input(gtadditions:ga_meta_item:32498)
    .output(UNINSULATED_OPTICAL_SOC,4)
    .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        cvd_unit.recipeBuilder()
                .input(GTBMetaItems.UNINSULATED_OPTICAL_SOC,gregtech:meta_item_1:12728,gregtech:meta_item_1:12575)
    .fluidInputs(liquid_crystal_detector.getFluid(144))
    .output(INSULATED_OPTICAL_SOC)
    .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        ion_implanter.recipeBuilder()
                .input(CONTACTLESS_OPTICAL_SOC,gregtech:meta_item_1:2534)
    .output(gtadditions:ga_meta_item:32499)
    .duration(1202)
                .EUt(2096012)
                .buildAndRegister();


        MIXER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_1:2584)
    .fluidInputs(xenon.getFluid(1000),seaborgium_doped_nanotubes.getFluid(1000))
    .output(gtadditions:ga_dust:32219)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();

        lmixer.recipeBuilder()
                .input(gregtech:meta_item_1:2584)
    .fluidInputs(xenon.getFluid(1000),seaborgium_doped_nanotubes.getFluid(1000))
    .output(gtadditions:ga_dust:32219)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:16709)
    .fluidInputs(xenon.getFluid(1000))
    .output(gtadditions:ga_dust:32218)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();

        lmixer.recipeBuilder()
                .input(gregtech:meta_item_2:16709)
    .fluidInputs(xenon.getFluid(1000))
    .output(gtadditions:ga_dust:32218)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:16709)
    .fluidInputs(krypton.getFluid(1000))
    .output(gtadditions:ga_dust:32220)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();

        lmixer.recipeBuilder()
                .input(gregtech:meta_item_2:16709)
    .fluidInputs(krypton.getFluid(1000))
    .output(gtadditions:ga_dust:32220)
    .duration(400)
                .EUt(52450)
                .buildAndRegister();



        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:25209)
    .notConsumable(gregicalityoreaddon:gaoe_meta_item:9)
    .output(gregtech:meta_item_1:8584)
    .duration(800)
                .EUt(901275)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(gregtech:meta_item_2:25209)
    .notConsumable(gregicalityoreaddon:gaoe_meta_item:9)
    .output(gregtech:meta_item_1:8584)
    .duration(800)
                .EUt(901275)
                .buildAndRegister();




























    }
}
