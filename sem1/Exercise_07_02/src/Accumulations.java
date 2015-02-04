
public class Accumulations
{

   public static void main(String[] args)
   {
      // Create an array of doubles and print out the:
      // 1. Sum of the numbers
      // 2. Average of the numbers
      // 3. Maximum of the numbers
      // 4. Product of the numbers
      
      // Initialize array
      double[] collection = {1.1, 2.2, 3.3, 4.4};
      double sum = 0, 
             maximum = 0, 
             product = 1,
             average; 

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
   }

}
