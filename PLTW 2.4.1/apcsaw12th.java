import java.util.Scanner;

public class apcsaw12th {

    public static void main(String[] args) {
        // Part 1: Output numbers from 5 to 25
        System.out.print("Numbers from 5 to 25: ");
        int num = 5;
        while (num <= 25) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");

        // Part 2: User input to check divisibility
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend (number to be divided by): ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor (number used to divide): ");
        int divisor = scanner.nextInt();

        int quotient = 0; // Initialize quotient
        int remainder = dividend; // Initialize remainder

        // Use a while loop to check divisibility without division or modulus
        while (remainder >= divisor) {
            remainder -= divisor; // Subtract divisor from remainder until it's less than the divisor
            quotient++; // Increase quotient by 1 for each subtraction
        }

        // Check if dividend is evenly divisible
        if (remainder == 0) {
            System.out.println(dividend + " is evenly divisible by " + divisor);
        } else {
            // Calculate the remainder using subtraction
            System.out.println(dividend + " is NOT evenly divisible by " + divisor + ". " + dividend +
                    " divided by " + divisor + " produces a remainder of " + (dividend - (quotient * divisor)) + ".");
        }

        // Part 3: Output digits in the dividend
        System.out.print("The digits that make up " + dividend + " are: ");
        int temp = dividend;
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            System.out.print(digit + " ");
            temp /= 10; // Remove the last digit
        }
        System.out.println("\n");

        // Part 4: Count occurrences of 3 from 0 to dividend
        int count = 0;
        for (int i = 0; i <= dividend; i++) {
            int tempNum = i;
            while (tempNum > 0) {
                if (tempNum % 10 == 3) {
                    count++;
                }
                tempNum /= 10;
            }
        }
        System.out.println("The number 3 occurs " + count + " times from 0 to " + dividend + ".\n");

        // Part 5: Enter the maximum value for a range of numbers
        System.out.print("Enter the maximum value for a range of numbers that starts with: " + dividend + " ");
        int maxRange = scanner.nextInt();

        // Part 6: Input integers until "q" is entered
        int sum = 0;
        int countInput = 0;
        scanner.nextLine(); // Consume the newline character
        while (true) {
            System.out.print("Enter another number, or the letter 'q', to end the sequence: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum += number;
            countInput++;
        }
        double average = (double) sum / countInput;

        // Output the sum and average
        System.out.println("The sum of the number(s) you entered and " + dividend + " is: " + sum +
                " The average is: " + average + "\n");

        // Part 7: Finding the 5th name in a string
        String names = "Elmo BigBird CookieMonster Oscar Grover AbbyCadabby";
        int namePosition = 0;
        int spaceIndex = 0;
        while (namePosition < 5) {
            spaceIndex = names.indexOf(" ", spaceIndex + 1);
            namePosition++;
        }
        int nextSpaceIndex = names.indexOf(" ", spaceIndex + 1);
        String fifthName = names.substring(spaceIndex + 1, nextSpaceIndex);
        System.out.println(fifthName + " is name 5");

        scanner.close();
    }
}
