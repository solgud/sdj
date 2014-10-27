
public class Test
{

   public static void main(String[] args)
   {
      // Test the Ship and Ferry classes
      
      // Make a new Object array
      Object[] shipsAndFerries = new Object[5];
      
      // Make some ships and some ferries
      Ship ship1 = new Ship(300, 30);
      Ship ship2 = new Ship(20, 1);
      Ferry ferry1 = new Ferry(200, 10, 200);
      Ferry ferry2 = new Ferry(100, 5, 50);
      Ferry ferry3 = new Ferry(150, 7, 70);
      
      // Fill the array (manually...)
      shipsAndFerries[0] = ship1;
      shipsAndFerries[1] = ship2;
      shipsAndFerries[2] = ferry1;
      shipsAndFerries[3] = ferry2;
      shipsAndFerries[4] = ferry3;
      
      // Print the information of all ships and ferries (using toString())
      for (Object item : shipsAndFerries)
      {
         System.out.println(item.toString());
      }

      // Print number of passengers of all ferries
      // Start with a counter set to zero
      int totalPassengersOnFerries = 0;
      // Loop through the array
      for (int i = 0; i < shipsAndFerries.length; i++)
      {
         // If the current item is a Ferry
         if (shipsAndFerries[i] instanceof Ferry)
         {
            // Make a convenient ferry object 
            // that copies the current array element
            Ferry currentFerry = (Ferry) shipsAndFerries[i];
            // Use the new ferry object to add to the counter
            totalPassengersOnFerries += currentFerry.getPassengers();
         }
      }
      System.out.println("Total passengers on ferries: " + totalPassengersOnFerries);
      
      // Print total weight of all the elements
      // Start with a counter set to zero
      double totalWeightOfAllShips = 0;
      // Loop through the array
      // Using a foreach loop
      for (Object item : shipsAndFerries)
      {
         // If the current item is a Ship
         if (item instanceof Ship)
         {
            // Cast it as a Ship
            Ship currentShip = (Ship) item;
            // Then add its weight to the counter
            totalWeightOfAllShips += currentShip.getWeight();
         }
         // If the current item is a Ferry
         if (item instanceof Ferry)
         {
            // Cast it as a Ferry
            Ferry currentFerry = (Ferry) item;
            // Then add its weight to the counter
            totalWeightOfAllShips += currentFerry.getWeight();
         }
      }
      System.out.println(totalWeightOfAllShips);

   }

}
