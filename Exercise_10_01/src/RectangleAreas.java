import java.util.Scanner;


public class RectangleAreas
{

   public static void main(String[] args)
   {
      // Ask reader for a number of areas
      // Create two double arrays (height, width) of that length 
      // Read widths and heights from keyboard
      // Print all values to console
      
      // Get a scanner object
      Scanner key = new Scanner(System.in);
      
      // Declare arrays
      double[] height, width;
      
      // Ask reader for array length
      System.out.println("How many rectangles would you like?");
      final int ARRAYLENGTH = key.nextInt();
      
      // Apply the length to the arrays
      height = new double[ARRAYLENGTH];
      width = new double[ARRAYLENGTH];

      // Loop to write values into the arrays
      for (int i = 0; i < ARRAYLENGTH; i++)
      {
         System.out.println("Height of rectangle " + (i+1) + "?");
         height[i] = key.nextDouble();
         System.out.println("Width of rectangle " + (i+1) + "?");
         width[i] = key.nextDouble();
      }
      
      // Loop to print area values
      for (int i = 0; i < ARRAYLENGTH; i++)
      {
         System.out.printf("Area of rectangle %d is: %.2f %n", (i+1), (width[i] * height[i]));
      }
      key.close();
   }

}
