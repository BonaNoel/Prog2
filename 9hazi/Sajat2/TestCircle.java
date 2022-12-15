public class TestCircle {
    public static void main(String[] args) {
        createCircle_getR_returnsR();
        setR_getR_returnsR();

        Circle_Kerulet_returnsKerulet();
        Circle_Terulet_returnsTerulet();

        Circle_isSmallerThen_returnsTrue();
        Circle_isSmallerThen_returnsFalse();

    }

    public static void createCircle_getR_returnsR() {
        Circle c = new Circle(3);

        assert c.getR() == 3;

        System.out.println("ok 1");
    }


    public static void setR_getR_returnsR() {
        Circle c = new Circle(3);

        c.setR(5);

        assert c.getR() == 5;

        System.out.println("ok 2");
    }

    public static void Circle_Kerulet_returnsKerulet() {
        Circle c = new Circle(3);

        assert c.Kerulet() == 2*3*Math.PI;

        System.out.println("ok 3");
    }

    public static void Circle_Terulet_returnsTerulet() {
        Circle c = new Circle(3);

        assert c.Terulet() == 3*3*Math.PI;

        System.out.println("ok 4");
    }

    public static void Circle_isSmallerThen_returnsTrue() {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        assert c1.isSmallerThen(c2) == true;

        System.out.println("ok 5");
    }

    public static void Circle_isSmallerThen_returnsFalse() {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(1);

        assert c1.isSmallerThen(c2) == false;

        System.out.println("ok 6");
    }


}
