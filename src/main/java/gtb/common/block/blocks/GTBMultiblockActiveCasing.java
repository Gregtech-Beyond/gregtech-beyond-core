package gtb.common.block.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantActiveBlock;
import gregtech.client.utils.BloomEffectUtil;

public class GTBMultiblockActiveCasing extends VariantActiveBlock<GTBMultiblockActiveCasing.ActiveCasingType> {

    public GTBMultiblockActiveCasing() {
        super(Material.IRON);
        setTranslationKey("gtb_multiblock_active_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(ActiveCasingType.DIMENSIONAL_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    @Override
    public boolean canRenderInLayer(@NotNull IBlockState state, @NotNull BlockRenderLayer layer) {
        ActiveCasingType type = getState(state);
        if (type == ActiveCasingType.HIGH_ENERGY_COIL) {
            if (layer == BlockRenderLayer.SOLID) return true;
        } else if (layer == BlockRenderLayer.CUTOUT) return true;

        if (isBloomEnabled(type)) return layer == BloomEffectUtil.getEffectiveBloomLayer(layer);
        return layer == BlockRenderLayer.CUTOUT;
    }

    public enum ActiveCasingType implements IStringSerializable {

        DIMENSIONAL_CASING("dimensional_casing"),
        FIELD_GENERATOR_CASING("field_generator_casing"),
        HIGH_ENERGY_COIL("high_energy_coil");

        private final String name;

        ActiveCasingType(String name) {
            this.name = name;
        }

        @Override
        public @NotNull String getName() {
            return this.name;
        }
    }
}
