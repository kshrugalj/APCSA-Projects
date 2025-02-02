import java.util.ArrayList;

public class ZooKeeperRunner {
  
  public static void main(String[] args) {
    // Create instances of animals
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    Tiger tiger = new Tiger("meat", true, 17.0);
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    
    // Create an ArrayList to store animals
    ArrayList<Animal> zoo = new ArrayList<>();
    
    // Add animals to the zoo
    zoo.add(elephant);
    zoo.add(tiger);
    zoo.add(giraffe);
    
    // Iterate over each animal in the zoo and call their speak method
    for (Animal animal : zoo) {
      animal.speak();
    }
    
    // Call hearTheAnimal method
    hearTheAnimal(elephant);
    hearTheAnimal(tiger);
    hearTheAnimal(giraffe);
  }
  
  // Method to hear the animal's sound
  public static void hearTheAnimal(Animal currentAnimal) {
    currentAnimal.speak();
  }
}