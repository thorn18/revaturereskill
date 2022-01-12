package src.log4j;

import org.apache.log4j.Logger;

public class testLogger {

    static Logger logger;

    public Logger getLogger() {
        return logger;
    }

    public testLogger() {
        this.logger = org.apache.log4j.Logger.getLogger(testLogger.class);

    }


}
