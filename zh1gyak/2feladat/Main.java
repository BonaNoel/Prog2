import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adj meg egy szamot: ");

        String s = sc.nextLine();
        char[] tmp = s.toCharArray();
        int[] szamok = new int[tmp.length];

        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = tmp[i];
        }

        int twoCounter = 0;
        int threeCounter = 0;

        for (int j = 0; j < szamok.length; j++) {
            if (szamok[j] % 2 == 0) {
                twoCounter++;
            }

            if (szamok[j] % 3 == 0) {
                threeCounter++;
            }
        }

        System.out.println("Szam: " + s);

        System.out.println("Harommal oszhtato: " + threeCounter);
        System.out.println("Kettovel oszthato: " + twoCounter);

        sc.close();

    }

}
