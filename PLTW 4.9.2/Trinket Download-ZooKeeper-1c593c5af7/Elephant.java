public class Elephant extends Hooved {

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }
    public void speak()
    {
        trumpet();
    }
    public void trumpet()
    {
        System.out.println("The elephant trumpets.");
    }
}
