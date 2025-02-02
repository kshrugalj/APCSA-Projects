import java.util.Scanner;

public class Player {
    // Instance variables
    private String name;
    private int points;

    // No-arg constructor
    public Player() {
        // Prompt the user to enter a player name
        System.out.print("Enter player name: ");
        
        // Construct a scanner object that will assign the user input to a variable newName
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        
        // Assign instance variable name the value of newName
        this.name = newName;

        // Welcome the player and concatenate with the player’s name entered
        System.out.println("Welcome, " + this.name + "!");

        // Assign instance variable points the value of 0
        this.points = 0;

        // Close the scanner
        scanner.close();
    }

    // Parameterized constructor
    public Player(String inputName) {
        // Assign instance variable name with the value of the parameter in the constructor
        this.name = inputName;

        // Welcome the player and concatenate with the player’s name entered
        System.out.println("Welcome, " + this.name + "!");

        // Assign instance variable points the value of 0
        this.points = 0;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    // Mutator methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setPoints(int newPoints) {
        this.points = newPoints;
    }

    public static void main(String[] args) {
        // Example usage:
        // Create a player with the no-arg constructor
        Player player1 = new Player();
        System.out.println("Player 1 Name: " + player1.getName());
        System.out.println("Player 1 Points: " + player1.getPoints());

        // Create a player with the parameterized constructor
        Player player2 = new Player("John Doe");
        System.out.println("Player 2 Name: " + player2.getName());
        System.out.println("Player 2 Points: " + player2.getPoints());
    }
}
