package Tehtävä_7_State.Creatures;

import Tehtävä_7_State.CreatureState.Creature;
import Tehtävä_7_State.CreatureState.CreatureState;

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
    public boolean experience() { return exp >= 10; }

    @Override
    public boolean maxlvl() { return false; }
}
