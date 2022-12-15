import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    private static final Random RAND = new Random();

    public static void main(String[] args) {

        // Random random = new Random(2022);

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(RAND.nextInt(5,15));
        // }



        List<Integer> lista = new ArrayList<>(List.of(1,2,3,4,5));

        int eredmeny= RandUtils.choice(lista);
    
        System.out.println(eredmeny);


    }


}
