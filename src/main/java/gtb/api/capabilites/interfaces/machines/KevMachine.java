package gtb.api.capabilites.interfaces.machines;

import org.jetbrains.annotations.Nullable;

import gtb.api.capabilites.interfaces.containers.IKevContainer;

public interface KevMachine {

    @Nullable
    IKevContainer getIKevContainer();
}
