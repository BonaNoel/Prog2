
public class StringUtils {

    public static String cleanse(String string) {
        char[] betu = string.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < betu.length; i++) {
            if (Character.isLetter(betu[i]) || Character.isWhitespace(betu[i])) {
                sb.append(betu[i]);
            } else {
                sb.append("_");
            }
        }

        return sb.toString();

    }

}
