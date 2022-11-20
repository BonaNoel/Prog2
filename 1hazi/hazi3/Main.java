// ezernél kissebb feladat
// https://arato.inf.unideb.hu/szathmary.laszlo/pmwiki/index.php?n=Py3.20120818e

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
