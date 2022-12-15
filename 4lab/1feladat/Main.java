import java.util.Arrays;
  

// tobb elem visszaadasa


class MinMax {
    public int min;
    public int max;

    public MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

}

public class Main {

    public static MinMax minMax(int[] array) {
        MinMax mm = new MinMax(array[0], array[0]);
        for (int i = 1; i < array.length; i++) {
            if (mm.min > array[i]) {
                mm.min = array[i];
            }
            if (mm.max < array[i]) {
                mm.max = array[i];
            }
        }

        return mm;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5 };

        for (int i : array) {
            System.out.println(i);
        }

        int[] b = array.clone();
        b[0] = 2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(b));


        MinMax minmax = minMax(array);
        System.out.printf("%d,  %d\n", minmax.max , minmax.min);
    }
}
