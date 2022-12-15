import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        // List<String> nevek = new ArrayList<>(List.of("cc", "dd", "aa", "bb"));

        // System.out.println(nevek);

        // Collections.sort(nevek);

        // System.out.println(nevek);

        // User u1 = new User("bela");

        // System.out.println(u1);

        List<User> users = new ArrayList<>();
        users.add(new User("bela",20));
        users.add(new User("aladar",18));
        users.add(new User("denes",16));
        users.add(new User("cecil",15));

        System.out.println(users);

        Collections.sort(users);
        System.out.println(users);
        System.out.println("---------------------------------------");

        Collections.sort(users, new AgeComparator());

        System.out.println(users);



    }
}
