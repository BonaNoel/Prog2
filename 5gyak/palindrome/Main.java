public class Main {
    
     public static boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        boolean result = sb.toString().equals(sb.reverse().toString());

        return result;
    } 
    
    public static void main(String[] args) {
        

        String s1 = "kaki";

        String s2 = "kaak";


        

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
      
    }
}
