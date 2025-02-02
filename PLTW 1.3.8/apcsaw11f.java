import java.util.Scanner;

public class apcsaw11f {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasRiptide = false;
        boolean hasShield = false;
        boolean hasProphecy = false;

        System.out.println("Welcome to the Percy Jackson Adventure Game!\n");

        // Initial choice at Camp Half-Blood
        System.out.println("You are Percy Jackson, the demigod son of Poseidon.");
        System.out.println("You find yourself at Camp Half-Blood with several choices ahead.");
        System.out.println("1. Train with your friends in the arena.");
        System.out.println("2. Go to the Big House to meet Chiron.");
        System.out.println("3. Explore the forest near the camp.");
        int choice1 = scanner.nextInt();
        System.out.println();

        // Choice 1: Training with friends
        if (choice1 == 1) {
            System.out.println("You have a sparring match with your friend Annabeth.");
            System.out.println("1. Use Riptide for the duel.");
            System.out.println("2. Spar without a weapon.");
            int choice2 = scanner.nextInt();
            System.out.println();

            // Nested Choice: Sparring match
            if (choice2 == 1) {
                hasRiptide = true;
                System.out.println("With Riptide in hand, you defeat Annabeth in the duel.");
            } else if (choice2 == 2) {
                System.out.println("You spar without a weapon and enjoy the training session.");
            }
        }
        // Choice 2: Meeting Chiron
        else if (choice1 == 2) {
            System.out.println("You meet Chiron, the activities director and centaur.");
            System.out.println("1. Seek his guidance on your upcoming quest.");
            System.out.println("2. Discuss recent prophecies.");
            int choice3 = scanner.nextInt();
            System.out.println();

            // Nested Choice: Meeting Chiron
            if (choice3 == 1) {
                System.out.println("Chiron provides you with valuable advice and information for your quest.");
            } else if (choice3 == 2) {
                hasProphecy = true;
                System.out.println("You discuss the prophecy with Chiron and learn about your destiny.");
            }
        }
        // Choice 3: Exploring the forest
        else if (choice1 == 3) {
            System.out.println("While exploring the forest, you come across a monster.");
            System.out.println("1. Fight the monster.");
            System.out.println("2. Run away and seek help.");
            int choice4 = scanner.nextInt();
            System.out.println();

            // Nested Choice: Confronting the monster
            if (choice4 == 1) {
                // Compound Boolean Expression: Needing Riptide
                if (hasRiptide) {
                    System.out.println("With Riptide, you defeat the monster and continue your exploration.");
                } else {
                    System.out.println("You don't have a weapon! The monster defeats you.");
                }
            } else if (choice4 == 2) {
                System.out.println("You run away from the monster and return to Camp Half-Blood safely.");
            }
        }

        System.out.println("\nCongratulations, demigod! You've completed this Percy Jackson adventure.");
        scanner.close();
    }
}
