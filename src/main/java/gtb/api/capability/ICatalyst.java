package gtb.api.capability;

import net.minecraftforge.items.IItemHandlerModifiable;


public interface ICatalyst extends IItemHandlerModifiable {

    default void consumeCatalyst(int amount){

    }
}
