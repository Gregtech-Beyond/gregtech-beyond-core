package gtb.common.item;

import gregtech.api.items.metaitem.MetaItem;

public class GTBMetaItems {

    public static MetaItem<?>.MetaValueItem ASTRO_MINER;

    public static void init() {
        GTBMetaItemRegistry metaItem1 = new GTBMetaItemRegistry((short) 0);
        metaItem1.setRegistryName("gtb");
    }
}
