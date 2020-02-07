package com.dyn.demo.behavior.observer;

public class Test {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        // 创建观察者
        ConcreteObserver observer1 = new ConcreteObserver("dyn");
        ConcreteObserver observer2 = new ConcreteObserver("wxy");
        ConcreteObserver observer3 = new ConcreteObserver("jzy");

        // 将观察者放入观察者集合,订阅消息
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        // 推送消息
        subject.notifyMethod("Jolin微博更新了");
    }

}
