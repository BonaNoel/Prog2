public class TestMain {
    public static void main(String[] args) {

        givenNumber_duplaz_returnsDuplicate();

        givenString_strlen_returnsLenghtOfString();

    }

    public static void givenNumber_duplaz_returnsDuplicate() {
        
        assert MyUtils.duplaz(0) == 0;
        
        assert MyUtils.duplaz(2) == 4;

        assert MyUtils.duplaz(4) == 8;

        assert MyUtils.duplaz(6) == 12;

        System.out.println(" duplaz ok");
    }

    public static void givenString_strlen_returnsLenghtOfString() {

        assert MyUtils.strlen("hellóka") == "hellóka".length();

        assert MyUtils.strlen("pisi") == "pisi".length();

        assert MyUtils.strlen("kaka") == "kaka".length();

        System.out.println(" strlen  ok");

    }
}
