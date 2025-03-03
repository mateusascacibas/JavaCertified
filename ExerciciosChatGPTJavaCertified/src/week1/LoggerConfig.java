package week1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerConfig {

    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getName());
    
    public static void configureLogger() {
        try {
            FileHandler fileHandler = new FileHandler("sistema.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
