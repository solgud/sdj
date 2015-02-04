import java.util.Date;

public abstract class Residence
{
   // Declare instance variables
   private int number;
   private double size;
   private String type;
   private Tenant rentedTo;
   
   // Constructor
   public Residence(int number, double size, String type)
   {
      this.number = number;
      this.size = size;
      this.type = type;
      this.rentedTo = null;
   }
   
   // Getters
   public int getNumber()
   {
      return this.number;
   }
   public double getSize()
   {
      return this.size;
   }
   public String getType()
   {
      return this.type;
   }
   
   // Check Residence for availability
   public boolean isAvailable()
   {
      return this.rentedTo == null;
   }
   
   // Add a new Tenant
   public void rentTo(Tenant tenant, Date rentedFrom)
   {
      this.rentedTo = tenant;
      this.rentedTo.setRentedFrom(rentedFrom);
   }
   // Getter for Tenant
   public Tenant getTenant()
   {
      return this.rentedTo;
   }
   
   // Abstract method
   public abstract int getNumberOfRooms();
   
}
