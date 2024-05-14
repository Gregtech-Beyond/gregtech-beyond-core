package gtb.common.item;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;

public class GTBMetaItems extends StandardMetaItem {
    public GTBMetaItems(short i) {
        super(i);
    }

    public static void init() {
        GTBMetaItems metaItem1 = new GTBMetaItems((short) 0);
        metaItem1.setRegistryName("gtb");
        metaItem1.addItem(1, "astro_miner");
        metaItem1.addItem(2, "moon");
        metaItem1.addItem(3, "paraffin_wax");
        metaItem1.addItem(4, "bitominous_residues");
        metaItem1.addItem(5, "damascus_steel_assembly");
        metaItem1.addItem(6, "hot_damascus_steel_assembly");
    }
}
