package gtb.api.render;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

import gtb.GregtechBeyondCore;

@Mod.EventBusSubscriber(modid = GregtechBeyondCore.MODID, value = Side.CLIENT)
public final class GTBTextures {

    public static SimpleOverlayRenderer VACUUM_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/vacuum_furnace_casing");
    public static SimpleOverlayRenderer CLIMATE_PROOF_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/climate_proof_casing");
    public static SimpleOverlayRenderer STEEL_BORDERED_WOODEN_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/steel_bordered_wooden_casing");
    public static final SimpleOverlayRenderer KEV_MULTIBLOCK_HATCH = new SimpleOverlayRenderer(
            "hatches/kev_multiblock_hatch/cube_all");
    public static final OrientedOverlayRenderer CRYSTALLIZER_OVERLAY = new OrientedOverlayRenderer(
            "machines/crystallizer");
    public static OrientedOverlayRenderer DEHYDRATOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/dehydrator");

    private GTBTextures() {}

    public static void preInit() {}
}
