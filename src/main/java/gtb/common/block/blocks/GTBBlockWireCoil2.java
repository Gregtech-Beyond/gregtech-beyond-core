package gtb.common.block.blocks;

import gregtech.api.block.IHeatingCoilBlockStats;
import gregtech.api.block.VariantActiveBlock;
import gregtech.api.block.VariantItemBlock;
import gregtech.api.items.toolitem.ToolClasses;
import gregtech.api.unification.material.Material;
import gregtech.client.utils.TooltipHelper;
import gregtech.common.ConfigHolder;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityMultiSmelter;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static gregtech.api.unification.material.Materials.HSSS;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gtb.api.unification.materials.GTBMaterials.*;

public class GTBBlockWireCoil2 extends VariantActiveBlock<GTBBlockWireCoil2.GTBCoilType> {
    public GTBBlockWireCoil2() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("gtb_wire_coil_2");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel(ToolClasses.WRENCH, 2);
        setDefaultState(getState(GTBCoilType.TEMPORALLYCONSTRAINEDANTIMATTER));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(VARIANT).ordinal();
    }

    @NotNull
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(@NotNull ItemStack itemStack, @Nullable World worldIn, @NotNull List<String> lines,
                               @NotNull ITooltipFlag tooltipFlag) {
        super.addInformation(itemStack, worldIn, lines, tooltipFlag);

        // noinspection rawtypes, unchecked
        VariantItemBlock itemBlock = (VariantItemBlock<GTBCoilType, GTBBlockWireCoil2>) itemStack.getItem();
        IBlockState stackState = itemBlock.getBlockState(itemStack);
        GTBCoilType gtbCoilType = getState(stackState);

        lines.add(I18n.format("tile.wire_coil.tooltip_heat", gtbCoilType.coilTemperature));

        if (TooltipHelper.isShiftDown()) {
            int gtbCoilTier = gtbCoilType.tier;
            lines.add(I18n.format("tile.wire_coil.tooltip_smelter"));
            lines.add(I18n.format("tile.wire_coil.tooltip_parallel_smelter", gtbCoilType.level * 32));
            int EUt = MetaTileEntityMultiSmelter.getEUtForParallel(
                    MetaTileEntityMultiSmelter.getMaxParallel(gtbCoilType.getLevel()), gtbCoilType.getEnergyDiscount());
            lines.add(I18n.format("tile.wire_coil.tooltip_energy_smelter", EUt));
            lines.add(I18n.format("tile.wire_coil.tooltip_pyro"));
            lines.add(I18n.format("tile.wire_coil.tooltip_speed_pyro", gtbCoilTier == 0 ? 75 : 50 * (gtbCoilTier + 1)));
            lines.add(I18n.format("tile.wire_coil.tooltip_cracking"));
            lines.add(I18n.format("tile.wire_coil.tooltip_energy_cracking", 100 - 10 * gtbCoilTier));
        } else {
            lines.add(I18n.format("tile.wire_coil.tooltip_extended_info"));
        }
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    @Override
    protected boolean isBloomEnabled(GTBCoilType value) {
        return ConfigHolder.client.coilsActiveEmissiveTextures;
    }

    public enum GTBCoilType implements IStringSerializable, IHeatingCoilBlockStats {
        TEMPORALLYCONSTRAINEDANTIMATTER("temporally_constrained_anti_matter", 16200, 512, 256, 9, TemporallyConstrainedAntiMatter),
        CATACLYSMINDUCEDMIXEDMATTER("cataclysm_induced_mixed_matter", 17100, 1024, 4096, 9, CataclysmInducedMixedMatter);

        private final String name;
        private final int coilTemperature;
        private final int level;
        private final int energyDiscount;
        private final int tier;
        private final Material material;

        GTBCoilType(String name, int coilTemperature, int level, int energyDiscount, int tier, Material material) {
            this.name = name;
            this.coilTemperature = coilTemperature;
            this.level = level;
            this.energyDiscount = energyDiscount;
            this.tier = tier;
            this.material = material;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getCoilTemperature() {
            return coilTemperature;
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public int getEnergyDiscount() {
            return energyDiscount;
        }

        @Override
        public int getTier() {
            return this.tier;
        }

        @Nullable
        @Override
        public Material getMaterial() {
            return material;
        }

        @NotNull
        @Override
        public String toString() {
            return getName();
        }
    }
}
