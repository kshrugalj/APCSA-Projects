public class HikeRunner
{
  public static void main(String[] args)
  {
    Hike hike1 = new Hike("Sharp Top", 3.3, 1253);
    System.out.println(hike1);

    Hike hike2 = new Hike("Apple Orchard", 2.6, 1003);
    System.out.println(hike2);

    // Instantiate a new Hike object, hike6, with no reference data
    Hike hike6 = new Hike();
    hike6.oscarsLoop();

    // Output the new hike6 reference data
    System.out.println("Hike6: " + hike6);

    // Call setFavorite() and getFavorite() using hike6 compared to hike2
    hike6.setFavorite(hike2);
    System.out.println("Favorite Hike: " + hike6.getFavorite());
  }
}
