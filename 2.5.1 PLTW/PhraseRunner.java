import java.util.Scanner;

public class PhraseRunner {
    private PhraseSolver phraseSolver;
    private Board board;

    public PhraseRunner(Player player1, Player player2, String phrase) {
        this.phraseSolver = new PhraseSolver(player1, player2);
        this.board = new Board(phrase);
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player currentPlayer = phraseSolver.getCurrentPlayer();
            System.out.print(currentPlayer.getName() + ", enter your guess: ");
            char guess = scanner.next().charAt(0);

            if (board.checkGuess(guess)) {
                board.addCorrectGuess(guess);
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess.");
            }

            if (board.solvePuzzle(Character.toString(guess))) {
                System.out.println(currentPlayer.getName() + " solved the puzzle!");
                phraseSolver.updateScore(currentPlayer, 1);
                break;
            }

            phraseSolver.switchPlayer();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        PhraseRunner phraseRunner = new PhraseRunner(player1, player2, "example phrase");

        phraseRunner.runGame();
    }
}
