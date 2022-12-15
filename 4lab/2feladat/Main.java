// ugyanaz a ketto metodusnak a neve

public class Main {

    public static int add(int a, int b) {
        System.out.println("#1");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("#2");
        return a + b;
    }

    public static void main(String[] args) {
        add(1, 2);
        add(3.4, 2.1);
    }
}
