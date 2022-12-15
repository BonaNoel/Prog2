import java.util.ArrayList;
import java.util.List;

public class Verem {

    private List<Integer> data;

    public Verem() {
        this.data = new ArrayList<Integer>();
    }


    public void betesz(int value) {
        this.data.add(value);
    }
    
    public int meret() {
        return this.data.size();
    }


    public boolean ures() {
        return this.meret() == 0;
    }

    @Override
    public String toString(){
        return "Verem(" + this.data.toString().replace("]", "") + ")";
    }
}
