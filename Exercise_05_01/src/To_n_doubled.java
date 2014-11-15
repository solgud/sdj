import java.util.Scanner;

public class To_n_doubled
{

   public static void main(String[] args)
   {
      // Get a number from the user
      // And show every even number until double that number
      
      // Declare variables
      
      int i=0, n;  // i is my loop counter
      
      // Get a new scanner object
      Scanner key = new Scanner(System.in);

      // Get value of n
      System.out.println("Give me a number!");
      n = key.nextInt();
      
      // Loop from 0 to n*2
      // Don't actually include n*2
      while (i < n * 2)
      {
         // Print out the value of i
         System.out.print(i + ", ");
         
         // Add 2 to i
         i += 2;
      }
      // Finally, print out n*2
      // This is only here because I add commas in the print statements in the loop
      // And I don't want a comma here
      // I could also use an if statement in the loop
      System.out.print(n * 2);
      
      key.close();
   }

}
