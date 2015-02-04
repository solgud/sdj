
public class Song
{
   // Implement class from a diagram
   
   // Declare fields
   private String artist;
   private String title;
   private int length;
   
   // Constructor
   public Song(String artist, String title, int length)
   {
      this.artist = artist;
      this.title = title;
      this.length = length;
   }
   
   // Methods
   public String getArtist()
   {
      return this.artist;
   }
   
   public String getTitle()
   {
      return this.title;
   }
   
   public int getLength()
   {
      return this.length;
   }
   
   public String toString()
   {
      return this.artist + ", " + this.title + ", " + this.length;
   }

}