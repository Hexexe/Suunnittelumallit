package Tehtävä_4_Observer;

import java.util.Observable;
import java.util.Observer;

public class Kello implements Observer {

    private Timer timer;

    public Kello(Timer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }

    public void draw() {
        System.out.printf("%02d:%02d:%02d\n", timer.getSec() / 3600, (timer.getSec() % 3600) / 60, (timer.getSec() % 60));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();
        }
    }
}
