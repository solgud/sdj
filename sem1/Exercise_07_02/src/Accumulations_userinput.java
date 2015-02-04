import java.util.Scanner;
public class Accumulations_userinput
{

   public static void main(String[] args)
   {
      // Create an array of doubles and print out the:
      // 1. Sum of the numbers
      // 2. Average of the numbers
      // 3. Maximum of the numbers
      // 4. Product of the numbers
      
      Scanner key = new Scanner(System.in);

      // Initialize array
      double[] collection;
      double sum = 0, 
             maximum = 0, 
             product = 1,
             average; 

      // Get and set size of array
      System.out.println("How many elements will you need?");
      final int LENGTH = key.nextInt();
      collection = new double[LENGTH];
      
      // Get items in array
      for (int count = 0; count < collection.length; count++)
      {
         System.out.println("Give me a number for location " + (count+1));
         collection[count] = key.nextDouble();
      }
      
      
      for (int count = 0; count < collection.length; count++)
      {
         // Add value to sum
         sum += collection[count];

         // Compare to maximum
         if (collection[count] >= maximum)
            maximum = collection[count];
         
         // Multiply value with product
         product *= collection[count];
         
      }
      average = sum / collection.length;

      System.out.printf("Sum is: %.2f \n", sum);
      System.out.printf("Maximum is: %.2f \n", maximum);
      System.out.printf("Product is: %.2f \n", product);
      System.out.printf("Average is: %.2f \n", average);
      key.close();
   }

}
