package gtb.api.metatileentity.multiblock;

import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Lists;

import gregtech.api.capability.GregtechDataCodes;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.EnergyContainerList;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockWithDisplayBase;
import gregtech.common.ConfigHolder;

import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.KevContainer;
import lombok.Getter;

public class KevGeneratorLogic {

    @Getter
    private KevContainer kevContainer;
    @Getter
    private int coolingAmount = 0;
    @Getter
    private int kevProduction = 0;
    @Getter
    private int euConsumption = 0;
    @Getter
    private boolean isWorking = false;
    @Getter
    private boolean isWorkingEnabled = false;

    private final MultiblockWithDisplayBase metaTileEntity;
    private IEnergyContainer energyContainer;
    protected boolean hasNotEnoughEnergy;
    private static final int base_kev_production = 300;
    private static final int base_eu_consumption = 1024;

    public KevGeneratorLogic(MultiblockWithDisplayBase metaTileEntity) {
        this.metaTileEntity = metaTileEntity;
    }

    public void initializeAbilities() {
        this.energyContainer = new EnergyContainerList(getAbilities(MultiblockAbility.INPUT_ENERGY));
        this.kevContainer = getAbilities(GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT).get(0);
        setCoolingAmount();
        setKevProduction();
    }

    private <T> List<T> getAbilities(MultiblockAbility<T> multiblockAbility) {
        return this.metaTileEntity.getAbilities(multiblockAbility);
    }

    private void setCoolingAmount() {
        getAbilities(GTBMultiblockAbilities.KEV_COOLER).forEach(cooler -> coolingAmount += cooler.getCoolingAmount());
    }

    private void setKevProduction() {
        this.kevProduction = base_kev_production - this.coolingAmount;
    }

    public void resetTileAbilities() {
        this.energyContainer = new EnergyContainerList(Lists.newArrayList());
        this.kevContainer.reset();
    }

    public boolean hasNotEnoughEnergy() {
        return hasNotEnoughEnergy;
    }

    public void update() {
        if (!isWorkingEnabled) {
            setWorking(false);
            return;
        }

        euConsumption = base_eu_consumption;

        boolean hasMaintenance = ConfigHolder.machines.enableMaintenance &&
                this.metaTileEntity.hasMaintenanceMechanics();
        if (hasMaintenance) {
            // 10% more energy per maintenance problem
            euConsumption += this.metaTileEntity.getNumMaintenanceProblems() * euConsumption / 10;
        }

        if (hasNotEnoughEnergy && this.energyContainer.getInputPerSec() > 19L * euConsumption) {
            hasNotEnoughEnergy = false;
        }

        if (this.energyContainer.getEnergyStored() >= euConsumption) {
            if (!hasNotEnoughEnergy) {
                long consumed = this.energyContainer.removeEnergy(euConsumption);
                if (consumed == -euConsumption) {
                    setWorking(true);
                } else {
                    hasNotEnoughEnergy = true;
                    setWorking(false);
                }
            }
        } else {
            hasNotEnoughEnergy = true;
            setWorking(false);
        }
    }

    public void setWorkingEnabled(boolean isWorkingAllowed) {
        isWorkingEnabled = isWorkingAllowed;
        this.metaTileEntity.markDirty();
        World world = this.metaTileEntity.getWorld();
        if (world != null && !world.isRemote) {
            this.metaTileEntity.writeCustomData(GregtechDataCodes.WORKING_ENABLED,
                    buf -> buf.writeBoolean(isWorkingEnabled));
        }
    }

    public void setWorking(boolean working) {
        if (working) this.kevContainer.setKev(kevProduction);
        else this.kevContainer.reset();

        if (isWorking != working) {
            isWorking = working;

            this.metaTileEntity.markDirty();
            World world = this.metaTileEntity.getWorld();
            if (world != null && !world.isRemote) {
                this.metaTileEntity.writeCustomData(GregtechDataCodes.WORKABLE_ACTIVE,
                        buf -> buf.writeBoolean(working));
            }
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        data.setBoolean("isWorking", this.isWorking);
        data.setBoolean("isWorkingEnabled", this.isWorkingEnabled);
        return data;
    }

    public void readFromNBT(NBTTagCompound data) {
        this.isWorking = data.getBoolean("isWorking");
        this.isWorkingEnabled = data.getBoolean("isWorkingEnabled");
    }

    public void writeInitialSyncData(PacketBuffer buf) {
        buf.writeBoolean(this.isWorking);
        buf.writeBoolean(this.isWorkingEnabled);
    }

    public void receiveInitialSyncData(PacketBuffer buf) {
        this.isWorking = buf.readBoolean();
        this.isWorkingEnabled = buf.readBoolean();
    }

    public void receiveCustomData(int dataId, @NotNull PacketBuffer buf) {
        if (dataId == GregtechDataCodes.WORKABLE_ACTIVE) {
            this.isWorking = buf.readBoolean();
            this.metaTileEntity.scheduleRenderUpdate();
        } else if (dataId == GregtechDataCodes.WORKING_ENABLED) {
            this.isWorkingEnabled = buf.readBoolean();
            this.metaTileEntity.scheduleRenderUpdate();
        }
    }
}
