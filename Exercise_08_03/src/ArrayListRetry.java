import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRetry
{

   public static void main(String[] args)
   {
      // Create an ArrayList of your own numbers
      // and print:
      // 1. All the elements
      // 2. All the elements in reverse order
      // 3. Square of each element


      // Make a key reader
      Scanner key = new Scanner(System.in);
      
      // Create an empty ArrayList
      ArrayList<Integer> intArray = new ArrayList<Integer>();
      
      // Fill out Array
      System.out.println("How many items would you like?");
      final int COUNT = key.nextInt();

      // Get values for the array
      for (int i = 0; i < COUNT; i++)
      {
         System.out.println("Give me value #" + (i+1));
         intArray.add(key.nextInt());
      }

      // Print all elements
      // Using Enhanced for loop (p.514)
      for (int value : intArray)
      {
         System.out.println("Value: " + value);
      }
      
      // Print all elements in reverse
      for (int i = COUNT; i > 0; i--)
      {
         System.out.println("Reverse value: " + intArray.get(i-1));
      }
      
      // Print each element squared
      for (int i = 0; i < COUNT; i++)
      {
         System.out.println("Value " + (i+1) + " squared is: " + Math.pow(intArray.get(i), 2));
      }
      key.close();
   }
}
