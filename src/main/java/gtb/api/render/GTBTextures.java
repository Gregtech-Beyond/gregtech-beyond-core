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
    public static SimpleOverlayRenderer BIOLOGICALLY_STERILE_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/biologically_sterile_casing");
    public static final OrientedOverlayRenderer CRYSTALLIZER_OVERLAY = new OrientedOverlayRenderer(
            "machines/crystallizer");
    public static OrientedOverlayRenderer DEHYDRATOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/dehydrator");
    public static OrientedOverlayRenderer NANOSCALE_FABRICATOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/nanoscale_fabricator");
    public static SimpleOverlayRenderer SILICON_CARBIDE_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/silicon_carbide_casing");
    public static SimpleOverlayRenderer CVD_UNIT_OVERLAY = new SimpleOverlayRenderer(
            "multiblock/cvd_unit");
    public static SimpleOverlayRenderer LARGE_CVD_UNIT_OVERLAY = new SimpleOverlayRenderer(
            "multiblock/large_cvd_unit");
    public static SimpleOverlayRenderer CURING_OVEN_OVERLAY = new SimpleOverlayRenderer(
            "multiblock/curing_oven");
    public static final SimpleOverlayRenderer KEV_MULTIBLOCK_HATCH = new SimpleOverlayRenderer(
            "hatches/kev_multiblock_hatch/cube_all");
    public static SimpleOverlayRenderer KEV_HATCH_OUTPUT_OVERLAY = new SimpleOverlayRenderer(
            "hatches/kev_multiblock_hatch/output_overlay");
    public static SimpleOverlayRenderer KEV_HATCH_INPUT_OVERLAY = new SimpleOverlayRenderer(
            "hatches/kev_multiblock_hatch/input_overlay");

    private GTBTextures() {}

    public static void preInit() {}
}
