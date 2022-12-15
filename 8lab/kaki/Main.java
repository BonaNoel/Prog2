import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        Verem v2 = new Verem(List.of(1,2,3,4));

        System.out.println(v2);

        v2.pop();
        v2.pop();

        System.out.println(v2);

        
    }
}
