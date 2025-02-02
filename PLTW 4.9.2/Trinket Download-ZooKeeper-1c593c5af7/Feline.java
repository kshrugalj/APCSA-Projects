public class Feline extends Animal {

    // Constructor for Feline
    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        // Call the constructor of the superclass (Animal)
        super(food, nocturnal, aveLifeSpan);
    }

    public void growl(){
        System.out.println("This feline growls. ");
    }

    public void roar(){
        System.out.println("This feline roars aloud. ");
    }
}
