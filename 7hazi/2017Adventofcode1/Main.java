import java.util.List;

public class Main {
    public static void main(String[] args) {

        String fname = "input.txt";

        int sum = 0;

        List<Integer> kaki = FileUtils.readFirstLineAsDigits(fname);


        for (int i = 0; i < kaki.size(); i++) {
           if (i == kaki.size() -1) {
                if (kaki.get(i)==kaki.get(0)) {
                    sum+= kaki.get(i);
                }
           }
            else if (kaki.get(i) == kaki.get(i+1)) {
                sum += kaki.get(i);
            }
        }

        System.out.println(sum);

    }
}
