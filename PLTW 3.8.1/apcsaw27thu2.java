import java.util.Arrays;

public class apcsaw27thu2 {
    public static void main(String[] args) {
        String[] tileValues = {"lion", "penguin", "dolphin", "fox", "monkey", "turtle"};

        String[][] gameboard = new String[3][2];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                gameboard[i][j] = tileValues[k];
                k++;
            }
        }

        System.out.println(".length on a 2D array outputs number of rows: " + gameboard.length);
        System.out.println("To output number of columns, use index 0 with .length: " + gameboard[0].length);
        System.out.println("Output using only the array name: " + gameboard);
        System.out.println("Output using array name and .toString();: " + Arrays.toString(gameboard));
        System.out.println("Output using .toString(); with one index to output a row: " + Arrays.toString(gameboard[0]));
        System.out.println("Output using .deepToString() on entire 2D Array;: " + Arrays.deepToString(gameboard));

        System.out.println("\nRow major order  to output each element on separate lines:");
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[i].length; j++) {
                System.out.println(gameboard[i][j]);
            }
        }

        System.out.println("\nRow major order using enhanced for loop to output each row on one line:");
        for (String[] row : gameboard) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nColumn major order to output each element on separate lines:");
        for (int j = 0; j < gameboard[0].length; j++) {
            for (int i = 0; i < gameboard.length; i++) {
                System.out.println(gameboard[i][j]);
            }
        }

        System.out.println("\nColumn major order using nested enhanced for loop to output each row:");
        for (int j = 0; j < gameboard[0].length; j++) {
            for (String[] row : gameboard) {
                System.out.print(row[j] + ", ");
            }
            System.out.println();
        }

        System.out.println("\nOutput contents of Tile 2D array gameboard in row major order:");
        for (String[] row : gameboard) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nMany are cool, but few are frozen.");
    }
}
