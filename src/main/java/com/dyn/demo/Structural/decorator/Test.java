package com.dyn.demo.Structural.decorator;

import com.dyn.demo.Structural.decorator.Component.Component;
import com.dyn.demo.Structural.decorator.Component.Window;

public class Test {

    public static void main(String[] args) {
        Component component = new Window(); //定义具体构件

        Component componentSB = new ScrollBarDecorator(component); //定义装饰后的构件

        componentSB.display();

    }

}
