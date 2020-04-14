package Tehtävä_11_Memento;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Customer extends Thread {

    private Riddler riddler;
    private String name;
    private Random r = new Random();
    private List<Integer> guesses = IntStream.range(1, 101).boxed().collect(Collectors.toList()); // 1 - 100
    private boolean b;

    public Customer(Riddler riddler, String name) {
        this.riddler = riddler;
        this.name = name;
    }

    @Override
    public void run() {
        Riddler.Memento m = riddler.joinGame();
        while (!b) {
            int i = guesses.remove(r.nextInt(guesses.size()));
            b = riddler.guessNumber(m, i);
            if (!b) System.out.printf("%s arvasi numeroksi %d, WRONG!! t.Lex Luthor\n", name, i);
            else System.out.printf("\n%s arvasi vihdoin oikein %d yrityksen jälkeen.\n\n", name, 100 - guesses.size());
        }
    }
}
