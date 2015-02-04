
public class BitVectorTest
{

   public static void main(String[] args)
   {
      // Test the BitVector class
      BitVector vector = new BitVector(4);
      
      // get the size
      System.out.println("Size is: " + vector.getSize());
      
      // set value of the four indexes
      vector.setValue(0, false);
      vector.setValue(1, true);
      vector.setValue(2, false);
      vector.setValue(3, true);
      
      // get value of an index
      System.out.println("Value of index two is: " + vector.getValue(2));
      
      // Find the last false in the array
      System.out.println("Last false index: " + vector.lastFalse());
      
      // See if all elements in array are true
      System.out.println("All elements true?: " + vector.allTrue());
      
      // Get a string representation
      System.out.println(vector.toString());
      
      

   }

}
