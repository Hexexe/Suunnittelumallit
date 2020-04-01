package Tehtävä_1_FactoryMethod;

import Tehtävä_1_FactoryMethod.Otukset.AterioivaOtus;
import Tehtävä_1_FactoryMethod.Otukset.Juoppo;
import Tehtävä_1_FactoryMethod.Otukset.Opettaja;
import Tehtävä_1_FactoryMethod.Otukset.Opiskelija;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus juoppo = new Juoppo();
        opettaja.aterioi();
        opiskelija.aterioi();
        juoppo.aterioi();
    }
}
