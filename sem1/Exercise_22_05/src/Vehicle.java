
public class Vehicle
{
   // Declare instance variables
   private String owner;
   private double price;
   
   // Constructor
   public Vehicle(String owner, double price)
   {
      this.owner = owner;
      this.price = price;
   }

   // Getters and Setters
   public String getOwner()
   {
      return this.owner;
   }

   public void setOwner(String owner)
   {
      this.owner = owner;
   }

   public double getPrice()
   {
      return this.price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }
   
   // Return a String representation
   public String toString()
   {
      return "Owner = " + this.owner + ", "
            + "Price = " + this.price;
   }
   
   // Check for equality against another Object
   public boolean equals(Object arg)
   {
      // If the argument is a Vehicle
      if (arg instanceof Vehicle)
      {
         // Cast that argument to a Vehicle
         Vehicle vehicle = (Vehicle) arg;
         // Check its fields for equality
         return this.owner.equals(vehicle.owner)
               && this.price == vehicle.price;
      }
      // In any other case, return false
      return false;
   }

}
