public class Main {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(5,4);
        Teglalap t2 = new Teglalap(2* t1.getA(), 2*t1.getB());



        System.out.println("Kerulet: " + t1.kerulet());
        System.out.println("Terulet: " + t1.terulet() );

        System.out.println(t2);

    }

}
