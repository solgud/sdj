import java.util.Scanner;


public class Squares
{

   public static void main(String[] args)
   {
      // Get a number from the user
      // List every number up to the given number
      // And show the square of that number
      
      // Declare the count variable
      int count;
      
      // Get a scanner object
      Scanner key = new Scanner(System.in);
      
      // Get the count variable from the user
      System.out.println("Give me a count!");
      count = key.nextInt();

      // Set up the chart header (\t is a tab)
      System.out.println("Number\t\tNumber Squared");
      System.out.println("--------------------------------");
      
      // Loop to the chosen number
      for (int number = 1; number <= count; number ++)
      {
         // Print out value, a tab, and the square
         System.out.println(number + "\t|\t" + (int) Math.pow(number, 2));
      }
      key.close();
   }

}
