/*
 * Activity 3.6.4
 */

 class Player {
    String name;
    int age;
  
    public Player(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public int getAge() {
      return this.age;
    }
  }
  
  public class apcsaw23tu {
    public static void main(String[] args) {
      int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
  
      int sum = 0;
      for (int i = 0; i < goals.length; i++)
        sum += goals[i];
  
      // Calculate and print the average number of goals
      double average = (double) sum / goals.length;
      System.out.println("The average number of goals scored is: " + average);
  
      // Find the minimum and maximum values in the array
      int min = goals[0];
      int max = goals[0];
  
      for (int i = 1; i < goals.length; i++) {
        // Check for minimum value
        if (goals[i] < min) {
          min = goals[i];
        }
  
        // Check for maximum value
        if (goals[i] > max) {
          max = goals[i];
        }
      }
  
      // Print the results
      System.out.println("The minimum number of goals scored was: " + min);
      System.out.println("The maximum number of goals scored was: " + max);
  
      // Compute the mode
      int[] goalCounter = new int[10];
      int mode = 0;
      int modeValue = 0;
  
      for (int goal : goals) {
        goalCounter[goal]++;
      }
  
      for (int i = 0; i < goalCounter.length; i++) {
        if (goalCounter[i] > modeValue) {
          modeValue = goalCounter[i];
          mode = i;
        }
      }
  
      // Print the mode
      System.out.println(mode + " is the mode in the array.");
  
      // Player array
      Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                          new Player("Bobbie", 18), new Player("Blaine", 20),
                          new Player("Chris", 15), new Player("Charlie", 15) };
  
      // Check if at least one player is over 18 years old
      boolean hasOver21 = false;
  
      for (Player player : players) {
        if (player.getAge() > 21) {
          System.out.println(player.name + " is over 21 years old.");
          hasOver21 = true;
        }
      }
  
      // Output the result for players over 21
      if (!hasOver21) {
        System.out.println("All players are under the age of 21.");
      }
  
      // Count the number of players age 15
      int countAge15 = 0;
  
      for (Player player : players) {
        if (player.getAge() == 15) {
          countAge15++;
        }
      }
  
      // Output the result for players age 15
      System.out.println(countAge15 + " players are exactly 15.");

    //   String[] arr = {"A", "B", "C", "D", "E", "F"};

    //     // The loop starts from the last element of the array and iterates backward
    //     // The loop runs as long as the index (i) is greater than 1
    //     for (int i = arr.length; i > 1; i--) 
    //     {
    //         // Store the value of the element at index (i-2) in a temporary variable (tmp)
    //         String tmp = arr[i-2];

    //         // Assign the value of the element at index (i-1) to the element at index (i-2)
    //         arr[i-2] = arr[i - 1];

    //         // Assign the value stored in the temporary variable (tmp) to the element at index (i-1)
    //         arr[i-1] = tmp;
    //     }
        
    //     // Print out the elements of the array using a single statement

    //     String[] arr = {"A", "B", "C", "D", "E", "F"};

    //         // The loop iterates over the first half of the array (up to arr.length/2)
    //         for (int i = 0; i < arr.length/2; i++)
    //         {
    //             // Store the value of the element at index i in a temporary variable (tmp)
    //             String tmp = arr[i];

    //             // Assign the value of the element at the end of the array (arr.length - i - 1) to the element at index i
    //             arr[i] = arr[arr.length - i - 1];

    //             // Assign the value stored in the temporary variable (tmp) to the element at the end of the array (arr.length - i - 1)
    //             arr[arr.length - i - 1] = tmp;
    //         }


    }
  }
  