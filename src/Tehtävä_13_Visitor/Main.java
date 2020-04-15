package Tehtävä_13_Visitor;

import Tehtävä_13_Visitor.Creatures.Koffing;
import Tehtävä_13_Visitor.State.Creature;
import Tehtävä_13_Visitor.Visitor.CreatureVisitor;
import Tehtävä_13_Visitor.Visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        Creature c = new Creature(new Koffing());
        Visitor v = new CreatureVisitor();
        c.Scream();
        do {
            c.accept(v);
            c.Attack();
            c.Run();
            c.useAbility();
        }while (!c.getMaxlvl());

    }
}
