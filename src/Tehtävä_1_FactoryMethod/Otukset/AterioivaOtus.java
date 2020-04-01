package Tehtävä_1_FactoryMethod.Otukset;

import Tehtävä_1_FactoryMethod.Juomat.Juoma;
import Tehtävä_1_FactoryMethod.Ruuat.Ruoka;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;

    public abstract Juoma createJuoma();
    public abstract Ruoka createRuoka();

    public void aterioi() {
        syö();
        juo();
    }

    public void syö() {
        if (ruoka == null)
            ruoka = createRuoka();
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä");
    }

    public void juo() {
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
