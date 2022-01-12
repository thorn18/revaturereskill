package src.log4j;

import org.apache.log4j.Logger;

public class logging {

    public static void main(String[] args) {
        testLogger t = new testLogger();
        Logger logger = t.getLogger();

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.error("This is an error method");
    }


}
