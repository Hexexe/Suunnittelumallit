package Tehtävä_20_Iterator;

import java.util.Iterator;

public class ThreadN extends Thread {

    private Iterator<Integer> i;
    private String name;

    public ThreadN(Iterator<Integer> i, String name) {
        this.i = i;
        this.name = name;
    }

    public void run() {
        while (i.hasNext()) {
            Integer v = i.next();
            if (name.equals("Purge") && v % 2 == 0) i.remove(); // delete test
            else System.out.printf("%s : %d\n", name, v);
        }
    }
}
