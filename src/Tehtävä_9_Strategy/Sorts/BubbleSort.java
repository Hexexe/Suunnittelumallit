package Tehtävä_9_Strategy.Sorts;

import java.util.List;

public class BubbleSort implements SortStrategy {

    Integer temp;
    boolean sorted;
    private double elapsedTime;

    @Override
    public void sort(List<Integer> l) {
        long startTime = System.nanoTime();
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < l.size() - 1; i++) {
                if (l.get(i).compareTo(l.get(i + 1)) > 0) {
                    temp = l.get(i);
                    l.set(i, l.get(i + 1));
                    l.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
    }

    @Override
    public void getResult() {
        System.out.printf("Bubble Sort - Time elapsed: %f seconds\n", elapsedTime / 1000000000);
    }
}

