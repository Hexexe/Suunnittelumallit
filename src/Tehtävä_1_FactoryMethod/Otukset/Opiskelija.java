package Tehtävä_1_FactoryMethod.Otukset;

import Tehtävä_1_FactoryMethod.Ruuat.Hernekeitto;
import Tehtävä_1_FactoryMethod.Juomat.Juoma;
import Tehtävä_1_FactoryMethod.Juomat.Maito;
import Tehtävä_1_FactoryMethod.Ruuat.Ruoka;

public class Opiskelija extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Maito();
    }
    public Ruoka createRuoka() {
        return new Hernekeitto();
    }
}
