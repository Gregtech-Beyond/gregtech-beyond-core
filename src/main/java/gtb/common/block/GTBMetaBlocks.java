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
    public static BlockCrucible BLOCK_CRUCIBLE;
    public static BlockCoolingCoil COOLING_COIL;
    public static GTBBlockQuantumForceTransformerCasing GTB_QUANTUM_FORCE_TRANSFORMER_CASING;
    public static GTBBlockComponentAssemblyLineCasing GTB_COMPONENT_ASSEMBLY_LINE_CASING;
    public static GTBBlockGlassCasing GTB_GLASS_CASING;
    public static GTBBlockPMMACasing GTB_PMMA_CASING;
    public static GTBBlockTransparentCasing GTB_TRANSPARENT_CASING;
    public static GTBBlockGlassCasingB GTB_GLASS_CASING_B;
    public static GTBBlockMultiblockCasingB GTB_MULTIBLOCK_CASING_B;

    public static void init() {

        GTB_MULTIBLOCK_CASING_B = new GTBBlockMultiblockCasingB();
        GTB_MULTIBLOCK_CASING_B.setRegistryName("gtb_multiblock_casing_b");

        GTB_GLASS_CASING_B = new GTBBlockGlassCasingB();
        GTB_GLASS_CASING_B.setRegistryName("gtb_glass_casing_b");

        GTB_TRANSPARENT_CASING = new GTBBlockTransparentCasing();
        GTB_TRANSPARENT_CASING.setRegistryName("gtb_transparent_casing");

        GTB_PMMA_CASING = new GTBBlockPMMACasing();
        GTB_PMMA_CASING.setRegistryName("gtb_pmma_casing");

        GTB_GLASS_CASING = new GTBBlockGlassCasing();
        GTB_GLASS_CASING.setRegistryName("gtb_glass_casing");

        GTB_MULTIBLOCK_CASING = new GTBMultiblockCasing();
        GTB_MULTIBLOCK_CASING.setRegistryName("gtb_multiblock_casing");

        GTB_COMPONENT_ASSEMBLY_LINE_CASING = new GTBBlockComponentAssemblyLineCasing();
        GTB_COMPONENT_ASSEMBLY_LINE_CASING.setRegistryName("gtb_quantum_component_assembly_line_casing");

        GTB_EXPLOSIVE = new GTBExplosive();
        GTB_EXPLOSIVE.setRegistryName("gtb_explosive");

        GTB_MULTIBLOCK_ACTIVE_CASING = new GTBMultiblockActiveCasing();
        GTB_MULTIBLOCK_ACTIVE_CASING.setRegistryName("gtb_multiblock_active_casing");

        BLOCK_CRUCIBLE = new BlockCrucible();
        BLOCK_CRUCIBLE.setRegistryName("crucible");

        COOLING_COIL = new BlockCoolingCoil();
        COOLING_COIL.setRegistryName("cooling_coil");

        GTB_QUANTUM_FORCE_TRANSFORMER_CASING = new GTBBlockQuantumForceTransformerCasing();
        GTB_QUANTUM_FORCE_TRANSFORMER_CASING.setRegistryName("gtb_quantum_force_transformer_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(GTB_MULTIBLOCK_CASING);
        registerItemModel(GTB_EXPLOSIVE);
        registerItemModel(GTB_MULTIBLOCK_ACTIVE_CASING);
        registerItemModel(BLOCK_CRUCIBLE);
        registerItemModel(COOLING_COIL);
        registerItemModel(GTB_TRANSPARENT_CASING);
        registerItemModel(GTB_QUANTUM_FORCE_TRANSFORMER_CASING);
        registerItemModel(GTB_MULTIBLOCK_CASING_B);
        registerItemModel(GTB_PMMA_CASING);
        registerItemModel(GTB_GLASS_CASING);
        registerItemModel(GTB_GLASS_CASING_B);
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
