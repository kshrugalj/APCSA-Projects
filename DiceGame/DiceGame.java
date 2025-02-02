import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int userChoice = 0;

        while (userChoice != 2) {
            System.out.println("Would you like to roll the dice? Yes (1) or No? (2) ");
            userChoice = sc.nextInt();

            if (userChoice == 1) {
                // create an instance of the Random class
                Random rand = new Random();
                // Generate random integers in the range 1 to 6 (inclusive)
                int rand_int = rand.nextInt(6) + 1;
                System.out.println("The random number that was spun from the dice was: " + rand_int);

            } else if (userChoice == 2) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter 1 to roll the dice or 2 to exit.");
            }
        }

        sc.close();
    }
}
