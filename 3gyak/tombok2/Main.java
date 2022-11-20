import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] t1 = {1,2,3};
        int[] t2 = {1,2,3};

        int[] t3 = {4,6,2,3,5,3,2};


        System.out.println(Arrays.equals(t1, t2));
        
        System.out.println(Arrays.toString(t1));
        Arrays.fill(t1,0);
        System.out.println(Arrays.toString(t1));

        Arrays.sort(t3);
        System.out.println(Arrays.toString(t3));

    }
}
