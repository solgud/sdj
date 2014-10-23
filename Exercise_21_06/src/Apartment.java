
public class Apartment extends Residence
{
   // Declare instance variable
   private int numberOfRooms;
   
   // Constructor
   public Apartment(int number, double size, int numberOfRooms)
   {
      // Call the superclass constructor first
      super(number, size, "Apartment");
      this.numberOfRooms = numberOfRooms;
   }
   
   // Override the getNumberOfRooms() method
   @Override
   public int getNumberOfRooms()
   {
      return this.numberOfRooms;
   }

}
