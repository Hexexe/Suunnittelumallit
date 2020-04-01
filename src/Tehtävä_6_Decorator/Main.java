package Tehtävä_6_Decorator;

public class Main {

    public static void main(String[] args) {
        String s = "PepegaClap";
        StringDecorator encrypted = new Crypto(new FileData("out/SuperSecretFile.txt"));
        encrypted.writeFile(s);
        Data plain = new FileData("out/SuperSecretFile.txt");

        System.out.printf("Input: %s\n", s);
        System.out.printf("Encoded: %s\n", plain.readFile());
        System.out.printf("Decoded: %s", encrypted.readFile());
    }
}
