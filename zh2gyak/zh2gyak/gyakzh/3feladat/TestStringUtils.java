
public class TestStringUtils {

    public static void main(String[] args) {
        getEmpty_String();
        getNormal_String();
        getNumberAndSpecialChar_String();
        getOnlyNumbers_String();
        getOnlySpecialChars_String();
    }

    // unit test for StringUtils.cleanse method

    public static void getEmpty_String() {
        String res = StringUtils.cleanse("");
        assert ("".equals(res));
        System.out.println("Empty string test passed");
    }

    public static void getNormal_String() {
        String res = StringUtils.cleanse("alma");
        assert ("alma".equals(res));
        System.out.println("Normal string test passed");
    }

    public static void getNumberAndSpecialChar_String() {
        String res = StringUtils.cleanse("alma 42!");
        assert ("alma ___".equals(res));
        System.out.println("Number and special char string test passed");
    }

    public static void getOnlySpecialChars_String() {
        String res = StringUtils.cleanse("!!!");
        assert ("___".equals(res));
        System.out.println("Only special chars string test passed");
    }

    public static void getOnlyNumbers_String() {
        String res = StringUtils.cleanse("123");
        assert ("___".equals(res));
        System.out.println("Only numbers string test passed");
    }

}