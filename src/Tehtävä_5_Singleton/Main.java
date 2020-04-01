package Tehtävä_5_Singleton;

public class Main {

    public static void main(String[] args) {

        Työtön rane = new Työtön("Rane",100);
        Työtön kake = new Työtön("Kake",200);

        rane.ostaRuokaa(100);
        rane.haeKelaTukia();
        rane.getTili();
        rane.haeKelaTukia();
        rane.ostaViinaa(600);

        Kela.getInstance().getValtionRahat();

        kake.ostaViinaa(100);
        kake.haeKelaTukia();
        kake.getTili();
        kake.haeKelaTukia();

        Kela.getInstance().getValtionRahat();

    }
}
