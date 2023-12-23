package tkcy.simpleaddon.common;

import net.minecraftforge.common.config.Config;

import tkcy.simpleaddon.TekCaySimpleAddon;

@Config(modid = TekCaySimpleAddon.MODID)
public class TKCYSAConfigHolder {

    @Config.Comment("Config tooltip")
    @Config.Name("Config label")
    public static GlobalMultiblocks globalMultiblocks = new GlobalMultiblocks();

    public static class GlobalMultiblocks {

        @Config.Comment({ "Config tooltip" })
        /**
         * Config label; {@code false} is the default value;
         */
        public boolean enableTieredCasings = false;
    }
}
