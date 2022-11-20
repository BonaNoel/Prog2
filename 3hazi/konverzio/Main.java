/* "123"   -> long
"3.14"  -> float
"7.89"  -> double
"a"     -> char */


public class Main {
    public static void main(String[] args) {
        String s1 = "123";
        String s2="3.14";
        String s3="7.89";
        String s4="a";

        long along = Long.parseLong(s1);
        double adouble = Double.parseDouble(s3);
        float afloat = Float.parseFloat(s2);
        char achar = s4.charAt(0);

        System.out.println(along);
        System.out.println(afloat);
        System.out.println(adouble);
        System.out.println(achar);
        
    }
}
