/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 'true' or 'false' for A");
    boolean a = Boolean.parseBoolean(sc.nextLine());

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = Boolean.parseBoolean(sc.nextLine());

    // Calculate both sides of the expression
    boolean leftSide = !(a && b);
    boolean rightSide = (!a) || (!b);

    // Output the results
    System.out.println("not (a and b) is " + leftSide);
    System.out.println("(not a) or (not b) is " + rightSide);

    // Check if both sides are equal and display the result
    if (leftSide == rightSide) {
      System.out.println("The expressions are equal (De Morgan's Law holds).");
    } else {
      System.out.println("The expressions are not equal (De Morgan's Law does not hold).");
    }
     // Calculate and validate the second part of De Morgan's Laws
     boolean leftSide2 = !(a || b);
     boolean rightSide2 = (!a) && (!b);
 
     System.out.println("not (a or b) is " + leftSide2);
     System.out.println("(not a) and (not b) is " + rightSide2);
 
     if (leftSide2 == rightSide2) {
       System.out.println("The second part of De Morgan's Laws holds.");
     } else {
       System.out.println("The second part of De Morgan's Laws does not hold.");
     }
     sc.close();
  }
}
