
public class PhoneCall extends BillableItem
{
   // Declare instance variables
   private int minutes;
   private double pricePerMinute;
   
   // Constructor
   public PhoneCall(String date, String recipient, int minutes, double pricePerMinute)
   {
      // Call the super's constructor
      super(date, recipient);
      
      // Then deal with the instance variables
      this.minutes = minutes;
      this.pricePerMinute = pricePerMinute;
   }
   
   // Getters
   public int getMinutes()
   {
      return this.minutes;
   }
   
   public double getPricePerMinute()
   {
      return this.pricePerMinute;
   }
   
   // Implement the getPrice from the abstract superclass
   @Override
   public double getPrice()
   {
      return this.minutes * this.pricePerMinute;
   }

}
