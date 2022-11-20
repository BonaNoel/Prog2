class Hamming {
    private String word1;
    private String word2;

    private Hamming() {
     
    }


    public static int distance(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return 99999999;
        } else {
            int counter = 0;

            char[] tmp1 = word1.toCharArray();
            char[] tmp2 = word2.toCharArray();

            for (int i = 0; i < tmp2.length; i++) {
                if (tmp1[i] != tmp2[i]) {
                    counter++;
                }
            }

            return counter;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        int diff = Hamming.distance("toned", "roses");
        System.out.println(diff);
    }
    
}
