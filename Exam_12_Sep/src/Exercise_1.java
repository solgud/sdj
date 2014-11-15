import java.util.Scanner;

public class Exercise_1
{

   public static void main(String[] args)
   {
      // Take two football scores from a user
      // One is for home team, the other is for away team
      // If home team wins, print 1
      // If away team wins, print 2
      // If tie, print X
      
      // Get a Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Declare variables
      int homeScore, awayScore;
      
      // 1, 2 are different types from X
      // I stuffed them into a string at first, because I'm lazy
      // But that was too lazy

      int resultWin = 0;
      char resultTie = ' ';
      
      // Get scores from user
      System.out.println("Input home team score!");
      homeScore = keyboard.nextInt();
      System.out.println("Input away team score!");
      awayScore = keyboard.nextInt();
      
      // Find result

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
      if (resultWin != 0)
      {
         System.out.println("Result is: " + resultWin);
      }
      else
      {
         System.out.println("Result is: " + resultTie);
      }

      keyboard.close();
   }

}
