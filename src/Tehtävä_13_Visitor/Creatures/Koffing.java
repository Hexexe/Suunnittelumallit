package Tehtävä_13_Visitor.Creatures;

import Tehtävä_13_Visitor.State.Creature;
import Tehtävä_13_Visitor.State.CreatureState;
import Tehtävä_13_Visitor.Visitor.Visitor;

public class Koffing implements CreatureState {

    private int exp;

    @Override
    public void scream() { System.out.println("Koffing screams: GAS GAS GAS"); }

    @Override
    public void run(Creature c) {
        System.out.println("Koffing floats around");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void attack(Creature c) {
        System.out.println("Koffing attacks the enemy");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void useAbility(Creature c) {
        System.out.println("Koffing Uses ability 'Poison Gas' ");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void evolve(Creature c) {
        System.out.println("\nKoffing evolves into Weezing\n");
        c.setState(new Weezing());
        c.Scream();
    }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this); }

    @Override
    public void bonusExp(int i) {
        System.out.printf("Current Experience: %d\n",exp);
        exp += i;
        System.out.printf("Koffing gains %d bonus experience. Experience now %d\n",i,exp);
    }

    @Override
    public boolean experience() { return exp >= 10; }

    @Override
    public boolean maxlvl() { return false; }
}
