import java.util.Scanner;

public class Main {

    public static double Kerulet(double a, double b) {
        return (a + b) * 2;
    }

    public static double Terulet(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double k = Kerulet(a, b);
        double t = Terulet(a, b);
        System.out.println("Kerulet: " + k);
        System.out.println("Terulet: " + t);

        scanner.close();
    }

}
