package gtb.api.utils;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class GTBLog {

    public static Logger logger;

    private GTBLog() {}

    public static void init(@NotNull Logger modLogger) {
        logger = modLogger;
    }
}
