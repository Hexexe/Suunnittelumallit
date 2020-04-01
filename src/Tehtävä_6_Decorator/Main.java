package Tehtävä_6_Decorator;

import Tehtävä_6_Decorator.Decorator.Crypto;
import Tehtävä_6_Decorator.Decorator.StringDecorator;
import Tehtävä_6_Decorator.File.FileManager;
import Tehtävä_6_Decorator.File.PepegaFileManager;

public class Main {

    public static void main(String[] args) {
        String s = "Pepega Clap";
        StringDecorator encrypted = new Crypto(new PepegaFileManager("out/SuperSecretFile.txt"));
        encrypted.writeFile(s);
        FileManager plain = new PepegaFileManager("out/SuperSecretFile.txt");

        System.out.printf("Input: %s\n", s);
        System.out.printf("Encrypted: %s\n", plain.readFile());
        System.out.printf("Decrypted: %s", encrypted.readFile());
    }
}
