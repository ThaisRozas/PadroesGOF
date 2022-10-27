package src.Iterator;

import java.util.ArrayList;

public class IteratorList implements Iterator{
    private ArrayList<Movie> movies;
    private int currentMovie;

    public IteratorList(ArrayList<Movie> movies) {
        this.movies = movies;
        this.currentMovie = -1;
    }

    @Override
    public Movie next() {
        return this.movies.get( ++this.currentMovie );
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}

