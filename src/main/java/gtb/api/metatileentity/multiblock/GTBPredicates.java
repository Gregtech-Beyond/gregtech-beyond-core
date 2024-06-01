package gtb.api.metatileentity.multiblock;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Supplier;

import net.minecraft.block.state.IBlockState;

import org.jetbrains.annotations.NotNull;

import gregtech.api.pattern.PatternStringError;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.util.BlockInfo;

import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.BlockCoolingCoil;

/**
 * Class containing global predicates
 */
public class GTBPredicates {

    private static final Supplier<TraceabilityPredicate> COOLING_COILS = () -> new TraceabilityPredicate(
            blockWorldState -> {
                IBlockState state = blockWorldState.getBlockState();
                if (state.getBlock() instanceof BlockCoolingCoil) {
                    BlockCoolingCoil.CoolingCoilType type = GTBMetaBlocks.COOLING_COIL.getState(state);
                    Object currentCoil = blockWorldState.getMatchContext().getOrPut("CoolingCoilType", type);
                    if (!currentCoil.equals(type)) {
                        blockWorldState.setError(new PatternStringError("gregtech.multiblock.pattern.error.coils"));
                        return false;
                    }
                    blockWorldState.getMatchContext().getOrPut("VABlock", new LinkedList<>())
                            .add(blockWorldState.getPos());
                    return true;
                }
                return false;
            }, () -> Arrays.stream(BlockCoolingCoil.CoolingCoilType.values())
                    .map(type -> new BlockInfo(GTBMetaBlocks.COOLING_COIL.getState(type)))
                    .toArray(BlockInfo[]::new));

    @NotNull
    public static TraceabilityPredicate coolingCoils() {
        return COOLING_COILS.get();
    }
}
