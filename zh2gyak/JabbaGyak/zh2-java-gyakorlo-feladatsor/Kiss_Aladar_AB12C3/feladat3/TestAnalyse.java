import java.util.HashMap;

public class TestAnalyse {

    public static void main(String[] args) {
        getEmptyString();   
        getOnlyUpperCase(); 
        getOnlyLowerCase(); 
        getOnlySpace();     

        getOnlyNumber();    
        getNormalString();  

        getKeysNumber();
        getKeysName();

    }

    public static void getEmptyString() {
        String string = "";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 0;
        assert map.get("uppercase") == 0;
        assert map.get("space") == 0;

        System.out.println("getEmptyString() passed");
    }

    public static void getOnlyUpperCase() {
        String string = "ABC";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 0;
        assert map.get("uppercase") == 3;
        assert map.get("space") == 0;

        System.out.println("getOnlyUpperCase() passed");
    }

    public static void getOnlyLowerCase() {
        String string = "abc";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 3;
        assert map.get("uppercase") == 0;
        assert map.get("space") == 0;

        System.out.println("getOnlyLowerCase() passed");
    }

    public static void getOnlySpace() {
        String string = " ";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 0;
        assert map.get("uppercase") == 0;
        assert map.get("space") == 1;

        System.out.println("getOnlySpace() passed");
    }

    public static void getOnlyNumber() {
        String string = "123";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 0;
        assert map.get("uppercase") == 0;
        assert map.get("space") == 0;

        System.out.println("getOnlyNumber() passed");
    }


    public static void getNormalString() {
        String string = "Aa 1";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.get("lowercase") == 1;
        assert map.get("uppercase") == 1;
        assert map.get("space") == 1;

        System.out.println("getNormalString() passed");
    }

    public static void getKeysNumber() {
        String string = "Aa 1";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.size() == 3;

        System.out.println("getKeysNumber() passed");
    }

    public static void getKeysName() {
        String string = "Aa 1";
        HashMap<String, Integer> map = Analyse.process(string);
        assert map.containsKey("lowercase");
        assert map.containsKey("uppercase");
        assert map.containsKey("space");

        System.out.println("getKeysName() passed");
    }
}