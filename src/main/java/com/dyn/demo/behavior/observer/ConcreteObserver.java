package com.dyn.demo.behavior.observer;

// 具体观察者
public class ConcreteObserver implements Observer {

    // 微博用户名
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    //实现响应方法
    public void update(String message) {
        System.out.println("to " + name + ":" + message);
    }

}
