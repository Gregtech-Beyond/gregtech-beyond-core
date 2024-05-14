package gtb.api.capabilites;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import gregtech.api.capability.SimpleCapabilityManager;

import gtb.api.capabilites.interfaces.containers.IKevContainer;

public final class GTBTileCapabilities {

    @CapabilityInject(IKevContainer.class)
    public static Capability<IKevContainer> CAPABILITY_KEV_CONTAINER = null;

    public static void register() {
        SimpleCapabilityManager.registerCapabilityWithNoDefault(IKevContainer.class);
    }
}
