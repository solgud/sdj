
public class SportsCar extends Car
{
   // Declare instance variables
   private int maxVelocity;

   // Constructor
   public SportsCar(String theOwner, double thePrice, String regNo, int maxVelocity)
   {
      // Call the superclass constructor
      super(theOwner, thePrice, regNo);
      // Then instantiate the remaining variables
      this.maxVelocity = maxVelocity;
   }
   
   // Getter
   public int getMaxVelocity()
   {
      return this.maxVelocity;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return super.toString() + ", "
            + "Maximum Velocity = " + this.maxVelocity;
   }
   
   // Check for equality against another Object
   @Override
   public boolean equals(Object arg)
   {
      // Check to see if arg is a SportsCar
      if (arg instanceof SportsCar)
      {
         // Cast arg as a SportsCar
         SportsCar sportsCar = (SportsCar) arg;
         // Then check fields for equality
         return super.equals(sportsCar)
               && this.maxVelocity == sportsCar.maxVelocity;
      }
      // Return false in any other case
      return false;
   }
   
   

}
