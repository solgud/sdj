
public class Laptop extends Computer
{
   // Declare instance variables
   private int screenSize;

   // Constructor
   public Laptop(String brand, String model, int screenSize)
   {
      // Call the superclass's constructor first
      super(brand, model);

      // Then set this class's instance variables
      this.screenSize = screenSize;
   }

   // Getter for screenSize
   public int getScreenSize()
   {
      return this.screenSize;
   }

   // Return a String representation
   @Override
   public String toString()
   {
      // Only print the CPU if it exists
      if (this.getCPU() != null)
      {
         return super.toString() + ", "
               + this.screenSize + ", "
               + this.getCPU().toString();
      }
      return super.toString() + ", "
      + this.screenSize;
   }

}
