import java.util.Scanner;


public class To_n
{

   public static void main(String[] args)
   {
      // Get a number from the user
      // Print all numbers from 0 to that number
      // Use a while loop
      
      // Declare variables
      int n, i = 0;
      
      // Get a scanner object
      Scanner keyboard = new Scanner(System.in);

      // Get n
      System.out.println("Give me a number!");
      n = keyboard.nextInt();
      
      // Loop from 0 until n
      while (i < n)
      {
         // Print result each iteration
         System.out.print(i + ", ");
         
         // Increment i
         i++;
      }
      // Print n (loop stops at n-1)
      // This is one way way to filter out the comma I put after every number in the loop
      System.out.println(n);
      
      keyboard.close();   
   }

}
