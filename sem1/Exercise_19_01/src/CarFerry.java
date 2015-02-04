import java.util.ArrayList;


public class CarFerry
{
   // Declare class variables
   private String name;
   private double weight;
   private double maxWeight;

   // Contains multiple vehicles
   private ArrayList<Vehicle> load; 
   
   // Constructor
   public CarFerry(String name, double weight, double maxWeight)
   {
      this.name = name;
      this.weight = weight;
      this.maxWeight = maxWeight;
      
      // Set load to an empty ArrayList by default
      this.load = new ArrayList<Vehicle>();
   }
   
   // Add a vehicle to the ArrayList
   public void addVehicle(Vehicle vehicle)
   {
      this.load.add(vehicle);
   }
   
   // Remove a vehicle by direct reference
   public void removeVehicle(Vehicle vehicle)
   {
      this.load.remove(vehicle);
   }
   
   // Get a vehicle by reference to license plate property
   public Vehicle getVehicle(String licensePlate)
   {
      // Loop through the array
      for (int i = 0; i < this.load.size(); i++)
      {
         // If the license plate of the vehicle
         // matches the license plate argument
         if (this.load.get(i).getLicensePlate().equals(licensePlate))
         {
            // Return the vehicle at that index
            return this.load.get(i);
         }
      }
      // If no license plate matched a car,
      // just return a null reference
      return null;
   }
   
   // Returns the total weight of the ferry
   public double getTotalWeight()
   {
      // Declare and initialize a total weight
      double totalWeight = 0;
      
      // Loop through the array
      for (int i = 0; i < this.load.size(); i++)
      {
         // Add the weight of each vehicle to the total weight
         totalWeight += this.load.get(i).getWeight();
      }

      // Return the total weight 
      // added to the initial weight of the ferry
      return totalWeight + this.weight;
   }
   
   // Checks if ferry is over weight
   public boolean isOverWeight()
   {
      return this.getTotalWeight() > this.maxWeight;
   }
   
   // Getters and setters
   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   public double getWeight()
   {
      return this.weight;
   }
   
   public double getMaxWeight()
   {
      return this.maxWeight;
   }

}
