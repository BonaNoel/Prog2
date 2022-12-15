public class Main {
    
    public static void main(String[] args) {
            


    }

    public static int product(int...szamok) { ///////// itt a lenyeg int...x
        
        int szorzat = 1;
        for (int i = 0; i < szamok.length; i++) {
            szorzat *=szamok[i];
        }

        return szorzat;
    }    
}
