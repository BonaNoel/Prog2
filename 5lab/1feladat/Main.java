Simport java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "16; Bea ; LaNy";

/*         String [] split =  s.split("\\s+"); // ha space-el van elvalasztva
 */
        String[] split = s.split("\\."); // ha pontal van elvalasztva

        System.out.println(Arrays.toString(split));
    }
}
