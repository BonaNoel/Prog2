import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinMaxClass {
    int min;
    int max;

    public static MinMaxClass minMaxClass(List<Integer> szamok) {
        MinMaxClass result = new MinMaxClass();
        result.min = szamok.get(0);
        result.max = szamok.get(0);

        for (int i = 0; i < szamok.size(); i++) {

            if (result.min > szamok.get(i)) {
                result.min = szamok.get(i);
            }
            if (result.max < szamok.get(i)) {
                result.max = szamok.get(i);
            }

        }

        return result;

    }

    @Override
    public String toString() {

        return String.format("[%d,%d]", min, max);
    }

}

public class Main {
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));

        List<Integer> result = MinMaxList(szamok);
        System.out.println("Lista: " + result);

        int[] eredmeny = MinMaxArray(szamok);
        System.out.println("Tomb: " + Arrays.toString(eredmeny));

        MinMaxClass vege = new MinMaxClass();
        vege.minMaxClass(szamok);

        System.out.println("Class: " + vege.toString());
    }

    public static int[] MinMaxArray(List<Integer> szamok) {
        int[] result = { 0, 0 };
        int[] numbers = new int[szamok.size()];

        for (int i = 0; i < szamok.size(); i++) {
            numbers[i] = szamok.get(i);
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        result[0] = min;
        result[1] = max;

        return result;

    }

    public static List<Integer> MinMaxList(List<Integer> szamok) {
        List<Integer> maxmin = new ArrayList<Integer>();

        int min = szamok.get(0);
        int max = szamok.get(0);

        for (int i = 1; i < szamok.size(); i++) {
            if (min > szamok.get(i)) {
                min = szamok.get(i);
            }
            if (max < szamok.get(i)) {
                max = szamok.get(i);
            }
        }

        maxmin.add(min);
        maxmin.add(max);

        return maxmin;
    }
}
