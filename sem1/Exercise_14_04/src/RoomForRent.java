
public class RoomForRent
{
   // Declare fields
   private String address;
   private double price;
   private Rectangle size;
   
   // Constructors
   // Using another object is just like using a String
   public RoomForRent(String address, double price, Rectangle size)
   {
      this.address = address;
      this.price = price;
      this.size = size;
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
             this.size.equals(other.size);
   }
   
   // Return a String representation
   public String toString()
   {
      return "Address: " + this.address +
             ", price: " + this.price +
             ", size: " + this.size.getArea();
   }
}
