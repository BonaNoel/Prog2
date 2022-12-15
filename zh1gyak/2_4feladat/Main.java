import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fname = "tablazat.txt";

        List<String> sorok = FileUtils.readLines(fname);

        int min = 0;
        int max = 0;

        int sum = 0;

        for (String sor : sorok) {
            String[] darabok = sor.trim().split("\\s+");
            int[] szamok = new int[darabok.length];

            for (int i = 0; i < darabok.length; i++) {
                szamok[i] = Integer.parseInt(darabok[i]);
            }

            min = szamok[0];
            max = szamok[0];

            for (int i = 0; i < szamok.length; i++) {
                if (min > szamok[i]) {
                    min = szamok[i];
                }
                if (max < szamok[i]) {
                    max = szamok[i];
                }
            }

            sum = sum + (max * min);
        }

        System.out.println(sum);
    }

}
