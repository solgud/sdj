
public class CPU
{
   // Declare instance variables
   private String brand;
   private String model;
   private double clockFrequency;
   private int cores;
   
   // Constructor
   public CPU(String brand, String model, double clockFrequency, int cores)
   {
      this.brand = brand;
      this.model = model;
      this.clockFrequency = clockFrequency;
      this.cores = cores;
   }

   // Getters
   public String getBrand()
   {
      return this.brand;
   }

   public String getModel()
   {
      return this.model;
   }

   public double getClockFrequency()
   {
      return this.clockFrequency;
   }

   public int getCores()
   {
      return this.cores;
   }

   // Return a String representation
   public String toString()
   {
      return this.brand + ", "
            + this.model + ", "
            + this.clockFrequency + ", "
            + this.cores;
   }
}
