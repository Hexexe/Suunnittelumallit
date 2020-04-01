package Tehtävä_2_AbstractFactory;

import Tehtävä_2_AbstractFactory.Factories.Jasper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Class c;
        Jasper j;

        try (InputStream i = new FileInputStream(System.getProperty("user.dir") + "/src/Tehtävä_2_AbstractFactory/Factories/Factory.properties")) {
            Properties p = new Properties();
            p.load(i);

            c = Class.forName(p.getProperty("Adidas"));
            j = (Jasper) c.getDeclaredConstructor().newInstance();

            System.out.println("Jasper päättää lähteä kouluun koronaviruskaranteenista huolimatta.");
            j.laitaPäälle();
            System.out.println("Jasperilla on nyt päällä: " + j.toString());

            c = Class.forName(p.getProperty("Boss"));
            j = (Jasper) c.getDeclaredConstructor().newInstance();

            System.out.println("\nJasper ei kuollut koulussa koronavirukseen ja pääsi töihin.");
            j.laitaPäälle();
            System.out.println("Jasperilla on nyt päällä " + j.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
