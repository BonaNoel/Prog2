import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String fname = "input.txt";

        List<String> sorok = FileUtils.readLines(fname);

        StringBuilder sbAll = new StringBuilder();

        for (String sor : sorok) {
            String[] s = sor.split("\\s+");
            for (int i = 0; i < s.length; i++) {
                sbAll.append(s[i] + ";");
            }
        }

        String[] all = sbAll.toString().split(";");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < all.length; i++) {
            if (result.contains(all[i])) {
                continue;
            } else {
                result.add(all[i]);
            }
        }

        System.out.println(result);
        System.out.println(result.size());

    }

}
