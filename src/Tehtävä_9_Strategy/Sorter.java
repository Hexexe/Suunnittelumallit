package Tehtävä_9_Strategy;

import Tehtävä_9_Strategy.Sorts.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list) {
        ArrayList<Integer> a = new ArrayList<>(List.copyOf(list));
        strategy.sort(a);
        strategy.getResult();
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
}
