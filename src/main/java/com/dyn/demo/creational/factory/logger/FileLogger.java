package com.dyn.demo.creational.factory.logger;

public class FileLogger implements Logger {

    public FileLogger() {
        System.out.println("FileLogger");
    }

    @Override
    public void writeLog() {
        System.out.println("FileLogger.writeLog()");
    }

}
