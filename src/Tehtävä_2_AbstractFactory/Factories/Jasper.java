package Tehtävä_2_AbstractFactory.Factories;

import Tehtävä_2_AbstractFactory.Products.Hat;
import Tehtävä_2_AbstractFactory.Products.Pants;
import Tehtävä_2_AbstractFactory.Products.Shirt;
import Tehtävä_2_AbstractFactory.Products.Shoes;

public abstract class Jasper {
    Hat hat = null;
    Shirt shirt = null;
    Pants pants = null;
    Shoes shoes = null;

    public abstract Pants createPants();
    public abstract Shirt createShirt();
    public abstract Hat createHat();
    public abstract Shoes createShoes();

    public void laitaPäälle() {
        pueHattu();
        puePaita();
        pueHousut();
        pueKengät();
    }

    public void pueKengät() {
        if (shoes == null)
            shoes = createShoes();
        System.out.println("Nyt on " + shoes + " laitettu jalkaan.");
    }

    public void pueHousut() {
        if (pants == null)
            pants = createPants();
        System.out.println("Nyt on " + pants + " puettu.");
    }

    public void puePaita() {
        if (shirt == null)
            shirt = createShirt();
        System.out.println("Nyt on " + shirt + " puettu.");
    }

    public void pueHattu() {
        if (hat == null)
            hat = createHat();
        System.out.println("Nyt on " + hat + " laitettu päähän.");
    }

    @Override
    public String toString() {
        return hat + ", " + shirt + ", " + pants + " ja " + shoes;
    }
}
