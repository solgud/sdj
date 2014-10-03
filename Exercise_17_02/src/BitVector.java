
public class BitVector
{
   private boolean[] bits;
   
   public BitVector(int size)
   {
      this.bits = new boolean[size];
   }
   
   public int getSize()
   {
      return this.bits.length;
   }
   
   public boolean getValue(int index)
   {
      return this.bits[index];
   }
   
   public void setValue(int index, boolean value)
   {
      this.bits[index] = value;
   }
   
   // Return the index of the last element in array this is false,
   // and -1 if no elements are false
   public int lastFalse()
   {
      // Set lastFalseIndex to -1 to start
      int lastFalseIndex = -1;
      
      // Loop through the array
      for(int i = 0; i < bits.length; i++)
      {
         // If index value is false
         if(!bits[i])
         {
            // Set lastFalseIndex to the current index number
            lastFalseIndex = i;
         }
      }
      return lastFalseIndex;
   }

   // Return true if all elements in array are true
   public boolean allTrue()
   {
      // loop through array
      for(int i = 0; i < bits.length; i++)
      {
         // If current index value is false
         if(!bits[i])
         {
            // Return false
            return false;
         }
      }
      // If loop didn't hit a false,
      // return true
      return true;
   }
   
   // Return a String representation
   // With 0 for false and 1 for true
   public String toString()
   {
      // Start with an empty string
      String arrayAsString = "";
      
      // Loop through array
      for(int i = 0; i < bits.length; i++)
      {
         // If current index is true
         if(bits[i])
         {
            // Concatenate "1" to end of the string
            arrayAsString += "1";
         }
         // If current index is false
         else 
         {
            // Concatenate "0" to end of the string
            arrayAsString += "0";
         }
      }
      // Outside of loop, return finished string
      return arrayAsString;
   }
}
