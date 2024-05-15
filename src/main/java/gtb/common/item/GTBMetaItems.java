package gtb.common.item;


import gregtech.api.items.metaitem.MetaItem;

public class GTBMetaItems {

    public static MetaItem<?>.MetaValueItem ASTRO_MINER;
    public static MetaItem<?>.MetaValueItem MOON;
    public static MetaItem<?>.MetaValueItem PARAFFIN_WAX;
    public static MetaItem<?>.MetaValueItem BITUMINOUS_RESIDUES;
    public static MetaItem<?>.MetaValueItem DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HOT_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY;

    public static void init() {
        GTBMetaItemRegistry metaItem1 = new GTBMetaItemRegistry((short) 0);
        metaItem1.setRegistryName("gtb");
    }
}
