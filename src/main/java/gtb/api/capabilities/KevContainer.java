package gtb.api.capabilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.capabilities.Capability;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MTETrait;
import gregtech.api.metatileentity.MetaTileEntity;

import lombok.Getter;

@Getter
public class KevContainer extends MTETrait {

    private int kev;
    private final boolean isInput;

    public KevContainer(@NotNull MetaTileEntity metaTileEntity, boolean isInput) {
        super(metaTileEntity);
        this.isInput = isInput;
    }

    @Override
    public @NotNull String getName() {
        return "kev_container";
    }

    @Override
    public <T> T getCapability(Capability<T> capability) {
        if (capability == GTBTileCapabilities.CAPABILITY_KEV_CONTAINER) {
            return GTBTileCapabilities.CAPABILITY_KEV_CONTAINER.cast(this);
        }
        return null;
    }

    public void setKev(int value) {
        this.kev = value;
        this.metaTileEntity.markDirty();
    }

    public void reset() {
        setKev(0);
    }

    @Override
    @NotNull
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        nbtTagCompound.setInteger("kev", this.kev);
        return nbtTagCompound;
    }

    @Override
    public void deserializeNBT(@NotNull NBTTagCompound compound) {
        this.kev = compound.getInteger("kev");
    }

    @Override
    public void writeInitialSyncData(@NotNull PacketBuffer buf) {
        buf.writeInt(this.kev);
    }

    @Override
    public void receiveInitialSyncData(@NotNull PacketBuffer buf) {
        this.kev = buf.readInt();
    }
}
