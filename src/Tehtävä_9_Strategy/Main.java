package Tehtävä_9_Strategy;

import Tehtävä_9_Strategy.Sorts.BubbleSort;
import Tehtävä_9_Strategy.Sorts.InsertionSort;
import Tehtävä_9_Strategy.Sorts.SelectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 100000; i++) { l.add(i); }
        Collections.shuffle(l);

        Sorter s = new Sorter(new InsertionSort());
        s.sort(l);
        s.setStrategy(new SelectionSort());
        s.sort(l);
        s.setStrategy(new BubbleSort());
        s.sort(l);
    }
}

