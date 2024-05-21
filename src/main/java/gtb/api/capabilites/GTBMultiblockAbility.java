package gtb.api.capabilites;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gtb.api.capabilites.interfaces.containers.ContainerNames;
import gtb.api.capabilites.interfaces.containers.IKevContainer;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GTBMultiblockAbility {

    public static final MultiblockAbility<IKevContainer> KEY_CONTAINER = new MultiblockAbility<>(ContainerNames.KEV_CONTAINER_NAME.name());
}
