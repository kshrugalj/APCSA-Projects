import java.util.Random;

public class assignment {
    public static void main(String[] args) {
        // Part 1: Populate a 4x4 2D array with random numbers between 1 and 1000
        int[][] array = new int[4][4];
        populateArray(array);
        System.out.println("The initial 2D array:");
        printArray(array);
        
        // Part 2: Find the number of columns where each element is successively higher than the one before
        int orderedColumns = countOrderedColumns(array);
        System.out.println("Number of ordered columns is: " + orderedColumns);
        
        // Part 3: Repopulate the 2D array with random numbers satisfying certain conditions
        repopulateArray(array);
        System.out.println("The repopulated 2D array:");
        printArray(array);
    }
    
    // Function to populate the array with random numbers between 1 and 1000
    public static void populateArray(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(1000) + 1;
            }
        }
    }
    
    // Function to count the number of ordered columns
    public static int countOrderedColumns(int[][] array) {
        int count = 0;
        for (int j = 0; j < array[0].length; j++) {
            boolean ordered = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i][j] <= array[i - 1][j]) {
                    ordered = false;
                    break;
                }
            }
            if (ordered) {
                count++;
            }
        }
        return count;
    }
    
    // Function to repopulate the array with random numbers satisfying certain conditions
    public static void repopulateArray(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num;
                do {
                    num = rand.nextInt(1000) + 1;
                } while (num % 10 != 0 || num % 100 == 0);
                array[i][j] = num;
            }
        }
    }
    
    // Function to print the array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
