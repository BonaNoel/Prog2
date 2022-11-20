
public class Main {
    public static void main(String[] args) {

        // String s = new String("Cica");

        String s = "Cicamica";

        System.out.println(s.charAt(2));

        s += " cirkula macska";

        System.out.println(s);

        String s1 = s.substring(9,16);

        System.out.println(s1);

        String s2 = "sajtos kifli";
        System.out.println(s2.substring(7));  // innentol irja ki
        System.out.println(s2.substring(0,7).toUpperCase());  // ezt a tartomanyt irja ki

        System.out.println(s.length());
        System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.indexOf('a')); // keres betut
        System.out.println(s.indexOf("mica"));  // keres stringben stringet honnan indul

        System.out.println(s.trim()); // levagja a whitespacet elorol haturol

        System.out.println(s.startsWith("Ci"));  // igaz hamis ezzel kezdodik e
        System.out.println(s.endsWith("ka"));  // vegzodik

        System.out.println(s.replace("Cica", "Pisi"));

        String s3 = "Java" + 17;
        System.out.println(s3);
    }
}
