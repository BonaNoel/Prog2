public class Main {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.err.println("Hibas parameterezes!");
            System.exit(1);
        }
        
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int step = Integer.parseInt(args[2]);

        int tmp = 0;

        if (min > max) {
            tmp = max;
            max = min;
            min = tmp;
        }

        int index = 1;

        int lastPuki = max - ((max-min) % step);

        for (int i = min; i < max; i+=step) {
            if (i == lastPuki ) {
                System.out.printf("%d. elem: %d", index,i);
                break;
            }
            System.out.printf("%d. elem: %d," , index, i);
            index++;
        }
        System.out.printf("\n");
    }
}
