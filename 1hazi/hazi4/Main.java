// https://arato.inf.unideb.hu/szathmary.laszlo/pmwiki/index.php?n=Py3.20120818f
//negyzetek osszege osszegek negyzete

public class Main {
    public static void main(String[] args) {
        int result = 0;

        // osszegek negyzete
        int a = 0;
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        a = sum * sum;

        // negyzetösszeg
        int b = 0;
        for (int i = 0; i < 101; i++) {
            b = b + (i*i);
        }

        System.out.println(a-b);
    }
}
