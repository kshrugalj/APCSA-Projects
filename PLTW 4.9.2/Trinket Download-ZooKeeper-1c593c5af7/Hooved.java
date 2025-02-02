/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved(String food, boolean nocturnal, double aveLifeSpan) 
  {
    // Call the constructor of the superclass (Animal)
    super(food, nocturnal, aveLifeSpan);
  }
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}