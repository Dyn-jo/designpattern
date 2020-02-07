package com.dyn.demo.creational.factory.logger;

public class DatabaseLogger implements Logger {

    public DatabaseLogger() {
        System.out.println("DatabaseLogger");
    }

    @Override
    public void writeLog() {
        System.out.println("DatabaseLogger.writeLog()");
    }

}
