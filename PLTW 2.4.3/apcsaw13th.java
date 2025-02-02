import java.util.Scanner;

public class apcsaw13th {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a String:");
        String inputString = scanner.nextLine();

        // Display every other letter in the string
        String everyOtherLetterResult = getEveryOtherLetter(inputString);
        System.out.println("Every other letter in the string is: " + everyOtherLetterResult);

        // Display the string without vowels
        String withoutVowelsResult = removeVowels(inputString);
        System.out.println("String without vowels: " + withoutVowelsResult);

        // Replace 'd', 'b', 'p', and 'q' with a random choice from the same set
        String randomReplacementResult = replaceWithRandom(inputString, "dbpq");
        System.out.println("Random replacement of 'd', 'b', 'q', and 'p': " + randomReplacementResult);

        // Close the scanner
        scanner.close();
    }

    private static String getEveryOtherLetter(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    private static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is not a vowel
            if ("AEIOUaeiou".indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private static String replaceWithRandom(String input, String charactersToReplace) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is in the set of characters to replace
            if (charactersToReplace.indexOf(currentChar) != -1) {
                // Replace with a random character from the set
                result.append(getRandomCharacter(charactersToReplace));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private static char getRandomCharacter(String characters) {
        int randomIndex = (int) (Math.random() * characters.length());
        return characters.charAt(randomIndex);
    }
}
