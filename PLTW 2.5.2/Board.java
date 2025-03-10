import java.util.Scanner;
import java.io.File;

public class Board {
    private String solvedPhrase = ""; // Initialize solvedPhrase with an empty string
    private String phrase;
    private int currentLetterValue;

    // Default constructor
    public Board() {
        // Initialize the board with a random phrase from phrases.txt
        this.phrase = loadPhrase();
        this.currentLetterValue = 0; // You might want to set this to a meaningful default value
        initializeSolvedPhrase();

        // Call setLetterValue method
        setLetterValue();

        // Print statement for testing
        System.out.println("Phrase: " + phrase); // temp test code
    }

    // Accessor methods
    public String getSolvedPhrase() {
        return solvedPhrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public int getCurrentLetterValue() {
        return currentLetterValue;
    }

    // Mutator methods (if needed in the future)

    // Other methods remain unchanged

    private void initializeSolvedPhrase() {
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.substring(i, i + 1).equals(" ")) {
                solvedPhrase += "  ";
            } else {
                solvedPhrase += "_ ";
            }
        }
    }

    /* ---------- provided code, do not modify ---------- */
    public void setLetterValue() {
        int randomInt = (int) ((Math.random() * 10) + 1) * 100;
        currentLetterValue = randomInt;
    }

    public boolean isSolved(String guess) {
        if (phrase.equals(guess)) {
            return true;
        }
        return false;
    }

    private String loadPhrase() {
        String tempPhrase = "";

        int numOfLines = 0;
        try {
            Scanner sc = new Scanner(new File("phrases.txt"));
            while (sc.hasNextLine()) {
                tempPhrase = sc.nextLine().trim();
                numOfLines++;
            }
        } catch (Exception e) {
            System.out.println("Error reading or parsing phrases.txt");
        }

        int randomInt = (int) ((Math.random() * numOfLines) + 1);

        try {
            int count = 0;
            Scanner sc = new Scanner(new File("phrases.txt"));
            while (sc.hasNextLine()) {
                count++;
                String temp = sc.nextLine().trim();
                if (count == randomInt) {
                    tempPhrase = temp;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading or parsing phrases.txt");
        }

        for (int i = 0; i < tempPhrase.length(); i++) {
            if (tempPhrase.substring(i, i + 1).equals(" ")) {
                solvedPhrase += "  ";
            } else {
                solvedPhrase += "_ ";
            }
        }

        return tempPhrase;
    }

    public boolean guessLetter(String guess) {
        boolean foundLetter = false;
        String newSolvedPhrase = "";

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.substring(i, i + 1).equals(guess)) {
                newSolvedPhrase += guess + " ";
                foundLetter = true;
            } else {
                newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";
            }
        }
        solvedPhrase = newSolvedPhrase;
        return foundLetter;
    }
}
