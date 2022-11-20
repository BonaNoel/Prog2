public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);

        Circle c2 = new Circle(2);

        System.out.println(c1);

        c1.setR(-3);

        System.out.println(c1);

        System.out.println(Circle.circleCount);

    }
}
