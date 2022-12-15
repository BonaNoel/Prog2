public class Main {
    public static void main(String[] args) {

        Tanulo t1 = new Tanulo("16; Bea ; LaNy");
        Tanulo t2 = new Tanulo("21;Marci;Fiu");
        Tanulo t3 = new Tanulo("17; Luca;lany ");

        System.out.println(t1);
        System.out.println(t2.getName());
        System.out.println(t3.getAge());
        System.out.println(t1.getGender());
        System.out.println(t1.isAdult());
        System.out.println(t2.isAdult());
        System.out.println(t1.compareAge(t2));
        System.out.println(t1.compareAge(t1));
        System.out.println(t2.compareAge(t3));

    }
}
