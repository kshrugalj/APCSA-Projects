public class LetterFrequencies {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String phrase = "This is a phrase!";
        int[] frequencies = new int[26]; // Array to store letter frequencies

        System.out.println("The following shows the letter frequencies for the phrase:");

        // Convert the phrase to lowercase for case-insensitive analysis
        phrase = phrase.toLowerCase();

        // Iterate through the alphabet
        for (int i = 0; i < letters.length(); i++) {
            char currentLetter = letters.charAt(i);
            int letterCount = 0;

            // Iterate through the phrase to count occurrences of the current letter
            for (int j = 0; j < phrase.length(); j++) {
                char currentPhraseChar = phrase.charAt(j);

                if (currentPhraseChar == currentLetter) {
                    letterCount++;
                }
            }

            // Update the frequencies array and display the result
            frequencies[i] = letterCount;
            System.out.println("Letter " + currentLetter + ": " + letterCount + " times");
        }
    }
}
