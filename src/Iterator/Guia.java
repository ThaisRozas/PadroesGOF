package src.Iterator;

import java.util.ArrayList;

public class Guia {
    public static void main(String[] args) {
        ArrayList<Iterator> packages = new ArrayList<>();
        packages.add(new AggregatorHBOMax().createIterator());
        packages.add(new AggregatorNetflix().createIterator());

        for (Iterator iterator: packages) {
            while(iterator.hasNext()) {
                Movie currentMovie = iterator.next();
                System.out.println(currentMovie.getCategory() + ". " + currentMovie.getName());
            }
        }
    }


}
