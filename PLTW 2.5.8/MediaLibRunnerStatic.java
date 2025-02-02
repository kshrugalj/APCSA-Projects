public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        System.out.println(MediaLib.getOwner() + "'s Library");
        System.out.println("The library now belongs to " + MediaLib.changeOwner("King"));
        
        // Instantiate two new MediaLib objects
        MediaLib myLib1 = new MediaLib();
        MediaLib myLib2 = new MediaLib();

        // Test getNumEntries()
        System.out.println("Number of entries in myLib1: " + MediaLib.getNumEntries());
        System.out.println("Number of entries in myLib2: " + MediaLib.getNumEntries());

        // Add a book to myLib1
        Book book1 = new Book("Percy Jackson and The Lightning Thief", "Rick Riodarn");
        myLib1.addBook(book1);

        // Add a movie to myLib2
        Movie movie1 = new Movie("Percy Jackson and The Lightning Thief", 1.98);
        myLib2.addMovie(movie1);

        // Test getNumEntries() again
        System.out.println("Number of entries in myLib1: " + MediaLib.getNumEntries());
        System.out.println("Number of entries in myLib2: " + MediaLib.getNumEntries());

        // Change book in myLib1
        Book newBook = new Book("Divergent", "Veronica Ross");
        myLib1.changeBook(newBook);

        // Change movie in myLib2
        Movie newMovie = new Movie("Divergent", 2.32);
        myLib2.changeMovie(newMovie);

        // Print library information
        System.out.println("Library 1:\n" + myLib1);
        System.out.println("Library 2:\n" + myLib2);

        // Print total number of entries
        System.out.println("Total number of entries: " + MediaLib.getNumEntries());
    }
}

