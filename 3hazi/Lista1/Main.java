import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    // A. match_ends
    // Bemenet: sztringek listája. Számoljuk meg, hogy a bemenetben
    // hány olyan sztring van, melynek a hossza legalább 2 s az
    // első karaktere egyezik az utolsó karakterével. A visszatérési
    // érték ezen feltételeket kielégítő sztringek száma legyen.
    private static int matchEnds(List<String> words) {
        int counter = 0;

        for (String i : words) {
            if (i.length() > 1) {
                if (i.endsWith(i.substring(0, 1)) == true) {
                    counter++;
                }
            }
        }

        return counter;
    }

    // B. front_x
    // Bemenet: sztringek listája. Egy olyan listával térjünk vissza,
    // melyben a szavak rendezve vannak, viszont az "x"-szel kezdődő szavak
    // kerüljenek előre.
    // Példa: ["mix", "xyz", "apple", "xanadu", "aardvark"] bemenet esetén
    // az eredmény: ["xanadu", "xyz", "aardvark", "apple", "mix"].
    // Tipp: használhatunk 2 listát is, melyeket külön-külön rendezünk, majd
    // egyesítjük őket.
    private static List<String> frontX(List<String> words) {
        List<String> startX = new ArrayList<>();
        List<String> notX = new ArrayList<>();

        for (String i : words) {
            if (i.startsWith("x")) {
                startX.add(i);
            } else {
                notX.add(i);
            }
        }

        Collections.sort(notX);
        Collections.sort(startX);

        List<String> result = new ArrayList<>();

        result.addAll(startX);
        result.addAll(notX);

        return result;
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(int got, int expected) {
        String prefix = (got == expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(List<String> got, List<String> expected) {
        var prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args) {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
                List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
                List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
                List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }

}