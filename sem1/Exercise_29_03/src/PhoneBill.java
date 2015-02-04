import java.util.ArrayList;

public class PhoneBill
{
   // Declare instance variables
   private String phoneNo;
   private ArrayList<BillableItem> billableItems;
   
   // Constructor
   public PhoneBill(String phoneNo)
   {
      this.phoneNo = phoneNo;
      // Initialize the empty ArrayList
      this.billableItems = new ArrayList<BillableItem>();
   }
   
   // Getter and setter for phoneNo
   public String getPhoneNo()
   {
      return this.phoneNo;
   }
   
   public void setPhoneNo(String phoneNo)
   {
      this.phoneNo = phoneNo;
   }
   
   // Add a BillableItem to the ArrayList
   public void addItem(BillableItem item)
   {
      this.billableItems.add(item);
   }
   
   // Return the length of the ArrayList
   public int getNumberOfItems()
   {
      return this.billableItems.size();
   }
   
   // Return a BillableItem by index in the ArrayList
   public BillableItem getItem(int index)
   {
      return this.billableItems.get(index);
   }
   
   // Return the total amount due
   public double getAmountDue()
   {
      // Declare and initialize a variable to hold the total
      double totalAmountDue = 0;
      
      // Loop through the ArrayList
      // using a foreach loop
      for(BillableItem billableItem : this.billableItems)
      {
         // At each element, use the getPrice() method to add to the total
         totalAmountDue += billableItem.getPrice();
      }
      
      // Outside of the loop, return the total
      return totalAmountDue;
   }
   
   // Return the total number of phone call minutes
   public double getPhoneCallMinutes()
   {
      // Declare and initialize a variable to hold the total minutes
      int totalPhoneCallMinutes = 0;
      
      // Loop through the ArrayList
      for (int i = 0; i < billableItems.size(); i++)
      {
         // If the current item is a PhoneCall
         if (this.billableItems.get(i) instanceof PhoneCall)
         {
            // Add its minutes to the total
            totalPhoneCallMinutes += ((PhoneCall) this.billableItems.get(i)).getMinutes();
         }
      }
      // Outside of the 
      return totalPhoneCallMinutes;
   }

   // Return an ArrayList with all the TextMessage objects
   public ArrayList<TextMessage> getTextMessages()
   {
      // Declare and initialize an empty ArrayList
      ArrayList<TextMessage> textMessages = new ArrayList<TextMessage>();
      
      // Loop through the ArrayList
      for (int i = 0; i < this.billableItems.size(); i++)
      {
         // If the element at the current index is a TextMessage
         if (this.billableItems.get(i) instanceof TextMessage)
         {
            // Add that TextMessage to the ArrayList
            textMessages.add((TextMessage) this.billableItems.get(i));
         }
      }
      // Outside of the loop, return the finished ArrayList
      return textMessages;
   }
   
}
