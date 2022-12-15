public class Main {
    public static void main(String[] args) {
        int n = 8;
        boolean paros = isEven(n);
        System.out.println(n + " páros? " + paros);

        
    }

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}