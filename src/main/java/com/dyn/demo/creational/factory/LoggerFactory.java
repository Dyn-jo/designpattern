package com.dyn.demo.creational.factory;

import com.dyn.demo.creational.factory.logger.Logger;

//日志记录器工厂
public interface LoggerFactory {

    //静态工厂方法
    Logger createLogger();

}
