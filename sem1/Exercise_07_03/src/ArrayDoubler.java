
public class ArrayDoubler
{

   public static void main(String[] args)
   {
      // Take an array and double all values in place
 
      int[] collection = {1,4,3,4,5,7};
      
      for (int count = 0; count < collection.length; count++)
      {
         collection[count] *= 2;
         System.out.printf("Value at space %d is now %d \n", count+1, collection[count]);
      }

   }

}
