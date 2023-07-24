// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setGenre("Fiction");
        book1.setIsbn("9780743273565");
        book1.setAvailable(true);

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "9780061120084", false);

        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor());
    }
}