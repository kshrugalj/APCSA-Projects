public class apcsaw6th{
    public static void main(String[] args) {
        //Step 1
    String theBestState = "New York";
    String theWorstState = "Arkansas";
    String theMidState = "Kentucky";
    System.out.println(theBestState);
    System.out.println(theWorstState);
    System.out.println(theMidState);
    //Step 2
    int numOfStates = 3;
    System.out.println(numOfStates);
    //Step 3
    String name = new String(" Kshrugal");
    //Step 4
    Object sixth = new Object();
    //Step 5
    System.out.println("My name is" + name);
    System.out.println("The location of the object in memory is "+(sixth));
    //Step 6
    System.out.println(theBestState + "\n" + theMidState);
    //Step 7
    theBestState += "\tis the best state in the USA.";
    //Step 8
    System.out.println(theBestState);
    //Step 9
    theWorstState = theWorstState.concat(" is the worst state in the USA.");
    System.out.println(theWorstState);
    //Step 10
    System.out.println("The number states that were outputted were: " + numOfStates);
    //Step 11
    String pangram = "The quick brown fox jumps over the lazy dog.";
    //Step 12 
    int length = pangram.length();
    //Step 13
    System.out.println(length);
    //Step 14
    int index = pangram.indexOf("quick");
    //Step 15
    System.out.println("\""+index + "\"");
    //Step 16
    System.out.println(pangram.substring(0,19));
    //Step 17
    String remainingPangram = pangram.substring(20);
    System.out.println(remainingPangram);
    //Step 18
    String fox = pangram.substring(16,20);
    //Step 19
    String lazy = pangram.substring(35,39);
    //Step 20
    lazy += fox;
    System.out.println(lazy);
    }
}