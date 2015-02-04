
public class RoomForRent
{
   // Declare fields
   private String address;
   private double price;
   private Rectangle size;
   private Person tenant;
   
   // Constructors
   // Using another object is just like using a String
   public RoomForRent(String address, double price, Rectangle size)
   {
      this.address = address;
      this.price = price;
      this.size = size;
      this.tenant = null;
   }
   // Four argument constructor
   public RoomForRent(String address, double price, Rectangle size, Person tenant)
   {
      this.address = address;
      this.price = price;
      this.size = size;
      this.tenant = tenant;
   }
   
   // Getter methods
   public String getAddress()
   {
      return this.address;
   }
   public double getPrice()
   {
      return this.price;
   }
   public Rectangle getSize()
   {
      return this.size;
   }

   // Setter method for price
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   public double getPricePerSquareMeter()
   {
      return this.price / this.size.getArea();
   }
   
   // Compare to another RoomForRent object
   public boolean equals(RoomForRent other)
   {
      return this.address.equals(other.address) &&
             this.price == other.price &&
             this.size.equals(other.size) &&
             this.tenant.equals(other.tenant);
   }
   
   // Return a String representation
   public String toString()
   {
      return "Address: " + this.address +
             ", price: " + this.price +
             ", size: " + this.size.getString() +
             ", tenant: " + this.tenant.getName();
   }
   
   // Set a new tenant if there isn't one already
   public void rent(Person newTenant)
   {
      if (this.tenant != null)
      {
         this.tenant = newTenant;
      }
   }
   
   // Boot a tenant (set value to null)
   public void evict()
   {
      this.tenant = null;
   }
   
   // Show if room is rented (true) or not (false)
   public boolean isRented()
   {
      return this.tenant != null;
   }
}
