
public class Test
{

   public static void main(String[] args)
   {
      // Test the Ship and Ferry classes
      
      // Start with an empty Object array
      Object[] shipsAndFerries = new Object[4];
      
      // Make some ships and some ferries
      Ship ship1 = new Ship(300, 30);
      Ship ship2 = new Ship(30, 3);
      Ferry ferry1 = new Ferry(200, 20, 400);
      Ferry ferry2 = new Ferry(20, 5, 40);
      
      // Fill the array (manually...)
      shipsAndFerries[0] = ship1;
      shipsAndFerries[1] = ship2;
      shipsAndFerries[2] = ferry1;
      shipsAndFerries[3] = ferry2;
      
      // Print the information of all ships and ferries
      // Use a simple foreach loop
      for (Object item : shipsAndFerries)
      {
         System.out.println(item.toString());
      }
      
      // Print the number of passengers of all ferries
      // Start with a counter set to zero
      int totalPassengersOnFerries = 0;
      // Loop through the array
      for (int i = 0; i < shipsAndFerries.length; i++)
      {
         // If the current element is a Ferry
         if (shipsAndFerries[i] instanceof Ferry)
         {
            // Take a copy of it, casted as a Ferry
            Ferry currentFerry = (Ferry) shipsAndFerries[i];
            // Add the number of passengers to the counter
            totalPassengersOnFerries += currentFerry.getPassengers();
         }
      }
      // Finally, print the total passengers
      System.out.println("Total passengers on ferries: " + totalPassengersOnFerries);
      
      

      // Print the total weight of all the elements

      // Start with a counter set to zero
      double totalWeight = 0;
      // Loop through the array
      for (int i = 0; i < shipsAndFerries.length; i++)
      {
         // If the current item is a Ship (also includes Ferries)
         if (shipsAndFerries[i] instanceof Ship)
         {
            // Take a copy and cast it as a Ship
            Ship currentShipOrFerry = (Ship) shipsAndFerries[i];
            // Add to the counter using the getWeight() method
            totalWeight += currentShipOrFerry.getWeight();
         }
      }
      // Finally, print the total weight
      System.out.println(totalWeight);

   }

}
