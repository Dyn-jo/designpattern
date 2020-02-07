package com.dyn.demo.creational.abstractfactory;

import com.dyn.demo.creational.abstractfactory.button.Button;
import com.dyn.demo.creational.abstractfactory.textfield.TextField;

public interface AbstractFactory {

    Button createButton();

    TextField createTextField();

}
