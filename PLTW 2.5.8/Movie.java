/*************************************
 * Sample solution for Activity 2.5.7
 * 
 * A Movie class for the MediaLibrary program
 * 
 **************************************/
public class Movie
{
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
  }
 
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }
  
 public boolean equals(Movie m)
  {
    if(this.title.equals(m.title) && (this.duration == m.duration))
      return true; 
      
    return false;
  }

  public String toString() 
   {
     String info = "\"" + title + "\", is " + duration + " hours long";
     if (rating != 0) 
       info += ", rating is " + rating;
     
     return info;
   }
  
  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }
    
  public int adjustRating(int r)
  {
    if ((rating + r >= 0) &&  (rating + r <= 10))
      rating += r;
 
    return rating;
  }
}
