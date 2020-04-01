package Tehtävä_2_AbstractFactory.Factories;

import Tehtävä_2_AbstractFactory.Products.*;

public class BossFactory extends Jasper {
    @Override
    public Pants createPants() { return new BossPants(); }

    @Override
    public Shirt createShirt() { return new BossShirt(); }

    @Override
    public Hat createHat() { return new BossHat(); }

    @Override
    public Shoes createShoes() { return new BossShoes(); }
}
