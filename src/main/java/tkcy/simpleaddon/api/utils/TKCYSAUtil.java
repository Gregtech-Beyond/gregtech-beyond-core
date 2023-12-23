package tkcy.simpleaddon.api.utils;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import tkcy.simpleaddon.TekCaySimpleAddon;

public final class TKCYSAUtil {

    public static @NotNull ResourceLocation tkcysa(@NotNull String path) {
        return new ResourceLocation(TekCaySimpleAddon.MODID, path);
    }

    private TKCYSAUtil() {}
}
