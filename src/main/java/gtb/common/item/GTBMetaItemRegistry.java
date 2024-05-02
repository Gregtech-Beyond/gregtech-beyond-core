package gtb.common.item;

import gregtech.api.items.metaitem.StandardMetaItem;

public class GTBMetaItemRegistry extends StandardMetaItem {

    public GTBMetaItemRegistry(short i) {
        super(i);
    }

    @Override
    public void registerSubItems() {
        GTBMetaItems.ASTRO_MINER = addItem(1, "astro_miner");
        GTBMetaItems.MOON = addItem(2, "moon");
        GTBMetaItems.PARAFFIN_WAX = addItem(3, "paraffin_wax");
        GTBMetaItems.BITOMINOUS_RESIDUES = addItem ( 4, "bitominous_residues");

    }
}
