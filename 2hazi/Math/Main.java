
public class Main {
    public static void main(String[] args) {
        int i = 7;
        int j = -9;
        double x = 72.3;
        double y = 0.34;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("-----------------------------");

        System.out.println("Abszolutertek:");
        System.out.println("|" + i + "|: " + Math.abs(i));
        System.out.println("|" + j + "|: " + Math.abs(j));
        System.out.println("|" + x + "|: " + Math.abs(x));
        System.out.println("|" + y + "|: " + Math.abs(y));
        System.out.println("-----------------------------");

        System.out.println(x + " kerekitve: " + Math.round(x));
        System.out.println(y + " kerekitve: " + Math.round(y));
        System.out.println("-----------------------------");

        System.out.println("min(" + i + "," + j + "): " + Math.min(i, j));
        System.out.println("min(" + x + "," + y + "): " + Math.min(x, y));
        System.out.println("min(" + i + "," + x + "): " + Math.min(i, x));
        System.out.println("min(" + y + "," + j + "): " + Math.min(y, j));
        System.out.println("-----------------------------");

        System.out.println("Pi: " + Math.PI);
        System.out.println("e: " + Math.E);
        System.out.println("-----------------------------");

        System.out.println("Itt egy random szam: " + Math.random());
        System.out.println("Itt van meg egy random szam: " + Math.random());

    }
}