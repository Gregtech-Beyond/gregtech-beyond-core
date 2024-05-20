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

import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.GTBMaterials.*;

public class GTBBlockWireCoil extends VariantActiveBlock<GTBBlockWireCoil.GTBCoilType> {
    public GTBBlockWireCoil() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("gtb_wire_coil");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel(ToolClasses.WRENCH, 2);
        setDefaultState(getState(GTBCoilType.HSS_S));
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
        VariantItemBlock itemBlock = (VariantItemBlock<GTBCoilType, GTBBlockWireCoil>) itemStack.getItem();
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
        HSS_S("hss_s", 6300, 4,4, 4, HSSS),
        NAQUADAH_ALLOY("naquadah_alloy", 8100, 8, 4, 5, NaquadahAlloy),
        AWAKENED_DRACONIUM("awakened_draconium",9900, 8, 8, 6, AwakenedDraconium),
        ADAMANTIUM("adamantium", 11700, 16, 4, 8, Adamantium),
        PIKYONIUM("pikyonium", 12600, 32, 16, 9, Pikyonium),
        COSMIC_NEUTRONIUM("comsic_neutronium", 13500, 64, 16, 9, CosmicNeutronium),
        INFINITY("infinity", 14400, 128, 64, 9, Infinity),
        ETERNAL("eternal", 15300, 256, 512, 9, Eternal);

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
