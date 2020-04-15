package Tehtävä_13_Visitor.Visitor;

import Tehtävä_13_Visitor.Creatures.China;
import Tehtävä_13_Visitor.Creatures.Koffing;
import Tehtävä_13_Visitor.Creatures.Weezing;

public class CreatureVisitor implements Visitor {

    @Override
    public void visit(Koffing k) { k.bonusExp(2); }

    @Override
    public void visit(Weezing w) { w.bonusExp(4); }

    @Override
    public void visit(China c) { c.bonusExp(6); }
}
