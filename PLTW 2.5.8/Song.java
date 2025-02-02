public class Song {
    private String title;
    private double duration;
    private int rating;
  
    /*** Constructor ****/
    public Song(String t, double d)
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
    
   public boolean equals(Song s)
    {
      if(this.title.equals(s.title) && (this.duration == s.duration))
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
  

