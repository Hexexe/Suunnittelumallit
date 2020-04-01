package Tehtävä_7_State;

import Tehtävä_7_State.CreatureState.Creature;
import Tehtävä_7_State.Creatures.Koffing;

public class Main {

    public static void main(String[] args) {
        Creature c = new Creature(new Koffing());
        c.Scream();
        do {
            c.Attack();
            c.Run();
            c.useAbility();
        }while (!c.getMaxlvl());

    }
}
