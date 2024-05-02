package gtb.common.item;

import gregtech.api.items.metaitem.MetaItem;
import scala.tools.cmd.Meta;

public class GTBMetaItems {

    public static MetaItem<?>.MetaValueItem ASTRO_MINER;
    public static MetaItem<?>.MetaValueItem MOON;
    public static MetaItem<?>.MetaValueItem PARAFFIN_WAX;
    public static MetaItem<?>.MetaValueItem BITOMINOUS_RESIDUES;

    public static void init() {
        GTBMetaItemRegistry metaItem1 = new GTBMetaItemRegistry((short) 0);
        metaItem1.setRegistryName("gtb");
    }
}
