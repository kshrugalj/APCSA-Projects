/* PLTW 1.2.5 non-void methods Kshrugal Jangalapalli 09.20.23 */
public class DogRunner
{
  public static void main(String[] args)
  {
    Dog d = new Dog("Duke");    // Instantiate object   
    String name = d.getName();
    int minutes = d.goOutside();
    int minutes2 = d.goOutside(1.5);
    System.out.println(name + " is my dogs name!");// Adding print statement using variable for return value
    System.out.println("He is a " + d.isGoodDog() + " good dog.");    // Output with method call 
    System.out.println(name + " has a new " + d.getToy() +".");// Different uses of method calls and variable in output
    System.out.println(d.getName()+ " has a new " + d.getToy() +".");
    System.out.println("In the morning, " + name + " goes out for " + minutes + " minutes");
    System.out.println("In the evening, " +name+ " goes out for " + minutes2 + " minutes");
    System.out.println(name + " spends " +(minutes+minutes2)+ " minutes outside a day!"); // Method calls with different values and expression in output
  }
}// Closes Class