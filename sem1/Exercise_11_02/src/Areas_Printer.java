import java.util.Scanner;

public class Areas_Printer
{
   public static void main(String[] args)
   {
      // Update the program from Exercise 10.04
      // using the new Rectangle class (with constructor)

      // Create an array of Rectangle objects
      // Ask user for array size
      // In a loop, add objects to the array
      // Have the user define widths and heights for each
      // Print area of each rectangle to the console

      // Get a scanner object
      Scanner key = new Scanner(System.in);

      // Declare the array
      Rectangle[] rectangleArray;

      // Get and set length of the array
      System.out.println("How many rectangles would you like?");
      final int ARRAYLENGTH = key.nextInt();
      rectangleArray = new Rectangle[ARRAYLENGTH];

      // Loop through array
      // Create rectangles and set widths and heights
      for (int i = 0; i < rectangleArray.length; i++)
      {
         // Get width and height from user
         // We'll pass these into the constructor
         System.out.println("Give height for rectangle " + (i+1));
         double width = key.nextDouble();

         System.out.println("Give width for rectangle " + (i+1));
         double height = key.nextDouble();

         // Create a new rectangle
         // Pass our values into the constructor
         rectangleArray[i] = new Rectangle(width, height);
      }

      // Loop through finished array
      // Print out areas
      for (int i = 0; i < rectangleArray.length; i++)
      {
         // Print area using getArea method
         System.out.println("Area for rectangle " + (i+1) + " is: " + rectangleArray[i].getArea());
      }
      key.close();
   }
}