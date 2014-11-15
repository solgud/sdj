import java.util.Scanner;

public class ComputeDistances
{
   public static void main(String[] args)
   {
      // Read point coordinates from a keyboard
      // Print out all coordinates
      // And compute distance between the successive coordinates
      
      Scanner key = new Scanner(System.in);
      int[] xCoordinates, yCoordinates;
      final int ARRAYLENGTH;
      double distance;
      
      // Find length and instantiate arrays
      System.out.println("How many coordinates will you please?");
      ARRAYLENGTH = key.nextInt();
      xCoordinates = new int[ARRAYLENGTH];
      yCoordinates = new int[ARRAYLENGTH];
      
      // Build arrays
      for (int i = 0; i < xCoordinates.length; i++)
      {
         System.out.println("Input x coordinate number " + (i+1));
         xCoordinates[i] = key.nextInt();
         System.out.println("Input y coordinate number " + (i+1));
         yCoordinates[i] = key.nextInt();
      }
      
      // Print arrays
      for (int i = 0; i < xCoordinates.length; i++)
      {
         System.out.println("Coordinate pair " + (i+1) + " is: ");
         System.out.printf("(%d, %d)\n", xCoordinates[i], yCoordinates[i]);
      }
      
      // Perform maths
      // Distance between x1,y1 and x2,y2 is sqrt((y2-y1)^2 + (x2-x1)^2)
     for (int i = 0; i < xCoordinates.length-1; i++)
     {
        // Find distance between coordinate sets
        distance = Math.sqrt(Math.pow(yCoordinates[i+1] - yCoordinates[i], 2) + Math.pow(xCoordinates[i+1] - xCoordinates[i], 2));
        System.out.println("Distance between points: ");
        System.out.printf("(%d, %d) and (%d, %d)\n", xCoordinates[i], yCoordinates[i], xCoordinates[i+1], yCoordinates[i+1]);
        System.out.println("is: " + distance);
     }
     key.close();
   }
}