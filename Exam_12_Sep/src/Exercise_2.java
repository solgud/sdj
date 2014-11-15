import java.util.Scanner;


public class Exercise_2
{

   public static void main(String[] args)
   {
      // Repeat process from Exercise 1
      // But use a loop
      // Repeat six times

      Scanner keyboard = new Scanner(System.in);

      // Declare and initialize variables
      int homeScore, awayScore;
      int resultWin = 0;
      char resultTie = ' ';
      
      // Hard coding match total...
      int matchesPlayed = 6;

      for (int i = 0; i < matchesPlayed; i++)
      {
         // Get information for match
         System.out.println("Match number " + (i+1));

         System.out.println("Input home team score!");
         homeScore = keyboard.nextInt();
         System.out.println("Input away team score!");
         awayScore = keyboard.nextInt();

         // Immediately display result
         // I think this is the only way to do this with only a loop and if statements
         // without hard coding variables like "matchOneHomeScore"

         // If tie, result => X
         if (homeScore == awayScore)
         {
            resultTie = 'X';
         }
         // If home team wins, result => 1
         else if (homeScore > awayScore)
         {
            resultWin = 1;
         }
         // If away team wins, result => 2
         else 
         {
            resultWin = 2;
         }

         // Print result
         // There's probably a more elegant way to check this
         System.out.println("*****");
         if (resultWin != 0)
         {
            System.out.println("Result for match " + (i+1) + " is: " + resultWin);
         }
         else
         {
            System.out.println("Result for match " + (i+1) + " is: " + resultTie);
         }
         System.out.println("*****");
      }
      keyboard.close();
   }
}
