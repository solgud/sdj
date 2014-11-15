
public abstract class BillableItem
{
   // Declare instance variables
   private String date;
   private String recipientNo;
   
   // Constructor
   public BillableItem(String date, String recipientNo)
   {
      this.date = date;
      this.recipientNo = recipientNo;
   }
   
   // Getters
   public String getDate()
   {
      return this.date;
   }
   
   public String getRecipientNo()
   {
      return this.recipientNo;
   }
   
   // Abstract method
   public abstract double getPrice();

}
