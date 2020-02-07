package com.dyn.demo.Structural.proxy;

//扩展功能 模拟实现日志记录
public class Logger {

    public void Log(String userId) {
        System.out.println("用户" + userId + "查询次数加1！");
    }

}
