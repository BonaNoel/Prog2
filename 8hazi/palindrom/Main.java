import java.util.List;

public class Main {
    
   public static void main(String[] args) {
       
    String fname = "words_alpha.txt";

    List<String> sorok = FileUtils.readLines(fname);

    int counter = 0;

    for (String sor : sorok) {

        if (StringUtils.isPalindrome(sor)) {
            counter++;
        }
    }

    System.out.println(counter);

   }
}