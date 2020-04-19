package Tehtävä_14_Builder;

import Tehtävä_14_Builder.Builder.BurgerBuilder;

public class MasterChef {
    private BurgerBuilder b;

    public void constructBurger(){
        b.buildJuusto();
        b.buildPihvi();
        b.buildBodypart();
        b.buildTomaatti();
        b.buildSalaatti();
        b.buildSämpylä();
    }
    public void setBurgerBuilder(BurgerBuilder b) {
        this.b = b;
    }
    public Object getBurger(){
        return b.getBurger();
    }
}
