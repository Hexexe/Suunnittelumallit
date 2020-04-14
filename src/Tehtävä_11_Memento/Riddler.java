package Tehtävä_11_Memento;

import java.util.Random;

public class Riddler {

    public Memento joinGame() { return new Memento(new Random().nextInt(100) + 1); }
    public boolean guessNumber(Memento m, int i) { return m.n == i; }

    static class Memento {
        private final int n;
        public Memento(int i) { this.n = i; }
    }

}
