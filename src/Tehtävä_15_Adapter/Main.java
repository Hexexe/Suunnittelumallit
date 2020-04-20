package Tehtävä_15_Adapter;

public class Main {

    public static void main(String[] args) {
        Luku l = new Luku(13501488);
        System.out.println(l.getI());
        BinaryAdapter c = new BinaryAdapater_C(l);
        System.out.println(c.convert());
    }
}
