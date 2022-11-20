public class Main {
    public static void main(String[] args) {
        Negyzet n1 = new Negyzet(3.2);

        Circle c1 =new Circle(4.3);
    
        Teglalap t1 = new Teglalap(3.5,2.3);

        Gomb g1 = new Gomb(6.3);

        System.out.println("NegyzetTerulet: " + n1.terulet());
        System.out.println("KorTerulet: " + c1.terulet());
        System.out.println("TeglalapTerulet: " + t1.terulet());
        System.out.println("GombTerfogat: " + g1.terfogat());
    }


    
}
