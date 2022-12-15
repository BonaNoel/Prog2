
public class Dog {

    public String name;
    public int weight;

    
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return  name+", " +   weight + " kg";
    }

    
    
}
