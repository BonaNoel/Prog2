public class Movie{

    private String film;
    private String genre;
    private int year;

    public Movie(String film, String genre, int year) {
        this.film = film;
        this.genre = genre.toLowerCase();
        this.year = year;
    }

    public String getFilm() {
        return film;
    }

    @Override
    public String toString() {
        return film;
    }


    

}