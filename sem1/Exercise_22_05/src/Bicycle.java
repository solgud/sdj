
public class Bicycle extends Vehicle
{
   // Declare instance variables
   private int gears;

   // Constructor
   public Bicycle(String owner, double price, int numberOfGears)
   {
      super(owner, price);
      this.gears = numberOfGears;
   }

   // Getter and Setter for gears
   public int getGears()
   {
      return this.gears;
   }

   public void setGears(int numberOfGears)
   {
      this.gears = numberOfGears;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return super.toString() + ", "
            + "Number of gears = " + this.gears;
   }
   
   // Check for equality against another Object
   @Override
   public boolean equals(Object arg)
   {
      // Check if arg is a Bicycle
      if (arg instanceof Bicycle)
      {
         // Then cast it to a Bicycle
         Bicycle bicycle = (Bicycle) arg;
         // And check fields for equality
         return super.equals(bicycle)
               && this.gears == bicycle.gears;
      }
      // In any other case, return false
      return false;
   }
   
   

}
