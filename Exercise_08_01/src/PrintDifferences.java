import java.util.Scanner;


public class PrintDifferences
{

   public static void main(String[] args)
   {
      // Ask user to create an array of a certain size
      // Fill array with entries from keyboard
      // Print out differences of successive numbers
      // Eg 3,8,6,6 -> 5,-2,0
      
      double[] collection;
      double diff;
      final int ARRAYLENGTH;
      Scanner key = new Scanner(System.in);

      // Get size of array and initialize
      System.out.println("How many items would you like?");
      ARRAYLENGTH = key.nextInt();
      collection = new double[ARRAYLENGTH];
      
      // Start filling array
      for (int i = 0; i < collection.length; i++)
      {
         System.out.println("Give me value for item " + (i+1));
         collection[i] = key.nextDouble();
      }
      
      // Loop over array and find differences
      for (int i = 0; i < collection.length; i++)
      {
         if (i > 0)
         {
            diff = collection[i] - collection[i-1];
            System.out.println("Difference between value " + i + " and value " + (i+1) + " is: " + diff);
         }
      }
      key.close();
   }
}
