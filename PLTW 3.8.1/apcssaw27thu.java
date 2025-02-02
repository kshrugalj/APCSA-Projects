import java.util.Arrays;

public class apcssaw27thu {
    public static void main(String[] args) {
        String[][] board = {{"close", "quarter", "extra1"},
                            {"moon", "rock", "extra2"},
                            {"band", "stand", "extra3"},
                            {"out", "shine", "extra4"}};

        int numRows = board.length;
        int numCols = board[0].length;

        System.out.println("2D array board: " + Arrays.deepToString(board));
        System.out.println("Number of rows in 2D array board = " + numRows);
        System.out.println("Number of columns in 2D array board = " + numCols);

        System.out.println("\nRow-major order using for loop outputting by index:");
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\nColumn-major order using for loop outputting by index:");
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRow-major order linear search for 'extra3':");
        boolean found = false;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (board[row][col].equals("extra3")) {
                    found = true;
                    System.out.println("Found 'extra3' at: " + row + " , " + col);
                    break;
                } else {
                    System.out.println("'extra3' is not at: " + row + " , " + col);
                }
            }
            if (found) break;
        }

        System.out.println("\nProclamation of my general awesomeness: The King Strikes Again!");
    }
}
