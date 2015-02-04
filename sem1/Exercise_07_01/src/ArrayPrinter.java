public class ArrayPrinter
{

   public static void main(String[] args)
   {

      // Create an array of doubles and print:
      // 1. All the elements
      // 2. All the elements in reverse order
      // 3. The square of each element
      
      // Initialize array
      double[] collection = {1.0, 2.0, 3.5, 2.3, 7.7};
      
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
