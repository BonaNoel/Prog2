import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float d = 3.14f;
        int a = (int)d;

        char c = (char)21321;
        System.out.println(c);

        System.out.println(Character.isDigit(c));

        System.out.println(Character.isDigit('3'));

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('3'));

        System.out.println(Character.isWhitespace('\n'));
    
    
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.isUpperCase('c'));


        String s2 = "123123";
        int sum = 0;
        for (char c2 : s2.toCharArray()) {
            sum += Character.getNumericValue(c2);
        }

        System.out.println(sum);



        List<Integer> pisi = new ArrayList<>(List.of(1,2,3,4));

    
    }
    
}
