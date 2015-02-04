
public class Computer
{
   // Declare instance variables
   private String brand;
   private String model;
   private CPU cpu;

   // Constructor
   public Computer(String brand, String model)
   {
      this.brand = brand;
      this.model = model;
      this.cpu = null;
   }

   // Setter and Getter for CPU
   public void setCPU(CPU cpu)
   {
      this.cpu = cpu;
   }

   public CPU getCPU()
   {
      return this.cpu;
   }

   // Getters for other instance variables
   public String getBrand()
   {
      return this.brand;
   }
   public String getModel()
   {
      return this.model;
   }

   // Return the brand off of the CPU object
   public String getCPUBrand()
   {
      return this.cpu.getBrand();
   }

   // Return a String representation
   public String toString()
   {
      // Only print the cpu if it exists
      if (this.cpu != null)
      {
         return this.brand + ", "
               + this.model + ", "
               + this.cpu.toString();
      }
      return this.brand + ", "
            + this.model;
   }

}
