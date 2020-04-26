package Tehtävä_18_Prototype;

import Tehtävä_18_Prototype.Kellot.DeepKello;
import Tehtävä_18_Prototype.Kellot.ShallowKello;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // viittaa samoihin juttuihin niin sekunnit hyppii 2 sec välein.
        ShallowKello s = new ShallowKello("Worst Clock EU 1");
        new Thread(s).start();
        ShallowKello se = (ShallowKello) s.clone();
        se.setNimi("Worst Clock EU 2");
        new Thread(se).start();
        se.setTime(10,10,10); // vaihtuu molemmissa

        DeepKello d = new DeepKello("2Deep4Me 1");
        new Thread(d).start();
        DeepKello de = (DeepKello) d.clone();
        de.setNimi("2Deep4Me 2");
        new Thread(de).start();
        de.setTime(5,5,5); // vaihtuu vain toisessa.
    }
}
