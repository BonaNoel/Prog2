public class StringUtils {

    public StringUtils() {
    }
    
    public static boolean isPalindrome(String s) {
       
        StringBuilder sb = new StringBuilder(s);
 
        boolean result = sb.toString().equals(sb.reverse().toString());
 
        return result;
    } 
}
