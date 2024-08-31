package gtb.api.block.impl;

import gtb.api.block.ITier;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public class WrappedTier implements ITier {
    private final IStringSerializable inner;

    public WrappedTier(IStringSerializable inner) {
        this.inner = inner;
    }

    @Override
    @Nonnull
    public String getName() {
        return inner.getName();
    }
}
