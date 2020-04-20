package Tehtävä_15_Adapter;

public class Main {

    public static void main(String[] args) {
        BinaryAdapter c = new BinaryAdapter_C(new Luku(13501488));
        System.out.println(c.convert());
    }
}
