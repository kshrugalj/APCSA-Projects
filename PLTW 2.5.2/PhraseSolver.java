import java.util.Scanner;

public class PhraseSolver {
    private Player player1;
    private Player player2;
    private Board game;
    private boolean solved;

    public PhraseSolver() {
        Scanner input = new Scanner(System.in);

        // Prompt user for Player 1 name
        System.out.print("Enter Player 1 Name: ");
        String player1Name = input.nextLine();
        player1 = new Player(player1Name);
        System.out.println("Hello and welcome to the game, " + player1.getName());

        // Prompt user for Player 2 name
        System.out.print("Enter Player 2 Name: ");
        String player2Name = input.nextLine();
        player2 = new Player(player2Name);
        System.out.println("Hello and welcome to the game, " + player2.getName());

        game = new Board();
        solved = false;

        // Print the loaded phrase for testing
        System.out.println("Phrase: " + game.getPhrase());

        // Close the scanner
        input.close();
    }

    public void play() {
        int currentPlayer = 1;

        Scanner input = new Scanner(System.in);

        while (!solved) {
            // Your game logic here
            // You can use player1, player2, and game objects to implement the game

            // For testing purposes, you can use the following:
            System.out.println("Current Player: " + (currentPlayer == 1 ? player1.getName() : player2.getName()));
            System.out.println("Solved Phrase: " + game.getSolvedPhrase());

            // Your code to switch players and handle user input

            // Update solved based on game logic
            solved = game.isSolved();
        }

        // Close the scanner
        input.close();
    }

    public static void main(String[] args) {
        PhraseSolver game = new PhraseSolver();
        game.play();
    }
}
