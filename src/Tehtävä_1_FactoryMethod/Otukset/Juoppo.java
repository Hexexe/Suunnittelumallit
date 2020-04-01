package Tehtävä_1_FactoryMethod.Otukset;

import Tehtävä_1_FactoryMethod.Ruuat.Hernekeitto;
import Tehtävä_1_FactoryMethod.Juomat.Juoma;
import Tehtävä_1_FactoryMethod.Juomat.Viina;
import Tehtävä_1_FactoryMethod.Ruuat.Ruoka;

public class Juoppo extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Viina();
    }
    public Ruoka createRuoka() {
        return new Hernekeitto();
    }
}
