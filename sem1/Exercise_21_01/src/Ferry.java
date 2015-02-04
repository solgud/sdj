
public class Ferry extends Ship
{
   // Declare class variables
   private int passengers;
   
   // Constructor
   public Ferry(double length, double weight, int passengers)
   {
      // Call to the superclass's constructor must go first
      super(length, weight);
      
      // Then deal with the class variables
      this.passengers = passengers;
   }
   
   // Let the compiler know I'm overriding the superclass
   @Override
   public int getPassengers()
   {
      return this.passengers;
   }
   
   // Set the number of passengers
   // This isn't in the superclass, so no need to @Override
   public void setPassengers(int passengers)
   {
      this.passengers = passengers;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return this.getLength() + ", " 
           + this.getWeight() + ", " 
           + this.getPassengers();
   }

}
