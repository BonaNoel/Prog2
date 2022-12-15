public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Vau vau");
        
    }

    @Override
    public void eat() {
        System.out.println("Gizsgutja eszik");
        
    }
    
    public void run() {
        System.out.println("Szálád a kutyu  éjjj");
    }

}
