import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] scores = new int[5];

        /* for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        } */

        int[] tomb = { 3, 2, 9, 6 };
        kiir(tomb);

        System.out.println(Arrays.toString(tomb));

        int[] five = getOneToFive();
        System.out.println(Arrays.toString(five));
    }


    public static void kiir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("");
    }

    static int[] getOneToFive() {
        int[] result = {1,2,3,4,5};
        return result;
        
    }


}
