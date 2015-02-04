
public class Vehicle
{
   // Declare class variables
   private String licensePlate;
   private double weight;
   
   // Constructor
   public Vehicle(String licensePlate, double weight)
   {
      this.licensePlate = licensePlate;
      this.weight = weight;
   }
   
   // Getters
   public String getLicensePlate()
   {
      return this.licensePlate;
   }

   public double getWeight()
   {
      return this.weight;
   }
   
   // Return a String representation
   public String toString()
   {
      return this.licensePlate + ", " + this.weight;
   }
   
   // Check for equality against another Vehicle object
   public boolean equals(Vehicle other)
   {
      return this.licensePlate.equals(other.licensePlate) && this.weight == other.weight;
   }
}

