package Tehtävä_9_Strategy.Sorts;

import java.util.List;

public class InsertionSort implements SortStrategy {

    private double elapsedTime;

    @Override
    public void sort(List<Integer> l) {
        long startTime = System.nanoTime();
        for (int j = 1; j < l.size(); j++) {
            Integer current = l.get(j);
            int i = j - 1;
            while ((i > -1) && ((l.get(i).compareTo(current)) > 0)) {
                l.set(i + 1, l.get(i));
                i--;
            }
            l.set(i + 1, current);
        }
        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
    }

    @Override
    public void getResult() {
        System.out.printf("Insertion Sort - Time elapsed: %f seconds\n", elapsedTime / 1000000000);
    }
}
