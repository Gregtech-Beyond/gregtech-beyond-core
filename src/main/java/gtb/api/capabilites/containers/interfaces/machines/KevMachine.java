package gtb.api.capabilites.containers.interfaces.machines;

import org.jetbrains.annotations.Nullable;

import gtb.api.capabilites.containers.interfaces.containers.IKevContainer;

public interface KevMachine {

    @Nullable
    IKevContainer getIKevContainer();
}
