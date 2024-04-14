package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gtb.api.utils.GTBUtil.gtb;

import gtb.common.metatileentities.multiblocks.MetaTileEntityWaterTank;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    public static MetaTileEntityWaterTank WATER_TANK;

    public static void init() {
        // Multiblocks
        WATER_TANK = registerMetaTileEntity(3000, new MetaTileEntityWaterTank(gtb("water_tank")));
    }
}
