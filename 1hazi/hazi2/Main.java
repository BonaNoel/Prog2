
public class Main {
    // E. verbing
    // Ha az adott sztring hossza legalább 3, akkor
    // a végéhez adjuk hozzá az 'ing' ragot.
    // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
    // ragot tegyük hozzá.
    // Ha a sztring hossza rövidebb 3 karakternél, akkor
    // hagyjuk változatlanul.
    // Adjuk vissza az eredménysztringet.
    private static String verbing(String s) {
        if (s.length() < 3) {
            return s;
        } else {
            if (s.endsWith("ing")) {
                return s + "ly";
            }
            return s + "ing";
        }
    }

    // F. not_bad
    // Egy adott sztringben keressük meg a 'not' és
    // 'bad' szavak előfordulási helyét. Ha a 'bad'
    // a 'not' szót követi, akkor cseréljük ki az
    // egész 'not'...'bad' részsztringet a 'good' szóra.
    // Adjuk vissza az eredmény sztringet.
    // Példa: 'This dinner is not that bad!' ->
    // This dinner is good!
    private static String notBad(String s) {
        int start = s.indexOf("not");
        int end = s.indexOf("bad");

        if (end < start) {
            return s;
        }

        return s.substring(0, start) + "good" + s.substring(end + 3);
    }

    // G. front_back
    // Egy sztringet osszunk két részre, s a két részt nevezzük
    // a sztring elejének és végének. Ha a sztring hossza páros, akkor
    // a két rész hossza azonos. Ha a hossz páratlan, akkor az eleje
    // legyen egy karakterrel hosszabb mint a vége.
    // Például 'abcde' esetén a két rész: 'abc' és 'de'.
    // Két adott sztring (a és b) esetén adjunk vissza egy sztringet, mely
    // a következőképpen épül fel:
    // a-eleje + b-eleje + a-vége + b-vége
    // Például ha a = 'abcd' és b = 'xy', akkor az eredmény 'abxcdy' legyen.
    private static String frontBack(String a, String b) {
        /*
         * int alenght = a.length();
         * int blenght = b.length();
         */

        /*
         * if (alenght % 2 == 0) {
         * String a1 = a.substring(0, (alenght / 2));
         * String a2 = a.substring((alenght / 2));
         * } else if (alenght % 2 == 1) {
         * String a1 = a.substring(0, (alenght / 2) + 1);
         * String a2 = a.substring((alenght / 2) + 1);
         * }
         * 
         * if (blenght % 2 == 0) {
         * String b1 = a.substring(0, (blenght / 2));
         * String b2 = a.substring((blenght / 2));
         * } else if (blenght % 2 == 1) {
         * 
         * String b1 = b.substring(0, (blenght / 2) + 1);
         * String b2 = b.substring((blenght / 2) + 1);
         * }
         */

        if (a.length() % 2 == 0) 
        {
            if (b.length() % 2 == 0)
             {
                return (a.substring(0, (a.length() / 2)) + b.substring(0, (b.length() / 2))
                        + a.substring((a.length() / 2)) + b.substring((b.length() / 2)));
            } else 
            {
                return (a.substring(0, (a.length() / 2)) + b.substring(0, (b.length() / 2) + 1)
                        + a.substring((a.length() / 2)) + b.substring((b.length() / 2) + 1));
            }
        } else if (a.length() % 2 == 1)
         {
            if (b.length() % 2 == 0) 
            {
                return (a.substring(0, (a.length() / 2) + 1) + b.substring(0, (b.length() / 2))
                        + a.substring((a.length() / 2) + 1) + b.substring((b.length() / 2)));
            } else 
            {
                return (a.substring(0, (a.length() / 2) + 1) + b.substring(0, (b.length() / 2) + 1)
                        + a.substring((a.length() / 2) + 1) + b.substring((b.length() / 2) + 1));
            }
        }
        return null;
    }

    static void test(String got, String expected) {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args) {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}