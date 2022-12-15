import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        

        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            
            System.out.println("--> wordst.txt beolvasása");
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }


        } catch (Exception e) {
            System.out.println("Hiba: " + e.getMessage());
        }


        try (PrintWriter pw = new PrintWriter("words_count.txt")) {
            
            System.out.println("--> words_count.txt írása");
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                pw.println(entry.getKey() + " " + entry.getValue());
            }
            
        } catch (Exception e) {
            System.out.println("Hiba: " + e.getMessage());
        }
            

    }
}
