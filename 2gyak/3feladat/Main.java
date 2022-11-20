
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Dune", "Frank Herbert", 412);
        /*
         * book1.title = "Dune";
         * book1.author = "Frank Herbert";
         * book1.pages = 412;
         */
        System.out.println(book1.author);
        System.out.println(book1.pages);

        book1.pages = 350;
        System.out.println(book1.pages);
    }

}
