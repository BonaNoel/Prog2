import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>(List.of(1,2,2,3));


        //halmaz

        Set<Integer> set1 = new HashSet<>(lista);

        // set.add(1);
        // set.add(2);
        // set.add(2);
        // set.add(3);
        // set.add(4);

        // System.out.println(set);

        // set.remove(3);

        // System.out.println(set);

        
        // System.out.println(set.contains(1));

        // System.out.println(set.size());


        // Set<Integer> set2 = new HashSet<>(List.of(2,4,9));

        // set1.addAll(set2); // unio
        // set1.retainAll(set2); // metszet
        // set1.removeAll(set2); // kulonbseg

        // System.out.println(set1);

        List<Integer> lista2 = new ArrayList<>(set1); // átkonvertáljuk igy kitörli az ismétlődést
        System.out.println(lista2);

        for (Integer i : set1) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            set1.add(i);
        }
    }
}
