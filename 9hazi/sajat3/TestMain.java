import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        array_getFirstAndLast_returnPair();
    }

    public static void array_getFirstAndLast_returnPair() {
        int[] numbers = { 34 , 32, 22, 11 };

        List<Integer> result = new ArrayList<>();
        result.add(34);
        result.add(11);

        assert Main.getFirstAndLast(numbers) == result;

        System.out.println("ok");

    }
}
