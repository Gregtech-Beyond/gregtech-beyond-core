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
        GTBMetaItems.YEAST_CELLS = addItem(12, "yeast_cells");
        GTBMetaItems.GROWN_YEAST_CULTURE = addItem(13, "grown_yeast_culture");
        GTBMetaItems.BARLEY = addItem(14, "barley");
        GTBMetaItems.SYRINGE = addItem(15, "syringe");
        GTBMetaItems.STERILIZED_SYRINGE = addItem(16, "sterilized_syringe");
        GTBMetaItems.SHEEP_BLOOD_SYRINGE = addItem(17, "sheep_blood_syringe");
        GTBMetaItems.COTTON = addItem(18, "cotton");
        GTBMetaItems.COTTON_SHEET = addItem(19, "cotton_sheet");
        GTBMetaItems.CHEESE_CLOTH = addItem(20, "cheese_cloth");
        GTBMetaItems.PANCREAS = addItem(21, "pancreas");
        GTBMetaItems.YEEM_PETRI = addItem(22, "yeem_petri");
        GTBMetaItems.SOY_BEAN = addItem(23, "soy_bean");
        GTBMetaItems.BIO_PLASTIC = addItem(24, "bio_plastic");
        GTBMetaItems.CUPRIAVIDUS_NECATOR_CULTURE = addItem(25, "cupriavidus_necator_culture");
        GTBMetaItems.PAD_PETRI_DISH = addItem(26, "pad_petri_dish");
    }
}
