import java.util.ArrayList;

public class apcsaw26tu {
    public static void main(String[] args) {
        int upTo = 100;
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 1; i <= upTo; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primes.add(i);
            }
        }

        // Linear search using enhanced for loop
        int searchValue = 7; // Change this to the value you want to search for
        boolean foundEnhanced = false;

        for (int prime : primes) {
            if (prime == searchValue) {
                foundEnhanced = true;
                break;
            }
        }

        if (foundEnhanced) {
            System.out.println(searchValue + " found using enhanced for loop.");
        } else {
            System.out.println(searchValue + " not found using enhanced for loop.");
        }

        // Linear search using while loop
        boolean foundWhile = false;
        int i = 0;

        while (i < primes.size()) {
            if (primes.get(i) == searchValue) {
                foundWhile = true;
                break;
            }
            i++;
        }

        if (foundWhile) {
            System.out.println(searchValue + " found using while loop.");
        } else {
            System.out.println(searchValue + " not found using while loop.");
        }
    }
}
