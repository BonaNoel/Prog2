import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = PyUtils.range(20);
        List<Integer> numbers1 = PyUtils.range(20,25 );
        List<Integer> numbers2 = PyUtils.range(4,20,2 );
        
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers2);
    }
}
