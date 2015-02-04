import java.util.Scanner;

public class QuadraticEquation
{

   public static void main(String[] args)
   {
      // Get three numbers from the user
      // And perform the quadratic equation with them
      // (what is the quadratic equation used for again???)

      // Declare variables
      double a, b, c, d, solution, solution2;

      // Get a scanner object
      Scanner keyboard = new Scanner(System.in);

      // Get values from user
      System.out.println("A:");
      a = keyboard.nextDouble();
      System.out.println("B:");
      b = keyboard.nextDouble();
      System.out.println("C:");
      c = keyboard.nextDouble();

      // Find the value of D
      // D = b^2 - 4ac 
      d = ((Math.pow(b, 2)) - (4 * a * c));

      // If D < 0, no solutions
      if (d < 0)
      {
         System.out.println("D is: " + d + ", no solutions");
      }

      // If D = 0, solution is -(b/2a)
      else if (d == 0)
      {
         solution = -1 * (b / (2 * a));
         System.out.println("Solution is: " + solution);
      }
      // If D > 0, two solutions
      else
      {
         solution = ((-1 * b) + Math.sqrt(d)) / (2 * a);
         solution2 = ((-1 * b) - Math.sqrt(d)) / (2 * a);
         System.out.println("Solution one is: " + solution);
         System.out.println("Solution two is: " + solution2);
      }
      keyboard.close();   
   }

}
