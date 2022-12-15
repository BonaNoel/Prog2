import java.util.HashMap;

public class Analyse {

    public static HashMap<String, Integer> process(String string) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("lowercase", 0);
        map.put("uppercase", 0);
        map.put("space", 0);

        char[] betu = string.toCharArray();

        for (int i = 0; i < betu.length; i++) {
            if (Character.isLowerCase(betu[i])) {
                map.put("lowercase", map.get("lowercase") + 1);
            } else if (Character.isUpperCase(betu[i])) {
                map.put("uppercase", map.get("uppercase") + 1);
            } else if (Character.isSpaceChar(betu[i])) {
                map.put("space", map.get("space") + 1);
            }
        }

        return map;

    }

}