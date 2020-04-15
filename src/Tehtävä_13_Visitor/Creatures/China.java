package Tehtävä_13_Visitor.Creatures;

import Tehtävä_13_Visitor.State.Creature;
import Tehtävä_13_Visitor.State.CreatureState;
import Tehtävä_13_Visitor.Visitor.Visitor;

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
    public void accept(Visitor visitor) { visitor.visit(this); }

    @Override
    public void bonusExp(int i) {
        System.out.printf("Current Experience: %d\n",exp);
        exp += i;
        System.out.printf("China gains %d bonus experience. Experience now %d\n",i,exp);
    }

    @Override
    public boolean experience() { return exp >= 20; }

    @Override
    public boolean maxlvl() { return maxlvl; }
}
