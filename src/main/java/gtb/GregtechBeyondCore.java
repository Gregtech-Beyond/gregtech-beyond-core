package gtb;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.jetbrains.annotations.NotNull;

import gtb.api.GTBInternalTags;
import gtb.api.capabilites.GTBTileCapabilities;
import gtb.api.utils.GTBLog;
import gtb.common.CommonProxy;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.item.GTBMetaItems;
import gtb.common.metatileentities.GTBMetaTileEntities;

@Mod(modid = GregtechBeyondCore.MODID,
     name = GregtechBeyondCore.NAME,
     version = GregtechBeyondCore.VERSION,
     dependencies = GTBInternalTags.GT_VERSION_STRING)
public class GregtechBeyondCore {

    public static final String MODID = "gtb";
    public static final String NAME = "Gregtech Beyond Core";
    public static final String VERSION = gtb.api.GTBInternalTags.VERSION;

    @SidedProxy(modId = MODID,
                clientSide = "gtb.common.ClientProxy",
                serverSide = "gtb.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void onPreInit(@NotNull FMLPreInitializationEvent event) {
        GTBLog.init(event.getModLog());
        GTBTileCapabilities.register();
        GTBMetaItems.init();
        GTBMetaBlocks.init();
        GTBMetaTileEntities.init();

        proxy.preLoad();
    }
}
