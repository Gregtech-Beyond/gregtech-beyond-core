package gtb.api;

import gregtech.common.blocks.*;
import gtb.api.block.ITier;
import gtb.api.block.ITierGlassBlockState;
import gtb.api.block.impl.WrappedIntTier;
import gtb.api.block.impl.WrappedTierWithMeta;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.*;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;

import java.util.Arrays;
import java.util.stream.Collectors;

import static gregtech.api.GregTechAPI.HEATING_COILS;

public class GTBAPI {
    
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_GLASS = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_GLASS_SHAPE_INFO = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_MACHINE_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CP_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CP_TUBE = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_PA_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_PA_INTERNAL_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CA_TIRED_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_QFT_MANIPULATOR = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_QFT_SHIELDING_CORE = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_QFT_GLASS = new Object2ObjectOpenHashMap<>();

    public static void APIBlockInit() {

        //  GTB_GLASS Init
        for (BlockGlassCasing.CasingType type : BlockGlassCasing.CasingType.values()) {
            MAP_GLASS.put(MetaBlocks.TRANSPARENT_CASING.getState(type), (ITierGlassBlockState)((Object)type));
        }
        for (GTBBlockGlassCasing.CasingType type : GTBBlockGlassCasing.CasingType.values()) {
            MAP_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING.getState(type), type);
        }
        for (GTBBlockPMMACasing.CasingType type : GTBBlockPMMACasing.CasingType.values()) {
            MAP_GLASS.put(GTBMetaBlocks.GTB_PMMA_CASING.getState(type), type);
        }
        for (GTBBlockTransparentCasing.TransparentCasingType type : GTBBlockTransparentCasing.TransparentCasingType.values()) {
            MAP_GLASS.put(GTBMetaBlocks.GTB_TRANSPARENT_CASING.getState(type), type);
        }
        for (GTBBlockGlassCasingB.GlassType type : GTBBlockGlassCasingB.GlassType.values()) {
            MAP_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING_B.getState(type), type);
        }
        MAP_GLASS.put(Blocks.GLASS.getDefaultState(), (ITierGlassBlockState) Blocks.GLASS);

        MAP_GLASS_SHAPE_INFO.putAll(MAP_GLASS);

        for (EnumDyeColor enumdyecolor : EnumDyeColor.values()) {
            MAP_GLASS.put(Blocks.STAINED_GLASS.getStateFromMeta(enumdyecolor.getMetadata()), new WrappedTierWithMeta((ITierGlassBlockState) Blocks.STAINED_GLASS, enumdyecolor.getMetadata()));
        }


        //  MAP_MACHINE_CASING Init
        for (BlockMachineCasing.MachineCasingType type : Arrays.stream(BlockMachineCasing.MachineCasingType.values()).filter((c)-> c.ordinal()<10).collect(Collectors.toList())) {
            MAP_MACHINE_CASING.put(MetaBlocks.MACHINE_CASING.getState(type),new WrappedIntTier(type,type.ordinal()));
        }

        //  MAP_CP_CASING Init
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS,1));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.STEEL_SOLID,2));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.ALUMINIUM_FROSTPROOF),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.ALUMINIUM_FROSTPROOF,3));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN,4));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE,5));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST,6));

        //  MAP_CP_TUBE Init
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE,1));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE,2));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TITANIUM_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE,5));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TUNGSTENSTEEL_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.TUNGSTENSTEEL_PIPE,6));

        //  MAP_PA_CASING Init
        MAP_PA_CASING.put(GTBMetaBlocks.GTB_MULTIBLOCK_CASING_B.getState(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK1),
                new WrappedIntTier(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK1, 1));
        MAP_PA_CASING.put(GTBMetaBlocks.GTB_MULTIBLOCK_CASING_B.getState(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK2),
                new WrappedIntTier(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK2, 2));
        MAP_PA_CASING.put(GTBMetaBlocks.GTB_MULTIBLOCK_CASING_B.getState(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK3),
                new WrappedIntTier(GTBBlockMultiblockCasingB.CasingType.PRECISE_ASSEMBLER_CASING_MK3, 3));

        //  MAP_PA_INTERNAL_CASING Init
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.LuV),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.LuV, 1));
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.ZPM),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.ZPM, 2));
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UV),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.UV, 3));

        //  MAP_CA_TIRED_CASING Init
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.LV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.LV, 1));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.MV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.MV, 2));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.HV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.HV, 3));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.EV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.EV, 4));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.IV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.IV, 5));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.LuV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.LuV, 6));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.ZPM),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.ZPM, 7));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.UV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.UV, 8));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.UHV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.UHV, 9));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.UEV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.UEV, 10));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.UIV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.UIV, 11));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.UXV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.UXV, 12));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.OpV),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.OpV, 13));
        MAP_CA_TIRED_CASING.put(GTBMetaBlocks.GTB_COMPONENT_ASSEMBLY_LINE_CASING.getState(GTBBlockComponentAssemblyLineCasing.CasingTier.MAX),
                new WrappedIntTier(GTBBlockComponentAssemblyLineCasing.CasingTier.MAX, 14));

        //  MAP_QFT_MANIPULATOR Init
        MAP_QFT_MANIPULATOR.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.NEUTRON_PULSE_MANIPULATOR_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.NEUTRON_PULSE_MANIPULATOR_CASING, 1));
        MAP_QFT_MANIPULATOR.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.COSMIC_FABRIC_MANIPULATOR_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.COSMIC_FABRIC_MANIPULATOR_CASING, 2));
        MAP_QFT_MANIPULATOR.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.INFINITY_INFUSED_MANIPULATOR_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.INFINITY_INFUSED_MANIPULATOR_CASING, 3));
        MAP_QFT_MANIPULATOR.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.SUPRACAUSAL_CONTINUUM_MANIPULATOR_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.SUPRACAUSAL_CONTINUUM_MANIPULATOR_CASING, 4));

        //  MAP_QFT_SHIELDING_CORE Init
        MAP_QFT_SHIELDING_CORE.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.NEUTRON_SHIELDING_CORE_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.NEUTRON_SHIELDING_CORE_CASING, 1));
        MAP_QFT_SHIELDING_CORE.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.COSMIC_FABRIC_SHIELDING_CORE_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.COSMIC_FABRIC_SHIELDING_CORE_CASING, 2));
        MAP_QFT_SHIELDING_CORE.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.INFINITY_INFUSED_SHIELDING_CORE_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.INFINITY_INFUSED_SHIELDING_CORE_CASING, 3));
        MAP_QFT_SHIELDING_CORE.put(GTBMetaBlocks.GTB_QUANTUM_FORCE_TRANSFORMER_CASING.getState(GTBBlockQuantumForceTransformerCasing.CasingType.SUPRACAUSAL_CONTINUUM_SHIELDING_CORE_CASING),
                new WrappedIntTier(GTBBlockQuantumForceTransformerCasing.CasingType.SUPRACAUSAL_CONTINUUM_SHIELDING_CORE_CASING, 4));

        //  MAP_QFT_GLASS Init
        MAP_QFT_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING_B.getState(GTBBlockGlassCasingB.GlassType.FORCE_FIELD_CONSTRAINED_GLASS),
                new WrappedIntTier(GTBBlockGlassCasingB.GlassType.FORCE_FIELD_CONSTRAINED_GLASS, 1));
        MAP_QFT_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING_B.getState(GTBBlockGlassCasingB.GlassType.COSMIC_MICROWAVE_BACKGROUND_RADIATION_ABSORPTION_GLASS),
                new WrappedIntTier(GTBBlockGlassCasingB.GlassType.COSMIC_MICROWAVE_BACKGROUND_RADIATION_ABSORPTION_GLASS, 2));
        MAP_QFT_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING_B.getState(GTBBlockGlassCasingB.GlassType.SPACETIME_SUPERCONDENSER_GLASS),
                new WrappedIntTier(GTBBlockGlassCasingB.GlassType.SPACETIME_SUPERCONDENSER_GLASS, 3));
        MAP_QFT_GLASS.put(GTBMetaBlocks.GTB_GLASS_CASING_B.getState(GTBBlockGlassCasingB.GlassType.SUPRACAUSAL_LIGHT_CONE_GLASS),
                new WrappedIntTier(GTBBlockGlassCasingB.GlassType.SUPRACAUSAL_LIGHT_CONE_GLASS, 4));
    }
}
