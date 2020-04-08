package Tehtävä_9_Strategy;

import Tehtävä_9_Strategy.Sorts.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

    private SortStrategy strategy;
    private ArrayList a;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list) {
        a = new ArrayList(List.copyOf(list));
        System.out.println(a);
        strategy.sort(a);
        strategy.getResult();
        System.out.println(a);
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
}
