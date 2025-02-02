/*
 * Activity 3.6.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    // Create a myDogs Dog object array containing three super cool named dogs
    Dog[] myDogs = new Dog[3];
    myDogs[0] = new Dog("Buddy");
    myDogs[1] = new Dog("Max");
    myDogs[2] = new Dog("Charlie");

    // Create a neighborsDogs Dog object array with a length of 3
    Dog[] neighborsDogs = new Dog[3];

    // Add an "empty" Dog object to each index
    for (int i = 0; i < neighborsDogs.length; i++) {
      neighborsDogs[i] = new Dog(); // Assuming Dog class has a default constructor
    }

    // Output each dog in the myDogs array
    for (int i = 0; i < myDogs.length; i++) {
      System.out.println("The " + (i + 1) + " dog in my array is: " + myDogs[i].getName());
    }

    // Neighbor's dogs' names provided with NFTs
    neighborsDogs[0].setName("Rover");
    neighborsDogs[1].setName("Daisy");
    neighborsDogs[2].setName("Fido");

    // Output each dog in the neighborsDogs array using escape sequences
    System.out.println("\nNeighbor's dogs' names with NFTs:");
    System.out.println("The first dog in my neighbor’s array is: " + neighborsDogs[0].getName());
    System.out.println("The second dog in my neighbor’s array is: " + neighborsDogs[1].getName());
    System.out.println("The third dog in my neighbor’s array is: " + neighborsDogs[2].getName());

    // Error scenarios
    // Uncomment these lines to see the respective errors
    // Dog[] errorArray = {new Dog("Error Dog"), new Dog("Error Dog 2")}; // cannot modify an array with initializer list
    // System.out.println(errorArray[2].getName()); // ArrayIndexOutOfBounds

    // Statement of general awesomeness and elan
    System.out.println("\nThanks for using this program! Stay frosty!");
  }
}
