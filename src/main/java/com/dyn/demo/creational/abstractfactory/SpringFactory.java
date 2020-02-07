package com.dyn.demo.creational.abstractfactory;

import com.dyn.demo.creational.abstractfactory.button.Button;
import com.dyn.demo.creational.abstractfactory.button.SpringButton;
import com.dyn.demo.creational.abstractfactory.textfield.SpringTextField;
import com.dyn.demo.creational.abstractfactory.textfield.TextField;

public class SpringFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

}
