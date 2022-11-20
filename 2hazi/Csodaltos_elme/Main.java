
public class Main {
    public static void main(String[] args) {
        String s = "3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754\n"
                + "M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.\n"
                + "3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D\n"
                + "3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D\n"
                + "4U70M471KU54N 3L 7UDJ4 0LV45N1.\n"
                + "4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.\n"
                + "L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.\n"
                + "H4 7375Z377, 05ZD M3G M450KK4L 15!\n";

        char[] stringArray = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (stringArray[i] == '3') {
                stringArray[i] = 'E';
            } else if (stringArray[i] == '4') {
                stringArray[i] = 'A';
            } else if (stringArray[i] == '7') {
                stringArray[i] = 'T';
            } else if (stringArray[i] == '5') {
                stringArray[i] = 'S';
            } else if (stringArray[i] == '0') {
                stringArray[i] = 'O';
            } else if (stringArray[i] == '1') {
                stringArray[i] = 'I';
            }

        }

        String newS = String.valueOf(stringArray);

        System.out.println(newS);

    }
}
