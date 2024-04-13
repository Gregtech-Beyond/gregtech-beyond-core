package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gtb.api.utils.GTBUtil.gtb;

import gtb.common.metatileentities.multiblocks.MultiBlockExample;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    public static MultiBlockExample MULTI_BLOCK_EXAMPLE;

    public static void init() {
        // Multiblocks
        MULTI_BLOCK_EXAMPLE = registerMetaTileEntity(3000, new MultiBlockExample(gtb("multi_block_example")));
    }
}
