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

        CLIMATE_PROOF_CASING("climate_proof_casing"),
        QUANTUM_CASING("quantum_casing"),
        QUANTUM_GLASS("quantum_glass"),
        ENGRAVER_CASING("engraver_casing"),
        SUBSTRATE("substrate"),
        ADVANCED_SUBSTRATE("advanced_substrate"),
        STEEL_BORDERED_WOODEN_CASING("steel_bordered_wooden_casing"),
        VACUUM_FURNACE_CASING("vacuum_furnace_casing"),
        SILICON_CARBIDE_CASING("silicon_carbide_casing"),
        NONCONDUCTING_CASING("nonconducting_casing"),

        BIOLOGICALLY_STERILE_CASING("biologically_sterile_casing"),
        FULLERENE_POLYMER_TETRIX_CASING("fullerene_polymer_tetrix_casing");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Override
        public @NotNull String getName() {
            return this.name;
        }
    }
}
