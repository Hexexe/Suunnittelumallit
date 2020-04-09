package Tehtävä_9_Strategy.Sorts;

import java.util.List;

public class SelectionSort implements SortStrategy {

    private double elapsedTime;

    @Override
    public void sort(List<Integer> l) {
        long startTime = System.nanoTime();
        for (int i = 0; i < l.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < l.size(); j++)
                if (l.get(j) < l.get(index)) index = j;
            int smallerNumber = l.get(index);
            l.set(index, l.get(i));
            l.set(i, smallerNumber);
        }
        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
    }

    @Override
    public void getResult() {
        System.out.printf("Selection Sort - Time elapsed: %f seconds\n", elapsedTime / 1000000000);
    }
}
