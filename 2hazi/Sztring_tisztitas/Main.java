public class Main {
    public static void main(String[] args) {
        String test1 = "192.20.246.138:\n 6666";
        String test2 =  "   206.130. 9 9 . \n82:\n8080";

        //System.out.println(test1);
        //System.out.println(test2);

        System.out.println(test1.replaceAll("\\s", ""));
        System.out.println(test2.replaceAll("\\s", ""));
    }
    
}
