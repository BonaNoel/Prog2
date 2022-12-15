public class Main {
    public static void main(String[] args) {


        gyemant(14);

    }

    public static void gyemant(int n) {

        if (n % 2 == 0) {
            System.err.println("Hiba! A szám páros");
            System.exit(1);
        }

        // vagy

        // assert width % 2 != 0;

        int width = n;

        int current = 1;
        boolean add = true;

        for (int i = 0; i < width; i++) {
            System.out.printf("%s%s\n", " ".repeat((width - current) / 2), "*".repeat(current));
            if (current == width) {
                add = false;
            }

            if (add) {
                current += 2;
            } else {
                current -= 2;
            }
        }

    }

}