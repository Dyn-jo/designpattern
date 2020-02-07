package com.dyn.demo.creational.abstractfactory;

import com.dyn.demo.creational.abstractfactory.button.Button;
import com.dyn.demo.creational.abstractfactory.textfield.TextField;

public class Test {

    /**
     * AbstractFactory的具体类型，可以写在配置文件中，灵活使用
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory factory = new SpringFactory();
        Button button = factory.createButton();
        button.display();
        TextField textField = factory.createTextField();
        textField.display();
    }

}
