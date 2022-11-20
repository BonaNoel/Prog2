
public class Main {
    public static void main(String[] args) {
        int n = 8;
        boolean paros = isEven(n);
        System.out.println(n + " páros? " + paros);

        line('-',10);
    }

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    static void line(char c, int number){
        for (int i = 0; i < number; i++) {
            System.out.print(c);
        }
    }
}
