class Proba{

    private Proba() {
        //üres  // ne lehessen meghívni kívüről
    }

    public static void hello(){
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        int i = -5;
        System.out.println(Math.abs(i));

        Proba.hello();

        double d = 3.2;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.max(2, 4));
        System.out.println(Math.min(3, 12));
    }

}

/// HF 8 MATH METODUS MUKODESENEK BEMUTATASA