package gtb.common.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import micdoodle8.mods.galacticraft.core.GCBlocks;

@Mod.EventBusSubscriber
public class BlockPlaceAbility {

    @SubscribeEvent
    public static void onBlockPlaced(BlockEvent.PlaceEvent event) {
        World world = event.getWorld();
        BlockPos placedPos = event.getPos();
        Block block = event.getPlacedBlock().getBlock();

        if (block != GCBlocks.landingPad) return;

        BlockPos below = placedPos.down();
        IBlockState stateBelow = world.getBlockState(below);
        Block blockBelow = stateBelow.getBlock();
        int meta = blockBelow.getMetaFromState(stateBelow);

        // Check if the block below is the correct rocket base block
        if (!blockBelow.getRegistryName().toString().equals("gtb:gtb_multiblock_casing2") || meta != 5) {
            if (!world.isRemote && event.getPlayer() != null) {
                event.getPlayer().sendStatusMessage(
                        new TextComponentString("You must place the Launch Pad on Rocket Base Block!"),
                        true);
            }
            event.setCanceled(true);
        }
    }
}
