package Tehtävä_6_Decorator.Decorator;

import Tehtävä_6_Decorator.File.Data;

import java.util.Base64;

public class Crypto extends StringDecorator {

    public Crypto(Data w) {
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

    private String encrypt(String d) {
        byte[] result = d.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 9001;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decrypt(String d) {
        byte[] result = Base64.getDecoder().decode(d);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 9001;
        }
        return new String(result);
    }
}
