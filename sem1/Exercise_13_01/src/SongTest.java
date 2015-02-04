import java.util.Scanner;

public class SongTest
{

   @SuppressWarnings("unused")
   public static void main(String[] args)
   {
      // Test program for Song class

      // Create new scanner object
      Scanner key = new Scanner(System.in);

      // Declare program variables
      String artist, title;
      int length;

      // Get values from user
      System.out.println("Artist?");
      artist = key.nextLine();
      System.out.println("Title?");
      title = key.nextLine();
      System.out.println("Length?");
      length = key.nextInt();

      // Make objects
      Song song1 = new Song(artist, title, length);
      Song song2 = song1;
      Song song3 = new Song(artist, title, length);
      Song song4 = null;
      
      // Compare objects
      // This is totally redundant and tedious,
      // but I can't think of another way to do it.
      // Probably not thinking enough.
      if (song1 == song2)
      {
         System.out.println("Song 1 and Song 2 are equal");
      }
      if (song1 == song3)
      {
         System.out.println("Song 1 and Song 3 are equal");
      }
      if (song1 == song4)
      {
         System.out.println("Song 1 and Song 4 are equal");
      }
      if (song2 == song3)
      {
         System.out.println("Song 2 and Song 3 are equal");
      }
      if (song2 == song4)
      {
         System.out.println("Song 2 and Song 4 are equal");
      }
      if (song3 == song4)
      {
         System.out.println("Song 3 and Song 4 are equal");
      }
      
      // Check if equal to null
      // Also tedious and redundant
      // I suppose this is supposed to teach us that we should use arrays instead
      if (song1 == null)
      {
         System.out.println("Song 1 is null");
      }
      if (song2 == null)
      {
         System.out.println("Song 2 is null");
      }
      if (song3 == null)
      {
         System.out.println("Song 3 is null");
      }
      if (song4 == null)
      {
         System.out.println("Song 4 is null");
      }
      
      // Find average length of the songs
      // song4 is excluded because it is null and this gives an error **+ song4.getLength()
      double average = (song1.getLength() + song2.getLength() + song3.getLength()) / 4; 
      System.out.println("Average length of songs is " + average);
      key.close();
   }

}
