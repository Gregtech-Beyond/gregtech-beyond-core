package gtb.api.utils;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gtb.GregtechBeyondCore;

public final class GTBUtil {

    public static @NotNull ResourceLocation gtb(@NotNull String path) {
        return new ResourceLocation(GregtechBeyondCore.MODID, path);
    }

    private GTBUtil() {}
}
