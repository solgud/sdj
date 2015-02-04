
public class Address
{
   // Declare class variables
   private String streetAddress;
   private int postCode;

   // Constructor
   public Address(String streetAddress, int postCode)
   {
      this.streetAddress = streetAddress;
      this.postCode = postCode;
   }
   
   // Setter for streetAddress
   public void setStreetAddress(String streetAddress)
   {
      this.streetAddress = streetAddress;
   }
   
   // Getter for streetAddress
   public String getStreetAddress()
   {
      return this.streetAddress;
   }

   // Setter for postCode
   public void setPostCode(int postCode)
   {
      this.postCode = postCode;
   }
   
   // Getter for postCode
   public int getPostCode()
   {
      return this.postCode;
   }
   
   // Copy method, returns a copy of an Address object
   public Address copy()
   {
      return new Address(this.streetAddress, this.postCode);
   }
   
   // Check for equality against another Address object
   public boolean equals(Address obj)
   {
      return this.streetAddress.equals(obj.streetAddress) && this.postCode == obj.postCode;
   }
}
