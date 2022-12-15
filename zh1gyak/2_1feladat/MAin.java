import java.util.ArrayList;
import java.util.List;

public class MAin {
    public static void main(String[] args) {
        

        List<String> ures = new ArrayList<String>();

        Nevek nevek1 = new Nevek(ures);

        System.out.println(nevek1);
        System.out.println(nevek1.size());
        System.out.println(nevek1.isEmpty());

        nevek1.append("Peter");
        nevek1.append("Jozsef");
        nevek1.append("Ajtony");

        int count = nevek1.countHasLetterJ();
        System.out.println(count);

        System.out.println(nevek1);
        System.out.println(nevek1.size());
        System.out.println(nevek1.isEmpty());

        nevek1.appendAll(List.of("Karoly","Ferenc"));

        System.out.println(nevek1);


    }
}
