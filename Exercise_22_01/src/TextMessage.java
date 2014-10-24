
public class TextMessage extends BillableItem
{
   // Declare instance variables
   private double smsPrice;
   private double extraCharges;

   // Constructor
   public TextMessage(String date,
         String recipientNo, 
         double smsPrice,
         double extraCharges)
   {
      // Call the super's constructor
      super(date, recipientNo);
     
      this.smsPrice = smsPrice;
      this.extraCharges = extraCharges;
   }
   
   // Getters
   public double getSmsPrice()
   {
      return this.smsPrice;
   }
   
   public double getExtraCharges()
   {
      return this.extraCharges;
   }
   
   // Implement the getPrice() method from the super
   @Override
   public double getPrice()
   {
      return getPrice();
   }
}

