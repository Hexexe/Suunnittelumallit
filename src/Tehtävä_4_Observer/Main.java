package Tehtävä_4_Observer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        new Kello(timer);
        new Thread(timer).start();
    }
}
