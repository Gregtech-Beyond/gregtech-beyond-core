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
        GTBMetaItems.BITOMINOUS_RESIDUES = addItem(4, "bitominous_residues");
        GTBMetaItems.PETRI_DISH = addItem(5, "petri_dish");
        GTBMetaItems.STERILIZED_PETRI_DISH = addItem(6, "sterilized_petri_dish");
        GTBMetaItems.PLUS_STERILIZED_PETRI_DISH = addItem(7, "plus_sterilized_petri_dish");
        GTBMetaItems.CONTAMINATED_STERILIZED_PETRI_DISH = addItem(8, "contaminated_sterilized_petri_dish");
        GTBMetaItems.PETRI_DISH_MOLD = addItem(9, "petri_dish_mold");
        GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH = addItem(10, "cuprivavidus_bacteria_sample_petri_dish");
        GTBMetaItems.ULTRASONIC_HOMOGENIZER = addItem(11, "ultrasonic_homogenizer");
    }
}
