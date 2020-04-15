package Tehtävä_13_Visitor.Visitor;

import Tehtävä_13_Visitor.Creatures.China;
import Tehtävä_13_Visitor.Creatures.Koffing;
import Tehtävä_13_Visitor.Creatures.Weezing;

public interface Visitor {
    void visit(Koffing k);
    void visit(Weezing w);
    void visit(China c);
}
