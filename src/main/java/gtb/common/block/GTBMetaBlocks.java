package gtb.common.block;

import gtb.common.block.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.network.DimensionMessageHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.common.blocks.MetaBlocks;

public final class GTBMetaBlocks {

    private GTBMetaBlocks() {}

    public static QuantumGlass QUANTUM_GLASS;
    public static DimensionalCasing DIMENSIONAL_CASING;
    public static FieldGeneratorCasing FIELD_GENERATOR_CASING;
    public static HighEnergyCoil HIGH_ENERGY_COIL;
    public static QuantumCasing QUANTUM_CASING;
    public static VacuumFurnaceCasing VACUUM_FURNACE_CASING;
    public static SteelBorderedWoodenCasing STEEL_BORDERED_WOODEN_CASING;
    public static ClimateProofCasing CLIMATE_PROOF_CASING;

    public static void init() {

        QUANTUM_GLASS = new QuantumGlass();
        QUANTUM_GLASS.setRegistryName("QuantumGlass");

        DIMENSIONAL_CASING = new DimensionalCasing();
        DIMENSIONAL_CASING.setRegistryName("DimensionalCasing");

        FIELD_GENERATOR_CASING = new FieldGeneratorCasing();
        FIELD_GENERATOR_CASING.setRegistryName("FieldGeneratorCasing");

        VACUUM_FURNACE_CASING = new VacuumFurnaceCasing();
        VACUUM_FURNACE_CASING.setRegistryName("VacuumFurnaceCasing");

        QUANTUM_CASING = new QuantumCasing();
        QUANTUM_CASING.setRegistryName("QuantumCasing");

        HIGH_ENERGY_COIL = new HighEnergyCoil();
        HIGH_ENERGY_COIL.setRegistryName("HighEnergyCoil");

        STEEL_BORDERED_WOODEN_CASING = new SteelBorderedWoodenCasing();
        STEEL_BORDERED_WOODEN_CASING.setRegistryName("SteelBorderedWoodenCasing");

        CLIMATE_PROOF_CASING = new ClimateProofCasing();
        CLIMATE_PROOF_CASING.setRegistryName("ClimateProofCasing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(HIGH_ENERGY_COIL);
        registerItemModel(QUANTUM_CASING);
        registerItemModel(VACUUM_FURNACE_CASING);
        registerItemModel(FIELD_GENERATOR_CASING);
        registerItemModel(DIMENSIONAL_CASING);
        registerItemModel(QUANTUM_GLASS);
        registerItemModel(STEEL_BORDERED_WOODEN_CASING);
        registerItemModel(CLIMATE_PROOF_CASING);
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
