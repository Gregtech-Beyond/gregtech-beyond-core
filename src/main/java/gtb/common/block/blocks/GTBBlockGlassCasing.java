package gtb.common.block.blocks;

import gregtech.api.GTValues;
import gtb.api.block.ITier;
import gtb.api.block.ITierGlassBlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

import javax.annotation.Nonnull;

public class GTBBlockGlassCasing extends VariantBlock<GTBBlockGlassCasing.CasingType> {

    public GTBBlockGlassCasing() {
        super(Material.IRON);
        setTranslationKey("gtb_glass");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(CasingType.NAQ_BORON_SILICATE_GLASS));
    }

    @Override
    @NotNull
    public BlockRenderLayer getRenderLayer() { return BlockRenderLayer.CUTOUT;}

    @Override
    public boolean canRenderInLayer(@NotNull IBlockState state, @NotNull BlockRenderLayer layer) {
            return getState(state) == CasingType.NAQ_BORON_SILICATE_GLASS ? layer == BlockRenderLayer.TRANSLUCENT :
                    super.canRenderInLayer(state, layer);
    }

    @Override
    public boolean isOpaqueCube(@NotNull IBlockState state) {return false ; }

    @Override
    public boolean isFullCube(@NotNull IBlockState state) { return false ;}

    @Override
    @SideOnly(Side.CLIENT)

    public boolean shouldSideBeRendered(@NotNull IBlockState state, IBlockAccess world, BlockPos pos,
                                        @NotNull EnumFacing side) {
        IBlockState sideState = world.getBlockState(pos.offset(side));

        return sideState.getBlock() == this ?
                getState(sideState) != getState(state) :
                super.shouldSideBeRendered(state, world, pos, side);

        }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable, ITierGlassBlockState {

        SILICATE_GLASS("boron_silicate_glass", GTValues.HV, true),
        TI_BORON_SILICATE_GLASS("ti_boron_silicate_glass", GTValues.EV, true),
        W_BORON_SILICATE_GLASS("w_boron_silicate_glass", GTValues.IV, true),
        OSMIR_BORON_SILICATE_GLASS("osmir_boron_silicate_glass",GTValues.LuV, true),
        NAQ_BORON_SILICATE_GLASS("naq_boron_silicate_glass", GTValues.ZPM, true),
        THY_BORON_SILICATE_GLASS("thy_boron_silicate_glass", GTValues.EV, true);

        private final String name;
        private final int tier;
        private final boolean isOpticalGlass;

        CasingType(String name, int tier, boolean isOpticalGlass) {
            this.name = name;
            this.tier = tier;
            this.isOpticalGlass = isOpticalGlass;
        }

        @Nonnull
        @Override
        public String getName() {return this.name;}

        @Override
        public int getGlassTier() {return this.tier;}

        public boolean isOpticalGlass() {return isOpticalGlass;}

        @Nonnull
        @Override
        public String toString() {return getName();}
    }
}
