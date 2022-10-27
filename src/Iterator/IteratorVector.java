package src.Iterator;

public class IteratorVector implements Iterator {
    private Movie[] movies;
    private int currentMovie;

    public IteratorVector(Movie[] movies) {
        this.movies = movies;
        this.currentMovie = -1;
    }

    public Movie next() {
        return this.movies[++this.currentMovie];
    }

    public boolean hasNext() {
        int proximo = this.currentMovie + 1;
        return proximo < this.movies.length && this.movies[proximo] != null;
    }
}

