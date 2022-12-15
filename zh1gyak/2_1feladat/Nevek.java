import java.util.ArrayList;
import java.util.List;

public class Nevek {
    private List<String> lista;

    public Nevek(List<String> lista) {
        this.lista = new ArrayList<String>();
    }

    public int size() {
        return this.lista.size();
    }

    public boolean isEmpty() {
        return this.lista.isEmpty();
    }

    public List<String> append(String value) {
        this.lista.add(value);
        return this.lista;
    }

    public List<String> appendAll(List<String> valueList) {
        for (String i : valueList) {
            this.lista.add(i);
        }

        return this.lista;
    }
    
     public int countHasLetterJ() {
        int count = 0;

        for (String i : this.lista) {
            char[] tmp = i.toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] == 'J' || tmp[j] == 'j') {
                    count++;
                }
            }
        }

        return count;

     }
    

    @Override
    public String toString() {
        String s = "< " + String.valueOf(lista) + " >";
        return s;
    }

}
