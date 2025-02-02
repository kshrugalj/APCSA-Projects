/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

    public static void main(String[] args) {
      // Part 1: Create a 3x4 gameboard and populate it with Tile objects
      Tile[][] gameboard = new Tile[3][4];
      int index = 0;
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 4; j++) {
              gameboard[i][j] = new Tile(tileValues[index]);
              index++;
          }
      }
      // Output the results
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 4; j++) {
              System.out.print(gameboard[i][j].getValue() + "\t");
          }
          System.out.println();
      }
      
      // Part 2: Create a 5x2 array with odd numbers in the first column and evens in the second
      int[][] numbersArray = new int[5][2];
      int number = 1; // Start with 1
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 2; j++) {
              numbersArray[i][j] = number;
              number += 2; // Increment by 2 for odd numbers
          }
      }
      
      // Calculate sum and average of all values in the 2D array
      int sumTotal = 0;
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 2; j++) {
              sumTotal += numbersArray[i][j];
          }
      }
      double averageTotal = (double) sumTotal / (5 * 2);
      System.out.println("Total sum of all values: " + sumTotal);
      System.out.println("Total average of all values: " + averageTotal);
      
      // Calculate sum and average by column
      int[] sumByColumn = new int[2];
      double[] averageByColumn = new double[2];
      for (int j = 0; j < 2; j++) {
          for (int i = 0; i < 5; i++) {
              sumByColumn[j] += numbersArray[i][j];
          }
          averageByColumn[j] = (double) sumByColumn[j] / 5;
          System.out.println("Sum of column " + (j + 1) + ": " + sumByColumn[j]);
          System.out.println("Average of column " + (j + 1) + ": " + averageByColumn[j]);
      }
  }
} 
