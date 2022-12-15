import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        String fname = "day01.txt";

        List<Integer> nums = FileUtils.readFirstLineAsDigits(fname);
    
        int sum = 0;

        for (Integer n : nums) {
            sum += n;
        }

        System.out.println(sum);
    }
    
}
