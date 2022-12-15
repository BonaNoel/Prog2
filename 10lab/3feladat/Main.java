public class Main {

    public static int product(int...x) {
        
        if (x.length == 0) {
            return 0;
        }

        int res = 1;


        for (int i = 0; i < x.length; i++) {
            res = res*x[i];
        }

        return res;

    }


    public static void printAll(String...a) {
        for (String string : a) {
            System.out.println(string);
        }
    }



    public static void main(String[] args) {

        System.out.println(product(1));
        System.out.println(product(1,2,3));
        System.out.println(product());

        System.out.println(product(1,2,3,4,5,6,7,8));



        printAll("pisi", "kaki", "puki");

    }
}
