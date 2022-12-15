import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getFilm().compareTo(o2.getFilm());
    }
    
}