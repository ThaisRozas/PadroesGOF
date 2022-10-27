package src.Iterator;

import java.util.ArrayList;

public class AggregatorHBOMax implements Aggregator {

    private ArrayList<Movie> movies = new ArrayList<>();


    public Iterator createIterator () {
        return new IteratorList(this.movies);
    }
}
