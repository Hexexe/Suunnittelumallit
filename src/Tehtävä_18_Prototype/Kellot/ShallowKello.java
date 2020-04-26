package Tehtävä_18_Prototype.Kellot;

import Tehtävä_18_Prototype.Viisari.Minuutti;
import Tehtävä_18_Prototype.Viisari.Sekunti;
import Tehtävä_18_Prototype.Viisari.Tunti;
import Tehtävä_18_Prototype.Viisari.Viisari;

public class ShallowKello implements Kello, Runnable, Cloneable {

    Viisari s = new Sekunti(), m = new Minuutti(), t = new Tunti();
    private String nimi;

    public ShallowKello(String nimi) { this.nimi = nimi; }

    public void setNimi(String nimi) { this.nimi = nimi; }
    @Override
    public void runKello() {
        System.out.printf("%s: %02d:%02d:%02d\n", nimi, t.getArvo(), m.getArvo(), s.getArvo());
        s.tick();
        if (s.getArvo() >= 59) m.tick();
        if (m.getArvo() == 0 && s.getArvo() >= 59) t.tick();
    }

    @Override
    public void setTime(int t, int m, int s) {
        this.t.setArvo(t);
        this.m.setArvo(m);
        this.s.setArvo(s);
    }

    @Override
    public void run() {
        while (s.getArvo() < 58) { // testausta varten
            try {
                Thread.sleep(1000);
                runKello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException { return super.clone(); }
}