
public class Room
{
   // Declare class variables
   private int number;
   private Bed bed;
   private Guest guest;

   // Constructor
   public Room(int number, String bedType)
   {
      this.number = number;
      this.bed = new Bed(bedType);
      this.guest = null;
   }

   // Getter for number
   public int getNumber()
   {
      return this.number;
   }
   
   // Get the floor number
   // Rooms are numbered x01, x02... where x is the floor
   public int getFloor()
   {
      // So I'll just do some integer division
      // Dividing by 100 will give me the floor number
      return number / 100;
   }
   
   // Get the price
   // Price depends on the bed type
   public double getPrice()
   {
      // I could use a switch statement here
      // But if statements are preferable for only 3 cases

      // Single is 59.50, double is 72.40, king is 89.00
      if (bed.isSingle())
      {
         return 59.50;
      }
      if (bed.isDouble())
      {
         return 72.40;
      }
      if (bed.isKingSize())
      {
         return 89.00;
      }
      // If neither of the three cases,
      // return a junk value
      // Should probably throw an error here
      return 0;
   }
   
   // Check if room is occupied (has a Guest)
   public boolean isOccupied()
   {
      // If guest is not null (the default value), 
      // then room is occupied
      return this.guest != null;
   }
   
   // Register the guest
   public void registerGuest(Guest guest)
   {
      // Since the relationship here is associative
      // (the guest is not an inseperable part of the room)
      // We want the same guest object that is being passed in
      this.guest = guest;
   }
   
   // Unregister the guest
   public void vacate()
   {
      // Reset guest to null
      this.guest = null;
   }
   
   // Return the bed type
   public String getBedType()
   {
      // I can't directly get the type of the bed object
      // because it is hidden (private)
      // This means I have to do the onerous task
      // of using the is...() methods
      // and if statements, like in getPrice()
      if (bed.isSingle())
      {
         return "Single";
      }
      if (bed.isDouble())
      {
         return "Double";
      }
      if (bed.isKingSize())
      {
         return "King Size";
      }
      // If not any of the three, return a junk empty String
      return "";
   }
   
   // Return the guest
   public Guest getGuest()
   {
      // I can return the actual guest object
      // since the "has a" relationship is association
      return this.guest;
   }

}
