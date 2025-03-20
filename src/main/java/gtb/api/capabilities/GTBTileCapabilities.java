package gtb.api.capabilities;

import gregtech.api.capability.SimpleCapabilityManager;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class GTBTileCapabilities {

    @CapabilityInject(KevContainer.class)
    public static Capability<KevContainer> CAPABILITY_KEV_CONTAINER = null;

    public static void register() {
        SimpleCapabilityManager.registerCapabilityWithNoDefault(KevContainer.class);
    }
}
