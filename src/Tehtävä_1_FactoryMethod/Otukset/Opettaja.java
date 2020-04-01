package Tehtävä_1_FactoryMethod.Otukset;

import Tehtävä_1_FactoryMethod.Ruuat.Hernekeitto;
import Tehtävä_1_FactoryMethod.Juomat.Juoma;
import Tehtävä_1_FactoryMethod.Juomat.Vesi;
import Tehtävä_1_FactoryMethod.Ruuat.Ruoka;

public class Opettaja extends AterioivaOtus {
    public Juoma createJuoma() { return new Vesi(); }
    public Ruoka createRuoka() {
        return new Hernekeitto();
    }
}
