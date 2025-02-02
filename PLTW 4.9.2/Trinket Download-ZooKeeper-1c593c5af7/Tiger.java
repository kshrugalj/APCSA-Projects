public class Tiger extends Feline {
    public Tiger(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }
    @Override
    public void speak()
    {
        roar();
    }
    public void  roar()
    {
        System.out.println("The tiger is roaring loudly! ");
    }
    public void swim(){
        System.out.println("The Tiger swim's in the lake. ");
    }

    public void huntAlone(){
        System.out.println( "The tiger is hunting alone.");
    }
}
