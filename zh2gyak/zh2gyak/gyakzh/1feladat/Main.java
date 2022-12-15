import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Hiba az argumentumba!");
            System.exit(1);
        }

        int minWeight = Integer.parseInt(args[0]);

        List<Dog> dogs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("dogs.csv"))) {

            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int weight = Integer.parseInt(parts[2]);
                Dog dog = new Dog(name, weight);
                if (minWeight <= weight) {
                    dogs.add(dog);
                }

            }
        } catch (Exception e) {
            System.err.println("Hiba a fájl olvasásakor!");
            System.exit(1);

        }

        Collections.sort(dogs, new wightComparator());

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
