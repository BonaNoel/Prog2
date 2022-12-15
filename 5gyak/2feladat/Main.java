public class Main {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Hiba");
            System.exit(1);
        }

        String result = StringUtils.swapCase(args[0]);
        System.out.println(result);
    }
}
