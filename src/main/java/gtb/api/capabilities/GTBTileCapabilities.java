package gtb.api.capabilities;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import gregtech.api.capability.SimpleCapabilityManager;

public class GTBTileCapabilities {

    @CapabilityInject(KevContainer.class)
    public static Capability<KevContainer> CAPABILITY_KEV_CONTAINER = null;

    public static void register() {
        SimpleCapabilityManager.registerCapabilityWithNoDefault(KevContainer.class);
    }
}
