package gtb.common.block.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

import javax.annotation.Nonnull;

public class GTBBlockMultiblockCasingB extends VariantBlock<GTBBlockMultiblockCasingB.CasingType> {

    public GTBBlockMultiblockCasingB() {
        super(Material.IRON);
        setTranslationKey("gtb_multiblock_casing_b");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(CasingType.GENERAL_PROCESSING_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public static enum CasingType implements IStringSerializable {
        GENERAL_PROCESSING_CASING("general_processing_casing"),
        MARAGING_STEEL_CASING("maraging_steel_casing"),
        BABBITT_ALLOY_CASING("babbitt_alloy_casing"),
        ZIRCONIUM_CARBIDE_CASING("zirconium_carbide_casing"),
        SUPERCRITICAL_FLUID_TURBINE_CASING("supercritical_fluid_turbine_casing"),
        CORROSION_CASING("corrosion_casing"),
        HASTELLOYX78_CASING("hastelloy_x78_casing"),
        STELLAR_CONTAINMENT_CASING("stellar_containment_casing"),
        HASTELLOYK243_CASING("hastelloy_k243_casing"),
        PRECISE_ASSEMBLER_CASING_MK1("precise_assembler_casing_mk1"),
        PRECISE_ASSEMBLER_CASING_MK2("precise_assembler_casing_mk2"),
        PRECISE_ASSEMBLER_CASING_MK3("precise_assembler_casing_mk3"),
        SUPERCRITICAL_FLUID_TURBINE_SHAFT_BLOCK("supercritical_fluid_turbine_shaft_block"),
        ALLOY_SMELTING_PIPE_CASING("alloy_smelting_pipe_casing"),
        CYCLOTRON_CASING("cyclotron_casing"),
        CYCLOTRON_COIL("cyclotron_coil");
        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return name;
        }
    }
}
