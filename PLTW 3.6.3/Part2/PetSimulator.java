/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[10];
    
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    Pet cat1 = new Pet("Bingo", Pet.DOG);
    Pet cat2 = new Pet("Fluffy", Pet.CAT);
    Pet dog1 = new Pet("Fido", Pet.DOG);
    Pet dog2 = new Pet("Freckles", Pet.CAT);

    // first things first, feed your pets
    cat1.feed();
    cat2.feed();
    dog1.feed();
    dog2.feed();

    // next, make yourself the owner of all of your new pets
    cat1.setOwner("PLTW's");
    cat2.setOwner("PLTW's");
    dog1.setOwner("PLTW's");
    dog2.setOwner("PLTW's");

    // your dogs make some noise, take them for a walk
    dog1.makeNoise();
    dog2.makeNoise();
    dog1.walk();
    dog2.walk();

    // when you get back, your cats make some noise
    cat1.makeNoise();
    cat2.makeNoise();
    
    // give all of your pets a treat
    cat1.giveTreat();
    cat2.giveTreat();
    dog1.giveTreat();
    dog2.giveTreat();

    // groom your cats
    cat1.groom();
    cat2.groom();

    // grooming is done, play with all pets
    cat1.play();
    cat2.play();
    dog1.play();
    dog2.play();

    // whew, that was tiring, all pets nap and get fed
    cat1.sleep();
    cat2.sleep();
    dog1.sleep();
    dog2.sleep();

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    System.out.println(cat1);
    System.out.println(cat2);
    System.out.println(dog1);
    System.out.println(dog2);

    // You decide to get a couple of pets for your friend (does not require looping)
    Pet friendDog1 = new Pet("Balto", Pet.DOG);
    Pet friendDog2 = new Pet("Brutus", Pet.DOG);

    // set the owner of the new pets to your friend's name
    friendDog1.setOwner("Best Friend's");
    friendDog2.setOwner("Best Friend's");

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    System.out.println(cat1);
    System.out.println(cat2);
    System.out.println(dog1);
    System.out.println(dog2);
    // show the state of your friend's pets
    System.out.println("--- FRIEND'S PETS ---");
    System.out.println(friendDog1);
    System.out.println(friendDog2);

  }
}
