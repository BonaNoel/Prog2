public class Main {
    public static void main(String[] args) {
        

        Point p1 = new Point(2, 5);
        Point p2 = new Point(2, 5);

        System.out.println(p1);
        System.out.println(p1.hashCode());

        System.out.println(p2);
        System.out.println(p2.hashCode());

        System.out.println(p1==p2); // false
        System.out.println(p1.equals(p2)); // átirva igy jó true

        System.out.println(p1.equals("kaki")); // false
    }
}
