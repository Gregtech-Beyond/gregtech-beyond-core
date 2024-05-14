package gtb.api.capabilites.interfaces.machines;

import gtb.api.capabilites.interfaces.containers.IKevContainer;
import org.jetbrains.annotations.Nullable;

public interface KevMachine {

    @Nullable
    IKevContainer getKevContainer();
}
