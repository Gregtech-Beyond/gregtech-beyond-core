package tkcy.simpleaddon.api.render;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

import tkcy.simpleaddon.TekCaySimpleAddon;

/**
 * Example taken from
 */
@Mod.EventBusSubscriber(modid = TekCaySimpleAddon.MODID, value = Side.CLIENT)
public final class TKCYSATextures {

    // Multiblock Controllers
    /**
     * Either declare here and initialize in {@link TKCYSATextures#preInit()}
     */
    public static SimpleOverlayRenderer EXAMPLE_TEXTURE;

    /**
     * Or declare and initialize in one step so it can be used without thinking about initialize order}
     */
    // public static SimpleOverlayRenderer EXAMPLE_TEXTURE = new SimpleOverlayRenderer(
    // "meta_block_example/block_example");

    private TKCYSATextures() {}

    public static void preInit() {
        EXAMPLE_TEXTURE = new SimpleOverlayRenderer("meta_block_example/block_example");;
    }
}
