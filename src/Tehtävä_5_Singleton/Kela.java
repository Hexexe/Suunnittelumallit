package Tehtävä_5_Singleton;

import java.util.HashMap;

public class Kela {

    private static Kela kela;
    private float valtionMenot;
    private HashMap<String, Boolean> tuet;

    private Kela() {
        valtionMenot = 0;
        tuet = new HashMap<>();
    }

    public static Kela getInstance() {
        if (kela == null) {
            kela = new Kela();
        }
        return kela;
    }

    public void getValtionRahat() {
        System.out.printf("\nValtio on maksanut tukia yhteensä %.2f € rotille.\n\n", valtionMenot);
    }

    public void setValtionRahat(float valtionRahat) {
        this.valtionMenot = valtionRahat;
    }

    public float myönnäTukia(Työtön s) {
        float f;
        if (tuet.containsKey(s.getName())) {
            f = 0;
        } else {
            tuet.put(s.getName(), true);
            f = 500;
            setValtionRahat(valtionMenot + f);
        }
        return f;
    }
}
