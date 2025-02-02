import java.util.ArrayList;
import java.util.Scanner;

public class Work {  
  public static void main(String args[]) {  
    Scanner userInput = new Scanner(System.in);
    ArrayList<Person> people = new ArrayList<Person>();
    
    boolean userQuit = false;

    while (!userQuit) {
        System.out.println("Name:");
        String name = userInput.nextLine();
        System.out.println("Age:");
        int age = userInput.nextInt();
        userInput.nextLine(); // Consume newline left by nextInt()
        System.out.println("Are you a student (true/false):");
        boolean isStudent = userInput.nextBoolean();
        
        Person person = new Person(name, age, isStudent);
        people.add(person);
        
        System.out.println("Input 'true' to quit, 'false' to continue:");
        userQuit = userInput.nextBoolean();
        userInput.nextLine(); // Consume newline left by nextBoolean()
    }
    
    // Output the list of people
    System.out.println("List of people:");
    for (Person person : people) {
        System.out.println("Name: " + person.name + ", Age: " + person.age + ", Student: " + person.isStudent);
    }
  }  
}
