public class MyDate
{
   // Update MyDate class from Exercise 10.03
   // Using constructors
   
   // Declare the fields
   private int day;
   private int month;
   private int year;
   
   // Create the constructor
   // Has parameters for day (d), month (m), and year (y)
   public MyDate(int d, int m, int y)
   {
      // Set fields to the arguments
      this.day = d;
      this.month = m;
      this.year = y;
   }
   
   // Everything else (getters and the like):
   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }
   
   public int getYear()
   {
      return this.year;
   }
   
   // Send a formatted date to the console
   public void displayDate()
   {
      System.out.printf("%d/%d/%d%n", this.day, this.month, this.year);
   }
}
