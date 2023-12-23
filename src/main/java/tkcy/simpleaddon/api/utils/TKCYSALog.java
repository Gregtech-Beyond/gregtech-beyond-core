package tkcy.simpleaddon.api.utils;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class TKCYSALog {

    public static Logger logger;

    private TKCYSALog() {}

    public static void init(@NotNull Logger modLogger) {
        logger = modLogger;
    }
}
