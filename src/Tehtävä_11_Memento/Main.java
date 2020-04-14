package Tehtävä_11_Memento;

public class Main {

    public static void main(String[] args) {
        Riddler r = new Riddler(); // MTIrMS8oMTAwLzIpJQ==
        Customer a = new Customer(r,"Pepega");
        Customer b = new Customer(r,"Hackerman");
        Customer c = new Customer(r,"Suuronen");
        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }
}

