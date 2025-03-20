package gtb.api.capabilities;

import gregtech.api.metatileentity.MTETrait;
import gregtech.api.metatileentity.MetaTileEntity;
import net.minecraftforge.common.capabilities.Capability;
import org.jetbrains.annotations.NotNull;

public class KevContainer extends MTETrait {


    public KevContainer(@NotNull MetaTileEntity metaTileEntity) {
        super(metaTileEntity);
    }

    @Override
    public @NotNull String getName() {
        return "kev_container";
    }

    @Override
    public <T> T getCapability(Capability<T> capability) {
        return null;
    }
}
