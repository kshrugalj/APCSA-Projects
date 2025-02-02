/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
    int weightOnEarth = 180;//my actual weight
    final double earthGravity = 9.81;//made this final due to earthGravity never changing 
    double mercuryGravity = 3.59;// gravity of Mercury in m/s^2
    double venusGravity = 8.87;//gravity of Venus in m/s^2
    double marsGravity = 3.711;//gravity of Mars in m/s^2
    
    // calculate weigth
    double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;// finding weight on Mercury in terms of pounds
    double weightOnVenus = weightOnEarth * venusGravity / earthGravity;// finding weight on Venus in terms of pounds 
    double weightOnMars = weightOnEarth * marsGravity / earthGravity;// finding weight on Mars in terms of pounds
    double totalWeightOfThreePlanets = weightOnMercury + weightOnVenus + weightOnMars;//finding total weight on all 3 planets to find the average
    double averageWeightOfThreePlanets = totalWeightOfThreePlanets/3;//using total weight and dividing by 3 since there are a total of 3 planets of finding the average
    // show results
    System.out.print("Your weight on Mercury is ");
    System.out.print(weightOnMercury);//shows weight for Mercury
    System.out.println(" lbs.");
    System.out.print("Your weight on Venus is ");
    System.out.print(weightOnVenus);//shows weight for Venus
    System.out.println(" lbs.");
    System.out.print("Your weight on Mars is ");
    System.out.print(weightOnMars);//shows weight for Mars
    System.out.println(" lbs.");
    System.out.print("The average weight of all 3 planets is ");
    System.out.print(averageWeightOfThreePlanets);//shows average weight for all 3 planets 
    System.out.println(" lbs.");
  }
}