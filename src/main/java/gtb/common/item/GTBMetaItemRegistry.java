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
        GTBMetaItems.BITUMINOUS_RESIDUES = addItem(4, "bituminous_residues");
        GTBMetaItems.DAMASCUS_STEEL_ASSEMBLY = addItem(5, "damascus_steel_assembly");
        GTBMetaItems.HOT_DAMASCUS_STEEL_ASSEMBLY = addItem(6, "hot_damascus_steel_assembly");
        GTBMetaItems.LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(7, "lightly_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(8, "hot_lightly_forged_damascus_steel_assembly");
        GTBMetaItems.MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(9, "moderately_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(10, "hot_moderately_forged_damascus_steel_assembly");
        GTBMetaItems.HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(11, "highly_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(12, "hot_highly_forged_damascus_steel_assembly");
    }
}
