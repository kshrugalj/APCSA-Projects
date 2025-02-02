/*
 * Activity 1.3.7
*/
class Shape
{
  String shapeOf="";
  int numOfSides;
  
  public void setShape(String x, int y)
  {
    shapeOf=x;
    numOfSides = y;
  }
  
  public String getShape()
  {
    return shapeOf;
  }
  
  public int getSides()
  {
    return numOfSides;
  }
  

  public boolean equals(Object obj) {
    if (this == obj) {
        return true; // Same object reference
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false; // Different classes or null
    }
    Shape other = (Shape) obj;
    return this.shapeOf.equals(other.shapeOf) && this.numOfSides == other.numOfSides;
  }

}