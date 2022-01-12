package src.log4j;

import org.apache.log4j.Logger;

public class logging {
    static Logger logger;

    public logging() {
        this.logger = Logger.getLogger(this.getClass());

    }

    public static void main(String[] args) {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.error("This is an error method");
    }


}
