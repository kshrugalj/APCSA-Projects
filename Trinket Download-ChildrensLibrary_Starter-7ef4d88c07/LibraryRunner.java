import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] args) {
        // Construct a new Library
        Library library = new Library();

        // Define an ArrayList named childrensBooks
        ArrayList<Book> childrensBooks = library.getChildrensBooks();

        // Finding books by author L. Frank Baum
        String authorToFind = "L. Frank Baum";
        System.out.println("Books written by " + authorToFind + ":");
        for (Book book : childrensBooks) {
            if (book.getAuthor().equals(authorToFind)) {
                System.out.println("Book: " + book.getTitle());
            }
        }

        // Finding the rating of the book Sky Island
        String bookToFind = "Sky Island";
        double minimumRating = 0.0;
        for (Book book : childrensBooks) {
            if (book.getTitle().equals(bookToFind)) {
                minimumRating = book.getRating();
                break;
            }
        }

        // Print the minimumRating to test if it is correct
        System.out.println("The minimum rating for books is: " + minimumRating);

        // Print all books and authors with a rating of at least 4.14
        System.out.println("Books and authors with a rating of at least 4.14:");
        for (Book book : childrensBooks) {
            if (book.getRating() >= minimumRating) {
                System.out.println("Book: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Rating: " + book.getRating());
                System.out.println();
            }
        }
    }
}
