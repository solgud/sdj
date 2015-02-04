
public class OrganismPopulation
{
   // Declare fields
   private double organismCount;
   private double averageDailyIncrease;
   private int daysToMultiply;
   
   // Constructor
   public OrganismPopulation(double count, double average, int days)
   {
      // Silently reset arguments if needed
      // In a real program this should throw an error or something
      if (count < 2 )
      {
         count = 2;
      }
      if (average < 0)
      {
         average = 0;
      }
      if (days < 1)
      {
         days = 1;
      }

      this.organismCount = count;
      this.averageDailyIncrease = average;
      this.daysToMultiply = days;
   }

   // Display population for a number of days
   public void populationOverTime()
   {
      // Loop for the given number of days
      for (int i = 0; i < daysToMultiply; i++)
      {
         // Print out the current population
         System.out.println("Day: " + (i+1) + ", population: " + organismCount);
         
         // Update the population with the average daily increase
         organismCount += (organismCount * (averageDailyIncrease / 100));
      }
   }
}
