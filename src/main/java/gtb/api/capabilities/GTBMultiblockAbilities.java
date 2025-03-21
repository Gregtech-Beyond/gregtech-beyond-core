package gtb.api.capabilities;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GTBMultiblockAbilities {

    public static final MultiblockAbility<KevContainer> KEV_CONTAINER_INPUT = new MultiblockAbility<>(
            "kev_container_input");
    public static final MultiblockAbility<KevContainer> KEV_CONTAINER_OUTPUT = new MultiblockAbility<>(
            "kev_container_output");
    public static final MultiblockAbility<IKevCooler> KEV_COOLER = new MultiblockAbility<>(
            "kev_cooler");
}
