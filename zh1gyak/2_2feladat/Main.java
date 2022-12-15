import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Szo: ");
        String s = sc.nextLine();

        System.out.println("A sztring hossza: " + (StringUtils.switchAtKukac(s)).length());

        System.out.println("Uj string: " + StringUtils.switchAtKukac(s));

        sc.close();

    }
}
