package Tehtävä_13_Visitor.State;

import Tehtävä_13_Visitor.Visitor.Visitor;

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
    public void accept(Visitor v){this.state.accept(v);}
}
