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
    public static SimpleOverlayRenderer CORROSION_PROOF_CARBON_STEEL_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/corrosion_proof_carbon_steel_casing");
    public static final OrientedOverlayRenderer CURING_OVEN_OVERLAY = new OrientedOverlayRenderer(
            "machines/curing_oven");
    public static OrientedOverlayRenderer BEAM_SHRINKING_DEVICE_OVERLAY = new OrientedOverlayRenderer(
            "machines/beam_shrinking_device");
    public static OrientedOverlayRenderer VACUUM_EJECTOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/vacuum_ejector");
    public static OrientedOverlayRenderer DRYER_OVERLAY = new OrientedOverlayRenderer(
            "machines/dryer");
    public static OrientedOverlayRenderer ROASTER_OVERLAY = new OrientedOverlayRenderer(
            "machines/roasters");
    public static OrientedOverlayRenderer ROTARY_EVAPORATOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/rotary_evaporator");
    public static OrientedOverlayRenderer MICROSCOPE_OVERLAY = new OrientedOverlayRenderer(
            "machines/microscope");
    public static OrientedOverlayRenderer WATER_COLLECTOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/water_collector");
    public static OrientedOverlayRenderer INDUCTION_SMELTER_OVERLAY = new OrientedOverlayRenderer(
            "machines/induction_smelter");
    public static OrientedOverlayRenderer INSCRIBER_OVERLAY = new OrientedOverlayRenderer(
            "machines/inscriber");

    private GTBTextures() {}

    public static void preInit() {}
}
