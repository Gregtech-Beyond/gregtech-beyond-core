package gtb.api.render;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

import gtb.GregtechBeyondCore;

/**
 * Example taken from
 */
@Mod.EventBusSubscriber(modid = GregtechBeyondCore.MODID, value = Side.CLIENT)
public final class GTBTextures {

    // Multiblock Controllers
    /**
     * Either declare here and initialize in {@link GTBTextures#preInit()}
     */
    public static SimpleOverlayRenderer EXAMPLE_TEXTURE;

    /**
     * Or declare and initialize in one step so it can be used without thinking about initialize order}
     */
    // public static SimpleOverlayRenderer EXAMPLE_TEXTURE = new SimpleOverlayRenderer(
    // "meta_block_example/block_example");

    private GTBTextures() {}

    public static void preInit() {
        EXAMPLE_TEXTURE = new SimpleOverlayRenderer("meta_block_example/block_example");;
    }
}
