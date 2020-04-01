package Tehtävä_7_State.CreatureState;

public interface CreatureState {
    void scream();
    void run(Creature c);
    void attack(Creature c);
    void useAbility(Creature c);
    void evolve(Creature c);
    boolean experience();
    boolean maxlvl();
}
