package com.dyn.demo.Structural.facade;

import com.dyn.demo.Structural.facade.example.FileReader;
import com.dyn.demo.Structural.facade.example.FileWriter;
import com.dyn.demo.Structural.facade.example.NewCipherMachine;

public class NewEncryptFacade extends AbstractEncryptFacade {

    private FileReader reader;

    private NewCipherMachine cipher;

    private FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.Encrypt(plainStr);
        writer.Write(encryptStr, fileNameDes);
    }

}
