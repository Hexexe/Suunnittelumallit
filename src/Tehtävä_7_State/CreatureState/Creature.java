package Tehtävä_7_State.CreatureState;

public class Creature {

    private CreatureState state;

    public Creature(CreatureState state) {
        this.state = state;
    }
    public void setState(CreatureState state) { this.state = state; }
    public void Scream() { state.scream(); }
    public void Run() { state.run(this); }
    public void Attack() { state.attack(this); }
    public void useAbility() { state.useAbility(this); }
    public boolean getMaxlvl(){ return state.maxlvl(); }
}
