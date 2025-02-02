import java.util.Scanner;

public class apcsaw13tu {
    public static void main(String[] args) {
        // Output numbers from 5 to 25 on a single line
        System.out.print("Numbers from 5 to 25: ");
        for (int i = 5; i <= 25; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  // Move to the next line

        Scanner scanner = new Scanner(System.in);

        // Get the number of pairs to check
        System.out.print("\nEnter the number of pairs to check: ");
        int numPairs = scanner.nextInt();

        // Check divisibility for each pair
        for (int i = 0; i < numPairs; i++) {
            // Get the dividend
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            // Get the divisor
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Check if the dividend is evenly divisible by the divisor
            boolean isEvenlyDivisible = checkDivisibility(dividend, divisor);

            // Output the divisibility result
            if (isEvenlyDivisible) {
                System.out.println(dividend + " is evenly divisible by " + divisor);
            } else {
                int remainder = calculateRemainder(dividend, divisor);
                System.out.println(dividend + " is NOT evenly divisible by " + divisor +
                        ". " + dividend + " divided by " + divisor + " produces a remainder of " + remainder + ".");
            }

            // Output additional information based on conditions
            if (dividend % 4 == 0) {
                System.out.println(dividend + " is a multiple of 4.");
            } else if (dividend % 2 == 0) {
                System.out.println(dividend + " is not a multiple of 4 but is an even number.");
            } else {
                System.out.println(dividend + " is an odd number.");
            }

            // Output the ratio of the dividend to the divisor
            System.out.println("The ratio of the dividend " + dividend + " to the divisor " + divisor + " is " + dividend + ":" + divisor + ".");

            // Output the time it takes for the dividend to double in value based on the rule of 72
            double yearsToDouble = 72.0 / divisor;
            System.out.println("If " + dividend + " were a sum of money, and " + divisor + "% was the interest rate, " +
                    "it would take " + yearsToDouble + " years for " + dividend + " to double in value.");
        }
         // Input integers until the user enters "q"
         int sum = 0;
         int count = 0;
         String input;
 
         System.out.println("\nEnter another number, or the letter 'q', to end the sequence:");
 
         while (true) {
             input = scanner.next();
 
             if (input.equalsIgnoreCase("q")) {
                 break;
             }
 
             int number = Integer.parseInt(input);
             sum += number;
             count++;
         }
 
         // Calculate and output the sum and average
         int secondUserInputSum = sum + count;
         double average = (double) secondUserInputSum / count;
 
         System.out.println("The sum of the number(s) you entered and " + count + " is: " + secondUserInputSum);
         System.out.println("The average is: " + average);
 
         // Create a string with six names
         String names = "Elmo Oscar CookieMonster Grover BigBird Bert";
 
         // Use a for loop to find the 5th name
         int startIndex = 0;
 
         for (int i = 1; i <= 5; i++) {
             int spaceIndex = names.indexOf(' ', startIndex);
             if (i == 5) {
                 String fifthName = names.substring(startIndex, spaceIndex);
                 System.out.println(fifthName + " is name 5");
             }
             startIndex = spaceIndex + 1;
         }
 
         // Close the scanner
         scanner.close();
     
    }

    // Function to check if the dividend is evenly divisible by the divisor
    private static boolean checkDivisibility(int dividend, int divisor) {
        while (dividend >= divisor) {
            dividend -= divisor;
        }
        return dividend == 0;
    }

    // Function to calculate the remainder when the dividend is divided by the divisor
    private static int calculateRemainder(int dividend, int divisor) {
        while (dividend >= divisor) {
            dividend -= divisor;
        }
        return dividend;
    }
}
