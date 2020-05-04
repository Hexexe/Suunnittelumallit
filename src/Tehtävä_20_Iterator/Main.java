package Tehtävä_20_Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> luvut = IntStream.range(1, 51).boxed().collect(Collectors.toList());

        Iterator<Integer> iterator_1 = luvut.iterator();
        Iterator<Integer> iterator_2 = luvut.iterator();

        // eri iteraattorit
        ThreadN l1 = new ThreadN(iterator_1,"Thread 1");
        ThreadN l2 = new ThreadN(iterator_2,"Thread 2");

        // kaikki hyvin

        //l1.start();
        //l2.start();

        // sama iteraattori
        ThreadN l3 = new ThreadN(iterator_1,"Thread 3");
        ThreadN l4 = new ThreadN(iterator_1,"Thread 4");

        // vaihtelee säikeiden välillä mutta toimii.

        //l3.start();
        //l4.start();


        // listan muokkaaminen iteroinnin aikana
        ThreadN l5 = new ThreadN(iterator_1,"Worst Thread EU");

        // ConcurrentModificationException (räjähtää jos muokataan iteroinnin aikana)

        //l5.start();
        //luvut.add(7777);

        // poistaminen
        ThreadN l6 = new ThreadN(iterator_1,"Purge");

        // näyttäs toimivan

        l6.start();
    }
}