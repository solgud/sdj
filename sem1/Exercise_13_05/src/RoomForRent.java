
public class RoomForRent
{
   // Declare fields
   private String address;
   private double price;
   private Rectangle size;
   
   // Constructor
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
}
