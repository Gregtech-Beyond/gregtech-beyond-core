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

import javax.annotation.Nonnull;

public class GTBMultiblockCasing extends VariantBlock<GTBMultiblockCasing.CasingType> {

    public GTBMultiblockCasing() {
        super(Material.IRON);
        setTranslationKey("gtb_multiblock_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(CasingType.CLIMATE_PROOF_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable {


        ADVANCED_INVAR_CASING("advanced_invar_casing"),
        CLIMATE_PROOF_CASING("climate_proof_casing"),
        QUANTUM_CASING("quantum_casing"),
        QUANTUM_GLASS("quantum_glass"),
        ENGRAVER_CASING("engraver_casing"),
        POLYBENZIMIDAZOLE_PIPE("polybenzimidazole_pipe_casing"),
        CYCLOTRON_CASING("cyclotron_casing"),
        CYCLOTRON_COIL("cyclotron_coil"),
        IRIDIUM_CASING("iridium_casing"),
        ADVANCED_FILTER_CASING("advanced_filter_casing"),
        ALGAE_FARM_CASING("algae_farm_casing"),
        SUBSTRATE("substrate_casing"),
        BASIC_STRUCTURAL_CASING("basic_structural_casing"),
        ADVANCED_SUBSTRATE("advanced_substrate_casing"),
        VACUUM_FURNACE_CASING("vacuum_furnace_casing"),
        SILICON_CARBIDE_CASING("silicon_carbide_casing"),
        BIOLOGICALLY_STERILE_CASING("biologically_sterile_casing"),
        FULLERENE_POLYMER_TETRIX_CASING("fullerene_polymer_tetrix_casing"),
        GRAVITY_SEPARATOR_ROTOR_BLOCK("gravity_separator_rotor_block"),
        SUBSTRATE_CASING("substrate_casing"),
        ADVANCED_SUBSTRATE_CASING("advanced_substrate_casing"),
        ADVANCED_ALUMINIUM_CASING("advanced_aluminium_casing"),
        VACUUM_CASING("vacuum_casing"),
        DRILL_HEAD("drill_head"),
        NAQUADRIA_CASING("naquadria_casing"),
        HYPER_CASING("hyper_casing"),
        TALONITE_CASING("talonite_casing"),
        FARM_PIPE_CASING("farm_pipe_casing"),
        FARM_CASING("farm_casing"),
        BREEDING_CASING("breeding_casing"),
        TRITANIUM_CASING("tritanium_casing"),
        REFLECTIVE_CASING("reflective_casing");
        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return name;
        }
    }
}
