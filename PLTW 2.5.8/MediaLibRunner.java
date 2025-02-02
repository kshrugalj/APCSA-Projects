/*************************************
 * Sample solution for Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 * 
 **************************************/
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    myLib.addBook(myBook);
    Movie myMovie = new Movie("Young Frankenstein", 1.75);
    myLib.addMovie(myMovie);

    System.out.println("Library:\n" + myLib);

    // test the equals methods
    Movie myMovie2 = new Movie("Young Frankenstein", 1.75);
    System.out.println("Movies are the same: " + myMovie.equals(myMovie2));
    myMovie2.setTitle("Frankenstein");
    System.out.println("Movies are the same: " + myMovie.equals(myMovie2));

    
  }
}