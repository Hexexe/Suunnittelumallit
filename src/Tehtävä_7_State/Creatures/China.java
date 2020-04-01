package Tehtävä_7_State.Creatures;

import Tehtävä_7_State.CreatureState.Creature;
import Tehtävä_7_State.CreatureState.CreatureState;

public class China implements CreatureState {

    private int exp;
    private boolean maxlvl;

    @Override
    public void scream() { System.out.println("China screams: China will grow larger"); }

    @Override
    public void run(Creature c) {
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void attack(Creature c) {
        System.out.println("China attacks everyone with global pandemic");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void useAbility(Creature c) {
        System.out.println("China uses the ability 'Smog' ");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void evolve(Creature c) {
        maxlvl = !maxlvl;
        maxlvl();
    }

    @Override
    public boolean experience() { return exp >= 10; }

    @Override
    public boolean maxlvl() { return maxlvl; }
}
