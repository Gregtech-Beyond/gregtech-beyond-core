package gtb.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.common.blocks.MetaBlocks;

import gtb.common.block.blocks.*;

public final class GTBMetaBlocks {

    private GTBMetaBlocks() {}

    public static GTBMultiblockCasing GTB_MULTIBLOCK_CASING;
    public static GTBMultiblockActiveCasing GTB_MULTIBLOCK_ACTIVE_CASING;
    public static GTBExplosive GTB_EXPLOSIVE;
    public static GTBBlockWireCoil GTB_BLOCK_WIRE_COIL;
    public static GTBBlockWireCoil2 GTB_BLOCK_WIRE_COIL_2;
    public static BlockCrucible BLOCK_CRUICIBLE;

    public static void init() {
        GTB_MULTIBLOCK_CASING = new GTBMultiblockCasing();
        GTB_MULTIBLOCK_CASING.setRegistryName("gtb_multiblock_casing");

        GTB_EXPLOSIVE = new GTBExplosive();
        GTB_EXPLOSIVE.setRegistryName("gtb_explosive");

        GTB_MULTIBLOCK_ACTIVE_CASING = new GTBMultiblockActiveCasing();
        GTB_MULTIBLOCK_ACTIVE_CASING.setRegistryName("gtb_multiblock_active_casing");

        GTB_BLOCK_WIRE_COIL = new GTBBlockWireCoil();
        GTB_BLOCK_WIRE_COIL.setRegistryName("gtb_wire_coil");

        GTB_BLOCK_WIRE_COIL_2 = new GTBBlockWireCoil2();
        GTB_BLOCK_WIRE_COIL_2.setRegistryName("gtb_wire_coil_2");

        BLOCK_CRUICIBLE = new BlockCrucible();
        BLOCK_CRUICIBLE.setRegistryName("block_cruicible");

    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(GTB_MULTIBLOCK_CASING);
        registerItemModel(GTB_EXPLOSIVE);
        GTB_MULTIBLOCK_ACTIVE_CASING.onModelRegister();
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(@NotNull Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            // noinspection ConstantConditions
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            MetaBlocks.statePropertiesToString(state.getProperties())));
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> @NotNull String getPropertyName(@NotNull IProperty<T> property,
                                                                             Comparable<?> value) {
        return property.getName((T) value);
    }
}
