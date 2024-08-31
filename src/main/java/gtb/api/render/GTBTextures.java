package gtb.api.render;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

import gtb.GregtechBeyondCore;

@Mod.EventBusSubscriber(modid = GregtechBeyondCore.MODID, value = Side.CLIENT)
public final class GTBTextures {

    public static SimpleOverlayRenderer BURNER_REACTOR_OVERLAY = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/burner_reactor_overlay");
    public static SimpleOverlayRenderer VACUUM_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/vacuum_furnace_casing");
    public static SimpleOverlayRenderer CLIMATE_PROOF_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/climate_proof_casing");
    public static SimpleOverlayRenderer BIOLOGICALLY_STERILE_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/biologically_sterile_casing");
    public static OrientedOverlayRenderer DEHYDRATOR_OVERLAY = new OrientedOverlayRenderer(
            "machines/dehydrator");
    public static SimpleOverlayRenderer SILICON_CARBIDE_CASING = new SimpleOverlayRenderer(
            "gtb_multiblock_casing/silicon_carbide_casing");
    public static SimpleOverlayRenderer CURING_OVEN_OVERLAY = new SimpleOverlayRenderer(
            "multiblock/curing_oven");
    public static SimpleOverlayRenderer ALGAE_FARM_CASING = new SimpleOverlayRenderer(
            "multiblock/algae_farm_casing");
    public static SimpleOverlayRenderer CYCLOTRON_CASING = new SimpleOverlayRenderer(
            "multiblock/cyclotron_casing");
    public static SimpleOverlayRenderer IRIDIUM_CASING = new SimpleOverlayRenderer(
            "multiblock/iridium_casing");
    public static SimpleOverlayRenderer QUANTUM_CASING = new SimpleOverlayRenderer(
            "multiblock/quantum_casing");

    private GTBTextures() {}

    public static void preInit() {}
}
