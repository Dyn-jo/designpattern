package com.dyn.demo.creational.factory;

import com.dyn.demo.creational.factory.logger.Logger;

public class Test {

    /**
     * LoggerFactory的具体类型，可以写在配置文件中，灵活使用
     * @param args
     */
    public static void main(String[] args) {
        LoggerFactory factory = new DatabaseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }

}
