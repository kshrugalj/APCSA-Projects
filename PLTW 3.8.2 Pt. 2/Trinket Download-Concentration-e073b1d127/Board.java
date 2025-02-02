/**
 * A game board of NxM board of tiles.
 * 
 * @author PLTW
 * @version 2.0
 */

import java.util.Random;

/**
 * A Board class for concentration
 */
public class Board {
    private static String[] tileValues = {"lion", "lion", "penguin", "penguin", "dolphin", "dolphin", "fox", "fox", "monkey", "monkey", "turtle", "turtle"};
    private Tile[][] gameboard = new Tile[3][4];

    /**
     * Constructor for the game. Creates the 2D gameboard by populating it with
     * card values
     * 
     */
    public Board() {
        /* your code here */
        // Populate the gameboard with tile values
        // int index = 0;
        // for (int i = 0; i < gameboard.length; i++) {
        //     for (int j = 0; j < gameboard[i].length; j++) {
        //         gameboard[i][j] = new Tile(tileValues[index]);
        //         index++;
        //     }
        // }
        // Fisher-Yates shuffle algorithm to shuffle the tileValues array
        Random rand = new Random();
        for (int i = tileValues.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = tileValues[i];
            tileValues[i] = tileValues[j];
            tileValues[j] = temp;
        }
        
        // Populate the gameboard with tiles using the shuffled tileValues array
        int index = 0;
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[i].length; j++) {
                gameboard[i][j] = new Tile(tileValues[index]);
                index++;
    }
  }
}

    /**
     * Returns a string representation of the board, getting the state of each tile.
     * If the tile is showing, displays its value, otherwise displays it as hidden.
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return a string representation of the board
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Tile[] row : gameboard) {
            for (Tile tile : row) {
                if (tile.isShowingValue()) {
                    sb.append(tile.getValue()).append("\t\t");
                } else {
                    sb.append("hidden").append("\t\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Determines if the board is full of tiles that have all been matched,
     * indicating the game is over.
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return true if all tiles have been matched, false otherwise
     */
    public boolean allTilesMatch() {
        /* your code here */
        for (Tile[] row : gameboard) {
            for (Tile tile : row) {
                if (!tile.matched()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Sets the tile to show its value (like a playing card face up)
     * 
     * Preconditions: gameboard is populated with tiles, row values must be in the
     * range of 0 to gameboard.length, column values must be in the range of 0 to
     * gameboard[0].length
     * 
     * @param row    the row value of Tile
     * @param column the column value of Tile
     */
    public void showValue(int row, int column) {
        /* your code here */
         // Check if the provided row and column indices are within the valid range
        if (row >= 0 && row < gameboard.length && column >= 0 && column < gameboard[0].length) {
          // Call the show() method of the corresponding Tile to show its value
          gameboard[row][column].show();
        }
    }

    /**
     * Checks if the Tiles in the two locations match.
     * 
     * If Tiles match, show Tiles in matched state and return a "matched" message If
     * Tiles do not match, re-hide Tiles (turn face down).
     * 
     * Preconditions: gameboard is populated with Tiles, row values must be in the
     * range of 0 to gameboard.length, column values must be in the range of 0 to
     * gameboard[0].length
     * 
     * @param row1 the row value of Tile 1
     * @param col1 the column value of Tile 1
     * @param row2 the row value of Tile 2
     * @param col2 the column value of Tile 2
     * @return a message indicating whether or not a match occured
     */
    public String checkForMatch(int row1, int col1, int row2, int col2) {
        String msg = "";

        /* your code here */
        // Get the values of the tiles at the specified locations
        String value1 = gameboard[row1][col1].getValue();
        String value2 = gameboard[row2][col2].getValue();
    
        // Check if the values of the tiles match
        if (value1.equals(value2)) {
          // If the tiles match, change their state to indicate they have been matched
          gameboard[row1][col1].foundMatch();
          gameboard[row2][col2].foundMatch();
          return "Congratulations! You've matched the tiles.";
        } else {
          // If the tiles do not match, hide them again
          gameboard[row1][col1].hide();
          gameboard[row2][col2].hide();
          return "Sorry, the tiles do not match.";
        }
    }

    /**
     * Checks the provided values fall within the range of the gameboard's dimension
     * and that the tile has not been previously matched
     * 
     * @param rpw the row value of Tile
     * @param col  the column value of Tile
     * @return true if row and col fall on the board and the row,col tile is
     *         unmatched, false otherwise
     */
    public boolean validateSelection(int row, int col) {
        /* your code here */
        return row >= 0 && row < gameboard.length && col >= 0 && col < gameboard[0].length;

    }
}
