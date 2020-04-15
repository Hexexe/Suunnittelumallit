package Tehtävä_13_Visitor.Creatures;

import Tehtävä_13_Visitor.State.Creature;
import Tehtävä_13_Visitor.State.CreatureState;
import Tehtävä_13_Visitor.Visitor.Visitor;

public class Weezing implements CreatureState {

    private int exp;

    @Override
    public void scream() { System.out.println("Weezing screams: Prepare to die"); }

    @Override
    public void run(Creature c) {
        System.out.println("Weezing floats around");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void attack(Creature c) {
        System.out.println("Weezing attack the enemy");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void useAbility(Creature c) {
        System.out.println("Weezing uses ability 'Explosion' ");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void evolve(Creature c) {
        System.out.println("\nWeezing evolves into China\n");
        c.setState(new China());
        c.Scream();
    }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this);}

    @Override
    public void bonusExp(int i) {
        System.out.printf("Current Experience: %d\n",exp);
        exp += i;
        System.out.printf("Weezing gains %d bonus experience. Experience now %d\n",i,exp);
    }

    @Override
    public boolean experience() { return exp >= 15; }

    @Override
    public boolean maxlvl() { return false; }
}
