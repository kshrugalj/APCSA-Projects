import java.util.Calendar;

public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;
  private static String owner = "PLTW";
  private static int numEntries;
  private Calendar date; // New field to store date and time
  public MediaLib()
    {
        date = Calendar.getInstance();
    }
    private void updateDate() {
        date = Calendar.getInstance();
    }
    public void addBook(Book b) {
        book = b;
        incrementNumEntries();
        updateDate();
    }

    public void addMovie(Movie m) {
        movie = m;
        incrementNumEntries();
        updateDate();
    }

    public void addSong(Song s) {
        song = s;
        incrementNumEntries();
        updateDate();
    }

  public void changeBook(Book newBook) {
      book = newBook;
  }

  public void changeMovie(Movie newMovie) {
      movie = newMovie;
  }

  // Change the song in the library
  public void changeSong(Song newSong) {
      song = newSong;
  }

  public static String getCurrentDateTime() {
    Calendar cal = Calendar.getInstance();
    return cal.getTime().toString();
}

  public String toString() {
      String info = "";

      if (book != null)
          info += "Book: " + book + "\n";
      if (movie != null)
          info += "Movie: " + movie + "\n";
      if (song != null)
          info += "Song: " + song + "\n";

        
      info += "Date/Time: " + date.getTime() + "\n"; // Display date and time


      return info;
      
  }

  public static String getOwner() {
      return owner;
  }

  public static String changeOwner(String newOwner) {
      owner = newOwner;
      return owner;
  }

  public static int getNumEntries() {
      return numEntries;
  }

  private static void incrementNumEntries() {
      numEntries++;
  }

//   public String getInfo()
//     {
//         return "The current book information is " + info;
//     }    
      
}
