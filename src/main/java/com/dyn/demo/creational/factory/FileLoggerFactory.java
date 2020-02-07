package com.dyn.demo.creational.factory;

import com.dyn.demo.creational.factory.logger.FileLogger;
import com.dyn.demo.creational.factory.logger.Logger;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        FileLogger logger = new FileLogger();

        return logger;
    }

}
