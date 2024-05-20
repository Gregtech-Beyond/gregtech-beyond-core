package gtb;

import gtb.common.block.blocks.GTBBlockWireCoil;
import gtb.common.block.blocks.GTBBlockWireCoil2;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.jetbrains.annotations.NotNull;

import gtb.api.GTBInternalTags;
import gtb.api.utils.GTBLog;
import gtb.common.CommonProxy;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.item.GTBMetaItems;
import gtb.common.metatileentities.GTBMetaTileEntities;

import static gregtech.api.GregTechAPI.HEATING_COILS;

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

        GTBMetaItems.init();
        GTBMetaBlocks.init();
        GTBMetaTileEntities.init();

        for (GTBBlockWireCoil.GTBCoilType type : GTBBlockWireCoil.GTBCoilType.values()) {
            HEATING_COILS.put(GTBMetaBlocks.GTB_BLOCK_WIRE_COIL.getState(type), type);
        }

        for (GTBBlockWireCoil2.GTBCoilType type : GTBBlockWireCoil2.GTBCoilType.values()) {
            HEATING_COILS.put(GTBMetaBlocks.GTB_BLOCK_WIRE_COIL_2.getState(type), type);
        }

        proxy.preLoad();
    }
}
