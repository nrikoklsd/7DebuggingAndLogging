package task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("test_1-info");
        logger.warn("test_1-warn");
        logger.debug("test_1-debug");
        logger.error("test_1-error");
        logger.fatal("test_1-fatal");
        logger.trace("test_1");

    }
}

