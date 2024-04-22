package gtb.common;

import java.util.Objects;
import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import gregtech.api.block.VariantItemBlock;

import gtb.GregtechBeyondCore;
import gtb.api.utils.GTBLog;
import gtb.common.block.GTBMetaBlocks;
import gtb.loaders.recipe.GTBRecipeLoader;

@Mod.EventBusSubscriber(modid = GregtechBeyondCore.MODID)
public class CommonProxy {

    public void preLoad() {}

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(GregtechBeyondCore.MODID)) {
            ConfigManager.sync(GregtechBeyondCore.MODID, Config.Type.INSTANCE);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        GTBLog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(GTBMetaBlocks.GTB_MULTIBLOCK_CASING);
        registry.register(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GTBLog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(GTBMetaBlocks.GTB_MULTIBLOCK_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(GTBMetaBlocks.GTB_MULTIBLOCK_ACTIVE_CASING, VariantItemBlock::new));
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent()
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTBLog.logger.info("Registering recipes...");

        // Main recipe registration
        // This is called AFTER GregTech registers recipes, so
        // anything here is safe to call removals in
        GTBRecipeLoader.init();
    }
}
