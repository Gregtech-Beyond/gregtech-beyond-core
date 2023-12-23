package gtb.api.unification;

public final class GTBFirstDegreeMaterials {

    private GTBFirstDegreeMaterials() {}

    public static void init() {
        /**
         * {@link gregtech.api.unification.material.materials.FirstDegreeMaterials}
         * e.g. :
         * StainlessSteel = new Material.Builder(323, gregtechId("stainless_steel"))
         * .ingot(3)
         * .liquid(new FluidBuilder().temperature(2011))
         * .color(0xC8C8DC).iconSet(SHINY)
         * .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_LONG_ROD,
         * GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE)
         * .components(Iron, 6, Chrome, 1, Manganese, 1, Nickel, 1)
         * .toolStats(ToolProperty.Builder.of(7.0F, 5.0F, 1024, 3)
         * .enchantability(14).build())
         * .rotorStats(7.0f, 4.0f, 480)
         * .fluidPipeProperties(2428, 75, true, true, true, false)
         * .blast(b -> b.temp(1700, GasTier.LOW).blastStats(VA[HV], 1100))
         * .build();
         */
    }
}
