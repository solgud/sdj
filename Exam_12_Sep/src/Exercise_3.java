import java.util.Scanner;
public class Exercise_3
{

   public static void main(String[] args)
   {
      // Streamline processes from Exercises 1 and 2
      // Using arrays
      
      Scanner keyboard = new Scanner(System.in);

      // Hard coding array size...
      final int ARRAYSIZE = 6;

      // Declare arrays
      int[] homeScore = new int[ARRAYSIZE];
      int[] awayScore = new int[ARRAYSIZE];
      
      // Now I'm being lazy
      // And making a results array
      // and shoving results into a string
      String[] results = new String[ARRAYSIZE];
      
      // Get results from user
      for (int i = 0; i < ARRAYSIZE; i++)
      {
         // Get user input
         System.out.println("Input results for Match " + (i+1));
         System.out.println("Home team score: ");
         homeScore[i] = keyboard.nextInt();
         System.out.println("Away team score: ");
         awayScore[i] = keyboard.nextInt();
         
         // Calculate result
         if (homeScore[i] == awayScore[i])
         {
            results[i] = "X";
         }
         else if (homeScore[i] > awayScore[i])
         {
            results[i] = "1";
         }
         else 
         {
            results[i] = "2";
         }
      }
      
      // Print results back to user
      for (int i = 0; i < results.length; i++)
      {
         System.out.println("Match no " + (i+1) + ": " + results[i]);
      }

   }

}
