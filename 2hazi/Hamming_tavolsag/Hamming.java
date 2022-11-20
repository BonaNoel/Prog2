public class Hamming {
    private String word1;
    private String word2;

    public Hamming(String word1, String word2) {
        this.setWord1(word1);
        this.setWord2(word2);
    }

    public void setWord1(String value) {
        this.word1 = value;
    }

    public void setWord2(String value) {
        this.word2 = value;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public int tavolsag() {
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
