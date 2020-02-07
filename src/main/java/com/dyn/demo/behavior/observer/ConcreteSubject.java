package com.dyn.demo.behavior.observer;

public class ConcreteSubject extends Subject {

    //实现通知方法
    public void notifyMethod(String message) {
        //遍历观察者集合，调用每一个观察者的响应方法
        for (Object obs : observers) {
            ((Observer) obs).update(message);
        }
    }

}
