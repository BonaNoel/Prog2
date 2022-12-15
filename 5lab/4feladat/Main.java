import java.util.Arrays;
import java.util.Scanner;

/* public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a+b);

        sc.close();

    }
}
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int sum = 0;

        if (args.length < 2) {
            System.err.println("Hiba! Adj meg minimum 2 szamot!");
            System.exit(1);
        }

        for (String s : args) {
            sum += Integer.parseInt(s);
        }


        System.out.println(sum);

    }
}