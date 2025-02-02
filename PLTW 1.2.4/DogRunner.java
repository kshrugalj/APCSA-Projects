/*
 * Activity 1.2.4
 */
public class DogRunner
{
  public static void main(String[] args)
  {
  Dog myDog = new Dog("Kai");
  myDog.eat("seaweed", 10, 3);
  myDog.walk(2, "Central Park");
  myDog.speak();
  myDog.play("bone");
  Dog daisy = new Dog("Daisy");
  daisy.eat("dog food"); // Daisy eats kibble twice a day
  daisy.setAge(20,10); // twice a day
  daisy.walk(35,"Memorial Park");
  myDog.play();
  Dog rex = new Dog("Rex");
  rex.eat("chocolate", 300, 5);
  rex.walk(0);
  rex.setAge(5);
  rex.sit();
  System.out.println("The King strikes again, with another piece of marvellous code!\n");

  }
}