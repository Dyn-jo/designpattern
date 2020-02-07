package com.dyn.demo.Structural.facade;

public class Test {

    public static void main(String[] args) {
        AbstractEncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src.txt", "des.txt");

        AbstractEncryptFacade ef2 = new NewEncryptFacade();
        ef2.fileEncrypt("src.txt", "des.txt");

    }

}
