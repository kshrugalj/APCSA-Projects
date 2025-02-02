/*
 * Activity 1.2.4
 */
public class Dog
{
  public Dog(String name)
  {
    System.out.println("Hi! I am a dog. My name is " + name + ".");
  }

  public void sit()
  {
    System.out.println("I don't feel like sitting, but I want more chocolate!\n");
  }

  public void speak()
  {
    System.out.println("I love to talk to my owner! Arf Arf!");
  }

  public void walk(int num)
  {
    System.out.println("I love to walk for " + num + " minutes.");
  }

  public void walk(int num, String park)
  {
    System.out.println("I love to walk for " + num + " minutes and go to " + park + "!");
  }

  public void eat(String food)
  {
    System.out.println("I eat " + food + ".");
  }
  public void eat(int num)
  {
    System.out.println("I eat "+ num + " time(s) a day.");
  }
  
  public void eat(String food, int num)
  {
    System.out.println("I eat " + food + " " + num + " times a day.");
  }

  public void eat(String food, double amount, int num)
  {
    System.out.println("I eat " + amount + " cups of " + food + " " + num + " times a day.");
  }
  
  public void setAge(int years)
  {
    System.out.println("I am " + years + " years old.");
  }

  public void setAge(int years, int months)
  {
    System.out.println("I am " + years + " years and " + months + " months old.");
  }
  public void setAge(double years)
  {
    System.out.println("I am " + years + " years old.");
  }
  
  public void play(String toy)
  {
    System.out.println("Oh boy! My owner is letting me play with my " + toy + "!");
  }
  public void play()
  {
    System.out.println("I like playing games with my owner!");
  }

}
