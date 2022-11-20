import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved he");

        String s1 = scanner.nextLine();
        // System.out.println("Szia " + s1 +" " + s2 + " udvozollek");

        System.out.printf("Szia %s, udvozolelk\n", s1);

        scanner.close();

        System.out.println(greetings(s1));

    }

    static String greetings(String name) {
        return String.format("Hello %s!", name);
    }
}
