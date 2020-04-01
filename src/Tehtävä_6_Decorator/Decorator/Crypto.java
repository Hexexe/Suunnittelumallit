package Tehtävä_6_Decorator.Decorator;

import Tehtävä_6_Decorator.File.FileManager;

import java.util.Base64;

public class Crypto extends StringDecorator {

    public Crypto(FileManager w) {
        super(w);
    }

    @Override
    public void writeFile(String data) {
        super.writeFile(encrypt(data));
    }

    @Override
    public String readFile() {
        return decrypt(super.readFile());
    }

    private String encrypt(String s) {
        byte[] result = s.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 9001;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decrypt(String s) {
        byte[] result = Base64.getDecoder().decode(s);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 9001;
        }
        return new String(result);
    }
}
