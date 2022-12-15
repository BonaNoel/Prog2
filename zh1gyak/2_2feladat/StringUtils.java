public class StringUtils {

    private StringUtils() {
    }

    public static String switchAtKukac(String s) {
        
        int vanBenne = 0;

        char[] tmp = s.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == '@') {
                vanBenne = 1;
                break;
            }
        }
        
        if (vanBenne == 0) {
            String result1 = "";
            return result1;
        }

        int kukacIndex = s.indexOf('@');

        String result = s.substring(kukacIndex) + s.substring(0, kukacIndex);

        return result;

    }
}
