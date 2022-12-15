import java.util.List;

public class V2 {

    public static void main(String[] args) {

        String fname = "config.txt";

        List<Integer> nums = FileUtils.readFirstLineAsDigits(fname);

        String puki = "";

        for (Integer n : nums) {
            puki = "" + n;
        }

        int N = Integer.parseInt(puki);

        System.out.println(N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= N; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }

}
