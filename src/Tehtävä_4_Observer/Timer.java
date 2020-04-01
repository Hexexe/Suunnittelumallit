package Tehtävä_4_Observer;

import java.beans.PropertyChangeListener;
import java.util.Observable;

public class Timer extends Observable implements Runnable {

    private int s;

    public int getSec() { return s; }

    public void tick() {
        s = (s < 86399) ? s + 1 : 0;
        setChanged();
        notifyObservers();
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tick();
        }
    }
}

