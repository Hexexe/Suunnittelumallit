package Tehtävä_9_Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10000; i++) { l.add(i); }
        Collections.shuffle(l);

        Sorter s = new Sorter(new SelectionSort());
        s.sort(l);
        s.setStrategy(new BubbleSort());
        s.sort(l);
        s.setStrategy(new InsertionSort());
        s.sort(l);

    }
}

