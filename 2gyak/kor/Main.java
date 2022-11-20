import java.util.Scanner;

public class Main {
    
    public static double Kerulet(double a) {
        return 2 * a * Math.PI;
    }
    
    public static double Terulet(double a) {
        return a* a* Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a= scanner.nextDouble();

        System.out.println("Kerulet: " + Kerulet(a));
        System.out.println("Terulet: "+Terulet(a));

        scanner.close();

    }
    
}
