package gtb.api.metatileentity.multiblock;

import gregtech.api.capability.impl.MultiblockRecipeLogic;

import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gtb.api.capabilities.IKevMachine;
import gtb.api.capabilities.KevContainer;
import gtb.common.metatileentities.multiblocks.MetaTileEntityKevConsumer;

public class KevConsumerLogic extends MultiblockRecipeLogic {

    private KevContainer kevContainer;

    public KevConsumerLogic(RecipeMapMultiblockController tileEntity, IKevMachine kevMachine) {
        super(tileEntity);
        this.kevContainer = kevMachine.getKevContainer();
    }


    @Override
    public void updateWorkable() {
        super.update();
        if (metaTileEntity.getOffsetTimer() % 20 == 0) {
            if (this.kevContainer == null) return;
            this.kevContainer.scanAndSetKev();
        }
    }
}
