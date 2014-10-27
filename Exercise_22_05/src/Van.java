
public class Van extends Car
{
   // Declare instance variables
   private int maxLoad;

   // Constructor
   public Van(String theOwner, double thePrice, String regNo, int maxLoad)
   {
      // Call the superclass constructor
      super(theOwner, thePrice, regNo);
      // Instantiate the remaining variables
      this.maxLoad = maxLoad;
   }
   
   // Getter
   public int getMaxLoad()
   {
      return this.maxLoad;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return super.toString() + ", "
            + "Maximum Load = " + this.maxLoad;
   }
   
   // Check for equality against another Object
   @Override
   public boolean equals(Object arg)
   {
      // Check to see if arg is a Van
      if (arg instanceof Van)
      {
         // Cast arg as a Van
         Van van = (Van) arg;
         // Then check fields for equality
         return super.equals(van)
               && this.maxLoad == van.maxLoad;
      }
      // In any other case, return false
      return false;
   }

}
