
public class MAin {
    public static void main(String[] args) {
        String name = "Norbert";
        int age = 22;
        String school = "DEIK";

        // Név (életkor), suli

        // System.out.println(name + " (" +  age + "), " + school);

        System.out.printf("%s (%d), %s\n", name, age, school);

        String nice = String.format("%s (%d), %s\n", name, age, school);
        System.out.println(nice);
    }    
}
