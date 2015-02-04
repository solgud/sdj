import java.util.Date;

public class Tenant
{
   // Declare instance variables
   private String name;
   private Date rentedFrom;

   // Constructor
   public Tenant(String name)
   {
      this.name = name;
      this.rentedFrom = new Date();
   }
   
   // Getters for instance variables
   public String getName()
   {
      return this.name;
   }
   public Date getRentedFrom()
   {
      return this.rentedFrom;
   }
   
   // Setter for rentedFrom
   public void setRentedFrom(Date date)
   {
      this.rentedFrom = date;
   }
}
