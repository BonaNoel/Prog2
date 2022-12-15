import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main{

    public static void main(String[] args) {
        
        
        int nagy = 0;
        int kis = 0;
        int szokoz = 0;

        if (args.length != 1) {
            System.err.println("Hiba: add meg egy file nevét!");
            System.exit(1);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                HashMap<String, Integer> map = Analyse.process(line);

                nagy += map.get("uppercase");
                kis += map.get("lowercase");
                szokoz += map.get("space");
            }
            



        } catch (Exception e) {
            System.err.println("Hiba: " + e.getMessage());
            System.exit(1);
        }


        System.out.println("Nagybetűk száma: " + nagy);
        System.out.println("Kisbetűk száma: " + kis);
        System.out.println("Szóközök száma: " + szokoz);
            
    }
    
}