package gtb.api.metatileentity.multiblock;

import gregtech.api.capability.impl.MultiblockRecipeLogic;

import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gtb.api.capabilities.IKevMachine;
import gtb.api.capabilities.KevContainer;
import gtb.common.metatileentities.multiblocks.MetaTileEntityKevConsumer;

public class KevConsumerLogic extends MultiblockRecipeLogic {
    private IKevMachine kevMachine;

    public KevConsumerLogic(RecipeMapMultiblockController tileEntity) {
        super(tileEntity);
        this.kevMachine = (IKevMachine) tileEntity;
    }

    @Override
    public void updateWorkable() {
        super.update();
        if (metaTileEntity.getOffsetTimer() % 20 == 0) {
            KevContainer kevContainer = kevMachine.getKevContainer();
            if (kevContainer == null) return;
            kevContainer.scanAndSetKev();
        }
    }
}
