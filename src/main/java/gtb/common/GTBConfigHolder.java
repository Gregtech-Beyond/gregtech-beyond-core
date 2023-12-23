package gtb.common;

import net.minecraftforge.common.config.Config;

import gtb.GregtechBeyondCore;

@Config(modid = GregtechBeyondCore.MODID)
public class GTBConfigHolder {

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
