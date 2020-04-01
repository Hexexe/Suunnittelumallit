package Tehtävä_6_Decorator;

import Tehtävä_6_Decorator.Decorator.Crypto;
import Tehtävä_6_Decorator.Decorator.StringDecorator;
import Tehtävä_6_Decorator.File.Data;
import Tehtävä_6_Decorator.File.FileData;

public class Main {

    public static void main(String[] args) {
        String s = "Pepega Clap";
        StringDecorator encrypted = new Crypto(new FileData("out/SuperSecretFile.txt"));
        encrypted.writeFile(s);
        Data plain = new FileData("out/SuperSecretFile.txt");

        System.out.printf("Input: %s\n", s);
        System.out.printf("Encoded: %s\n", plain.readFile());
        System.out.printf("Decoded: %s", encrypted.readFile());
    }
}
