package Tehtävä_10_ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();
        Ceo ceo = new Ceo();
        manager.setSuccessor(director);
        director.setSuccessor(ceo);
        try {
            while (true) {
                System.out.println("Welcome to Sarif Industries\n");
                System.out.print("Please state your name >");
                String st = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.print("Please enter your current salary >");
                double sa = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.print("Please enter your preferred salary >");
                double ra = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.raiseRequest(new WageSlave(st, sa, ra));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}

