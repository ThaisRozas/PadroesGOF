package src.Iterator;

public class AggregatorNetflix implements Aggregator {

    private Movie[] movies = new Movie[3];

    public AggregatorNetflix() {
        this.movies[0] = new Movie(120, "Telecine Action");
        this.movies[1] = new Movie(121, "Telecine Pipoca");
        this.movies[2] = new Movie(122, "Telecine Cult");
    }

    public Iterator createIterator() {
        return new IteratorVector(this.movies);
    }

}

