package gtb.common.item;

import gregtech.api.items.metaitem.MetaItem;

public class GTBMetaItems {

    public static MetaItem<?>.MetaValueItem ASTRO_MINER;
    public static MetaItem<?>.MetaValueItem MOON;
    public static MetaItem<?>.MetaValueItem PARAFFIN_WAX;
    public static MetaItem<?>.MetaValueItem BITOMINOUS_RESIDUES;
    public static MetaItem<?>.MetaValueItem PETRI_DISH;
    public static MetaItem<?>.MetaValueItem STERILIZED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem PLUS_STERILIZED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem CONTAMINATED_STERILIZED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem PETRI_DISH_MOLD;
    public static MetaItem<?>.MetaValueItem CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem CUPRIAVIDUS_NECATOR_CULTURE;
    public static MetaItem<?>.MetaValueItem ULTRASONIC_HOMOGENIZER;

    public static void init() {
        GTBMetaItemRegistry metaItem1 = new GTBMetaItemRegistry((short) 0);
        metaItem1.setRegistryName("gtb");
    }
}
