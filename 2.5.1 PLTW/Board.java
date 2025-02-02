import java.util.HashSet;
import java.util.Set;

public class Board {
    private String phrase;
    private Set<Character> correctGuesses;

    public Board(String phrase) {
        this.phrase = phrase;
        this.correctGuesses = new HashSet<>();
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Set<Character> getCorrectGuesses() {
        return correctGuesses;
    }

    public void addCorrectGuess(char guess) {
        correctGuesses.add(guess);
    }

    public boolean checkGuess(char guess) {
        return phrase.contains(String.valueOf(guess));
    }

    public boolean solvePuzzle(String guess) {
        return guess.equals(phrase);
    }
}
