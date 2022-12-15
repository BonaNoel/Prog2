import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {

        read();
        write();

    }

    public static void write() {
        try(PrintWriter pw = new PrintWriter("out.txt", "utf-8")){

            for (int i = 0; i < 100; i++) {
                pw.println(i);
            }


        }
        catch(FileNotFoundException e){
            e.getStackTrace();
            System.exit(1);
        }
        catch(UnsupportedEncodingException e){
            e.getStackTrace();
            System.exit(1);

        }
    }

    public static void read() {
        try (BufferedReader br = new BufferedReader(new FileReader("pelda.txt"))){

            int sum = 0;
            String line;
            while ((line = br.readLine()) != null) {
                sum = sum + Integer.parseInt(line);
            }

            System.out.println(sum);

            // br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fajl nem talalhato");
            System.exit(1);
        } catch (IOException e) {

            e.printStackTrace();
            System.exit(1);

        }
    }
}
