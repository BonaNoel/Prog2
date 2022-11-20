public class Main {
    
    public static void main(String[] args) {
        char s = '4';

        System.out.println("");
        System.out.println("Character:");
        System.out.println("A karakter egy szam vagy nem (true/false)");
        System.out.println("4 az egy szam?: " + Character.isDigit(s));
        System.out.println("-------------------");
        System.out.println("A karakter egy betu(true/false)");
        System.out.println("4 az egy betu?: " + Character.isAlphabetic(s));
        System.out.println("-------------------");

        int a = 4;
        int b = 8;

        System.out.println("");
        System.out.println("Integer:");
        System.out.println("Ket szam kozul melyik a nagyobb");
        System.out.println("Nagyobb(4,8): " + Integer.max(a, b));
        System.out.println("-------------------");
        System.out.println("Ket szam kozul melyik kisseb");
        System.out.println("Kissebb(4,8): " + Integer.min(a, b));
        System.out.println("-------------------");

        double c = 3.14;
        double d = 7.34;

        System.out.println("");
        System.out.println("Double:");
        System.out.println("Ket szam kozul melyik a nagyobb");
        System.out.println("Nagyobb(3.14,7.34): " + Double.max(c, d));
        System.out.println("-------------------");
        System.out.println("Osszead ket szamot:");
        System.out.println("3.14 + 7.34 =  " + Double.sum(c, d));
        System.out.println("-------------------");


        boolean t = true;
        boolean f = false;

        System.out.println("");
        System.out.println("Boolean:");
        System.out.println("Logikai vagy/OR");
        System.out.println("True + False: " + Boolean.logicalOr(t, f));
        System.out.println("-------------------");
        System.out.println("String kent irja ki a tipust");
        System.out.println("Boolean true string kent: " + Boolean.toString(t) );

    }
}
