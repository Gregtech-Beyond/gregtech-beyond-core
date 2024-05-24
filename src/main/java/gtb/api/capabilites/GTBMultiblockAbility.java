package gtb.api.capabilites;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;

import gtb.api.capabilites.interfaces.containers.ContainerNames;
import gtb.api.capabilites.interfaces.containers.IKevContainer;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GTBMultiblockAbility {

    public static final MultiblockAbility<IKevContainer> KEY_CONTAINER_INPUT = new MultiblockAbility<>(
            ContainerNames.KEV_CONTAINER_INPUT.name());

    public static final MultiblockAbility<IKevContainer> KEY_CONTAINER_OUTPUT = new MultiblockAbility<>(
            ContainerNames.KEV_CONTAINER_OUTPUT.name());
}
