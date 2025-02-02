public class Hike
{
  private String name;
  private double miles;
  private int elevation;
  private Hike favorite;

  public Hike(String name, double miles, int elevation)
  {
    this.name = name;
    this.miles = miles;
    this.elevation = elevation;
  }

  public Hike()
  {
    // Default constructor with default values
    this.name = "Default Hike";
    this.miles = 0.0;
    this.elevation = 0;
  }

  public String getName()
  {
    return name;
  }

  public double getMiles()
  {
    return miles;
  }

  public double getElevation()
  {
    return elevation;
  }

  public boolean isLongerThan(Hike h)
  {
    return miles > h.getMiles();
  }

  public boolean isHigherThan(Hike h)
  {
    return elevation > h.getElevation();
  }

  public void setFavorite(Hike otherHike)
  {
    if (otherHike.getMiles() > this.miles) {
      favorite = otherHike;
    } else {
      favorite = this;
    }
  }

  public Hike getFavorite()
  {
    return favorite;
  }

  public void oscarsLoop()
  {
    this.name = "Oscars Loop";
    this.miles = 3.3;
    this.elevation = 334;
  }

  public String toString() 
  {
    return name + " is " + miles + " miles and gains " + elevation + " feet."; 
  }
}
