import java.util.Scanner;


public class SongTest
{

   public static void main(String[] args)
   {
      // A new test program for Song class
      // This time using arrays
      
      // Make a new scanner object
      Scanner key = new Scanner(System.in);
      
      // Get the number of songs from the user
      System.out.println("How many songs do you need?");
      final int NUMBEROFSONGS = key.nextInt();
      
      // Make a new Song array with that number of songs
      Song[] songs = new Song[NUMBEROFSONGS];
      
      // Make a loop
      // to fill out the array
      for (int i = 0; i < songs.length; i++)
      {
         // Declare needed variables
         String artist, title;
         int length;
         
         // Get user input

         // Move to the next line (fix bug in Scanner)
         key.nextLine();

         System.out.println("Artist?");
         artist = key.nextLine();

         System.out.println("Title?");
         title = key.nextLine();

         System.out.println("Length?");
         length = key.nextInt();
         
         // Make a new object with the input
         songs[i] = new Song(artist, title, length);
      }

      // Make another loop
      // To print out average length of songs
      int totalLength = 0;
      for (int i = 0; i < songs.length; i++)
      {
         totalLength += songs[i].getLength();
      }
      System.out.println("Average length of songs: " + (double) totalLength / songs.length);
      key.close();
   }

}
