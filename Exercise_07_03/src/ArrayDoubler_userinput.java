import java.util.Scanner;

public class ArrayDoubler_userinput
{

   public static void main(String[] args)
   {
      // Take an array and double all values in place
      Scanner key = new Scanner(System.in);
 
      double[] collection;
      
      // Get and set array length
      System.out.println("How many elements will you need?");
      final int LENGTH = key.nextInt();
      collection = new double[LENGTH];

      // Get array values
      for (int count = 0; count < collection.length; count++)
      {
         System.out.println("Give me a value for position " + (count+1));
         collection[count] = key.nextDouble();
      }
      
      for (int count = 0; count < collection.length; count++)
      {
         collection[count] *= 2;
         System.out.printf("Value at space %d is now %.2f \n", count+1, collection[count]);
      }

      key.close();
   }

}
