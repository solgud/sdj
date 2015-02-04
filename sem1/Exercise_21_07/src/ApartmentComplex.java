import java.util.ArrayList;


public class ApartmentComplex
{
   // Declare instance variables
   private String address;
   private ArrayList<Residence> residences;
   
   // Constructor
   public ApartmentComplex(String address)
   {
      this.address = address;
      // Instantiate residences to an empty ArrayList
      residences = new ArrayList<Residence>();
   }
   
   // Return number of Residences in ArrayList
   public int getNumberOfResidences()
   {
      return this.residences.size();
   }
   
   // Add a Residence to the ArrayList
   public void add(Residence residence)
   {
      this.residences.add(residence);
   }
   
   // Get a residence from the ArrayList
   // by index reference
   public Residence getResidence(int index)
   {
      return this.residences.get(index);
   }
   
   // Get a residence from the ArrayList
   // by reference to its number
   public Residence getResidenceByNumber(int number)
   {
      // Using a foreach loop for fun
      for(Residence residence : this.residences)
      {
         // If the number of the current element matches the desired number
         if (residence.getNumber() == number)
         {
            // Return the current element
            return residence;
         }
      }
      // If no matches were found, return null
      return null;
   }
   
   // Return the first available Room
   public Room getAvailableRoom()
   {
      // Loop through the ArrayList
      for (int i = 0; i < this.residences.size(); i++)
      {
         // If the element at the current index
         // Is a room and is available
         if (this.residences.get(i) instanceof Room && this.residences.get(i).isAvailable())
         {
            // Return the element at the current index
            return (Room) this.residences.get(i);
         }
      }
      // If no available Rooms were found, return null
      return null;
   }

   // Return the first available Apartment
   // with a minimum number of rooms
   public Apartment getAvailableApartment(int minNoOfRooms)
   {
      // Use a foreach loop for convenience
      for (Residence residence : this.residences)
      {
         // If the current residence
         // is an Apartment and is available
         // and has at least the minimum number of rooms
         if (residence instanceof Apartment 
               && residence.isAvailable() 
               && residence.getNumberOfRooms() >= minNoOfRooms)
         {
            // Return the current residence
            return (Apartment) residence;
         }
      }
      // If no suitable Apartments were found, return null
      return null;
   }
   

}
