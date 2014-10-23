
public class Room extends Residence
{
   // Constructor
   public Room(int number, double size)
   {
      // Call the superclass constructor
      super(number, size, "Room");
   }
   
   @Override
   public int getNumberOfRooms()
   {
      // Just return 1, since there is just one room
      return 1;
   }

}
