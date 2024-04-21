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

import gtb.common.block.blocks.MetaBlockExample;

public final class GTBMetaBlocks {

    public static MetaBlockExample EXAMPLE;

    public static void init() {
        EXAMPLE = new MetaBlockExample();
        EXAMPLE.setRegistryName("meta_block_example");
        CLIMATE_PROOF_CASING = new MetaBlockExample();
        CLIMATE_PROOF_CASING.setRegistryName("meta_block_example");

        VACUUM_FURNACE_CASING = new MetaBlockExample();
        VACUUM_FURNACE_CASING.setRegistryName("meta_block_example");

        QUANTUM_CASING = new MetaBlockExample();
        QUANTUM_CASING.setRegistryName("meta_block_example");

        DIMENSIONAL_CASING = new MetaBlockExample();
        DIMENSIONAL_CASING.setRegistryName("meta_block_example");

        FIELD_GENERATOR_CASING = new MetaBlockExample();
        FIELD_GENERATOR_CASING.setRegistryName("meta_block_example");

        QUANTUM_GLASS = new MetaBlockExample();
        QUANTUM_GLASS.setRegistryName("meta_block_example");

        HIGH_ENERGY_COIL = new MetaBlockExample();
        HIGH_ENERGY_COIL.setRegistryName("meta_block_example");

        EXAMPLE = new MetaBlockExample();
        EXAMPLE.setRegistryName("meta_block_example");

    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(EXAMPLE);
        registerItemModel(CLIMATE_PROOF_CASING);
        registerItemModel(VACUUM_FURNACE_CASING);
        registerItemModel(DIMENSIONAL_CASING);
        registerItemModel(FIELD_GENERATOR_CASING);
        registerItemModel(HIGH_ENERGY_COIL);
        registerItemModel(QUANTUM_GLASS);
        registerItemModel(QUANTUM_CASING);
    }

    public static MetaBlockExample QUANTUM_CASING;
    public static MetaBlockExample DIMENSIONAL_CASING;
    public static MetaBlockExample FIELD_GENERATOR_CASING;
    public static MetaBlockExample HIGH_ENERGY_COIL;
    public static MetaBlockExample QUANTUM_GLASS;
    public static MetaBlockExample CLIMATE_PROOF_CASING;
    public static MetaBlockExample VACUUM_FURNACE_CASING;

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
