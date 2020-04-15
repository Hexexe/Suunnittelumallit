package Tehtävä_13_Visitor.State;
import Tehtävä_13_Visitor.Visitor.Visitor;

public interface CreatureState {
    void scream();
    void run(Creature c);
    void attack(Creature c);
    void useAbility(Creature c);
    void evolve(Creature c);
    boolean experience();
    boolean maxlvl();
    void accept(Visitor v);
    void bonusExp(int i);
}
