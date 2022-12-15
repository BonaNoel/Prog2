import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> in1 = new ArrayList<>();
        List<Double> in2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("in1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                in1.add(Double.parseDouble(line));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("in2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                in2.add(Double.parseDouble(line));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }


        List<Integer> out = new ArrayList<Integer>();
        int counter = 0;

        for (int i = 0; i < in1.size(); i++) {
            if ((in1.get(i) + in2.get(i)) >= 1.0) {
                out.add(i + 1);
                counter++;
            }
        }


        try (PrintWriter pw = new PrintWriter("out.txt")) {
            for (Integer data : out) {
                pw.println(data);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }




        System.out.println("out.txt létrehozva");
        System.out.println("sikeres kísérletek száma: " + counter);
    }
}