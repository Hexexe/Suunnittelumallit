package Tehtävä_2_AbstractFactory.Factories;

import Tehtävä_2_AbstractFactory.Products.*;

public class AdidasFactory extends Jasper {

    @Override
    public Pants createPants() {
        return new AdidasPants();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Hat createHat() {
        return new AdidasHat();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
