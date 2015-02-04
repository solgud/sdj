import java.util.Scanner;

public class ArrayPrinter_userinput
{

   public static void main(String[] args)
   {

      // Create an array of doubles and print:
      // 1. All the elements
      // 2. All the elements in reverse order
      // 3. The square of each element
      
      // Initialize array
      double[] collection;

      @SuppressWarnings("resource")
      Scanner key = new Scanner(System.in);
      
      // Get and set array length
      System.out.println("How many values will you need?");
      final int LENGTH = key.nextInt();
      collection = new double[LENGTH];
      
      for (int count = 0; count < LENGTH; count++)
      {
         System.out.printf("Give me value number %d", count+1);
         collection[count] = key.nextDouble();
      }
      
      // Perform operations
      for ( int count = 0; count < collection.length; count++ )
      {
         // All the elements
         System.out.println("Element " + (count + 1) + " is: " + collection[count]);
         // Elements in reverse order
         System.out.println("From reverse, element " + ((collection.length - (count+1)) + 1) + " is: " + collection[collection.length - (count+1)]);
         // Square of each element
         System.out.println("Element " + (count + 1) + " squared is: " + Math.pow(collection[count], 2));
         System.out.println();
      }
   }
}
