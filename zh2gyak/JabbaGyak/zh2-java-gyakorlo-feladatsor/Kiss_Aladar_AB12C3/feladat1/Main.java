import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.err.println("Hibás paraméterezés! Adj meg egy műfajt!");
            System.exit(1);
        }

        String mufaj = args[0].toLowerCase();


        List<Movie> movies = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader("movies.csv"))) {
            
            br.readLine();
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(",");
                String film = adatok[0];
                String genre = adatok[1];
                int year = Integer.parseInt(adatok[7]);

                if (mufaj.equals(genre.toLowerCase())) {
                    movies.add(new Movie(film, genre, year));
                }
                
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl olvasásakor!");
        }


        Collections.sort(movies, new NameComparator());


        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

    }
}