package gtb.api.capabilites.containers.impl;

import static gtb.api.utils.NBTKeys.KEV_KEY;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.Capability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.MTETrait;
import gregtech.api.metatileentity.MetaTileEntity;

import gtb.api.capabilites.GTBTileCapabilities;
import gtb.api.capabilites.containers.interfaces.containers.ContainerNames;
import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;
import gtb.api.capabilites.pipable.CapabilityNetworkId;
import gtb.api.utils.GTBLog;
import lombok.Getter;

@Getter
public class KevContainer extends MTETrait implements IKevContainer {

    private int kev;
    private final int maxKev;

    public KevContainer(MetaTileEntity metaTileEntity, int maxKev) {
        super(metaTileEntity);
        this.maxKev = maxKev;
        this.kev = 0;
    }

    @Override
    public void setKev(int kev) {
        this.kev = kev;
        this.metaTileEntity.markDirty();
    }

    @NotNull
    @Override
    public String getName() {
        return ContainerNames.KEV_CONTAINER.name();
    }

    @Nullable
    public <T> T getCapability(Capability<T> capability) {
        if (capability == GTBTileCapabilities.CAPABILITY_KEV_CONTAINER) {
            return GTBTileCapabilities.CAPABILITY_KEV_CONTAINER.cast(this);
        }
        return null;
    }

    @NotNull
    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound compound = super.serializeNBT();
        compound.setInteger(KEV_KEY, this.kev);
        return compound;
    }

    @Override
    public void deserializeNBT(@NotNull NBTTagCompound compound) {
        this.kev = compound.getInteger(KEV_KEY);
    }

    @Override
    public void resetContainer() {
        this.setKev(0);
    }

    @Override
    public boolean canChangeKev(int valueToAdd) {
        int additionResult = this.getKev() + valueToAdd;
        return additionResult >= minKev && additionResult <= this.getMaxKev();
    }

    @Override
    public void changeKev(int valueToAdd) {
        this.setKev(this.kev + valueToAdd);
        GTBLog.logger.info("has Changed");
    }

    @Override
    public int getNetworkId() {
        return CapabilityNetworkId.KEV_NETWORK_ID.getId();
    }
}
