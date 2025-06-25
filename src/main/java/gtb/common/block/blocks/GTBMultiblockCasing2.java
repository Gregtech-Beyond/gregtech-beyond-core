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

public class GTBMultiblockCasing2 extends VariantBlock<GTBMultiblockCasing2.CasingType> {

    public GTBMultiblockCasing2() {
        super(Material.IRON);
        setTranslationKey("gtb_multiblock_casing2");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(CasingType.HSS_G_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable {

        HSS_G_CASING("hss_g_casing"),
        SONCIATOR_CASING("sonicator_casing"),
        THERMAL_EVAPORATION_CASING("thermal_evaporation_casing"),
        FUSED_QUARTZ_BLOCK("fused_quartz_block"),
        BLADE_ASSEMBLY_CASING("blade_assembly_casing"),
        ROCKET_BLOCK_BASE("rocket_block_base"),
        GALVANIZED_PORCELAIN_TILES("galvanized_porcelain_tiles");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Override
        public @NotNull String getName() {
            return this.name;
        }
    }
}
