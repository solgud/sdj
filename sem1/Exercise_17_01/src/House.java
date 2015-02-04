
public class House
{
   private double size;
   private Address address;
   
   // Constructor
   public House(double size, Address address)
   {
      this.size = size;
      // Needs to be compositional
      // Pull in a copy of the argument
      this.address = address.copy();
   }

   // Return a copy of the address class variable
   public Address getAddress()
   {
      return this.address.copy();
   }
   
   // Return the size class variable
   public double getSize()
   {
      return this.size;
   }
   
}
