import java.util.List;

public class V1 {

    public static void main(String[] args) {

        String fname = "config.txt";

        List<String> sorok = FileUtils.readLines(fname);

        String pisi = "";

        for (String sor : sorok) {
            String[] darabok = sor.split("_");

            for (int i = 0; i < darabok.length; i++) {
                pisi = "" + darabok[i];
            }

        }

        int N = Integer.parseInt(pisi);

        String kaki = "";

        for (int i = 0; i <= N; i++) {
            kaki = "" + i;
        }

        System.out.println(kaki);
    }
}
