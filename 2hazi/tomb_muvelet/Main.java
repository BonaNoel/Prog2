import java.util.Arrays;

class MyArrayUtils {

    private MyArrayUtils() {

    }

    public static boolean equals(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        } else {

            for (int i = 0; i < tomb1.length; i++) {
                if (tomb1[i] != tomb2[i]) {
                    return false;
                }
            }

            return true;
        }

    }

    public static int[] sortDescending(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = tomb[i] * (-1);
        }
        Arrays.sort(tomb);

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = tomb[i] * (-1);
        }

        return tomb;
    }

    /*
     * public static int[] reverse(int[] tomb){
     * int[] tmp = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
     * 
     * for (int i = 0; i < tomb.length; i++) {
     * tmp[i] = tomb[i];
     * }
     * 
     * for (int i = tomb.length; i >= 0; i--) {
     * for (int j = 0; j < tomb.length; j++) {
     * tomb[i] = tmp[j];
     * }
     * }
     * 
     * return tomb;
     * }
     */

    public static int[] fill(int[] tomb1, int ertek) {

        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = ertek;
        }

        return tomb1;
    }

    public static int[] sort(int[] tomb) {

        int index;
        for (int i = 0; i < tomb.length; i++) {
            index = i;
            for (int j = i; j <= tomb.length - 1; j++) {
                if (tomb[j] < tomb[index]) {
                    index = j;
                }
            }
            int temp = tomb[i];
            tomb[i] = tomb[index];
            tomb[index] = temp;
        }

        return tomb;
    }

}

public class Main {
    public static void main(String[] args) {

        int[] t1 = { 1, 2, 3 };
        int[] t2 = { 1, 2, 3 };
        int[] t3 = { 14, 3, 6 };

        System.out.println("Osszehasonlitas: ");
        System.out.println(MyArrayUtils.equals(t1, t2));
        System.out.println(MyArrayUtils.equals(t1, t3));
        System.out.println("-------------------------");

        /*
         * int[] t5 = MyArrayUtils.reverse(t3);
         * System.out.println(Arrays.toString(t5));
         * 
         * System.out.println("-----------------------");
         */

        int[] t4 = MyArrayUtils.sortDescending(t3);

        System.out.println("Visszafele rendezes: " + Arrays.toString(t4));
        System.out.println("----------------------");

        int[] t6 = { 0, 0, 0, 0, 0, 0, 0 };
        t6 = MyArrayUtils.fill(t6, 10);
        System.out.println("Feltotles: " + Arrays.toString(t6));

        System.out.println("------------------");

        int[] t7 = { 5, 3, 2, 1, 4 };

        int[] sort = MyArrayUtils.sort(t7);
        System.out.println("Rendezés:" + Arrays.toString(sort));

    }

}
